package pages;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import TechMQA.ExcelWriter;
import utilities.CoreTapWrappers;

public class ObjectExtractor extends CoreTapWrappers {
	private WebDriver driver;
	private ExtentTest test;
	public ObjectExtractor(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}
	
	public void objectExtractPageFactory(String pageName) {
		ExcelWriter objExtractor = new  ExcelWriter(driver);
		try {
			objExtractor.designAccelator(pageName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
