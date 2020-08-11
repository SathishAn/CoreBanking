package stepdefinitions;

import cucumber.api.java.en.And;
import pages.T24_OpenSavingAccountPage;
import utilities.CoreTapWrappers;
import utilities.DataProvider;

public class T24_OpenSavingAccount_Glue extends CoreTapWrappers {
	DataProvider dataprovider = new DataProvider();
	T24_OpenSavingAccountPage openSavingAccount = new T24_OpenSavingAccountPage(getDriver());
	
	@And("^enter the mandate fields in Saving Account$")
	public void enter_the_mandate_fields() {
		wait(1000);
		excelHashMapValues.put("AccountID", openSavingAccount.get_transactionID());
		//Excel Updation
				try {
					dataprovider.insertExcelData(excelHashMapValues.get("scenarioName"), "AccountID" , excelHashMapValues.get("sheetName"),  excelHashMapValues.get("AccountID"));
					dataprovider.insertpreRequesitExcelData(excelHashMapValues.get("scenarioName"), "AccountID" , "Cash_Deposit",  excelHashMapValues.get("AccountID"));
					dataprovider.insertpreRequesitExcelData(excelHashMapValues.get("scenarioName"), "CustomerID" , "Customer_Portfolio",  excelHashMapValues.get("CustomerID"));
					dataprovider.insertpreRequesitExcelData(excelHashMapValues.get("scenarioName"), "AccountID" , "Customer_Portfolio",  excelHashMapValues.get("AccountID"));
					dataprovider.insertpreRequesitExcelData(excelHashMapValues.get("scenarioName"), "CustomerID" , "Loans",  excelHashMapValues.get("CustomerID"));
					dataprovider.insertpreRequesitExcelData(excelHashMapValues.get("scenarioName"), "AccountID" , "Loans",  excelHashMapValues.get("AccountID"));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		openSavingAccount.enter_Customer_ID(excelHashMapValues.get("CustomerID"));	
		openSavingAccount.enter_Currency(excelHashMapValues.get("Currency"));
		captureScreenshot("Account Creation");
	}
	
	
	@And("^click on the validate button$")
	public void click_on_Validate_button() {
		openSavingAccount.click_commitTheDeal();
		captureScreenshot("AfterCommit");
		closeAllBrowsers();
	}

}
