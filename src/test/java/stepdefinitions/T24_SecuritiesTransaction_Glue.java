package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.T24_SecuritiesTransactionPage;
import utilities.CoreTapWrappers;

public class T24_SecuritiesTransaction_Glue extends CoreTapWrappers{
	
	T24_SecuritiesTransactionPage securitiesTrans= new T24_SecuritiesTransactionPage(getDriver());
	
	@And("^Find the Security Trade Transaction$")
	public void find_the_secuity_trade_transaction() {
		securitiesTrans.switch_ToFrames("Tabs");
		securitiesTrans.switch_ToFrames("WorkArea");
		securitiesTrans.enter_portfolio(excelHashMapValues.get("PortfolioID"));
		captureScreenshot("Find protfolio");
		securitiesTrans.click_find();
		securitiesTrans.click_selectDrilldown();		
		securitiesTrans.switch_ToFrames("default");
	}
	
	@Then("^validate the \"([^\"]*)\" message$")
	public void validate_the_message(String arg1) {
		securitiesTrans.switch_ToFrames("BLANK");
		
		excelHashMapValues.put("AuthorisationRefNo", securitiesTrans.get_AuthorisationRefNo());
		securitiesTrans.verify_Message(arg1);
		captureScreenshot("Authroisation summary");
	}
	
	@When("^click on the commit the deal to Authorise$")
	public void click_on_the_commit_the_deal_to_Authorise() {
		securitiesTrans.click_commitTheDeal();
		if(!securitiesTrans.check_click_AcceptOverrides()) {			
//			buyOrder.click_commitTheDeal();
		}
		captureScreenshot("After commit the deal");
	}
	
	@And("^view the contract of security Authorisation$")
	public void view_contract_security_Authorisation() {
		securitiesTrans.enter_inputAuthRefNo(excelHashMapValues.get("AuthorisationRefNo"));
		securitiesTrans.click_view_Contract();
		securitiesTrans.click_Audit();
		captureScreenshot("View Contract");
	}
	
	@And("^select the value \"([^\"]*)\" in more Action$")
	public void select_value_inMore_action(String arg1) {
		securitiesTrans.select_MoreAction(arg1);
		captureScreenshot(arg1+" action");
		securitiesTrans.click_Go();
		securitiesTrans.switch_ToFrames("default");
	}
	
	@And("^Validate the list of entries and customer position$")
	public void validate_list_of_entries_customer_position() {
		switchToLastWindow();
		securitiesTrans.click_viewEntry();
		captureScreenshot("Customer position");
	}
	
	@Then("^validate the position summary$")
	public void validate_position_summary() {
		switchToLastWindow();
		captureScreenshot("Position summary");
	}
	
	
}
