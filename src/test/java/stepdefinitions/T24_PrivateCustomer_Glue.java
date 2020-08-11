package stepdefinitions;

import cucumber.api.java.en.And;
import pages.T24_PrivateCustomerPage;
import utilities.CoreTapWrappers;

public class T24_PrivateCustomer_Glue extends CoreTapWrappers{
	T24_PrivateCustomerPage privateCustomer = new T24_PrivateCustomerPage(getDriver());
	
	
	@And("^click on the \"([^\"]*)\" in private customer$")
	public void click_on_the_selection_in_private_customer(String arg1) {
		
		switch (arg1.toLowerCase()) {
		case "customer security":
			wait(2000);
			privateCustomer.frame_switchToMainFrame();
			privateCustomer.click_Customer_Security();
			privateCustomer.frame_defaultContent();
			privateCustomer.frame_switchToWrokArea();
			privateCustomer.enter_transactionID(excelHashMapValues.get("CustomerID"));			
			captureScreenshot("Private Customer Search");
			privateCustomer.pressEnter_transactionID();
			break;
			
		default:
			break;
		}
		
	}
	
	@And("^enter the mandatory fields in private customer application$")
	public void enter_mandatory_fields_in_private_customer() {
		privateCustomer.select_Client_Type_1(excelHashMapValues.get("ClientType"));
		privateCustomer.enter_Statement_Frequency(excelHashMapValues.get("StatementFrequency"));
		privateCustomer.enter_Reports_Requested_1(excelHashMapValues.get("ReportsRequested"));
		captureScreenshot("Private Customer details");
	}
	
	@And("^click on the commit the deal button$")
	public void click_on_the_commit_the_deal_button() {
		privateCustomer.click_commitTheDeal();
		captureScreenshot("Private Customer after commit the deal");
		privateCustomer.fill_autoWaring();
		captureScreenshot("Fill the warings");
		privateCustomer.click_commitTheDeal();
		captureScreenshot("Private Customer after commit the deal");
		
	}
	
	@And("^Verify the Authorization in private customer$")
	public void verify_the_Authorization_private_customer() {
		privateCustomer.enter_transactionID(excelHashMapValues.get("CustomerID"));
		captureScreenshot("To view contract");
		privateCustomer.click_view_Contract();
		privateCustomer.click_Audit();
		captureScreenshot("Private customer contract");
	}
	
}
