package stepdefinitions;

import cucumber.api.java.en.And;
import pages.T24_AuthorisedAccountPage;
import pages.T24_AuthorisedFundTransferPage;
import pages.T24_UnAuthorisedCustomerPage;
import utilities.BaseTestSetup;
import utilities.CoreTapWrappers;

public class T24_AuthoriseFundTransfer_Glue extends CoreTapWrappers {
	T24_AuthorisedFundTransferPage AuthFT = new T24_AuthorisedFundTransferPage(getDriver());

	@And("^Authorise the AA Disbursement$")
	public void authorise_Customer() throws InterruptedException {
		wait(2000);
		AuthFT.click_searchIcon();
		AuthFT.enter_SearchWithID(excelHashMapValues.get("AADisbursementID"));
		captureScreenshot("Find the Disbursement to Authorise");
		AuthFT.click_find();
		//AuthFT.find_Authorise(excelHashMapValues.get("AADisbursementRefNo"));
		captureScreenshot("Disbursement to Authorise");
		AuthFT.click_Authorise();
		wait(2000);
		captureScreenshot("Disbursement to Authorise a Deal");
		AuthFT.click_Authorise_Deal();
		wait(2000);
		captureScreenshot("After Authorise a Deal");
		AuthFT.get_TransactionMessage();
		AuthFT.enter_TranasactionId(excelHashMapValues.get("AADisbursementID"));
		captureScreenshot("To view contract");
		AuthFT.click_view_Contract();
		AuthFT.click_Audit();
		captureScreenshot("Disbursement Audit");
		closeBrowser();
		switchToParentWindow();
		
	}

}
