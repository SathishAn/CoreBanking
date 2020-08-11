package stepdefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.omg.CORBA.PERSIST_STORE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.T24_CashDepositPage;
import pages.T24_PersonalLoansPage;
import utilities.CoreTapWrappers;
import utilities.DataProvider;

public class T24_PersonalLoans_Glue extends CoreTapWrappers  {
	T24_PersonalLoansPage PersonalLoans = new T24_PersonalLoansPage(getDriver());
	DataProvider dataprovider = new DataProvider();
	
	
	@When("^Select new arrangements in Personal loan$")
	public void navigate_personalLoans() throws InterruptedException, AWTException {
		PersonalLoans.click_PersonalLoans();
		captureScreenshot("Product catalogue page");
		PersonalLoans.click_newArrangement();
		captureScreenshot("Personal Loan page");
	}
	
	
	@And("^Enter the manditory fields in New arrangement page$")
	public void enter_manditoryFields() throws InterruptedException, AWTException {
		PersonalLoans.enter_Customer_1(excelHashMapValues.get("CustomerID"));
		PersonalLoans.enter_Currency(excelHashMapValues.get("Currency"));
		captureScreenshot("Manditory fields are entered");
		PersonalLoans.click_validateDeal();
		captureScreenshot("validate deal is clicked");
	}
	
	
	@And("^Enter the fields in commitment tab and commit the deal$")
	public void enterfields_commitment() throws InterruptedException, AWTException {
		PersonalLoans.click_Commitment();
		PersonalLoans.enter_Amount(excelHashMapValues.get("Amount"));
		PersonalLoans.enter_Term(excelHashMapValues.get("Term"));
		captureScreenshot("commitment tab details are enterted");
		PersonalLoans.click_CommitDeal();
		PersonalLoans.select_warningBox(excelHashMapValues.get("WarningMessage"));
		captureScreenshot("warning message is selected");
		PersonalLoans.click_CommitDeal();
	}
	
	
	@And("^Validate the completed Loan transaction$")
	public void Transaction_complete() {
		excelHashMapValues.put("LoanRefNo", PersonalLoans.validate_transactionNum());
		captureScreenshot("Transaction is completed");		
		try {
            dataprovider.insertExcelData(excelHashMapValues.get("scenarioName"), "LoanRefNo" , excelHashMapValues.get("sheetName"),  excelHashMapValues.get("LoanRefNo"));
            
            
//            dataprovider.insertpreRequesitExcelData(excelHashMapValues.get("scenarioName"), "CustomerID" , "Account_Creation",  excelHashMapValues.get("CustomerID"));
			} catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
		}
	}
	
	
	@When("^view the loan created$")
	public void view_createdLoan() throws InterruptedException, AWTException {
		PersonalLoans.enter_loanRefNum(excelHashMapValues.get("LoanRefNo"));
		captureScreenshot("Loan Ref num is entered");
		PersonalLoans.click_viewContract();
//		PersonalLoans.click_ArrangementId();
		PersonalLoans.click_New_ArrangementTab();
		excelHashMapValues.put("ArrangementID", PersonalLoans.arrangementId());
		captureScreenshot("Arrangement id is captured");	
		try {
            dataprovider.insertExcelData(excelHashMapValues.get("scenarioName"), "ArrangementID" , excelHashMapValues.get("sheetName"),  excelHashMapValues.get("ArrangementID"));
            dataprovider.insertpreRequesitExcelData(excelHashMapValues.get("scenarioName"), "CreditAccount" , "Loan_Disbursement",  excelHashMapValues.get("AccountID"));
            dataprovider.insertpreRequesitExcelData(excelHashMapValues.get("scenarioName"), "ArrangementID" , "Loan_Disbursement",  excelHashMapValues.get("ArrangementID"));
//            dataprovider.insertpreRequesitExcelData(excelHashMapValues.get("scenarioName"), "CustomerID" , "Account_Creation",  excelHashMapValues.get("CustomerID"));
			} catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
		}
		closeAllBrowsers();
	}
	
	
	
}