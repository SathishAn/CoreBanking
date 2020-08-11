package TechMQA;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;
import wrappers.LeafTapsWrappers;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;

public class NewTest extends LeafTapsWrappers {
	RemoteWebDriver driver ;

	
  @Test(dataProvider = "dp", threadPoolSize=3)
  public void f(String s) {
	
	 
	  App ap= new App(driver, test);
			  ap.Sample(s);;
	  
	  
	
	  
	  
  }

  @DataProvider(parallel=true)
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"a" },
      new Object[] {"b" },
      new Object[] {"c" },
    };
  }
}
