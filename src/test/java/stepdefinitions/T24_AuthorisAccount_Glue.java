package stepdefinitions;

import cucumber.api.java.en.And;
import pages.T24_AuthorisedAccountPage;
import pages.T24_UnAuthorisedCustomerPage;
import utilities.CoreTapWrappers;

public class T24_AuthorisAccount_Glue extends CoreTapWrappers {
	T24_AuthorisedAccountPage AuthAccount = new T24_AuthorisedAccountPage(getDriver());

	@And("^Authorise the Account$")
	public void authorise_Customer() throws InterruptedException {
		wait(2000);
		AuthAccount.click_searchIcon();
		AuthAccount.enter_SearchWithID(excelHashMapValues.get("AccountID"));
		captureScreenshot("Find the Transaction to Authorise");
		AuthAccount.click_find();
		AuthAccount.find_Authorise(excelHashMapValues.get("AccountID"));
		captureScreenshot("Transaction to Authorise");
		AuthAccount.click_Authorise();
		wait(2000);
		captureScreenshot("Transaction to Authorise a Deal");
		AuthAccount.click_Authorise_Deal();
		wait(2000);
		captureScreenshot("After Authorise a Deal");
		AuthAccount.get_TransactionMessage();
		AuthAccount.enter_TranasactionId(excelHashMapValues.get("AccountID"));
		captureScreenshot("To view contract");
		AuthAccount.click_view_Contract();
		AuthAccount.click_Audit();
		captureScreenshot("Final");
	}

}
