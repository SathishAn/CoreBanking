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

public class T24_CashDepositPage extends CoreTapWrappers {
	private WebDriver driver;



	public T24_CashDepositPage(WebDriver driver) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(this.driver, this);
		if (!verifyTitle("TELLER")) {
			reportStep("This is not a Cash Deposit Page", "FAIL");
		}
		wait(2000);
		driver.manage().window().maximize();
	}

 //New Object added - 25.07.2019 - 13.34.24

  @FindBy(how=How.LINK_TEXT, using= "Audit") WebElement Audit;
 //New Object added - 25.07.2019 - 13.34.24

  @FindBy(how=How.ID, using= "fieldName:ACCOUNT.2") WebElement Credit_Account;
 //New Object added - 25.07.2019 - 13.34.24

  @FindBy(how=How.ID, using= "fieldName:AMOUNT.LOCAL.1:1") WebElement Deposit_Amount;
 //New Object added - 25.07.2019 - 13.34.24

  @FindBy(how=How.ID, using= "fieldName:DR.UNIT:1") WebElement Units_1;
 //New Object added - 25.07.2019 - 13.34.24

  @FindBy(how=How.ID, using= "fieldName:NARRATIVE.2:1") WebElement Narrative_1;
 //New Object added - 25.07.2019 - 13.34.24

  @FindBy(how=How.ID, using= "fieldName:VALUE.DATE.2") WebElement Value_Date;
 //New Object added - 25.07.2019 - 13.34.24

  @FindBy(how=How.ID, using= "moreactions") WebElement moreactions;

  @FindBy(how=How.XPATH, using= "//img[contains(@title,'Commit the deal')]") WebElement Commit;
  
  @FindBy(how=How.LINK_TEXT, using= "Accept Overrides") WebElement Accept_Overrides;
  
  @FindBy(how=How.XPATH, using= "//input[contains(@class,'idbox idbox_TELLER idbox_TELLER_LCYCASHIN')]") WebElement Input_CashLocalDeposit;
  
  @FindBy(how=How.XPATH, using= "//a[contains(@title,'View a contract')]") WebElement view_contract;
  
  @FindBy(how=How.XPATH, using= "//span[text()='Audit']") WebElement Audit_Tab;
  
  @FindBy(how=How.XPATH, using= "//span[contains(@class,'iddisplay iddisplay_TELLER')]") WebElement TransactionID;
  
  @FindBy(how=How.XPATH, using= "//img[@title='Go']") WebElement Go_Button;
  
  @FindBy(how=How.XPATH, using= "//td[@class='message']") WebElement TransactionNumber;
  
  @FindBy(how=How.XPATH, using= "//span[contains(@class,'iddisplay iddisplay_TELLER')]") WebElement AuditScreenTransNumber;
  
  @FindBy(how=How.XPATH, using= "//*[@id='enqheader']/tbody/tr[2]/td[2]") WebElement EntriesScreenTransNumber;
  
  
  
 public void click_Audit(){ 
 
 webElementClick(Audit,"Audit"); 
 } 


 public void enter_Credit_Account(String temp_Credit_Account){ 
 
 enterInputText(Credit_Account,temp_Credit_Account,"Credit Account"); 
 } 
 
 public void wait_Credit_Account(){ 
	 
	 webElementWait(Credit_Account, "3", "Stale element");
	 } 



 public void enter_Deposit_Amount(String temp_Deposit_Amount){ 
 
 enterInputText(Deposit_Amount,temp_Deposit_Amount,"Deposit Amount"); 
 } 


 public void enter_Units_1(String temp_Units_1){ 
 
 enterInputText(Units_1,temp_Units_1,"Units 1"); 
 } 


 public void enter_Narrative_1(String temp_Narrative_1){ 
 
 enterInputText(Narrative_1,temp_Narrative_1,"Narrative 1"); 
 } 


 public void enter_Value_Date(String temp_Value_Date){ 
 
 enterInputText(Value_Date,temp_Value_Date,"Value Date"); 
 } 


 public void select_moreactions(String temp_moreactions){ 
 
 selectVisibileText(moreactions,temp_moreactions,"moreactions"); 
 } 
 
 public void click_commit(){ 
	 
	 webElementClick(Commit,"Commit the deal");
 } 
 
 public void Accept_Overrides(){ 
	 
	 webElementClick(Accept_Overrides,"Accept Overrides");
 }
 
 public void Input_CashLocalDeposit(String Transaction_Id){ 
	 
 enterInputText(Input_CashLocalDeposit,Transaction_Id,"Transaction ID"); 
 } 
 
 public void view_contract(){ 
	 
	 webElementClick(view_contract,"view contract");
 }
 public void Audit_Tab(){ 
	 
	 webElementClick(Audit_Tab,"Audit Tab");
 }
 
public void Go_Button(){ 
	 
	 webElementClick(Go_Button,"Go Button");
 }

public void ValidateAcceptOverride(){ 
	if (Accept_Overrides.isDisplayed()) {	
	   webElementClick(Accept_Overrides,"Accept Overrides");
	}	
 }

public String validate_transactionNum() {
	String s1 = getTextWebElement(TransactionNumber, "Transaction Number");
	String[] trans = s1.split(" ");
	String Trans_Number = trans[2];	
	System.out.println(Trans_Number);
	return Trans_Number;
}

public void validate_transactionNum_Audit(String transNumAudit) {
	verifyText(AuditScreenTransNumber, transNumAudit);
}

public void validate_transactionNum_Entries(String transNumEntries) {
	verifyText(EntriesScreenTransNumber, transNumEntries);
}
 
}
