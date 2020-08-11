package pages;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import TechMQA.ExcelWriter;
import TechMQA.FieldExtractorUtils;
import utilities.CoreTapWrappers;

public class FieldExtractor extends CoreTapWrappers {
	private WebDriver driver;
	private ExtentTest test;
	public FieldExtractor(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.test = test;
	}
	
	public void objectExtractPageFactory(String pageName) {
		try {
		FieldExtractorUtils fieldExtractor = new FieldExtractorUtils(driver);
			fieldExtractor.designAccelator(pageName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
