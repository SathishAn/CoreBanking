package stepdefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import TechMQA.ExcelWriter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.T24_ExecuteOrderPage;
import pages.T24_IndividualCustomerPage;
import utilities.CoreTapWrappers;

public class T24_ExecuteOrder_Glue extends CoreTapWrappers {
	T24_ExecuteOrderPage ExecuteOdr = new T24_ExecuteOrderPage(getDriver());
	
	@And("^search for the portfolio name in dealer blotter page and Execute$")
	public void search_Portfolio_Name() throws InterruptedException, AWTException {
			wait(3000);
			ExecuteOdr.click_dealerBlotterSearch();
			ExecuteOdr.portfolio_Search(excelHashMapValues.get("PortfolioID"));
			ExecuteOdr.portfolio_Find();
			ExecuteOdr.execute_Portfolio();		
		captureScreenshot("Search with portfolio");
		
	}
	
	@And("^navigate to Broker section and enter values for the mandatory fields$")
	public void navigateto_Broker_Section() throws InterruptedException, AWTException {
		    excelHashMapValues.put("ExecuteRefNo", ExecuteOdr.get_executionRefNo());
			ExecuteOdr.click_On_BrokerSection();
			ExecuteOdr.enter_tradeDate(excelHashMapValues.get("TradeDate"));
			ExecuteOdr.enter_ValueDate(excelHashMapValues.get("ValueDate"));
			ExecuteOdr.broker_No_1(excelHashMapValues.get("BrokerNo1"));
			ExecuteOdr.select_Broker_Type_1(excelHashMapValues.get("BrokerType1"));
			ExecuteOdr.nominal_Recd_1(excelHashMapValues.get("NominalRecd1"));
			ExecuteOdr.price_1(excelHashMapValues.get("Price1"));
			ExecuteOdr.delivery_instr_1(excelHashMapValues.get("DeliveryInstr1"));
			captureScreenshot("Broker details");
		
	}	
	
	@And("^click on the commit to deal button to execute order$")
	public void click_on_the_commit_execute_order() {
		ExecuteOdr.click_Validate();
		
		
		captureScreenshot("Commit");
	}
	
	@And("^search and view contract of the order$")
	public void view_Contract() {
		
		ExecuteOdr.enter_inputexecutionRefNo(excelHashMapValues.get("ExecuteRefNo"));
		ExecuteOdr.click_viewContract();
		captureScreenshot("view Contract");
		ExecuteOdr.click_Audit();
		captureScreenshot("Audit");
	}
	
	
}
