/*package TechMQA;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.commons.exec.launcher.Java13CommandLauncher;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.How;



public class ReadObject {
	static Map<String, String> identifiedObjects;
	static Map<String, String> identifiedAttributes;
	static Map<String, String> identifiedName;
	
	static HashMap<String, String> newObject;
	static HashMap<String, String> newattributes;
	static HashMap<String, String> newObjectName;
	static Map<String, String> existingObject;
	static Map<String, String> existObjAttributes;
	static HashMap<String, String> existingObjectComments;
	static String indexValues = "";
	static boolean skelCodeFlag = true;
	public static void createPageFactory(String pageName) {
	
	public static void main(String[] args) {
		
		String pageName = "CustomerCreation";
		
		
		String path = "./src/test/resources/Datatable/accelator.xlsx";		
		//String pageName = "ObjectRepository";
		identifiedObjects = new TreeMap<String, String>();
		identifiedAttributes = new HashMap<String, String>();
		identifiedName = new HashMap<String, String>();
		
		newObjectName = new HashMap<String, String>();
		newObject = new HashMap<String, String>();
		newattributes = new HashMap<String, String>();
		
		
		
		
		
		File file = new File(path);
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream(file);
		
		XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		Row row = sheet.getRow(0);
		String objectName = null, attribute = null, fieldType = null, objectProperty = null;
		int colCount = row.getLastCellNum();
		for (int i=1 ; i <= rowCount ; i++){			
			String fieldText = null;
			row = sheet.getRow(i);
			System.out.println(row.getCell(1).getStringCellValue());
			if (!(row.getCell(0) == null || row.getCell(0).toString().isEmpty() )){
				
				objectName	= row.getCell(0).getStringCellValue();
			}
			if (!(row.getCell(1) == null)){
				fieldType = row.getCell(1).getStringCellValue();
			}	
			if (!(row.getCell(2) == null || row.getCell(2).toString().isEmpty() )){
				attribute = "ID";
				objectProperty	= row.getCell(2).getStringCellValue();
			}else if (!(row.getCell(3) == null || row.getCell(3).toString().isEmpty())){
				attribute = "name";
				objectProperty	= row.getCell(3).getStringCellValue();
			}else if (!(row.getCell(5) == null || row.getCell(5).toString().isEmpty())){
			attribute = "Class";
				objectProperty	= row.getCell(5).getStringCellValue();
			}else if (!(row.getCell(9) == null || row.getCell(9).toString().isEmpty())){
					attribute = "Link";
					objectProperty	= row.getCell(9).getStringCellValue();
			}else if(!(row.getCell(10) == null || row.getCell(10).toString().isEmpty())){
				attribute = "Xpath";
			 objectName	= row.getCell(10).getStringCellValue();
		}
			
			
			if (!(identifiedAttributes.containsKey(objectName))){	
					identifiedObjects.put(objectName, objectProperty);
					identifiedAttributes.put(objectName, attribute);										
					identifiedName.put(objectName, fieldType);			
			
			}
			
		}
		changeClass(pageName);
		mapComparison(pageName);		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public static void insertObjects(String objectName, String objectType, String methodName, String excelColumn, String pageName, String locators, String locatorValue) {
		
		
			
		 
		String sql = "INSERT INTO ObjectDetails(ObjectName, ObjectType, MethodName, ExcelColumn , PageName, Locators, LocatorValue) VALUES(?, ?, ?, ?, ?,?, ?)";  
		   
	        try{  
	            Connection conn = SQLite.connect(); 
	            
	            
	            PreparedStatement pstmt = conn.prepareStatement(sql);  
	            pstmt.setString(1, objectName);  
	            pstmt.setString(2, objectType);
	            pstmt.setString(3, methodName);
	            pstmt.setString(4, excelColumn);
	            pstmt.setString(5, pageName);
	            pstmt.setString(6, locators);
	            pstmt.setString(7, locatorValue);
	            pstmt.executeUpdate();  
	            conn.close();
	        } catch (SQLException e) {  
	            System.out.println(e.getMessage());  
	        }  
	}
	
	
	public static void changeClass(String pageName){		
		existingObject = new TreeMap<String, String>();
		existObjAttributes = new HashMap<String, String>();
		existingObjectComments = new HashMap<String, String>();
		String existComments = "" ;
		File javaFile = new File("./src/test/java/TechMQA/" +pageName + ".java");
		try {
			BufferedReader br = new BufferedReader(new FileReader(javaFile));
            String st;
            while((st = br.readLine()) != null){
            	String sPrefix = "@FindBy";
            	if (st.contains(sPrefix)){ 
            		StringBuffer objectAttributes = new StringBuffer();
            		StringBuffer objectName = new StringBuffer();
            		 int len = sPrefix.length();
            		 String variable = st.substring(st.indexOf(sPrefix));
            		 variable = variable.substring(len+1);
            		 System.out.println(variable);
            		 objectName.append(variable.substring(variable.indexOf("WebElement")+10).trim().replace(";", ""));
            		 System.out.println(objectName.toString());
            		 variable = variable.substring(0, variable.indexOf(")"));
            		String[] varSplit = variable.split(",");
            		String variableKey = varSplit[0].substring(varSplit[0].indexOf("=")+1).replace("\"", "");            		
            		String variableValue =varSplit[1].substring(varSplit[1].indexOf("=")+1).replace("\"", "");            		
            		existingObject.put(objectName.toString().trim(), variableValue.trim());
            		existObjAttributes.put(objectName.toString().trim(), variableKey.trim());
            		existingObjectComments.put(objectName.toString().trim(), existComments);
            				 
            	}else{
            		if(!st.isEmpty()){
            			if(!(st.contains("import") || st.contains("class")|| st.contains("package") || st.contains("//"))) {
            				indexValues = indexValues +"\n" +st;
            			}
            			
            			if(st.contains("//")) {
            				existComments = st;
            			}
            			
            		}else {
            			if(!indexValues.isEmpty()) {
            				indexValues = indexValues + "\n";
            			}
            			
            		}
            	}
            
            }
            
            for (Entry<String, String> entry: existingObject.entrySet()){
    			System.out.println(entry.getKey() + "-" +entry.getValue());
    		}
		
		
	}catch(Exception e){
		System.out.println(e);
		
	}
		
	}

public static void createPage(String pageName) {
	
	HashMap<String, String> propertyChange = new HashMap<String, String>();
	String sql = "SELECT * FROM ObjectDetails WHERE PageName = '" + pageName + "'";
	try {
			Connection conn = SQLite.connect();
			Statement stmt = conn.createStatement();
			ResultSet rs;
			rs = stmt.executeQuery(sql);
			File javaFile = new File("./src/test/java/TechMQA/" +pageName + ".java");	
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(javaFile)));
			String FileContent = null;
			String outputValue = null;	
			writer.write("package TechMQA;\n\n");	
			writer.write("import java.util.List;\nimport org.openqa.selenium.By;\nimport org.openqa.selenium.By;\r\n" + 
					"import org.openqa.selenium.WebElement;\r\n" + 
					"import org.openqa.selenium.support.FindBy;\r\n" + 
					"import utilities.CoreTapWrappers;\r\n"+
					"import org.openqa.selenium.support.How;\n\n");
			writer.write("public class " + pageName + " extends CoreTapWrappers {\n\n");
			while (rs.next()) {
				propertyChange.put(rs.getString("ObjectName"), rs.getString("Locators"));
			}
			
			for(Entry<String, String> key: propertyChange.entrySet()) {
				writer.write("\n\n @FindBy(how=" + key.getValue() + ", using=\"" + key.getKey() +"\") WebElement " + key.getKey() +  ";" );
			}
			writer.write(indexValues);
			if(indexValues.isEmpty()) {
				writer.write("\n}\n");
			}
			
		    writer.close();
	}catch (Exception e) {
		
	}
}
	
	
	
	
public static void mapComparison(String pageName) throws IOException{
	String comparisonValue = null;
	String comparisonAttributes = null;
	ArrayList<String> newlist = new ArrayList<String>();
	HashMap<String, String> propertyChange = new HashMap<String, String>();	
	// To compare existing and new objects
	HashMap<String, String> comparisonChange = new HashMap<String, String>(identifiedAttributes);
	TreeSet<String> unionKeys = new TreeSet<>(existingObject.keySet());
	unionKeys.addAll(identifiedObjects.keySet());	 
	unionKeys.removeAll(existingObject.keySet());	 
	System.out.println(unionKeys);
	comparisonChange.keySet().removeAll(unionKeys);
	
	for(String k: comparisonChange.keySet()) {		
		if(!existingObject.get(k).equalsIgnoreCase(identifiedObjects.get(k))) {
			System.out.println( k+"-"+existingObject.get(k));
			existingObject.put(k, identifiedObjects.get(k));
			existObjAttributes.put(k, identifiedAttributes.get(k));
			propertyChange.put(k, "Yes");
		}		
	}
	
	
	File javaFile = new File("./src/test/java/TechMQA/" +pageName + ".java");	
	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(javaFile)));
	String FileContent = null;
	String outputValue = null;	
	writer.write("package TechMQA;\n\n");	
	writer.write("import java.util.List;\nimport org.openqa.selenium.By;\nimport org.openqa.selenium.By;\r\n" + 
			"import org.openqa.selenium.WebElement;\r\n" + 
			"import org.openqa.selenium.support.FindBy;\r\n" + 
			"import utilities.CoreTapWrappers;\r\n"+
			"import org.openqa.selenium.support.How;\n\n");
	writer.write("public class " + pageName + " extends CoreTapWrappers {\n\n");	
	
	
	for (String key:existingObject.keySet() ){
		if(propertyChange.containsKey(key)){
			String timeStamp = new SimpleDateFormat("dd.MM.yyyy - HH.mm.ss").format(new Date());
			writer.write("\n//Modification done on object property - " + timeStamp);
			 existObjAttributes.put(key, "How."+  existObjAttributes.get(key));
		}else if(!(existingObjectComments.get(key)==null)){
			writer.write("\n" + existingObjectComments.get(key) );
		}
		writer.write("\n\n @FindBy(how=" + existObjAttributes.get(key) + ", using=\"" + existingObject.get(key) +"\") WebElement " + key +  ";" );
		
	}	
	
	for(String s: unionKeys) {
		String timeStamp = new SimpleDateFormat("dd.MM.yyyy - HH.mm.ss").format(new Date());
		writer.write("\n //New Object added - " + timeStamp);
		writer.write("\n\n  @FindBy(how=");
		String sAttribute = identifiedAttributes.get(s);
		
		switch (sAttribute) {
		case "ID":
			outputValue = "How.ID, using= \""+ identifiedObjects.get(s)+"\")";
			break;
			
		case "name":
			outputValue = "How.NAME, using= \""+ identifiedObjects.get(s)+"\")";
			break;
			
		case "Class":
			outputValue = "How.CLASSNAME, using= \""+ identifiedObjects.get(s) +"\")";
			break;
		case "Link":
			outputValue = "How.LINK_TEXT, using= \""+ identifiedObjects.get(s) +"\")";
			break;
		case "Xpath":
			outputValue = "How.XPATH, using= \""+  identifiedObjects.get(s) +"\");";
			break;
		
		default:
			break;
		}
		if (identifiedName.get(s).equalsIgnoreCase("radio")){
			writer.write(outputValue + " List<WebElement> " + s + ";");
		}else {
			writer.write(outputValue + " WebElement " + s + ";");
		}
		
	}
	
	
	for(String s: unionKeys) {
		
		String newValue = s;
		String methodName = null, excelValue = null;
		System.out.println(newValue);
		switch (identifiedName.get(s).toLowerCase()) {
		case "text":
			methodName = "enter_" + newValue ;
			excelValue= newValue.replace("_", " ") ;
			writer.write("\n\n" );
			writer.write("\r\n public void enter_" + newValue + "(String temp_" + newValue + "){ \n \n enterInputText(" + newValue+ ",temp_" + newValue + ",\"" + newValue.replace("_", " ") + "\"); \n } ");
			break;
			
		case "select":
			methodName = "select_" + newValue ;
			excelValue= newValue.replace("_", " ") ;
			writer.write("\n\n" );
			writer.write("\r\n public void select_" + newValue + "(String temp_" + newValue + "){ \n \n selectVisibileText(" + newValue+ ",temp_" + newValue + ",\"" + newValue.replace("_", " ") + "\"); \n } ");
			break;	
			
		case "button":
			methodName = "click_" + newValue ;
			excelValue= "";
			writer.write("\n\n" );
			writer.write("\r\n public void click_" + newValue + "(){ \n \n webElementClick(" + newValue+ ",\"" + newValue.replace("_", " ") + "\"); \n } ");
			break;	
		case "radio":
			methodName = "select_" + newValue ;
			excelValue= newValue.replace("_", " ") ;
			writer.write("\n\n" );
			writer.write("\r\n public void select_" + newValue + "(String temp_" + newValue + "){ \n \n selectRadioButton(" + newValue+ ", temp_" + newValue + ",\""  + newValue.replace("_", " ") + "\"); \n } ");	
			break;
			
		case "link":
			methodName = "click_" + newValue ;
			excelValue= "";
			writer.write("\n\n" );
			writer.write("\r\n public void click_" + newValue + "(){ \n \n webElementClick(" + newValue+ ",\"" + newValue.replace("_", " ") + "\"); \n } ");
			break;
			
		case "CheckBox":
			writer.write("//Skeleton code for new object" + newValue + "\n\n" );
			writer.write("ieButtonJSClick(ob." + newValue + ");\n");	
			writer.write("webElementClick(ob." + newValue + ");\n\n");
			break;	
			
				
		case "Link":
			writer.write("//Skeleton code for new object " + newValue + "\n\n" );
			writer.write("ieButtonJSClick(ob." + newValue + ");\n");	
			writer.write("webElementClick(ob." + newValue + ");\n");
			writer.write("getTextFromWebElement(ob."+ newValue +");\n\n");
			break;

		default:
			break;		
		
		}
		
		insertObjects(s ,identifiedName.get(s), methodName, excelValue , pageName ,identifiedAttributes.get(s), identifiedObjects.get(s));
		
		
		
	}
	
    
	writer.write(indexValues);
	if(indexValues.isEmpty()) {
		writer.write("\n}\n");
	}
	
    writer.close();
    
    
    
	if(skelCodeFlag) {
    	createSkeletonCode(pageName, unionKeys);
    }
    
    
    String dataPath = "./src/test/resources/Datatable/T24-TestData_Sample.xlsx";
    File datafile = new File(dataPath);
	FileInputStream inputDataStream;

	
	try {
		inputDataStream = new FileInputStream(datafile);			
		XSSFWorkbook workbookData;
		workbookData = new XSSFWorkbook(inputDataStream);
		XSSFSheet workSheet;
		XSSFCellStyle style = (XSSFCellStyle) workbookData.createCellStyle();
		Row row;
		Cell cell;
		 Font font = workbookData.createFont();  
         font.setFontHeightInPoints((short)11);  
         font.setFontName("Palatino Linotype");
         font.setBold(true);  
         
         // Applying font to the style  
         style.setFont(font); 
         style.setAlignment(HorizontalAlignment.CENTER);
		style.setFillForegroundColor(IndexedColors.PALE_BLUE.getIndex());  
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND); 
        style.setBorderBottom(BorderStyle.THIN);  
        style.setBottomBorderColor(IndexedColors.BLACK.getIndex());  
        style.setBorderRight(BorderStyle.THIN);  
        style.setRightBorderColor(IndexedColors.BLACK.getIndex());  
        style.setBorderTop(BorderStyle.THIN);  
        style.setTopBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderLeft(BorderStyle.THIN);
        style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
         
		int sheets = workbookData.getNumberOfSheets();
		boolean pageExist = false;
		for(int i = 0; i< sheets; i++) {
			if(workbookData.getSheetName(i).equals(pageName)) {
				pageExist = true;
				break;
			}			
		}
		if (!pageExist) {
			workSheet = workbookData.createSheet(pageName);			
			 row = workSheet.createRow(0);
			 cell = row.createCell(0);
			 workSheet.setColumnWidth(0, 5000);
			 cell.setCellValue("ScenarioName");			 
			 cell.setCellStyle(style);
			 cell = row.createCell(1);
			 workSheet.setColumnWidth(1, 5000);
			 cell.setCellValue("ExecutionFlag");			 
			 cell.setCellStyle(style);
			 row.setHeight((short) 400); 
		}else {
			workSheet = workbookData.getSheet(pageName);
			 row = workSheet.getRow(0);
		}
		
		for(String s: unionKeys) {
			if(!(identifiedName.get(s).toLowerCase().equals("button") || identifiedName.get(s).toLowerCase().equals("link"))) {
				int cols = row.getLastCellNum();
				cell = row.createCell(cols); 
				workSheet.setColumnWidth(cols, 5000);;  
				cell.setCellValue(s.replaceAll("_", ""));				
				cell.setCellStyle(style);  
			}
			
		}
		inputDataStream.close();
		FileOutputStream outStream = new FileOutputStream(datafile);
		workbookData.write(outStream);
		outStream.close();
		
		
		
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
    
}


public static void createSkeletonCode(String pageName, TreeSet<String> unionKeys) throws IOException {
	File javaGlueFile = new File("./src/test/java/TechMQA/" +pageName + "_Glue.java");	
	BufferedWriter writerGlue = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(javaGlueFile)));		
	writerGlue.write("package TechMQA;\n\n");	
	writerGlue.write("import java.util.List;\nimport org.openqa.selenium.By;\nimport org.openqa.selenium.By;\r\n" + 
			"import org.openqa.selenium.WebElement;\r\n" + 
			"import org.openqa.selenium.support.FindBy;\r\n" + 
			"import utilities.CoreTapWrappers;\r\n\n");
	writerGlue.write("public class " + pageName + "_Glue extends CoreTapWrappers {\n\n");
	writerGlue.write(pageName + " " + pageName.toLowerCase() + " = new " + pageName + "();");
	writerGlue.write("public void seletonGlueCode(){\n\n");
	
for(String s: unionKeys) {
		
		String newValue = s;
		
		System.out.println(newValue);
		switch (identifiedName.get(s).toLowerCase()) {
		case "text":
			writerGlue.write("\n\n" );
			writerGlue.write("\r\n"+ pageName.toLowerCase() + ".enter_" + newValue + "(excelHashMapValues.get(\"" + newValue.replaceAll("_","") +"\")); ");
			break;
			
		case "select":
			writerGlue.write("\n\n" );
			writerGlue.write("\r\n"+ pageName.toLowerCase()  +".select_" + newValue + "(excelHashMapValues.get(\"" + newValue.replaceAll("_","") +"\"));");
			break;	
			
		case "button":
			writerGlue.write("\n\n" );
			writerGlue.write("\r\n"+ pageName.toLowerCase()  +".click_" + newValue + "();");
			break;	
		case "radio":
			writerGlue.write("\n\n" );
			writerGlue.write("\r\n"+ pageName.toLowerCase()  +".select_" + newValue + "(excelHashMapValues.get(\"" + newValue.replaceAll("_","") +"\")); ");	
			break;
			
		case "link":
			writerGlue.write("\n\n" );
			writerGlue.write("\r\n"+ pageName.toLowerCase()  +".click_" + newValue + "();");
			break;
			
		case "CheckBox":
			writer.write("//Skeleton code for new object" + newValue + "\n\n" );
			writer.write("ieButtonJSClick(ob." + newValue + ");\n");	
			writer.write("webElementClick(ob." + newValue + ");\n\n");
			break;	
			
				
		case "Link":
			writer.write("//Skeleton code for new object " + newValue + "\n\n" );
			writer.write("ieButtonJSClick(ob." + newValue + ");\n");	
			writer.write("webElementClick(ob." + newValue + ");\n");
			writer.write("getTextFromWebElement(ob."+ newValue +");\n\n");
			break;

		default:
			break;		
		
		}
}
	
	
	writerGlue.write("\n}\n}");
	writerGlue.close();
    
}



}
*/