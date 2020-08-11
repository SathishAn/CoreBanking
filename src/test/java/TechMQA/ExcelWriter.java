package TechMQA;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.validator.GenericTypeValidator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelWriter {
	static int newFlag = 0;
	static XSSFWorkbook wwb;
	static Sheet sheet;
	static File filePath;
	static String id, name, className, xpath, fieldValue, fieldText, finalXpath;
	
	private static WebDriver driver;
	public ExcelWriter(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	

	public static String updateValues(WebElement element, String fieldType) throws InterruptedException {
		id = element.getAttribute("id");
		name = element.getAttribute("name");
		className = element.getAttribute("class");
		fieldValue = element.getText();
		
		String sTempValue = "";
		if (!id.isEmpty()) {
			if (id.contains("fieldName:")) {
				sTempValue= id.replace("CheckBox:", "");
				sTempValue= sTempValue.replace("fieldName:", "fieldCaption:");
				sTempValue= sTempValue.replaceAll(":\\d", "");
				System.out.println(sTempValue);
				List<WebElement> ele = driver.findElements(By.id(sTempValue));
				if (ele.size() > 0) {
					String script = "return arguments[0].innerHTML";
					fieldText = (String) ((JavascriptExecutor) driver).executeScript(script, ele.get(0));					

				} else {
					fieldText = sTempValue.replaceAll("fieldCaption:", "");
				}
			} else if (id.contains("radio")) {
				sTempValue= id.replaceAll("\\d", "");
				sTempValue= sTempValue.replace("radio:tab:", "fieldCaption:");
				sTempValue= sTempValue.replace("radio:mainTab:", "fieldCaption:");
				System.out.println(sTempValue);
				List<WebElement> ele = driver.findElements(By.id(sTempValue));
				if (ele.size() > 0) {
					String script = "return arguments[0].innerHTML";
					fieldText = (String) ((JavascriptExecutor) driver).executeScript(script, ele.get(0));
				} else {
					fieldText = sTempValue.replaceAll("fieldCaption:", "");
				}

			} else {
				fieldText = id;
			}

		}

		String xpath = xpathGenerator(element, fieldType);
		dataUpdateWorkbook(fieldText, fieldType, id, name, className, "", "", "", "", "", xpath);
		return fieldText;
	}

	public static void updateLinkValues(WebElement element, String fieldType) {

		fieldValue = element.getText();
		String xpath = "";
		xpath = "";
		// FieldText = id;
		dataUpdateWorkbook(fieldText, fieldType, id, name, className, "", "", "", "", "", xpath);
	}

	public static void designAccelator(String pageName) throws Exception {

		filePath = new File("./src/test/resources/Datatable/accelator.xlsx");
		if (!filePath.exists() || newFlag == 0) {
			createWorkbook();
			newFlag = 1;
		}
		headerUpdateWorkbook();

		java.util.List<org.openqa.selenium.WebElement> linkElements3 = driver.findElements(By.tagName("select"));
		for (int i = 0; i < linkElements3.size(); i++) {			
			updateValues(linkElements3.get(i), "select");
		}

		java.util.List<org.openqa.selenium.WebElement> linkElements5 = driver.findElements(By.tagName("button"));
		for (int i = 0; i < linkElements5.size(); i++) {
			System.out.println(i + "button size");
			updateValues(linkElements5.get(i), "Button");

		}

		java.util.List<org.openqa.selenium.WebElement> linkElements6 = driver.findElements(By.tagName("a"));
		for (int i = 0; i < linkElements6.size(); i++) {
			if (linkElements6.get(i).getAttribute("class").contains("nonactive-tab")) {
				fieldValue = linkElements6.get(i).getText();
				// FieldText = id;
				dataUpdateWorkbook(fieldValue, "Link", "", "", "", "", "", "", "", fieldValue, "");
			}

		}

		java.util.List<org.openqa.selenium.WebElement> linkElements = driver.findElements(By.tagName("input"));
		for (int i = 0; i < linkElements.size(); i++) {
			if (linkElements.get(i).getAttribute("type").equals("text")) {
				System.out.println("*************************Input Type Text **********************");
				updateValues(linkElements.get(i), "Text");

			} else if (!linkElements.get(i).getAttribute("type").equals("")
					& linkElements.get(i).getAttribute("type").equals("button")) {

				updateValues(linkElements.get(i), "Button");

			} else if (!linkElements.get(i).getAttribute("type").equals("")
					& linkElements.get(i).getAttribute("type").equals("radio")) {
				System.out.println("Input Type Rado");
				updateValues(linkElements.get(i), "Radio");

			} else if (!linkElements.get(i).getAttribute("type").equals("")
					& linkElements.get(i).getAttribute("type").equals("checkbox")) {
				System.out.println("Input Type Checkbox");
				updateValues(linkElements.get(i), "CheckBox");
			} else if (!linkElements.get(i).getAttribute("type").equals("")
					& linkElements.get(i).getAttribute("type").equals("submit")) {
				updateValues(linkElements.get(i), "submit");

			} else if (!linkElements.get(i).getAttribute("type").equals("text")
					& linkElements.get(i).getAttribute("value").equals("select")) {
				updateValues(linkElements.get(i), "select");

			}

		}

		//ReadObject.createPageFactory(pageName);

	}

	// Create a new Workbook
	public static void createWorkbook() {
		FileOutputStream outStream;
		try {
			System.out.println("Create Workbook");
			outStream = new FileOutputStream(filePath);
			wwb = new XSSFWorkbook();
			sheet = wwb.createSheet("PSTC");
			wwb.write(outStream);
			outStream.close();

		} catch (Exception e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void headerUpdateWorkbook() throws IOException {
		FileInputStream inputstreams = new FileInputStream(filePath);
		wwb = new XSSFWorkbook(inputstreams);
		sheet = wwb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);

		if (rowCount < 1) {

			Row row = sheet.createRow(0);
			row.createCell(0).setCellValue("Field_Text");
			row.createCell(1).setCellValue("Field_Type");
			row.createCell(2).setCellValue("Attribute_ID");
			row.createCell(3).setCellValue("Attribute_Name");
			row.createCell(4).setCellValue("Attribute_InnerText");
			row.createCell(5).setCellValue("Attribute_Class");
			row.createCell(6).setCellValue("Attribute_Value");
			row.createCell(7).setCellValue("Attribute_Placeholder");
			row.createCell(8).setCellValue("Attribute_Title");
			row.createCell(9).setCellValue("Attribute_TextValue");
			row.createCell(10).setCellValue("Attribute_xpath");

		}

		inputstreams.close();
		FileOutputStream outStream = new FileOutputStream(filePath);
		wwb.write(outStream);
		outStream.close();

	}

	public static void dataUpdateWorkbook(String sf1, String sf2, String sf3, String sf4, String sf5, String sf6,
			String sf7, String sf8, String sf9, String sf10, String sf11) {
		System.out.println("Sample");
		FileInputStream inputstreams = null;
		try {
			inputstreams = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wwb = new XSSFWorkbook(inputstreams);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet = wwb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		if ((sf1 == null || sf1.equals("") || sf1.equals("null")) && !(sf3.equals(""))) {
			sf1 = sf3;
		} else if ((sf1 == null || sf1.equals("") || sf1.equals("null")) && !(sf4.equals(""))) {
			sf1 = sf4;
		}
		

		Row row = sheet.createRow(rowCount + 1);
		System.out.println(sf1);
		sf1 = sf1.replace("fieldName:", "").trim();
		sf1 = sf1.replace(":", "_").trim().replaceAll("\\W", "").trim();
		// sf1 = sf1.replace(".", "_").trim().replaceAll("/", "_");
		row.createCell(0).setCellValue(sf1.replaceAll(" ", "_").trim());
		row.createCell(1).setCellValue(sf2);
		row.createCell(2).setCellValue(sf3);
		row.createCell(3).setCellValue(sf4);
		row.createCell(4).setCellValue(sf5);
		row.createCell(5).setCellValue(sf6);
		row.createCell(6).setCellValue(sf7);
		row.createCell(7).setCellValue(sf8);
		row.createCell(8).setCellValue(sf9);
		row.createCell(9).setCellValue(sf10);
		row.createCell(10).setCellValue(sf11);

		try {
			inputstreams.close();
			FileOutputStream outStream = new FileOutputStream(filePath);
			wwb.write(outStream);
			outStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

	public static String xpathGenerator(WebElement linkElements, String type) throws InterruptedException {

		// TODO Auto-generated method stub
		int identifiedFlag = 0;
		finalXpath = null;
		String newXpath = null, tagName;
		tagName = linkElements.getTagName();
		String[] strFlow = { "Parent", "Parent_sibling" };
		tagName = linkElements.getTagName();	
		newXpath = tagName;		
		List<WebElement> preceding, Parent_Sibling, Grand_Parent_Sibling;
		WebElement Parents = null, Grand_Parents = null;
		int iCount = 0;
		do {
			System.out.println("###################################################################");
			switch (strFlow[iCount]) {
			
			case "Parent":
				Parents = linkElements.findElement(By.xpath("parent::*"));
				tagName = Parents.getTagName();
					newXpath = tagName + "/" + newXpath;
				
				break;
			case "Parent_sibling":
				Parent_Sibling = Parents.findElements(By.xpath("preceding-sibling::*"));
				
					for(WebElement ele: Parent_Sibling) {
						if(findElementText(ele)) {
							finalXpath = finalXpath + "/following-sibling::" + newXpath;
							System.out.println(finalXpath);
							identifiedFlag = 1;
						};
					}
				
				
				
				
					
				break;
			
				
			default:
				break;
			}
			iCount++;

		} while (identifiedFlag == 0 & iCount < strFlow.length);
		if (fieldText != null) {
			if (fieldText.length() > 25) {
				if (fieldText.indexOf("\n") > 0) {
					fieldText = fieldText.substring(0, fieldText.indexOf("\n"));
				} else {
					fieldText = fieldText.substring(0, 25);
				}
			}
		}

		return finalXpath;

	}
	
	
	
	public static boolean findElementText(WebElement ele) {
		boolean bFlag = false;
		String tagName = null;
		String script = "return arguments[0].innerText";
		String FielValue = (String) ((JavascriptExecutor) driver).executeScript(script, ele);		
		if(ele.getAttribute("for") != null) {
			tagName = ele.getTagName();			
			bFlag = true;
		}else if (!FielValue.equals("")) {
			List<WebElement> childElements = ele.findElements(By.xpath("descendant::*"));
			if (childElements.size() > 0) {
				for(WebElement ele1: childElements) {
					if(ele1.getAttribute("for") != null) {
						finalXpath = "//"+ ele1.getTagName() + "[@for = '" + ele1.getAttribute("for") + "']/.." ;						
						bFlag = true;
						break;
						
					}
					
				}
		}
		}
		return bFlag;
		
		
		
	}
	
	
	
	
	
	
	
	
	

	

	
	
	
	

}
