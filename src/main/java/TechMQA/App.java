package TechMQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

/**
 * Hello world!
 *
 */
public class App extends LeafTapsWrappers
{
	
	private RemoteWebDriver driver;
	private ExtentTest test;

	public App(RemoteWebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}
	
    public void Sample(String s)
    {
    	invokeApp("chrome");
    	enterById("signOnName", s);
       
        
    }
}
