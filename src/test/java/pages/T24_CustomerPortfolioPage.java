package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CoreTapWrappers;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

public class T24_CustomerPortfolioPage extends CoreTapWrappers {

	private WebDriver driver;
	public T24_CustomerPortfolioPage(WebDriver driver) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(this.driver, this);
		/*if (!verifyTitle("Private Customer")) {
			reportStep("This is not a Private Customer Page", "FAIL");
		}*/
		wait(2000);
		driver.manage().window().maximize();
		
	}
	 @FindBy(how=How.LINK_TEXT, using= "Account Special Conditions") WebElement Account_Special_Conditions;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.LINK_TEXT, using= "Audit") WebElement Audit;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "CheckBox:fieldName:DIVERSIFICATION") WebElement CheckBox_DIVERSIFICATION;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "CheckBox:fieldName:IAM.PORTFOLIO") WebElement CheckBox_IAM_PORTFOLIO;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "CheckBox:fieldName:MARGIN.LENDING") WebElement CheckBox_MARGIN_LENDING;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "CheckBox:fieldName:REIMBURSE.TR.FEE") WebElement CheckBox_REIMBURSE_TR_FEE;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "CheckBox:fieldName:SEGREG.CHARGE") WebElement CheckBox_SEGREG_CHARGE;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "CheckBox:fieldName:SEGREG.INCOME") WebElement CheckBox_SEGREG_INCOME;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "CheckBox:fieldName:WR.REPORTING") WebElement CheckBox_WR_REPORTING;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.LINK_TEXT, using= "Custody Details") WebElement Custody_Details;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.LINK_TEXT, using= "Depot preferences") WebElement Depot_preferences;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.LINK_TEXT, using= "Fees Summary") WebElement Fees_Summary;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.LINK_TEXT, using= "Group Portfolio Details") WebElement Group_Portfolio_Details;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.LINK_TEXT, using= "Joint Holders") WebElement Joint_Holders;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.LINK_TEXT, using= "Margin Details") WebElement Margin_Details;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.LINK_TEXT, using= "Perf Fees") WebElement Perf_Fees;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.LINK_TEXT, using= "Portfolio Activity") WebElement Portfolio_Activity;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:AC.DEF.ACCT:1:1") WebElement AC_DEF_ACCT_1_1;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:AC.DEF.CCY:1:1") WebElement AC_DEF_CCY_1_1;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:AC.DEF.SC.ACCT:1") WebElement AC_DEF_SC_ACCT_1;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:AC.DEF.SYS.CODE:1") WebElement AC_DEF_SYS_CODE_1;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:ACC.NO.CLOSE:1") WebElement ACC_NO_CLOSE_1;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:ACCOUNT.NAME") WebElement Account_Name;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:ACCOUNT.NOS:1") WebElement Account_No__1;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:ACCOUNT.OFFICER") WebElement Portfolio_Mgr;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:ADV.LAST.RUN") WebElement ADV_LAST_RUN;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:ADVICE.INDEX") WebElement ADVICE_INDEX;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:ADVISORY.ACCR.ACCT") WebElement ADVISORY_ACCR_ACCT;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:ADVISORY.ACCR.PL") WebElement ADVISORY_ACCR_PL;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:APP.FIELD:1:1") WebElement APP_FIELD_1_1;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:APP.OPERAND:1:1") WebElement APP_OPERAND;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:APP.VALUE:1:1") WebElement APP_VALUE;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:BENCHMARK:1") WebElement BENCHMARK_1;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:CUS.RELATIONSHIP:1") WebElement CUS_RELATIONSHIP_1;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:DEFAULT.DEPO:1") WebElement DEFAULT_DEPO_1;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:EXT.ACCT.BANK:1") WebElement EXT_ACCT_BANK_1;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:EXT.ACCT.CCY:1") WebElement EXT_ACCT_CCY_1;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:EXT.ACCT.NO:1") WebElement EXT_ACCT_NO_1;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:EXT.CUSTODIAN") WebElement EXT_CUSTODIAN;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:FACILITY") WebElement Facility;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:GEARING") WebElement Gearing;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:GLOBAL.LIMIT") WebElement Global_Limit;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:INC.ACCOUNT.NO:1") WebElement INC_ACCOUNT_NO_1;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:INITIAL.MARGIN") WebElement Initial_Margin;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:INVESTMENT.PROGRAM") WebElement Portfolio_Prog_;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:JOINT.HOLDER:1") WebElement JOINT_HOLDER_1;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:JOINT.NOTES:1") WebElement JOINT_NOTES_1;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:MANAGED.ACCOUNT") WebElement Managed_Account;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:MGN.MAINT.LMT.AMT") WebElement MGN_MAINT_LMT_AMT;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:OWN.COMP.ID") WebElement OWN_COMP_ID;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:PF.ACCR.ACCT") WebElement PF_ACCR_ACCT;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:PF.FEES.ACML") WebElement PF_FEES_ACML;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:PF.FEES.FREQ") WebElement PF_FEES_FREQ;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:PF.FEES.START") WebElement PF_FEES_START;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:PF.FEES.TYPE") WebElement PF_FEES_TYPE;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:PORT.CLASS.TYPE") WebElement Portfolio_Class_type;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:PORT.COMP.ID") WebElement PORT_COMP_ID;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:PP.ADJ.FACTOR") WebElement Pp_Adj_Factor;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:REFERENCE.CURRENCY") WebElement Ref_Currency;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:RELATION.CODE:1") WebElement RELATION_CODE_1;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:SAFE.LAST.RUN") WebElement SAFE_LAST_RUN;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:SAFEKEEP.ACCR.ACCT") WebElement SAFEKEEP_ACCR_ACCT;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:SAFEKEEP.ACCR.PL") WebElement SAFEKEEP_ACCR_PL;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:SAFEKEEP.CHRG.ACC") WebElement Safekeeping_Acct;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:SELL.OUT.MGN.RATE") WebElement Sell_Out_Mgn_Rate;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:START.DATE") WebElement Start_Date;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:SUB.ACC.EXT.ID:1") WebElement SUB_ACC_EXT_ID_1;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:SUB.ACCOUNT:1") WebElement SUB_ACCOUNT_1;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:TAX.PAYABLE.CAT") WebElement TAX_PAYABLE_CAT;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:TOP.UP.MGN.RATE") WebElement Top_Up_Mgn_Rate;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "fieldName:VALUATION.CURRENCY") WebElement Val_Currency;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "moreactions") WebElement moreactions;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "radio:mainTab:MARGIN.ALLOWED") List<WebElement> radio_mainTab_MARGIN_ALLOWED;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "radio:mainTab:ONLINE.VAL") List<WebElement> radio_mainTab_ONLINE_VAL;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "radio:tab4:COUPON.TAX.STATUS") List<WebElement> radio_tab4_COUPON_TAX_STATUS;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "radio:tab8:FEE.ADJUSTMENT.TYPE") List<WebElement> radio_tab8_FEE_ADJUSTMENT_TYPE;
	 //New Object added - 26.07.2019 - 11.43.22

	  @FindBy(how=How.ID, using= "radio:tab8:PORTFOLIO.FEES") List<WebElement> radio_tab8_PORTFOLIO_FEES;
	  
	  @FindBy(how=How.XPATH, using= "//span[text()='Create Portfolio']") WebElement createPortfolioTab;
	 //New Object added - 25.07.2019 - 13.34.24

	  @FindBy(how=How.XPATH, using= "//input[contains(@class,'idbox idbox_SECACCMASTER')]") WebElement portfolioInput;
	
	  @FindBy(how=How.XPATH, using= "//frame[@target='workarea']") WebElement frameWorkArea;
	
	  @FindBy(how=How.XPATH, using= "(//frame[contains(@name,'AUTHORISER_TAB_PRIVATE_CUSTOMER')])[2]") WebElement framePortfolio;
	  
	  @FindBy(how=How.XPATH, using= "//img[@title='Commit the deal']") WebElement CommitDeal;
	  
	  @FindBy(how=How.XPATH, using= "//select[@class='warningbox']") WebElement warningBox;
	  
	  @FindBy(how=How.LINK_TEXT, using= "Accept Overrides") WebElement AcceptOverrides;
	  
	  @FindBy(how=How.XPATH, using= "(//td[@class='message'])[1]") WebElement TransactionNumber;
	  
	  @FindBy(how=How.XPATH, using= "//input[contains(@class,'idbox_SECACCMASTER idbox_SECACCMASTER_INPCUS')]") WebElement PortfolioInput;
	
	  @FindBy(how=How.XPATH, using= "//img[@title='Selection Criteria']") WebElement SearchPortfolio;
	  
	  @FindBy(how=How.XPATH, using= "//span[text()='Audit']") WebElement AuditTab;
		
	  @FindBy(how=How.XPATH, using= "//a[contains(@title,'View a contract')]") WebElement view_contract;
	 public void click_AuditTab(){ 
			webElementClick(AuditTab, "Audit Tab is clicked");
			 
			 } 
	public void switchTabFrame(){ 
		 driver.switchTo().frame(frameWorkArea);
		 
		 } 
	
	public void Portfolio_Search(){ 
		 driver.switchTo().frame(frameWorkArea);
		 
		 } 
	
	public void click_Search_Portfolio(){ 
		webElementClick(view_contract, "search portfolio click");
		 
		 } 	
	
	public void enter_portfolioID(String temp_portfolioID){ 
		 
		 enterInputText(PortfolioInput,temp_portfolioID,"Portfolio Id"); 
		 } 
	
	
	public void SelectProposal_Override(String temp_warning){ 
		if (AcceptOverrides.isDisplayed()) {	
			selectVisibileText(warningBox,temp_warning,"Investment proposal warning"); 
		    webElementClick(AcceptOverrides,"Accept Overrides");
		}	
	 }
	public String validate_TransactionNum() {
		String s1 = getTextWebElement(TransactionNumber, "Transaction Number");
		String[] trans = s1.split(" ");
		String Trans_Number = trans[2];	
		System.out.println(Trans_Number);
		return Trans_Number;
	}
	
	public void click_CommitDeal() {
		webElementClick(CommitDeal, "Commit Deal");
		
	}
	
	/*public void select_warning(String temp_warning) {
		selectVisibileText(warningBox,temp_warning,"Investment proposal warning"); 
		
	}
	*/
	public void PortfolioFrame(){ 
		 driver.switchTo().frame(framePortfolio);
		 
		 } 
	public void enter_portfolioInput(String temp_portfolioInput){ 
		
		 enterInputText(portfolioInput,temp_portfolioInput,"portfolio Input"); 
		 portfolioInput.sendKeys(Keys.ENTER);
		 wait(3000);
		/* driver.switchTo().defaultContent();
		 switchToLastWindow();*/
		 
		 } 

	public void click_createPortfolioTab() {
		webElementClick(createPortfolioTab, "create Portfolio Tab");
		driver.switchTo().defaultContent();
	}
	public void click_Account_Special_Conditions(){ 
		 
		 webElementClick(Account_Special_Conditions,"Account Special Conditions"); 
		 } 


		 public void click_Audit(){ 
		 
		 webElementClick(Audit,"Audit"); 
		 } 


		 public void click_Custody_Details(){ 
		 
		 webElementClick(Custody_Details,"Custody Details"); 
		 } 


		 public void click_Depot_preferences(){ 
		 
		 webElementClick(Depot_preferences,"Depot preferences"); 
		 } 


		 public void click_Fees_Summary(){ 
		 
		 webElementClick(Fees_Summary,"Fees Summary"); 
		 } 


		 public void click_Group_Portfolio_Details(){ 
		 
		 webElementClick(Group_Portfolio_Details,"Group Portfolio Details"); 
		 } 


		 public void click_Joint_Holders(){ 
		 
		 webElementClick(Joint_Holders,"Joint Holders"); 
		 } 


		 public void click_Margin_Details(){ 
		 
		 webElementClick(Margin_Details,"Margin Details"); 
		 } 


		 public void click_Perf_Fees(){ 
		 
		 webElementClick(Perf_Fees,"Perf Fees"); 
		 } 


		 public void click_Portfolio_Activity(){ 
		 
		 webElementClick(Portfolio_Activity,"Portfolio Activity"); 
		 } 


		 public void enter_AC_DEF_ACCT_1_1(String temp_AC_DEF_ACCT_1_1){ 
		 
		 enterInputText(AC_DEF_ACCT_1_1,temp_AC_DEF_ACCT_1_1,"AC DEF ACCT 1 1"); 
		 } 


		 public void enter_AC_DEF_CCY_1_1(String temp_AC_DEF_CCY_1_1){ 
		 
		 enterInputText(AC_DEF_CCY_1_1,temp_AC_DEF_CCY_1_1,"AC DEF CCY 1 1"); 
		 } 


		 public void enter_AC_DEF_SC_ACCT_1(String temp_AC_DEF_SC_ACCT_1){ 
		 
		 enterInputText(AC_DEF_SC_ACCT_1,temp_AC_DEF_SC_ACCT_1,"AC DEF SC ACCT 1"); 
		 } 


		 public void enter_AC_DEF_SYS_CODE_1(String temp_AC_DEF_SYS_CODE_1){ 
		 
		 enterInputText(AC_DEF_SYS_CODE_1,temp_AC_DEF_SYS_CODE_1,"AC DEF SYS CODE 1"); 
		 } 


		 public void enter_ACC_NO_CLOSE_1(String temp_ACC_NO_CLOSE_1){ 
		 
		 enterInputText(ACC_NO_CLOSE_1,temp_ACC_NO_CLOSE_1,"ACC NO CLOSE 1"); 
		 } 


		 public void enter_Account_Name(String temp_Account_Name){ 
		 
		 enterInputText(Account_Name,temp_Account_Name,"Account Name"); 
		 } 


		 public void enter_Account_No__1(String temp_Account_No__1){ 
		 
		 enterInputText(Account_No__1,temp_Account_No__1,"Account No  1"); 
		 } 


		 public void enter_Portfolio_Mgr(String temp_Portfolio_Mgr){ 
		 
		 enterInputText(Portfolio_Mgr,temp_Portfolio_Mgr,"Portfolio Mgr"); 
		 } 


		 public void enter_ADV_LAST_RUN(String temp_ADV_LAST_RUN){ 
		 
		 enterInputText(ADV_LAST_RUN,temp_ADV_LAST_RUN,"ADV LAST RUN"); 
		 } 


		 public void enter_ADVICE_INDEX(String temp_ADVICE_INDEX){ 
		 
		 enterInputText(ADVICE_INDEX,temp_ADVICE_INDEX,"ADVICE INDEX"); 
		 } 


		 public void enter_ADVISORY_ACCR_ACCT(String temp_ADVISORY_ACCR_ACCT){ 
		 
		 enterInputText(ADVISORY_ACCR_ACCT,temp_ADVISORY_ACCR_ACCT,"ADVISORY ACCR ACCT"); 
		 } 


		 public void enter_ADVISORY_ACCR_PL(String temp_ADVISORY_ACCR_PL){ 
		 
		 enterInputText(ADVISORY_ACCR_PL,temp_ADVISORY_ACCR_PL,"ADVISORY ACCR PL"); 
		 } 


		 public void enter_APP_FIELD_1_1(String temp_APP_FIELD_1_1){ 
		 
		 enterInputText(APP_FIELD_1_1,temp_APP_FIELD_1_1,"APP FIELD 1 1"); 
		 } 


		 public void select_APP_OPERAND(String temp_APP_OPERAND){ 
		 
		 selectVisibileText(APP_OPERAND,temp_APP_OPERAND,"APP OPERAND"); 
		 } 


		 public void enter_APP_VALUE(String temp_APP_VALUE){ 
		 
		 enterInputText(APP_VALUE,temp_APP_VALUE,"APP VALUE"); 
		 } 


		 public void enter_BENCHMARK_1(String temp_BENCHMARK_1){ 
		 
		 enterInputText(BENCHMARK_1,temp_BENCHMARK_1,"BENCHMARK 1"); 
		 } 


		 public void enter_CUS_RELATIONSHIP_1(String temp_CUS_RELATIONSHIP_1){ 
		 
		 enterInputText(CUS_RELATIONSHIP_1,temp_CUS_RELATIONSHIP_1,"CUS RELATIONSHIP 1"); 
		 } 


		 public void enter_DEFAULT_DEPO_1(String temp_DEFAULT_DEPO_1){ 
		 
		 enterInputText(DEFAULT_DEPO_1,temp_DEFAULT_DEPO_1,"DEFAULT DEPO 1"); 
		 } 


		 public void enter_EXT_ACCT_BANK_1(String temp_EXT_ACCT_BANK_1){ 
		 
		 enterInputText(EXT_ACCT_BANK_1,temp_EXT_ACCT_BANK_1,"EXT ACCT BANK 1"); 
		 } 


		 public void enter_EXT_ACCT_CCY_1(String temp_EXT_ACCT_CCY_1){ 
		 
		 enterInputText(EXT_ACCT_CCY_1,temp_EXT_ACCT_CCY_1,"EXT ACCT CCY 1"); 
		 } 


		 public void enter_EXT_ACCT_NO_1(String temp_EXT_ACCT_NO_1){ 
		 
		 enterInputText(EXT_ACCT_NO_1,temp_EXT_ACCT_NO_1,"EXT ACCT NO 1"); 
		 } 


		 public void enter_EXT_CUSTODIAN(String temp_EXT_CUSTODIAN){ 
		 
		 enterInputText(EXT_CUSTODIAN,temp_EXT_CUSTODIAN,"EXT CUSTODIAN"); 
		 } 


		 public void enter_Facility(String temp_Facility){ 
		 
		 enterInputText(Facility,temp_Facility,"Facility"); 
		 } 


		 public void enter_Gearing(String temp_Gearing){ 
		 
		 enterInputText(Gearing,temp_Gearing,"Gearing"); 
		 } 


		 public void enter_Global_Limit(String temp_Global_Limit){ 
		 
		 enterInputText(Global_Limit,temp_Global_Limit,"Global Limit"); 
		 } 


		 public void enter_INC_ACCOUNT_NO_1(String temp_INC_ACCOUNT_NO_1){ 
		 
		 enterInputText(INC_ACCOUNT_NO_1,temp_INC_ACCOUNT_NO_1,"INC ACCOUNT NO 1"); 
		 } 


		 public void enter_Initial_Margin(String temp_Initial_Margin){ 
		 
		 enterInputText(Initial_Margin,temp_Initial_Margin,"Initial Margin"); 
		 } 


		 public void enter_Portfolio_Prog_(String temp_Portfolio_Prog_){ 
		 
		 enterInputText(Portfolio_Prog_,temp_Portfolio_Prog_,"Portfolio Prog "); 
		 } 


		 public void enter_JOINT_HOLDER_1(String temp_JOINT_HOLDER_1){ 
		 
		 enterInputText(JOINT_HOLDER_1,temp_JOINT_HOLDER_1,"JOINT HOLDER 1"); 
		 } 


		 public void enter_JOINT_NOTES_1(String temp_JOINT_NOTES_1){ 
		 
		 enterInputText(JOINT_NOTES_1,temp_JOINT_NOTES_1,"JOINT NOTES 1"); 
		 } 


		 public void enter_Managed_Account(String temp_Managed_Account){ 
		 
		 enterInputText(Managed_Account,temp_Managed_Account,"Managed Account"); 
		 } 


		 public void enter_MGN_MAINT_LMT_AMT(String temp_MGN_MAINT_LMT_AMT){ 
		 
		 enterInputText(MGN_MAINT_LMT_AMT,temp_MGN_MAINT_LMT_AMT,"MGN MAINT LMT AMT"); 
		 } 


		 public void enter_OWN_COMP_ID(String temp_OWN_COMP_ID){ 
		 
		 enterInputText(OWN_COMP_ID,temp_OWN_COMP_ID,"OWN COMP ID"); 
		 } 


		 public void enter_PF_ACCR_ACCT(String temp_PF_ACCR_ACCT){ 
		 
		 enterInputText(PF_ACCR_ACCT,temp_PF_ACCR_ACCT,"PF ACCR ACCT"); 
		 } 


		 public void enter_PF_FEES_ACML(String temp_PF_FEES_ACML){ 
		 
		 enterInputText(PF_FEES_ACML,temp_PF_FEES_ACML,"PF FEES ACML"); 
		 } 


		 public void enter_PF_FEES_FREQ(String temp_PF_FEES_FREQ){ 
		 
		 enterInputText(PF_FEES_FREQ,temp_PF_FEES_FREQ,"PF FEES FREQ"); 
		 } 


		 public void enter_PF_FEES_START(String temp_PF_FEES_START){ 
		 
		 enterInputText(PF_FEES_START,temp_PF_FEES_START,"PF FEES START"); 
		 } 


		 public void enter_PF_FEES_TYPE(String temp_PF_FEES_TYPE){ 
		 
		 enterInputText(PF_FEES_TYPE,temp_PF_FEES_TYPE,"PF FEES TYPE"); 
		 } 


		 public void enter_Portfolio_Class_type(String temp_Portfolio_Class_type){ 
		 
		 enterInputText(Portfolio_Class_type,temp_Portfolio_Class_type,"Portfolio Class type"); 
		 } 


		 public void enter_PORT_COMP_ID(String temp_PORT_COMP_ID){ 
		 
		 enterInputText(PORT_COMP_ID,temp_PORT_COMP_ID,"PORT COMP ID"); 
		 } 


		 public void enter_Pp_Adj_Factor(String temp_Pp_Adj_Factor){ 
		 
		 enterInputText(Pp_Adj_Factor,temp_Pp_Adj_Factor,"Pp Adj Factor"); 
		 } 


		 public void enter_Ref_Currency(String temp_Ref_Currency){ 
		 
		 enterInputText(Ref_Currency,temp_Ref_Currency,"Ref Currency"); 
		 } 


		 public void enter_RELATION_CODE_1(String temp_RELATION_CODE_1){ 
		 
		 enterInputText(RELATION_CODE_1,temp_RELATION_CODE_1,"RELATION CODE 1"); 
		 } 


		 public void enter_SAFE_LAST_RUN(String temp_SAFE_LAST_RUN){ 
		 
		 enterInputText(SAFE_LAST_RUN,temp_SAFE_LAST_RUN,"SAFE LAST RUN"); 
		 } 


		 public void enter_SAFEKEEP_ACCR_ACCT(String temp_SAFEKEEP_ACCR_ACCT){ 
		 
		 enterInputText(SAFEKEEP_ACCR_ACCT,temp_SAFEKEEP_ACCR_ACCT,"SAFEKEEP ACCR ACCT"); 
		 } 


		 public void enter_SAFEKEEP_ACCR_PL(String temp_SAFEKEEP_ACCR_PL){ 
		 
		 enterInputText(SAFEKEEP_ACCR_PL,temp_SAFEKEEP_ACCR_PL,"SAFEKEEP ACCR PL"); 
		 } 


		 public void enter_Safekeeping_Acct(String temp_Safekeeping_Acct){ 
		 
		 enterInputText(Safekeeping_Acct,temp_Safekeeping_Acct,"Safekeeping Acct"); 
		 } 


		 public void enter_Sell_Out_Mgn_Rate(String temp_Sell_Out_Mgn_Rate){ 
		 
		 enterInputText(Sell_Out_Mgn_Rate,temp_Sell_Out_Mgn_Rate,"Sell Out Mgn Rate"); 
		 } 


		 public void enter_Start_Date(String temp_Start_Date){ 
		 
		 enterInputText(Start_Date,temp_Start_Date,"Start Date"); 
		 } 


		 public void enter_SUB_ACC_EXT_ID_1(String temp_SUB_ACC_EXT_ID_1){ 
		 
		 enterInputText(SUB_ACC_EXT_ID_1,temp_SUB_ACC_EXT_ID_1,"SUB ACC EXT ID 1"); 
		 } 


		 public void enter_SUB_ACCOUNT_1(String temp_SUB_ACCOUNT_1){ 
		 
		 enterInputText(SUB_ACCOUNT_1,temp_SUB_ACCOUNT_1,"SUB ACCOUNT 1"); 
		 } 


		 public void enter_TAX_PAYABLE_CAT(String temp_TAX_PAYABLE_CAT){ 
		 
		 enterInputText(TAX_PAYABLE_CAT,temp_TAX_PAYABLE_CAT,"TAX PAYABLE CAT"); 
		 } 


		 public void enter_Top_Up_Mgn_Rate(String temp_Top_Up_Mgn_Rate){ 
		 
		 enterInputText(Top_Up_Mgn_Rate,temp_Top_Up_Mgn_Rate,"Top Up Mgn Rate"); 
		 } 


		 public void enter_Val_Currency(String temp_Val_Currency){ 
		 
		 enterInputText(Val_Currency,temp_Val_Currency,"Val Currency"); 
		 } 


		 public void select_moreactions(String temp_moreactions){ 
		 
		 selectVisibileText(moreactions,temp_moreactions,"moreactions"); 
		 } 


		 public void select_radio_mainTab_MARGIN_ALLOWED(String temp_radio_mainTab_MARGIN_ALLOWED){ 
		 
		 selectRadioButton(radio_mainTab_MARGIN_ALLOWED, temp_radio_mainTab_MARGIN_ALLOWED,"radio mainTab MARGIN ALLOWED"); 
		 } 


		 public void select_radio_mainTab_ONLINE_VAL(String temp_radio_mainTab_ONLINE_VAL){ 
		 
		 selectRadioButton(radio_mainTab_ONLINE_VAL, temp_radio_mainTab_ONLINE_VAL,"radio mainTab ONLINE VAL"); 
		 } 


		 public void select_radio_tab4_COUPON_TAX_STATUS(String temp_radio_tab4_COUPON_TAX_STATUS){ 
		 
		 selectRadioButton(radio_tab4_COUPON_TAX_STATUS, temp_radio_tab4_COUPON_TAX_STATUS,"radio tab4 COUPON TAX STATUS"); 
		 } 


		 public void select_radio_tab8_FEE_ADJUSTMENT_TYPE(String temp_radio_tab8_FEE_ADJUSTMENT_TYPE){ 
		 
		 selectRadioButton(radio_tab8_FEE_ADJUSTMENT_TYPE, temp_radio_tab8_FEE_ADJUSTMENT_TYPE,"radio tab8 FEE ADJUSTMENT TYPE"); 
		 } 


		 public void select_radio_tab8_PORTFOLIO_FEES(String temp_radio_tab8_PORTFOLIO_FEES){ 
		 
		 selectRadioButton(radio_tab8_PORTFOLIO_FEES, temp_radio_tab8_PORTFOLIO_FEES,"radio tab8 PORTFOLIO FEES"); 
		 } 

	
}
