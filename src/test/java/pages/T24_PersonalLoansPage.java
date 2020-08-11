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

public class T24_PersonalLoansPage extends CoreTapWrappers {

	private WebDriver driver;


	public T24_PersonalLoansPage(WebDriver driver) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(this.driver, this);
		/*if (!verifyTitle("Authorise/Delete Account - R18TJPLAY")) {
			reportStep("This is not a UnAuthorised customer Page", "FAIL");
		}*/
		wait(2000);
		driver.manage().window().maximize();
	}
	
 //New Object added - 05.08.2019 - 14.27.57

  @FindBy(how=How.LINK_TEXT, using= "Audit") WebElement Audit;
 //New Object added - 05.08.2019 - 14.27.57

  @FindBy(how=How.ID, using= "fieldName:AGENT.ARR.ID:1") WebElement Agent_Arr_Id_1;
 //New Object added - 05.08.2019 - 14.27.57

  @FindBy(how=How.ID, using= "fieldName:AGENT.ID:1") WebElement Agent_Id_1;
 //New Object added - 05.08.2019 - 14.27.57

  @FindBy(how=How.ID, using= "fieldName:AGENT.ROLE:1") WebElement Agent_Role_1;
 //New Object added - 05.08.2019 - 14.27.57

  @FindBy(how=How.ID, using= "fieldName:ALTERNATE.ID") WebElement Alternate_Id;
 //New Object added - 05.08.2019 - 14.27.57

  @FindBy(how=How.ID, using= "fieldName:CURRENCY") WebElement Currency;
 //New Object added - 05.08.2019 - 14.27.57

  @FindBy(how=How.ID, using= "fieldName:CUSTOMER:1") WebElement Customer_1;
 //New Object added - 05.08.2019 - 14.27.57

  @FindBy(how=How.ID, using= "fieldName:PRICING.PLAN") WebElement Pricing_Plan;
 //New Object added - 05.08.2019 - 14.27.57

  @FindBy(how=How.ID, using= "fieldName:PRICING.SELECTION") WebElement Pricing;
 //New Object added - 05.08.2019 - 14.27.57

  @FindBy(how=How.ID, using= "fieldName:PRODUCT.VARIATION") WebElement Variation;
 //New Object added - 05.08.2019 - 14.27.57

  @FindBy(how=How.ID, using= "fieldName:REMARKS") WebElement Remarks;
 //New Object added - 05.08.2019 - 14.27.57

  @FindBy(how=How.ID, using= "fieldName:REWARDS.ARR.ID") WebElement Rewards_Arr_Id;
 //New Object added - 05.08.2019 - 14.27.57

  @FindBy(how=How.ID, using= "fieldName:TRADE.DATE") WebElement Trade_Date;
 //New Object added - 05.08.2019 - 14.27.57

  @FindBy(how=How.ID, using= "moreactions") WebElement moreactions;

  @FindBy (how=How.XPATH, using="(//td[text()='Personal Loans']/a)[2]") WebElement personalLoans;
	
  @FindBy (how=How.XPATH, using= "(//td[text()='Personal Loans']/following-sibling::td[contains(@class,'PRODUCTCATALOG')])[1]") WebElement newArrangement;
	
  @FindBy (how=How.XPATH, using= "//img[@title='Validate a deal']") WebElement ValidateDeal;
  
  @FindBy (how=How.XPATH, using= "//img[@title='Commit the deal']") WebElement CommitDeal;
  
  @FindBy (how=How.ID, using= "fieldName:AMOUNT") WebElement Amount;
  
  @FindBy(how=How.LINK_TEXT, using= "Commitment") WebElement Commitment;
  
  @FindBy (how=How.ID, using= "fieldName:TERM") WebElement Term;
  
  @FindBy (how=How.XPATH, using= "//select[@class='warningbox']") WebElement warningBox;
  
  @FindBy (how=How.XPATH, using= "//td[@class='message']") WebElement LoanTransRefNo;
  
  @FindBy (how=How.XPATH, using= "//input[contains(@class,'ARRANGEMENTACTIVITY')]") WebElement inputNewArrangement;
  
  @FindBy (how=How.XPATH, using= "//img[@title='View a contract']") WebElement viewContract;
  
  @FindBy (how=How.XPATH, using= "//label[@for='fieldName:ARRANGEMENT']/../following-sibling::td[2]/span") WebElement ArrangementId;
  
  @FindBy(how=How.XPATH, using= "//span[text()='New Arrangement']") WebElement New_ArrangementTab;
  
  
 public void click_Audit(){ 
 
 webElementClick(Audit,"Audit"); 
 } 

 public void click_ArrangementId(){ 
	 
 webElementClick(ArrangementId,"ArrangementId"); 
 } 
 
 public void click_New_ArrangementTab(){ 
	 
 webElementClick(New_ArrangementTab,"New_ArrangementTab"); 
 } 

 public void enter_Agent_Arr_Id_1(String temp_Agent_Arr_Id_1){ 
 
 enterInputText(Agent_Arr_Id_1,temp_Agent_Arr_Id_1,"Agent Arr Id 1"); 
 } 


 public void enter_Agent_Id_1(String temp_Agent_Id_1){ 
 
 enterInputText(Agent_Id_1,temp_Agent_Id_1,"Agent Id 1"); 
 } 


 public void select_Agent_Role_1(String temp_Agent_Role_1){ 
 
 selectVisibileText(Agent_Role_1,temp_Agent_Role_1,"Agent Role 1"); 
 } 


 public void enter_Alternate_Id(String temp_Alternate_Id){ 
 
 enterInputText(Alternate_Id,temp_Alternate_Id,"Alternate Id"); 
 } 


 public void enter_Currency(String temp_Currency){ 
 
 enterInputText(Currency,temp_Currency,"Currency"); 
 } 


 public void enter_Customer_1(String temp_Customer_1){ 
 
 enterInputText(Customer_1,temp_Customer_1,"Customer 1"); 
 } 


 public void enter_Pricing_Plan(String temp_Pricing_Plan){ 
 
 enterInputText(Pricing_Plan,temp_Pricing_Plan,"Pricing Plan"); 
 } 


 public void enter_Pricing(String temp_Pricing){ 
 
 enterInputText(Pricing,temp_Pricing,"Pricing"); 
 } 


 public void enter_Variation(String temp_Variation){ 
 
 enterInputText(Variation,temp_Variation,"Variation"); 
 } 


 public void enter_Remarks(String temp_Remarks){ 
 
 enterInputText(Remarks,temp_Remarks,"Remarks"); 
 } 


 public void enter_Rewards_Arr_Id(String temp_Rewards_Arr_Id){ 
 
 enterInputText(Rewards_Arr_Id,temp_Rewards_Arr_Id,"Rewards Arr Id"); 
 } 


 public void enter_Trade_Date(String temp_Trade_Date){ 
 
 enterInputText(Trade_Date,temp_Trade_Date,"Trade Date"); 
 } 


 public void select_moreactions(String temp_moreactions){ 
 
 selectVisibileText(moreactions,temp_moreactions,"moreactions"); 
 } 
 
 
 public void click_PersonalLoans() {
		webElementClick(personalLoans, "Personal Loans");
 }
	
 
 public void click_newArrangement() {
		webElementClick(newArrangement, "Personal Loans new arrangement Icon");
		driver.switchTo().defaultContent();
		switchToLastWindow();
		driver.manage().window().maximize();
}

 
 public void click_validateDeal() {
		webElementClick(ValidateDeal, "Validate deal Icon is clicked");
		
}
 
 public void click_CommitDeal() {
		webElementClick(CommitDeal, "Commit deal Icon is clicked");
		
}
 
 public void click_Commitment() {
		webElementClick(Commitment, "Commitment is clicked");
		
}
 
 public void enter_Amount(String temp_Amount){ 
	 
	 enterInputText(Amount,temp_Amount,"Amount"); 
} 

 
 public void enter_Term(String temp_Term){ 
	 
	 enterInputText(Term,temp_Term,"Term"); 
} 
 
 public void select_warningBox(String temp_warningBox){ 
	 
	 selectVisibileText(warningBox,temp_warningBox,"warningBox"); 
 } 
 
 public String validate_transactionNum() {
		String s1 = getTextWebElement(LoanTransRefNo, "Loan Transaction Number");
		String[] trans = s1.split(" ");
		String Trans_Number = trans[2];	
		System.out.println(Trans_Number);
		return Trans_Number;
	}
 
 
 public void enter_loanRefNum(String temp_loanRefNum){ 
	 
 enterInputText(inputNewArrangement,temp_loanRefNum,"input the loan ref num"); 
 } 
 
 public void click_viewContract() throws InterruptedException {
		webElementClick(viewContract, "View contract is clicked");
		Thread.sleep(3000);
		
}
 
 public String arrangementId() {
		String s1 = getTextWebElement(ArrangementId, "Arrangement id");
		
		System.out.println(s1);
		return s1;
	}
 
 
}
