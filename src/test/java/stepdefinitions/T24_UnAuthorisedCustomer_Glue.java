package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.T24_UnAuthorisedCustomerPage;
import utilities.CoreTapWrappers;

public class T24_UnAuthorisedCustomer_Glue extends CoreTapWrappers {
	T24_UnAuthorisedCustomerPage unAuthCust = new T24_UnAuthorisedCustomerPage(getDriver());

	@And("^Authorise the customer$")
	public void authorise_Customer() throws InterruptedException {
		unAuthCust.click_searchIcon();
		unAuthCust.enter_SearchWithID(excelHashMapValues.get("CustomerID"));
		captureScreenshot("Find the Transaction to Authorise");
		unAuthCust.click_find();
		unAuthCust.find_Authorise(excelHashMapValues.get("CustomerID"));
		captureScreenshot("Transaction to Authorise");
		unAuthCust.click_Authorise();
		wait(2000);
		captureScreenshot("Transaction to Authorise a Deal");
		unAuthCust.click_Authorise_Deal();
		wait(2000);
		captureScreenshot("After Authorise a Deal");
		
	}
	
	@Then("^view the contract of customer creation$")
	public void view_the_contract_of_customer_creation() {
		unAuthCust.get_TransactionMessage();
		unAuthCust.enter_TranasactionId(excelHashMapValues.get("CustomerID"));
		captureScreenshot("To view contract");
		unAuthCust.click_view_Contract();
		unAuthCust.click_Audit();
		captureScreenshot("Final");
	}

}
