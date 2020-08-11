package stepdefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FieldExtractor;
import pages.ObjectExtractor;
import pages.T24_HomePage;
import pages.T24_IndividualCustomerPage;
import pages.T24_SignInPage;
import pages.T24_UnAuthorisedCustomerPage;
import utilities.CoreTapWrappers;
import utilities.GenericWrapper;

public class T24_SignIn_Glue extends CoreTapWrappers {
	
	
	
	@Given("^Launch the \"([^\"]*)\" appliaction$")
	public void launch_the_Application(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions			 
		invokeApp(arg1, "Chrome");
	  
	   
	}  
	
	@Then("^Home page should be navigate$")
	public void home_page_should_be_navigate() {
		captureScreenshot("HomePage Navigation");
	}
	
	
	
	
	
	@When("^navigate to \"([^\"]*)\" under the user menu$")
	public void i_enter_the_Mandate_details_in_the_application(String tempValue) throws Throwable {
	   
		T24_HomePage homePage = new T24_HomePage(getDriver());
		homePage.switchFrame();
		
		
		switch (tempValue.toLowerCase()) {
		case "individual customer":
			homePage.click_UserMenu();
			homePage.click_CustomerMenu();
			homePage.click_IndividualCustomerMenu();
			break;
			
		case "corporate customer":
			homePage.click_UserMenu();
			homePage.click_CustomerMenu();
			homePage.click_corporateCustomerMenu();			
			break;
			
		case "authorise customer":		
			homePage.click_UserMenu();
			homePage.click_CustomerMenu();
			homePage.click_AuthoriseCustomerMenu();
			break;
			
		case "open saving account":
			homePage.click_UserMenu();
			homePage.click_AccountMenu();
			homePage.click_openSavingAccount();
			break;
			
		case "authorise account":
			homePage.click_UserMenu();
			homePage.click_AccountMenu();
			homePage.click_AuthoriseAccountMenu();
			break;
			
			
		case "private customer":
			homePage.click_UserMenu();
			homePage.click_privateOperationsMenu();
			homePage.click_securitiesMenu();
			homePage.Wait_frontOfficeMenu();			
			homePage.click_frontOfficeMenu();
			homePage.click_clientMaintenanceMenu();
			homePage.click_privateCustomerMenu();
			homePage.click_privateCustomerLinkMenu();
			break;
			
		case "buy order":
			homePage.click_UserMenu();
			homePage.click_privateOperationsMenu();
			homePage.click_securitiesMenu();
			homePage.Wait_frontOfficeMenu();
			homePage.click_frontOfficeMenu();
			homePage.click_directOrderingMenu();
			homePage.click_singleOrdersMenu();
			homePage.click_orderEntryMenu();
			homePage.click_buyOrderMenu();	
			
			break;
			
		case "security transaction":
			homePage.click_UserMenu();
			homePage.click_privateOperationsMenu();
			homePage.click_securitiesMenu();
			homePage.click_backOfficeMenu();
			homePage.click_securitiesAuthorisationMenu();
			homePage.click_unauthoriseSecurityTransaction();
			break;
			
		case "cash deposit":
			homePage.click_UserMenu();
			homePage.click_retailOperations();
			homePage.click_accountTransactions();
			homePage.click_teller();
			homePage.click_tellerOperations();
			homePage.click_tellerCash();
			homePage.click_cashDepositLocal();
			break;
			
		case "customer portfolio":
			homePage.click_UserMenu();
			homePage.click_privateOperationsMenu();
			homePage.click_securitiesMenu();
			homePage.click_frontOfficeMenu();
			homePage.click_clientMaintenanceMenu();
			homePage.click_privateCustomerMenu();
			homePage.click_privateCustomerLinkMenu();
			break;	
			
		case "private operations":
			homePage.click_UserMenu();
			homePage.click_privateOperationsMenu();
			homePage.click_securitiesMenu();
			homePage.click_middleOfficeMenu();
			homePage.click_clientOrderExecutionMenu();
			homePage.click_0rderExecutionMenu();
			homePage.click_dealerBlotterMenu();
			break;
			
		case "aa disbursement":
			homePage.click_UserMenu();
			homePage.click_retailOperations();
			homePage.click_loanTransactionsMenu();
			homePage.click_arrangementActivitiesFTMenu();
			homePage.click_AADisbursement();
			break;
			
		case "authorise ft":
			homePage.click_UserMenu();
			homePage.click_retailOperations();
			homePage.click_loanTransactionsMenu();
			homePage.click_arrangementActivitiesFTMenu();
			homePage.click_Authorise_DeleteFT();
			break;	
			
		case "find loan":					
			homePage.click_findLoanMenu();			
			break;	
			
		case "product catalog":
			homePage.click_UserMenu();
			homePage.click_retailOperations();
			homePage.click_productCatalog();
			break;
			
		case "authorise loan":
			homePage.click_UserMenu();
			homePage.click_retailOperations();
			homePage.click_findLoanMenu();
			break;
			
		default:
			break;
		} 
	   
	}
	
	@When("^I sign in with \"([^\"]*)\" user$")
	public void i_sign_in_with_user(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions		
		T24_SignInPage signon= new T24_SignInPage(getDriver());
		signon.enterUserName(config.getPropertyValue(arg1));
		signon.enterPassword(config.getPropertyValue(arg1+"_PWD"));
		captureScreenshot("Login");
		//captureScreen();
		signon.clickSignIn();
		
	}
	
	@And("^call Object Extractor \"([^\"]*)\"$")
	public void objectExtraction(String arg1) {
		ObjectExtractor obj = new ObjectExtractor(getDriver());
		obj.objectExtractPageFactory("T24_"+arg1.replace(" ", "")+"Page");
	}
	
	@And("^call Field Extractor \"([^\"]*)\"$")
	public void fieldExtraction(String arg1) {
		FieldExtractor obj = new FieldExtractor(getDriver());
		obj.objectExtractPageFactory("T24_"+arg1.replace(" ", "")+"Page");
	}

}
