package stepdefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.T24_CashDepositPage;
import utilities.CoreTapWrappers;
import utilities.DataProvider;

public class T24_CashDeposit_Glue extends CoreTapWrappers  {
	T24_CashDepositPage CashDeposit = new T24_CashDepositPage(getDriver());
	DataProvider dataprovider = new DataProvider();
	@When("^enter the Mandatiory details in the application$")
	public void enter_mandatiory_Details() throws InterruptedException, AWTException {
		CashDeposit.enter_Deposit_Amount(excelHashMapValues.get("Deposit_Amount"));
		CashDeposit.wait_Credit_Account();
		CashDeposit.enter_Credit_Account(excelHashMapValues.get("AccountID"));
		CashDeposit.enter_Units_1(excelHashMapValues.get("Units"));
		captureScreenshot("Cash Deposit Page");
	}
	
	@And("^click on commit button$")
	public void click_commit() throws InterruptedException, AWTException {
		CashDeposit.click_commit();
		CashDeposit.ValidateAcceptOverride();
//		captureScreenshot("After commit");		
	}

	@And("^Validate the completed transaction$")
	public void Transaction_complete() {
		excelHashMapValues.put("TransactionRefNo", CashDeposit.validate_transactionNum());
		
		captureScreenshot("Transaction is completed");		
		try {
            dataprovider.insertExcelData(excelHashMapValues.get("scenarioName"), "TransactionRefNo" , excelHashMapValues.get("sheetName"),  excelHashMapValues.get("TransactionRefNo"));
//            dataprovider.insertpreRequesitExcelData(excelHashMapValues.get("scenarioName"), "CustomerID" , "Account_Creation",  excelHashMapValues.get("CustomerID"));
            
     } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
     }

	}
	
	@And("^Search with TransactionId$")
	public void Search_Transaction() {
		CashDeposit.Input_CashLocalDeposit(excelHashMapValues.get("TransactionRefNo"));
		captureScreenshot("Transaction id is entered");
		CashDeposit.view_contract();
		captureScreenshot("Contract is viewed");	
	}
	
	@And("^Validate Audit Tab$")
	public void AuditTab() {
		CashDeposit.validate_transactionNum_Audit(excelHashMapValues.get("TransactionRefNo"));
		CashDeposit.Audit_Tab();
		captureScreenshot("Audit Tab is clicked");	
	}
	
	@And("^Select more actions and validate the list of entries$")
	public void MoreActions() {
		CashDeposit.select_moreactions(excelHashMapValues.get("More_Actions"));
		captureScreenshot("More Actions is selected");
		CashDeposit.Go_Button();
		switchToLastWindow();
		CashDeposit.validate_transactionNum_Entries(excelHashMapValues.get("TransactionRefNo"));
		captureScreenshot("List of Entries Page");
	}
	
	
	/*@And("^Validate the completed transaction$")
	public void Transaction_complete() {
		String s1 = driver.findElement(By.xpath("//td[@class='message']")).getText();
		String Trans_Number = s1.substring(15, 26);
		excelHashMapValues.put("TransactionRefNo", Trans_Number);
		System.out.println(Trans_Number);
		captureScreenshot("Transaction is completed");		
	}*/
	
	
}
