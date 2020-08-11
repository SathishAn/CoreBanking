package stepdefinitions;

import cucumber.api.java.en.And;
import pages.T24_AuthorisedAccountPage;
import pages.T24_AuthorisedFundTransferPage;
import pages.T24_FindLoanPage;
import pages.T24_UnAuthorisedCustomerPage;
import utilities.CoreTapWrappers;

public class T24_FindLoan_Glue extends CoreTapWrappers {
	T24_FindLoanPage findLoan = new T24_FindLoanPage(getDriver());

	@And("^find the loan with Arrangement$")
	public void authorise_Customer() throws InterruptedException {
		
		findLoan.enter_SearchWithArrangement(excelHashMapValues.get("ArrangementID"));
		captureScreenshot("Search with Arrangement ID");
		findLoan.click_find();
		captureScreenshot("Find Loan");
		findLoan.click_Overview();
		wait(5000);
		switchToLastWindow();		
		//AuthFT.find_Authorise(excelHashMapValues.get("AADisbursementRefNo"));
		captureScreenshot("Arrangement Overview");
		
		
	}

}
