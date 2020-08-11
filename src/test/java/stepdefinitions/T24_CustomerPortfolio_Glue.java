package stepdefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.T24_CashDepositPage;
import pages.T24_CustomerPortfolioPage;
import utilities.CoreTapWrappers;
import utilities.DataProvider;

public class T24_CustomerPortfolio_Glue extends CoreTapWrappers  {
	T24_CustomerPortfolioPage CustomerPortfolio = new T24_CustomerPortfolioPage(getDriver());
	DataProvider dataprovider = new DataProvider();
	@When("^enter the Portfolio number in the application$")
	public void enter_PortfolioNumber() throws InterruptedException, AWTException {
		CustomerPortfolio.switchTabFrame();
		CustomerPortfolio.click_createPortfolioTab();
		captureScreenshot("Create portfolio tab");
		CustomerPortfolio.PortfolioFrame();
		CustomerPortfolio.enter_portfolioInput(excelHashMapValues.get("CustomerID"));
		captureScreenshot("Customer portfolio is entered");
	}
	
	@And("enter the manditory fields in the private customer page$")
	public void enter_fields_privateCustomerPage() throws InterruptedException, AWTException {
		CustomerPortfolio.enter_Ref_Currency(excelHashMapValues.get("Reference_Currency"));
		CustomerPortfolio.enter_Val_Currency(excelHashMapValues.get("Value_Currency"));
		CustomerPortfolio.enter_Account_Name(excelHashMapValues.get("Account_Name"));
		CustomerPortfolio.enter_Portfolio_Mgr(excelHashMapValues.get("Portfolio_manager"));
		CustomerPortfolio.enter_Portfolio_Prog_(excelHashMapValues.get("Portfolio_program"));
		CustomerPortfolio.enter_Managed_Account(excelHashMapValues.get("Managed_account"));
		CustomerPortfolio.enter_Account_No__1(excelHashMapValues.get("AccountID"));
		CustomerPortfolio.enter_Safekeeping_Acct(excelHashMapValues.get("SafeKeeping_Acc"));
		CustomerPortfolio.select_radio_mainTab_ONLINE_VAL(excelHashMapValues.get("ValueOnline"));
		captureScreenshot("Manditory values are entered");
		
		}
	
	@And("^click on commit$")
	public void click_commit() throws InterruptedException, AWTException {
		CustomerPortfolio.click_CommitDeal();
		CustomerPortfolio.SelectProposal_Override(excelHashMapValues.get("Proposal_Warning"));
		captureScreenshot("Transaction number is generated");
		excelHashMapValues.put("TransactionRefNo", CustomerPortfolio.validate_TransactionNum());
		
		try {
            dataprovider.insertExcelData(excelHashMapValues.get("scenarioName"), "TransactionRefNo" , excelHashMapValues.get("sheetName"),  excelHashMapValues.get("TransactionRefNo"));
            dataprovider.insertpreRequesitExcelData(excelHashMapValues.get("scenarioName"), "CustomerID" , "Buy_Order",  excelHashMapValues.get("CustomerID"));
            dataprovider.insertpreRequesitExcelData(excelHashMapValues.get("scenarioName"), "AccountID" , "Buy_Order",  excelHashMapValues.get("AccountID"));
            dataprovider.insertpreRequesitExcelData(excelHashMapValues.get("scenarioName"), "PortfolioID" , "Buy_Order",  excelHashMapValues.get("TransactionRefNo"));
            dataprovider.insertpreRequesitExcelData(excelHashMapValues.get("scenarioName"), "PortfolioID" , "Execute_Order",  excelHashMapValues.get("TransactionRefNo"));
            dataprovider.insertpreRequesitExcelData(excelHashMapValues.get("scenarioName"), "PortfolioID" , "Authorise_Settlement",  excelHashMapValues.get("TransactionRefNo"));
		} catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
		}

	}
	
	@And("^Enter the Portfolio generated$")
	public void EnterPortfolio() throws InterruptedException, AWTException {
		CustomerPortfolio.enter_portfolioID(excelHashMapValues.get("TransactionRefNo"));
		captureScreenshot("Transaction number input");
		CustomerPortfolio.click_Search_Portfolio();
		captureScreenshot("Transaction is searched");
	}
	
	@And ("^Validate the audit tab$")
	public void ValidateAudit() throws InterruptedException, AWTException {
		CustomerPortfolio.click_AuditTab();
		captureScreenshot("Audit tab is clicked");
	}
}
