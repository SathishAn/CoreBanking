package stepdefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import TechMQA.ExcelWriter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.T24_AuthoriseLoanPage;
import pages.T24_ExecuteOrderPage;
import pages.T24_IndividualCustomerPage;
import utilities.CoreTapWrappers;

public class T24_AuthoriseLoan_Glue extends CoreTapWrappers {
	T24_AuthoriseLoanPage AutLoan = new T24_AuthoriseLoanPage(getDriver());
	
	@And("^search for the loan number in the AA Arangement page and Approve$")
	public void search_Portfolio_Name() throws InterruptedException, AWTException {
			wait(3000);
			AutLoan.click_unauthorised_section();
			AutLoan.loan_Search(excelHashMapValues.get("ArrangementID"));
			AutLoan.Find_Loan();
			AutLoan.click_On_Overview();
			wait(5000);
			AutLoan.click_On_Approve();
			captureScreenshot("Loan Approved");
			AutLoan.authorise_A_Deal();
			
		captureScreenshot("Search with loanID and Authorise");
		
	}
	
	@And("^Validate the completed authorised Loan transaction$")
	public void complete_loan() {
		excelHashMapValues.put("LoanRefNo", AutLoan.validate_loanAuthorisation());
		captureScreenshot("Transaction is completed");	
		AutLoan.enter_loan_TransactionRefNo(excelHashMapValues.get("LoanRefNo"));
		AutLoan.click_On_Search();
		captureScreenshot("Transaction Details");
	}

	
}
