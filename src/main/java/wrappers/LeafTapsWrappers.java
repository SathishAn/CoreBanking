package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class LeafTapsWrappers extends GenericWrappers {
	
	public String browserName;
	public String dataSheetName;
	public String testcaseSheetName="";
	
	

	@BeforeSuite
	public void beforeSuite(){
		startResult();
	}

	@BeforeTest
	public void beforeTest(){
//		loadObjects();
	}
	
	@BeforeMethod
	public void beforeMethod(){
		test = startTestCase(testCaseName, "");
		test.assignCategory("");
		test.assignAuthor("");
		
	}
		
	@AfterSuite
	public void afterSuite(){
		endResult();
	}

	@AfterTest
	public void afterTest(){
//		unloadObjects();
	}
	
	@AfterMethod
	public void afterMethod(){
		endTestcase();
//		quitBrowser();
		
	}
	
	@DataProvider(name="fetchData")
	public Object[][] getData(){
		return DataInputProvider.getSheet(dataSheetName, testcaseSheetName);		
	}	
	
	
}






