package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CoreTapWrappers;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

public class T24_BuyOrderPage extends CoreTapWrappers {

	private WebDriver driver;

	public T24_BuyOrderPage(WebDriver driver) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(this.driver, this);
//		if (!verifyTitle("Account")) {
//			reportStep("This is not a Account Page", "FAIL");
//		}
		wait(2000);
		driver.manage().window().maximize();
	}
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.LINK_TEXT, using= "Audit") WebElement Audit;
 //New Object added - 25.07.2019 - 19.42.11
  
  @FindBy(how=How.XPATH, using= "//span[contains(@class, 'iddisplay_SECOPENORDER_BUYSTP')]") WebElement buyOrderReferenceNo;

  @FindBy(how=How.LINK_TEXT, using= "Broker Details") WebElement Broker_Details;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "CheckBox:fieldName:AUTHORISE.TRADE") WebElement CheckBox_AUTHORISE_TRADE;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.LINK_TEXT, using= "Execution Details") WebElement Execution_Details;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:ACCT.NARRATIVE:1") WebElement Front_Off_Instrns_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:ADJUST.COMM:1") WebElement Adj_Cash_Comm_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:AMT.TO.BROKER:1") WebElement AMT_TO_BROKER_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:BR.ACC.NO:1") WebElement BR_ACC_NO_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:BR.PRICE:1") WebElement BR_PRICE_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:BROKER:1") WebElement BROKER_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CALC.CHRGS:1") WebElement Calculate_Chrgs_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CASH.CHRGS:1") WebElement Chrgs_Gross_Net_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CASH.ROUNDING:1") WebElement Cash_Rounding_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CONFIRMATION:1") WebElement CONFIRMATION_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CU.BRKR.COMM:1") WebElement Broker_Commission_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CU.CASH.AMOUNT:1") WebElement Cash_Amount_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CU.CHARGE.TAX.AMT:1:1") WebElement Cu_Charge_Tax_Amount_1_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CU.CHARGE.TAX.AMT:1:2") WebElement Cu_Charge_Tax_Amount_1_2;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CU.CHARGE.TAX.AMT:1:3") WebElement Cu_Charge_Tax_Amount_1_3;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CU.CHARGE.TAX.AMT:1:4") WebElement Cu_Charge_Tax_Amount_1_4;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CU.CHARGE.TAX.AMT:1:5") WebElement Cu_Charge_Tax_Amount_1_5;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CU.CHARGE.TAX.AMT:1:6") WebElement Cu_Charge_Tax_Amount_1_6;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CU.CHARGE.TAX.AMT:1:7") WebElement Cu_Charge_Tax_Amount_1_7;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CU.CHARGE.TAX.AMT:1:8") WebElement Cu_Charge_Tax_Amount_1_8;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CU.CHARGE.TAX.AMT:1:9") WebElement Cu_Charge_Tax_Amount_1_9;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CU.COMMISSION:1") WebElement Commission_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CU.DEPOSITORY:1") WebElement Client_Depository_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CU.EBV.FEES:1") WebElement EBV_Fees_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CU.FEES.MISC:1") WebElement Misc_Fees_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CU.FOREIGN.FEE:1") WebElement Foreign_Fee_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CU.INCOME.ACC:1") WebElement Client_Income_Acct_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CU.STAMP.TAX:1") WebElement Stamp_Tax_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CURR.PRICE:1") WebElement Price_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CUST.ACC.NO:1") WebElement Client_Acct_No_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:CUST.NUMBER:1") WebElement Client_Number_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:DATE.TO.BROKER:1") WebElement DATE_TO_BROKER_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:DEAL.STATUS") WebElement DEAL_STATUS;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:DEPOSITORY") WebElement DEPOSITORY;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:LIMIT.EXP.DATE") WebElement Limit_Exp_Date;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:LIMIT.PRICE") WebElement Limit_Price;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:LIMIT.TYPE") WebElement Limit_Type;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:NARRATIVE:1:1") WebElement Client_Instrns_1_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:NO.NOMINAL:1") WebElement Nominal_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:ORDER.DATE") WebElement Order_Date;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:ORDER.STATUS") WebElement ORDER_STATUS;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:ORDER.TIME") WebElement Order_Time;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:ORDER.TYPE") WebElement Order_Type;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:PERCENTAGE:1") WebElement Percentage_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:ROUT.COMPANY") WebElement ROUT_COMPANY;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:SECURITY.ACCNT:1") WebElement Portfolio_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:SECURITY.NO") WebElement Security;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:SETTLEMENT.CCY:1") WebElement Settl_Ccy_1;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:STOCK.EXCHANGE") WebElement STOCK_EXCHANGE;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:TRADE.CCY") WebElement Trade_CCY;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:TRANSACTION.CODE") WebElement Activity;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:TXN.CHANNEL") WebElement Txn_Channel;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:UPFRONT.SEC") WebElement UPFRONT_SEC;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "fieldName:VALUE.DATE") WebElement Value_Date;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "moreactions") WebElement moreactions;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "radio:mainTab:ODD.LOT.ORDER") List<WebElement> radio_mainTab_ODD_LOT_ORDER;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "radio:tab2:STP.ORDER") List<WebElement> radio_tab2_STP_ORDER;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "radio:tab3:EXE.HLT") List<WebElement> radio_tab3_EXE_HLT;
 //New Object added - 25.07.2019 - 19.42.11

  @FindBy(how=How.ID, using= "radio:tab3:TRADE.HLT") List<WebElement> radio_tab3_TRADE_HLT;
  
  @FindBy(how = How.CLASS_NAME, using = "warningbox") List<WebElement> mandatoryWaring;

  @FindBy(how=How.XPATH, using= "//a[@title='Commit the deal']") WebElement commitTheDeal;
  
  
  @FindBy(how=How.XPATH, using= "//input[contains(@class,'idbox_SECOPENORDER_BUYSTP')]") WebElement securityBuyOrder;
 
  
  @FindBy (how=How.XPATH, using="//img[@alt='Selection Screen']/..") WebElement searchIcon;
  
  @FindBy(how=How.XPATH, using="//a[@title='View a contract']") WebElement view_Contract;
  
  @FindBy(how=How.LINK_TEXT, using= "Accept Overrides") List<WebElement> AcceptOverrides;
  
 public void click_Audit(){ 
 
 webElementClick(Audit,"Audit"); 
 } 


 public void click_Broker_Details(){ 
 
 webElementClick(Broker_Details,"Broker Details"); 
 } 


 public void click_Execution_Details(){ 
 
 webElementClick(Execution_Details,"Execution Details"); 
 } 


 public void enter_Front_Off_Instrns_1(String temp_Front_Off_Instrns_1){ 
 
 enterInputText(Front_Off_Instrns_1,temp_Front_Off_Instrns_1,"Front Off Instrns 1"); 
 } 


 public void select_Adj_Cash_Comm_1(String temp_Adj_Cash_Comm_1){ 
 
 selectVisibileText(Adj_Cash_Comm_1,temp_Adj_Cash_Comm_1,"Adj Cash Comm 1"); 
 } 


 public void enter_AMT_TO_BROKER_1(String temp_AMT_TO_BROKER_1){ 
 
 enterInputText(AMT_TO_BROKER_1,temp_AMT_TO_BROKER_1,"AMT TO BROKER 1"); 
 } 


 public void enter_BR_ACC_NO_1(String temp_BR_ACC_NO_1){ 
 
 enterInputText(BR_ACC_NO_1,temp_BR_ACC_NO_1,"BR ACC NO 1"); 
 } 


 public void enter_BR_PRICE_1(String temp_BR_PRICE_1){ 
 
 enterInputText(BR_PRICE_1,temp_BR_PRICE_1,"BR PRICE 1"); 
 } 


 public void enter_BROKER_1(String temp_BROKER_1){ 
 
 enterInputText(BROKER_1,temp_BROKER_1,"BROKER 1"); 
 } 


 public void select_Calculate_Chrgs_1(String temp_Calculate_Chrgs_1){ 
 
 selectVisibileText(Calculate_Chrgs_1,temp_Calculate_Chrgs_1,"Calculate Chrgs 1"); 
 } 


 public void select_Chrgs_Gross_Net_1(String temp_Chrgs_Gross_Net_1){ 
 
 selectVisibileText(Chrgs_Gross_Net_1,temp_Chrgs_Gross_Net_1,"Chrgs Gross Net 1"); 
 } 


 public void select_Cash_Rounding_1(String temp_Cash_Rounding_1){ 
 
 selectVisibileText(Cash_Rounding_1,temp_Cash_Rounding_1,"Cash Rounding 1"); 
 } 


 public void select_CONFIRMATION_1(String temp_CONFIRMATION_1){ 
 
 selectVisibileText(CONFIRMATION_1,temp_CONFIRMATION_1,"CONFIRMATION 1"); 
 } 


 public void enter_Broker_Commission_1(String temp_Broker_Commission_1){ 
 
 enterInputText(Broker_Commission_1,temp_Broker_Commission_1,"Broker Commission 1"); 
 } 


 public void enter_Cash_Amount_1(String temp_Cash_Amount_1){ 
 
 enterInputText(Cash_Amount_1,temp_Cash_Amount_1,"Cash Amount 1"); 
 } 


 public void enter_Cu_Charge_Tax_Amount_1_1(String temp_Cu_Charge_Tax_Amount_1_1){ 
 
 enterInputText(Cu_Charge_Tax_Amount_1_1,temp_Cu_Charge_Tax_Amount_1_1,"Cu Charge Tax Amount 1 1"); 
 } 


 public void enter_Cu_Charge_Tax_Amount_1_2(String temp_Cu_Charge_Tax_Amount_1_2){ 
 
 enterInputText(Cu_Charge_Tax_Amount_1_2,temp_Cu_Charge_Tax_Amount_1_2,"Cu Charge Tax Amount 1 2"); 
 } 


 public void enter_Cu_Charge_Tax_Amount_1_3(String temp_Cu_Charge_Tax_Amount_1_3){ 
 
 enterInputText(Cu_Charge_Tax_Amount_1_3,temp_Cu_Charge_Tax_Amount_1_3,"Cu Charge Tax Amount 1 3"); 
 } 


 public void enter_Cu_Charge_Tax_Amount_1_4(String temp_Cu_Charge_Tax_Amount_1_4){ 
 
 enterInputText(Cu_Charge_Tax_Amount_1_4,temp_Cu_Charge_Tax_Amount_1_4,"Cu Charge Tax Amount 1 4"); 
 } 


 public void enter_Cu_Charge_Tax_Amount_1_5(String temp_Cu_Charge_Tax_Amount_1_5){ 
 
 enterInputText(Cu_Charge_Tax_Amount_1_5,temp_Cu_Charge_Tax_Amount_1_5,"Cu Charge Tax Amount 1 5"); 
 } 


 public void enter_Cu_Charge_Tax_Amount_1_6(String temp_Cu_Charge_Tax_Amount_1_1){ 
 
 enterInputText(Cu_Charge_Tax_Amount_1_6,temp_Cu_Charge_Tax_Amount_1_1,"Cu Charge Tax Amount 1 6"); 
 } 


 public void enter_Cu_Charge_Tax_Amount_1_7(String temp_Cu_Charge_Tax_Amount_1_1){ 
 
 enterInputText(Cu_Charge_Tax_Amount_1_7,temp_Cu_Charge_Tax_Amount_1_1,"Cu Charge Tax Amount 1 7"); 
 } 


 public void enter_Cu_Charge_Tax_Amount_1_8(String temp_Cu_Charge_Tax_Amount_1_1){ 
 
 enterInputText(Cu_Charge_Tax_Amount_1_8,temp_Cu_Charge_Tax_Amount_1_1,"Cu Charge Tax Amount 1 8"); 
 } 


 public void enter_Cu_Charge_Tax_Amount_1_9(String temp_Cu_Charge_Tax_Amount_1_1){ 
 
 enterInputText(Cu_Charge_Tax_Amount_1_9,temp_Cu_Charge_Tax_Amount_1_1,"Cu Charge Tax Amount 1 9"); 
 } 


 public void enter_Commission_1(String temp_Commission_1){ 
 
 enterInputText(Commission_1,temp_Commission_1,"Commission 1"); 
 } 


 public void enter_Client_Depository_1(String temp_Client_Depository_1){ 
 
 enterInputText(Client_Depository_1,temp_Client_Depository_1,"Client Depository 1"); 
 } 


 public void enter_EBV_Fees_1(String temp_EBV_Fees_1){ 
 
 enterInputText(EBV_Fees_1,temp_EBV_Fees_1,"EBV Fees 1"); 
 } 


 public void enter_Misc_Fees_1(String temp_Misc_Fees_1){ 
 
 enterInputText(Misc_Fees_1,temp_Misc_Fees_1,"Misc Fees 1"); 
 } 


 public void enter_Foreign_Fee_1(String temp_Foreign_Fee_1){ 
 
 enterInputText(Foreign_Fee_1,temp_Foreign_Fee_1,"Foreign Fee 1"); 
 } 


 public void enter_Client_Income_Acct_1(String temp_Client_Income_Acct_1){ 
 
 enterInputText(Client_Income_Acct_1,temp_Client_Income_Acct_1,"Client Income Acct 1"); 
 } 


 public void enter_Stamp_Tax_1(String temp_Stamp_Tax_1){ 
 
 enterInputText(Stamp_Tax_1,temp_Stamp_Tax_1,"Stamp Tax 1"); 
 } 


 public void enter_Price_1(String temp_Price_1){ 
 
 enterInputText(Price_1,temp_Price_1,"Price 1"); 
 } 


 public void enter_Client_Acct_No_1(String temp_Client_Acct_No_1){ 
 
 enterInputText(Client_Acct_No_1,temp_Client_Acct_No_1,"Client Acct No 1"); 
 } 


 public void enter_Client_Number_1(String temp_Client_Number_1){ 
 
 enterInputText(Client_Number_1,temp_Client_Number_1,"Client Number 1"); 
 } 


 public void enter_DATE_TO_BROKER_1(String temp_DATE_TO_BROKER_1){ 
 
 enterInputText(DATE_TO_BROKER_1,temp_DATE_TO_BROKER_1,"DATE TO BROKER 1"); 
 } 


 public void select_DEAL_STATUS(String temp_DEAL_STATUS){ 
 
 selectVisibileText(DEAL_STATUS,temp_DEAL_STATUS,"DEAL STATUS"); 
 } 


 public void enter_DEPOSITORY(String temp_DEPOSITORY){ 
 
 enterInputText(DEPOSITORY,temp_DEPOSITORY,"DEPOSITORY"); 
 } 


 public void enter_Limit_Exp_Date(String temp_Limit_Exp_Date){ 
 
 enterInputText(Limit_Exp_Date,temp_Limit_Exp_Date,"Limit Exp Date"); 
 } 


 public void enter_Limit_Price(String temp_Limit_Price){ 
 
 enterInputText(Limit_Price,temp_Limit_Price,"Limit Price"); 
 } 


 public void select_Limit_Type(String temp_Limit_Type){ 
 
 selectVisibileText(Limit_Type,temp_Limit_Type,"Limit Type"); 
 } 


 public void enter_Client_Instrns_1_1(String temp_Client_Instrns_1_1){ 
 
 enterInputText(Client_Instrns_1_1,temp_Client_Instrns_1_1,"Client Instrns 1 1"); 
 } 


 public void enter_Nominal_1(String temp_Nominal_1){ 
 
 enterInputText(Nominal_1,temp_Nominal_1,"Nominal 1"); 
 } 


 public void enter_Order_Date(String temp_Order_Date){ 
 
 enterInputText(Order_Date,temp_Order_Date,"Order Date"); 
 } 


 public void select_ORDER_STATUS(String temp_ORDER_STATUS){ 
 
 selectVisibileText(ORDER_STATUS,temp_ORDER_STATUS,"ORDER STATUS"); 
 } 


 public void enter_Order_Time(String temp_Order_Time){ 
 
 enterInputText(Order_Time,temp_Order_Time,"Order Time"); 
 } 


 public void enter_Order_Type(String temp_Order_Type){ 
 
 enterInputText(Order_Type,temp_Order_Type,"Order Type"); 
 } 


 public void enter_Percentage_1(String temp_Percentage_1){ 
 
 enterInputText(Percentage_1,temp_Percentage_1,"Percentage 1"); 
 } 


 public void enter_ROUT_COMPANY(String temp_ROUT_COMPANY){ 
 
 enterInputText(ROUT_COMPANY,temp_ROUT_COMPANY,"ROUT COMPANY"); 
 } 


 public void enter_Portfolio_1(String temp_Portfolio_1){ 
 
 enterInputText(Portfolio_1,temp_Portfolio_1,"Portfolio 1"); 
 } 


 public void enter_Security(String temp_Security){ 
 
 enterInputText(Security,temp_Security,"Security"); 
 } 


 public void enter_Settl_Ccy_1(String temp_Settl_Ccy_1){ 
 
 enterInputText(Settl_Ccy_1,temp_Settl_Ccy_1,"Settl Ccy 1"); 
 } 


 public void enter_STOCK_EXCHANGE(String temp_STOCK_EXCHANGE){ 
 
 enterInputText(STOCK_EXCHANGE,temp_STOCK_EXCHANGE,"STOCK EXCHANGE"); 
 } 


 public void enter_Trade_CCY(String temp_Trade_CCY){ 
 
 enterInputText(Trade_CCY,temp_Trade_CCY,"Trade CCY"); 
 } 
 
 public void wait_Trade_CCY() {
	 webElementWait(Trade_CCY, "3", "Stale Element");
 }


 public void enter_Activity(String temp_Activity){ 
 
 enterInputText(Activity,temp_Activity,"Activity"); 
 } 


 public void select_Txn_Channel(String temp_Txn_Channel){ 
 
 selectVisibileText(Txn_Channel,temp_Txn_Channel,"Txn Channel"); 
 } 


	public void enter_UPFRONT_SEC(String temp_UPFRONT_SEC) {

		enterInputText(UPFRONT_SEC, temp_UPFRONT_SEC, "UPFRONT SEC");
	}

	public void enter_Value_Date(String temp_Value_Date) {

		enterInputText(Value_Date, temp_Value_Date, "Value Date");
	}

	public void select_moreactions(String temp_moreactions) {

		selectVisibileText(moreactions, temp_moreactions, "moreactions");
	}

	public void select_radio_mainTab_ODD_LOT_ORDER(String temp_radio_mainTab_ODD_LOT_ORDER) {

		selectRadioButton(radio_mainTab_ODD_LOT_ORDER, temp_radio_mainTab_ODD_LOT_ORDER, "radio mainTab ODD LOT ORDER");
	}

	public void select_radio_tab2_STP_ORDER(String temp_radio_tab2_STP_ORDER) {

		selectRadioButton(radio_tab2_STP_ORDER, temp_radio_tab2_STP_ORDER, "radio tab2 STP ORDER");
	}

	public void select_radio_tab3_EXE_HLT(String temp_radio_tab3_EXE_HLT) {

		selectRadioButton(radio_tab3_EXE_HLT, temp_radio_tab3_EXE_HLT, "radio tab3 EXE HLT");
	}

	public void select_radio_tab3_TRADE_HLT(String temp_radio_tab3_TRADE_HLT) {

		selectRadioButton(radio_tab3_TRADE_HLT, temp_radio_tab3_TRADE_HLT, "radio tab3 TRADE HLT");
	}

	public String get_buyOrderReferenceNo() {
		return getTextWebElement(buyOrderReferenceNo, "Reference No");

	}

	public void click_commitTheDeal() {
		webElementClick(commitTheDeal, "Commit The Deal");
	}

	public void fill_autoWaring() {
		for (int i = 0; i < mandatoryWaring.size(); i++) {
			selectVisibileText(mandatoryWaring.get(i), "YES", mandatoryWaring.get(i).getAttribute("name"));
		}
	}

	public boolean check_click_AcceptOverrides() {
		boolean bFlag = false;
		if (AcceptOverrides.size() > 0) {
			webElementClick(AcceptOverrides.get(0), "Accept Overrides");
			bFlag= true;
		}
		return bFlag;
	}

	public void click_searchIcon() {
		webElementClick(searchIcon, "Search");
	}

	public void click_view_Contract() {
		webElementClick(view_Contract, "View Contract");

	}
	
	public void enter_securityBuyOrder(String tempsecurityBuyOrder) {
		enterInputText(securityBuyOrder, tempsecurityBuyOrder, "Security Buy Order");
	}

}
