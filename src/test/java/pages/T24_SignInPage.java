package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import utilities.CoreTapWrappers;

public class T24_SignInPage extends CoreTapWrappers {
	
	private WebDriver driver;



	public T24_SignInPage(WebDriver driver){
		this.driver = driver;
		this.test = test;		 
		PageFactory.initElements(this.driver, this);
		if(!verifyTitle("T24 Sign in")){
			reportStep("This is not T24 Sign in Page", "FAIL");
		}
	}
	//T24 Signin User Name
	@FindBy(how=How.ID, using="signOnName")
	WebElement txtbx_UserName;
	
	//T24 Signin Password
	@FindBy(how=How.ID, using ="password")
	WebElement txtbx_Password;
	
	@FindBy(how=How.ID, using="sign-in")
	WebElement btn_SignIn;
	
	
	
	public void enterUserName(String userName) {
		enterInputText(txtbx_UserName, userName, "User Name");
	}
	
	public void enterPassword(String userPassword) {
		enterInputText(txtbx_Password, userPassword, "Password");
	}
	
	public void clickSignIn() {
		webElementClick(btn_SignIn, "Sign In");
	}
	
	
	

}
