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

public class T24_LoanDisbursementPage extends CoreTapWrappers {

	private WebDriver driver;



	public T24_LoanDisbursementPage(WebDriver driver) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(this.driver, this);
		if (!verifyTitle("FUNDS.TRANSFER")) {
			reportStep("This is not a FUNDS.TRANSFER Page", "FAIL");
		}
		wait(2000);
		driver.manage().window().maximize();
	}
	

 //New Object added - 05.08.2019 - 15.25.18

  @FindBy(how=How.LINK_TEXT, using= "Audit") public WebElement Audit;
 //New Object added - 05.08.2019 - 15.25.18
  
  @FindBy(how=How.LINK_TEXT, using= "Accept Overrides") List<WebElement> AcceptOverrides;

  @FindBy(how=How.ID, using= "fieldName:CREDIT.ACCT.NO") WebElement Credit_Account;
 //New Object added - 05.08.2019 - 15.25.18

  @FindBy(how=How.ID, using= "fieldName:CREDIT.VALUE.DATE") WebElement Credit_Value_Date;
 //New Object added - 05.08.2019 - 15.25.18

  @FindBy(how=How.ID, using= "fieldName:CUSTOMER.RATE") WebElement Customer_rate;
 //New Object added - 05.08.2019 - 15.25.18

  @FindBy(how=How.ID, using= "fieldName:CUSTOMER.SPREAD") WebElement Customer_Spread;
 //New Object added - 05.08.2019 - 15.25.18

  @FindBy(how=How.ID, using= "fieldName:DEBIT.ACCT.NO") WebElement Arrangement_Id;
 //New Object added - 05.08.2019 - 15.25.18

  @FindBy(how=How.ID, using= "fieldName:DEBIT.AMOUNT") WebElement Debit_Amount;
 //New Object added - 05.08.2019 - 15.25.18

  @FindBy(how=How.ID, using= "fieldName:DEBIT.CURRENCY") WebElement Debit_Currency;
 //New Object added - 05.08.2019 - 15.25.18

  @FindBy(how=How.ID, using= "fieldName:DEBIT.VALUE.DATE") WebElement Debit_Value_Date;
 //New Object added - 05.08.2019 - 15.25.18

  @FindBy(how=How.ID, using= "fieldName:TREASURY.RATE") WebElement Treasury_Rate;
 //New Object added - 05.08.2019 - 15.25.18

  @FindBy(how=How.ID, using= "moreactions") WebElement moreactions;
  
  @FindBy(how=How.XPATH, using= "//span[contains(@class, 'iddisplay_FUNDSTRANSFER')]") WebElement aaDisbursementRef;

  @FindBy(how=How.XPATH, using= "//input[contains(@class, 'idbox_FUNDSTRANSFER')]") WebElement inputAADisbursementRef;
  
  
  @FindBy(how = How.XPATH, using = "//img[@alt= 'Validate a deal']") WebElement validate;

  @FindBy(how = How.XPATH, using = "//img[@alt= 'Commit the deal']")	WebElement Commit;
  
  @FindBy(how=How.XPATH, using="//a[@title='View a contract']") WebElement view_Contract;
	
	

 public void click_Audit(){ 
 
 webElementClick(Audit,"Audit"); 
 } 


 public void enter_Credit_Account(String temp_Credit_Account){ 
 
 enterInputText(Credit_Account,temp_Credit_Account,"Credit Account"); 
 } 


 public void enter_Credit_Value_Date(String temp_Credit_Value_Date){ 
 
 enterInputText(Credit_Value_Date,temp_Credit_Value_Date,"Credit Value Date"); 
 } 


 public void enter_Customer_rate(String temp_Customer_rate){ 
 
 enterInputText(Customer_rate,temp_Customer_rate,"Customer rate"); 
 } 


 public void enter_Customer_Spread(String temp_Customer_Spread){ 
 
 enterInputText(Customer_Spread,temp_Customer_Spread,"Customer Spread"); 
 } 


 public void enter_Arrangement_Id(String temp_Arrangement_Id){ 
 
 enterInputText(Arrangement_Id,temp_Arrangement_Id,"Arrangement Id"); 
 
 } 


 public void enter_Debit_Amount(String temp_Debit_Amount){ 
 
 enterInputText(Debit_Amount,temp_Debit_Amount,"Debit Amount"); 
 } 


 public void enter_Debit_Currency(String temp_Debit_Currency){ 
 
 enterInputText(Debit_Currency,temp_Debit_Currency,"Debit Currency"); 
 } 


 public void enter_Debit_Value_Date(String temp_Debit_Value_Date){ 
 
 enterInputText(Debit_Value_Date,temp_Debit_Value_Date,"Debit Value Date"); 
 } 


 public void enter_Treasury_Rate(String temp_Treasury_Rate){ 
 
 enterInputText(Treasury_Rate,temp_Treasury_Rate,"Treasury Rate"); 
 } 


 public void select_moreactions(String temp_moreactions){ 
 
 selectVisibileText(moreactions,temp_moreactions,"moreactions"); 
 } 
 
 public String get_aaDisbursementRefNO() {
	 return getTextWebElement(aaDisbursementRef, "Reference No");
 }
 
	public void click_validate() {

		webElementClick(validate, "Validate");

	}

	public void click_Commit() {

		webElementClick(Commit, "Commit");

	}
	
	public boolean check_click_AcceptOverrides() {
		boolean bFlag = false;
		if (AcceptOverrides.size()>0) {
			webElementClick(AcceptOverrides.get(0), "Accept Overrides");
			bFlag = true;
		}
		return bFlag;
		
		
	}
	
	public void enter_AADisbursementRefNo(String tempRefNo) {
		enterInputText(inputAADisbursementRef, tempRefNo, "AA Disbursement Reference");
	}
	
	public void click_view_Contract() {
		webElementClick(view_Contract, "View Contract");
	}
	
	
	
}
