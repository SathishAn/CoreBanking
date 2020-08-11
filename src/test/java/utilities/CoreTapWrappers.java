package utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class CoreTapWrappers extends GenericWrapper {
	
	

	public String browserName;
	public String dataSheetName;
	public String testcaseSheetName;
	public Scenario scenario;
		
	public static HashMap<String, String> excelHashMapValues = new HashMap<String, String>();
	
	@BeforeSuite
	public void beforeSuite(){
		
		startResult();
	}
	
	@AfterSuite
	public void afterSuite(){
		endResult();
	}	
	
	
	
}
