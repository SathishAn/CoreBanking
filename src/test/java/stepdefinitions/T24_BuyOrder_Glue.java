package stepdefinitions;

import cucumber.api.java.en.And;
import pages.T24_BuyOrderPage;
import utilities.CoreTapWrappers;
import utilities.DataProvider;

public class T24_BuyOrder_Glue extends CoreTapWrappers {
	
	DataProvider dataprovider = new DataProvider();
	T24_BuyOrderPage buyOrder = new T24_BuyOrderPage(getDriver());
	
	@And("^enter the mandatory fields to Buy the Order$")
	public void enter_the_mandatory_fields_buy_order() {
		
		excelHashMapValues.put("BuyOrderReferenceNo", buyOrder.get_buyOrderReferenceNo());
		try {
			dataprovider.insertExcelData(excelHashMapValues.get("scenarioName"), "BuyOrderReferenceNo" , excelHashMapValues.get("sheetName"),  excelHashMapValues.get("BuyOrderReferenceNo"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		buyOrder.enter_Security(excelHashMapValues.get("Security"));
		buyOrder.wait_Trade_CCY();
		buyOrder.enter_Trade_CCY(excelHashMapValues.get("TradeCCY"));
		buyOrder.enter_Activity(excelHashMapValues.get("Activity"));
		buyOrder.enter_Order_Date(excelHashMapValues.get("OrderDate"));
		buyOrder.enter_Value_Date(excelHashMapValues.get("ValueDate"));
//		buyOrder.enter_Order_Type(excelHashMapValues.get("OrderType"));		
		captureScreenshot("Buy Order Basic Details");
	}
	
	@And("^Provide values for the required fields in Client Details Section under Buy Order$")
	public void provide_values_for_the_client_details_section_buy_order() {
		buyOrder.enter_Client_Number_1(excelHashMapValues.get("CustomerID"));
		buyOrder.enter_Portfolio_1(excelHashMapValues.get("PortfolioID"));
		buyOrder.enter_Client_Depository_1(excelHashMapValues.get("ClientDepository"));
		buyOrder.enter_Client_Acct_No_1(excelHashMapValues.get("AccountID"));
		buyOrder.enter_Nominal_1(excelHashMapValues.get("Nominal1"));
		captureScreenshot("Buy Order Client Details");
	}
	
	@And("^click on the Commit the deal button in buy order$")
	public void click_on_Commit_the_deal_button_buy_order() {
		buyOrder.click_commitTheDeal();
		captureScreenshot("Buy Order commit the deal");		
		if(!buyOrder.check_click_AcceptOverrides()) {			
//			buyOrder.click_commitTheDeal();
		}		
		captureScreenshot("Buy Order after commit the deal");
	}
	
	@And ("view buy Order contract")
	public void view_buy_Order_contract() {
		buyOrder.enter_securityBuyOrder(excelHashMapValues.get("BuyOrderReferenceNo"));
		captureScreenshot("Search View Contract");
		buyOrder.click_view_Contract();
		captureScreenshot("View Contract");
		buyOrder.click_Audit();
		captureScreenshot("Final Screenshot");
	}

}
