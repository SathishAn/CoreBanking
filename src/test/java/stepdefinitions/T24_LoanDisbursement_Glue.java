package stepdefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.T24_ExecuteOrderPage;
import pages.T24_IndividualCustomerPage;
import utilities.CoreTapWrappers;
import utilities.DataProvider;

public class T24_LoanDisbursement_Glue extends CoreTapWrappers {
	pages.T24_LoanDisbursementPage loandisburse = new pages.T24_LoanDisbursementPage(getDriver());
	DataProvider dataprovider = new DataProvider();
	@And("^enter the mandatory details for loan disbursement$")
	public void enter_mandatory_details_loan_disbursement() throws Exception {
			wait(3000);
		excelHashMapValues.put("AADisbursementID", loandisburse.get_aaDisbursementRefNO().replace("/", "") );
		dataprovider.insertExcelData(excelHashMapValues.get("scenarioName"), "AADisbursementID" , excelHashMapValues.get("sheetName"),  excelHashMapValues.get("AADisbursementID"));
		loandisburse.enter_Arrangement_Id(excelHashMapValues.get("ArrangementID"));
		
		loandisburse.enter_Debit_Currency(excelHashMapValues.get("DebitCurrency"));
		loandisburse.enter_Debit_Amount(excelHashMapValues.get("DebitAmount"));
		loandisburse.enter_Credit_Account(excelHashMapValues.get("CreditAccount"));
		captureScreenshot("Basic Details");		
	}
	
	@And ("^click on the validate and commit the deal$")
	public void click_on_commit_the_deal_loan_disbursement() {
		loandisburse.click_validate();
		captureScreenshot("after validation Details");
		loandisburse.click_Commit();
		captureScreenshot("After Commit the deal");
		if(!loandisburse.check_click_AcceptOverrides()) {
			
		}
		loandisburse.enter_AADisbursementRefNo(excelHashMapValues.get("AADisbursementID"));
		captureScreenshot("To view the contract of the deal");
		loandisburse.click_view_Contract();
		loandisburse.click_Audit();
		captureScreenshot("Audit Screen Capture");
		closeAllBrowsers();
	}
	
	
	
}
