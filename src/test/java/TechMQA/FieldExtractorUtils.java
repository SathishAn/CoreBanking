package TechMQA;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.apache.commons.validator.GenericTypeValidator;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FieldExtractorUtils {
	private static int newFlag = 0, fieldextractFlag = 0;
	private static XSSFWorkbook wwb;
	private static Sheet sheet;
	private static File filePath;
	private static String id, name, className, xpath, fieldValue, fieldText;
	private static boolean boolFieldExtraction= true;	
	private static List<String> Radiovalues ;
	
	private static List<String> arrayList ;
	private static Map<String, List<String>> fieldValues = new TreeMap<String, List<String>>();
	private static Map<String, List<WebElement>> fieldextractor = new TreeMap<String, List<WebElement>>();
	private static Map<String, String> objectIdentified = new TreeMap<String, String>();
	private static Map<String, Boolean> objectStatus = new TreeMap<String, Boolean>();
	private static WebDriver driver;
	
	public FieldExtractorUtils(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated constructor stub
		this.driver = driver;		
		Thread.sleep(5000);
	}
	
	
	public static String updateValues(WebElement element, String fieldType) {
		id = element.getAttribute("id");
		fieldValue = element.getText();
		boolean fieldStatus = element.isEnabled();
		String xpath = "";	
		String sTempValue="";
		if (!id.isEmpty()) {		
			if(id.contains("fieldName:")) {
				sTempValue= id.replace("CheckBox:", "");
				sTempValue= sTempValue.replace("fieldName:", "fieldCaption:");
				sTempValue= sTempValue.replaceAll(":\\d", "");
				System.out.println(sTempValue);				
				List<WebElement> ele= driver.findElements(By.id(sTempValue));
				if(ele.size() > 0) {
					String script = "return arguments[0].innerHTML";
					fieldText = (String) ((JavascriptExecutor) driver).executeScript(script, ele.get(0));
				}else {
					fieldText = sTempValue.replaceAll("fieldCaption:", "");
				}
			}else if (id.contains("radio")) {
				sTempValue= id.replaceAll("\\d", "");
				sTempValue= sTempValue.replace("radio:tab:", "fieldCaption:");
				sTempValue= sTempValue.replace("radio:mainTab:", "fieldCaption:");				
				System.out.println(sTempValue);	
				List<WebElement> ele= driver.findElements(By.id(sTempValue));
				if(ele.size() > 0) {
					String script = "return arguments[0].innerHTML";
					fieldText = (String) ((JavascriptExecutor) driver).executeScript(script, ele.get(0));
				}else {
					fieldText = sTempValue.replaceAll("fieldCaption:", "");
				}			
				
				String scriptValue = "return arguments[0].value";
				fieldValue = (String) ((JavascriptExecutor) driver).executeScript(scriptValue,element);
				if(fieldValue.isEmpty()) {
					fieldValue= "None";
				}
				System.out.println(fieldValue);
				if(fieldValues.containsKey(fieldText)) {
					Radiovalues = fieldValues.get(fieldText);
					Radiovalues.add(fieldValue);
					fieldValues.put(fieldText, arrayList);
				}else {
					arrayList = new ArrayList<String>();
					arrayList.add(fieldValue);
					fieldValues.put(fieldText, arrayList);
				}
				
				
				
				System.out.println(fieldText);
				
			}else {
				fieldText = id;
			}
		
		}
		
	
				
		objectIdentified.put(fieldText, fieldType);
		objectStatus.put(fieldText, fieldStatus);
		
		return fieldText;		
	}
	
	
	public static void designAccelator(String pageName) throws Exception {
		
		if(boolFieldExtraction) {
			 filePath = new File("./src/test/resources/Datatable/fieldExtraction.xlsx");
				if (!filePath.exists() || fieldextractFlag == 0){
					createWorkbook("fieldextractor", filePath, pageName);
					fieldextractFlag = 1;
				}
				headerUpdateWorkbook();
				//updatefieldExtraction();
		}
		
		
		 
	
		java.util.List<org.openqa.selenium.WebElement> linkElements3 =driver.findElements(By.tagName("select"));
		for (int i = 0; i < linkElements3.size(); i++) {
			System.out.println(i + "select size");
			String key = updateValues(linkElements3.get(i), "Dropdown");
			fieldextractor.put(key,  new Select(linkElements3.get(i)).getOptions());
			System.err.println( key+ " is enabled  - " +linkElements3.get(i).isEnabled());
				
		}
		
		java.util.List<org.openqa.selenium.WebElement> linkElements5 =driver.findElements(By.tagName("button"));
		for (int i = 0; i < linkElements5.size(); i++) {
			System.out.println(i + "button size");
			updateValues(linkElements5.get(i), "Button");							
				

		}
		
		java.util.List<org.openqa.selenium.WebElement> linkElements6 =driver.findElements(By.tagName("a"));
		for (int i = 0; i < linkElements6.size(); i++) {
			if(linkElements6.get(i).getAttribute("class").contains("nonactive-tab")) {
				fieldValue = linkElements6.get(i).getText();	
				objectIdentified.put(fieldValue, "Link");
				objectStatus.put(fieldValue, linkElements6.get(i).isEnabled());
				
			}
		}
		
		java.util.List<org.openqa.selenium.WebElement> linkElements =driver.findElements(By.tagName("input"));
		for (int i = 0; i < linkElements.size(); i++) {
			if(linkElements.get(i).getAttribute("type").equals("text")){
				
				updateValues(linkElements.get(i), "EditBox");				
				
			
			}else if(!linkElements.get(i).getAttribute("type").equals("") & linkElements.get(i).getAttribute("type").equals("button")){
				
				updateValues(linkElements.get(i), "Button");	
				
			}else if(!linkElements.get(i).getAttribute("type").equals("") & linkElements.get(i).getAttribute("type").equals("radio")){
				System.out.println("*************************Input Type Radio **********************");
				System.out.println("Input Type Radio");
				updateValues(linkElements.get(i), "RadioButton");	
				
			}else if(!linkElements.get(i).getAttribute("type").equals("") & linkElements.get(i).getAttribute("type").equals("checkbox")){
				System.out.println("Input Type Checkbox");
				updateValues(linkElements.get(i), "CheckBox");	
			}else if(!linkElements.get(i).getAttribute("type").equals("") & linkElements.get(i).getAttribute("type").equals("submit")){
				updateValues(linkElements.get(i), "submit");
			
			}else if(!linkElements.get(i).getAttribute("type").equals("text") & linkElements.get(i).getAttribute("value").equals("select")){
				updateValues(linkElements.get(i), "select");
				String key = updateValues(linkElements.get(i), "select");
				fieldextractor.put(key,  new Select(linkElements.get(i)).getOptions());
			}
		}
		
		java.util.List<org.openqa.selenium.WebElement> linkElements7 =driver.findElements(By.tagName("img"));
		for (int i = 0; i < linkElements7.size(); i++) {
			if(linkElements7.get(i).getAttribute("title").contains("Dropdown List") && linkElements7.get(i).getAttribute("dropfield") != null) {
				String value = linkElements7.get(i).getAttribute("dropfield");
				System.out.println(linkElements7.get(i).getAttribute("dropfield"));
				String sTempValue=null;
				sTempValue= value.replace("fieldName:", "fieldCaption:");
				sTempValue= sTempValue.replaceAll(":\\d", "");
							
				List<WebElement> ele= driver.findElements(By.id(sTempValue));
				if(ele.size() > 0) {
					String script = "return arguments[0].innerHTML";
					fieldText = (String) ((JavascriptExecutor) driver).executeScript(script, ele.get(0));
				}else {
					fieldText = sTempValue.replaceAll("fieldCaption:", "");
				}
				
				
				String scriptValue = "return arguments[0].click()";
				fieldValue = (String) ((JavascriptExecutor) driver).executeScript(scriptValue,linkElements7.get(i));	
				Thread.sleep(2000);
				Set<String> winHandles = driver.getWindowHandles();	
				if(winHandles.size() > 2) {
					for (String wHandle : winHandles) {
						driver.switchTo().window(wHandle);
					}
					WebElement table = driver.findElement(By.xpath("//table[contains(@id, 'datadisplay')]/tbody"));
					arrayList = new ArrayList<String>();
					arrayList =  tableHandler(table);
					fieldValues.put(fieldText, arrayList);
					driver.close();
					winHandles = driver.getWindowHandles();
					for (String wHandle : winHandles) {
						driver.switchTo().window(wHandle);
						
					}
					
					
				}else {
					WebElement table = driver.findElement(By.xpath("//table[contains(@id, '" + value + "')]/tbody"));
					arrayList = new ArrayList<String>();
					arrayList =  tableHandler(table);
					fieldValues.put(fieldText, arrayList);
					
				}
				
			}
		}
		
		
		updatefieldExtraction();
		
	}
	
	public static List<String> tableHandler(WebElement tableElement) {
		List<String> arrList = new ArrayList<String>();
		
		List < WebElement > rows_table = tableElement.findElements(By.tagName("tr"));
		
		int rows_count = rows_table.size();
		
		for (int row = 0; row < rows_count; row++) {
			String row_Value = null;
			 List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
			 int columns_count = Columns_row.size();
			   //Loop will execute till the last cell of that specific row.
			   for (int column = 0; column < columns_count; column++) {
			    //To retrieve text from the cells.
			    String celltext = Columns_row.get(column).getText();
			    if (!celltext.isEmpty()) {
			    	if (row_Value == null) {
				    	row_Value = celltext;
				    }else{
				    	row_Value = row_Value + "|"  +  celltext;
				    }
			    }
			    
			   
			   }
			 
			   arrList.add(row_Value);
		}	
		return arrList;
		
		
		
		
		
	}
	
	
	
	//Create a new Workbook
	public static void createWorkbook(String workBook, File filePath, String sheetName){
		FileOutputStream outStream;
		try {
			switch (workBook.toLowerCase()) {
			case "objectextractor":
				System.out.println("Create Workbook");
				outStream= new FileOutputStream(filePath);		
				wwb=new XSSFWorkbook();
				sheet = wwb.createSheet(sheetName);
				wwb.write(outStream);
				outStream.close();
				break;
				
			case "fieldextractor":
				
				outStream= new FileOutputStream(filePath);		
				wwb=new XSSFWorkbook();
				sheet = wwb.createSheet(sheetName);
				wwb.write(outStream);
				outStream.close();
				break;

			default:
				break;
			}
			
			
			
		} catch (Exception e) {			// TODO Auto-generated catch block
			e.printStackTrace();
		}
					
	}
	

public static void insertCellValue(Row row, int col, String value) {
	XSSFCellStyle style = (XSSFCellStyle) wwb.createCellStyle();	
	Cell cell;
	
	 Font font = wwb.createFont();  
     font.setFontHeightInPoints((short)11);  
     font.setFontName("Palatino Linotype");     
     
     // Applying font to the style  
        style.setFont(font); 
        style.setAlignment(HorizontalAlignment.LEFT);
        cell = row.createCell(col);
    	cell.setCellValue(value);
		cell.setCellStyle(style);        
        
}
	
public static void CellAlignment(Row row, int col) {
	XSSFCellStyle style = (XSSFCellStyle) wwb.createCellStyle();
	
	Cell cell;
	
	
	 Font font = wwb.createFont();  
     font.setFontHeightInPoints((short)11);  
     font.setFontName("Palatino Linotype");     
     font.setBold(true); 
     // Applying font to the style  
        style.setFont(font); 
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());  
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND); 
        style.setBorderBottom(BorderStyle.THIN);  
        style.setBottomBorderColor(IndexedColors.BLACK.getIndex());  
        style.setBorderRight(BorderStyle.THIN);  
        style.setRightBorderColor(IndexedColors.BLACK.getIndex());  
        style.setBorderTop(BorderStyle.THIN);  
        style.setTopBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderLeft(BorderStyle.THIN);
        style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        cell = row.getCell(col) ; 
        sheet.setColumnWidth(col, 5000);
		cell.setCellStyle(style);        
        
}	
	
	
	
	

	public static void updatefieldExtraction() {
		FileInputStream inputstreams;
		try {
			inputstreams = new FileInputStream(filePath);
			wwb = new XSSFWorkbook(inputstreams);
			sheet = wwb.getSheetAt(0);
			Row row;
			for (String field : objectIdentified.keySet()) {
				int rowCount = sheet.getLastRowNum();				
				row = sheet.createRow(rowCount + 1);
				insertCellValue(row, 0, field);
				insertCellValue(row, 1, objectIdentified.get(field));
				if(objectStatus.get(field)) {
					insertCellValue(row, 2, "Enabled");
				}else {
					insertCellValue(row, 2, "Disabled");
				}
				
				int col = 3;
				if (objectIdentified.get(field).equalsIgnoreCase("Dropdown")) {
					for (WebElement ele : fieldextractor.get(field)) {
						String script = "return arguments[0].innerHTML";
						String val = (String) ((JavascriptExecutor) driver).executeScript(script, ele);
						if (!(val.trim().isEmpty())) {
							insertCellValue(row, col, val);
							col++;
						}

					}
				} else if (objectIdentified.get(field).equalsIgnoreCase("RadioButton")) {
					for (String text : fieldValues.get(field)) {
						System.out.println(text);
						insertCellValue(row, col, text);
						col++;

					}

				}else if (objectIdentified.get(field).equalsIgnoreCase("EditBox") &&  fieldValues.containsKey(field) ) {
					for (String text : fieldValues.get(field)) {
						System.out.println(text);
						if((text != null)) {
							insertCellValue(row, col, text);
							col++;
						}
						

					}
					
				}

			}

			int rowCount = sheet.getLastRowNum();
			System.out.println(rowCount);
			int colCount = sheet.getRow(0).getLastCellNum();
			System.out.println(colCount);
			row = sheet.getRow(0);
			for (int j = 0; j < colCount; j++) {
				CellAlignment(row, j);
			}

			inputstreams.close();
			FileOutputStream outStream = new FileOutputStream(filePath);
			wwb.write(outStream);
			outStream.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void headerUpdateWorkbook() throws IOException {
		FileInputStream inputstreams = new FileInputStream(filePath);
		wwb = new XSSFWorkbook(inputstreams);
		sheet = wwb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		Row row;
		if (rowCount < 1) {
			row = sheet.createRow(0);
			insertCellValue(row, 0, "Object");
			insertCellValue(row, 1, "ObjectType");
			insertCellValue(row, 2, "ObjectStatus");
			for (int i = 3; i < 50; i++) {
				insertCellValue(row, i, "FieldValue-" + (i - 2));
			}
		}
		inputstreams.close();
		FileOutputStream outStream = new FileOutputStream(filePath);
		wwb.write(outStream);
		outStream.close();

	}
}
