package utilities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;


public class DataProvider extends CoreTapWrappers {
	public String TestDataFilePath = "./src/test/resources/datatable";
	
	Fillo fillo=new Fillo();
	
	public HashMap<String, String> extractExcelData(String ScenarioName, HashMap<String, String> excelHashMapValues) throws FilloException, IOException
	{
		
		Connection connection=fillo.getConnection(TestDataFilePath +"/"+ config.getTestDataFile());
		String sheetname = excelHashMapValues.get("sheetName");
		String strQuery="Select * from "+sheetname+" where ScenarioName='" +ScenarioName +"'";
		Recordset recordset=connection.executeQuery(strQuery);
		while(recordset.next())
		{
			ArrayList<String> ColCollection = recordset.getFieldNames();
			int Iter;
			int size = ColCollection.size();
			for (Iter=0 ; Iter<= (size-1) ; Iter++)
			{
				String ColName = ColCollection.get(Iter);
				String ColValue = recordset.getField(ColName);
				excelHashMapValues.put(ColName, ColValue);				
			}
		}
		recordset.close();
		connection.close();
		return excelHashMapValues;
	}
	
	public HashMap<String, String> extractExcelData(String ScenarioName,String sheetname, HashMap<String, String> excelHashMapValues) throws FilloException, IOException
	{
		Connection connection=fillo.getConnection(TestDataFilePath +"/"+ config.getTestDataFile());
		String strQuery="Select * from "+sheetname+" where ScenarioName='" +ScenarioName +"'";
		Recordset recordset=connection.executeQuery(strQuery);
		while(recordset.next())
		{
			ArrayList<String> ColCollection = recordset.getFieldNames();
			int Iter;
			int size = ColCollection.size();
			for (Iter=0 ; Iter<= (size-1) ; Iter++)
			{
				String ColName = ColCollection.get(Iter);
				String ColValue = recordset.getField(ColName);
				excelHashMapValues.put(ColName, ColValue);				
			}
		}
		recordset.close();
		connection.close();
		return excelHashMapValues;
	}	
	
	
	public void insertExcelData(String ScenarioName, String key, String Sheetname, String value) throws Exception
	{
		Connection connection=fillo.getConnection(TestDataFilePath +"/"+ config.getTestDataFile());		
		String strQuery="Update "+Sheetname+" Set "+key+"='"+value.replaceAll("'", "")+"' where ScenarioName='" +ScenarioName +"'";
		connection.executeUpdate(strQuery);
		connection.close();
	}
	
	public void insertpreRequesitExcelData(String ScenarioName, String key, String Sheetname,  String value) throws Exception
	{
		Connection connection=fillo.getConnection(TestDataFilePath +"/"+ config.getTestDataFile());		
		String strQuery="Update "+Sheetname+" Set "+key+"='"+value+"' where PreRequsiteTestCaseID='" +ScenarioName +"'";
		connection.executeUpdate(strQuery);
		connection.close();
	}
	
}



