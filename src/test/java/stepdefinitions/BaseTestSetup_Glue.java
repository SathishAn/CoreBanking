package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;

import com.codoid.products.exception.FilloException;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


import techM.TechMRunnerClass;
import utilities.CoreTapWrappers;
import utilities.DataProvider;
import utilities.GenericWrapper;

public class BaseTestSetup_Glue extends CoreTapWrappers {
	DataProvider dataprovider = new DataProvider();
	
	@Before()
	public void beforeCucumber(Scenario scenario) {  
		try {
    	this.scenario = scenario;
    	StringBuffer scenarioName = new StringBuffer();
    	StringBuffer testcaseName = new StringBuffer();
    	StringBuffer sheetName = new StringBuffer();
    	scenarioName.append(scenario.getName());
    	testcaseName.append(scenarioName.substring(scenarioName.indexOf("|~")+2, scenarioName.indexOf("|@")).trim().replace("\"", ""));
    	sheetName.append(scenarioName.substring(scenarioName.indexOf("|@")+2).trim().replace("\"", ""));
    	excelHashMapValues.put("scenarioName", testcaseName.toString());
    	excelHashMapValues.put("sheetName", sheetName.toString());	    	
    	
    		dataprovider.extractExcelData(testcaseName.toString(), sheetName.toString(), excelHashMapValues);
    		
    		if(excelHashMapValues.get("ExecutionFlag").equals("Y")) {
        		System.out.println("########################################### Scenario: " +  scenarioName.toString().substring(0,scenarioName.indexOf("|")) + " #############################################" );
        		System.out.println("TestCase Name:" + testcaseName.toString());
        		
    			test = startTestCase(testcaseName.toString(), scenarioName.toString().substring(0,scenarioName.indexOf("|")));
    			CreateScreenshotDoc(testcaseName.toString(), scenarioName.toString());
        	}else {
        		throw new SkipException("Test skipped");
        	}
    		
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}    	
    	
    	
    	
    	
    	
    }
	
	 
	 
	 

	
	
	@After
	public void testAfter() {
		if(excelHashMapValues.get("ExecutionFlag").equals("Y")) {
			endTestcase();
	    	//closeAllBrowsers();
	    	System.out.println("########################################### End of Test Case #################################################");
		}
	}
	
}
