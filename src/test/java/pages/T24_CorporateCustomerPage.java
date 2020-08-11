package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import TechMQA.ExcelWriter;
import utilities.CoreTapWrappers;

public class T24_CorporateCustomerPage extends CoreTapWrappers{
	private WebDriver driver;


	public T24_CorporateCustomerPage(WebDriver driver) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(this.driver, this);
		if (!verifyTitle("CUSTOMER")) {
			reportStep("This is not a customer Page", "FAIL");
		}
		wait(2000);
		driver.manage().window().maximize();
	}
	
	
	public void call_ObjectExtractor() {
				
		
		ExcelWriter excel= new ExcelWriter(driver);
		try {
			excel.designAccelator("T24_CorporateCustomerPage");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
