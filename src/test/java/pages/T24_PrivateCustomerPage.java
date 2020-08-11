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

public class T24_PrivateCustomerPage extends CoreTapWrappers {

	private WebDriver driver;



	public T24_PrivateCustomerPage(WebDriver driver) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(this.driver, this);
//		if (!verifyTitle("Account")) {
//			reportStep("This is not a Account Page", "FAIL");
//		}
		wait(2000);
		driver.manage().window().maximize();
	}
	
	@FindBy(how=How.LINK_TEXT, using= "Accept Overrides") List<WebElement> AcceptOverrides;
 //New Object added - 25.07.2019 - 16.37.52

  @FindBy(how=How.LINK_TEXT, using= "Additional Dets") WebElement Additional_Dets;
 //New Object added - 25.07.2019 - 16.37.52

  @FindBy(how=How.LINK_TEXT, using= "Additional Info") WebElement Additional_Info;
 //New Object added - 25.07.2019 - 16.37.52

  @FindBy(how=How.LINK_TEXT, using= "Calc Risk Profile") WebElement Calc_Risk_Profile;
 //New Object added - 25.07.2019 - 16.37.52

  @FindBy(how=How.LINK_TEXT, using= "Create Account") WebElement Create_Account;
 //New Object added - 25.07.2019 - 16.37.52

  @FindBy(how=How.LINK_TEXT, using= "Create Portfolio") WebElement Create_Portfolio;
 //New Object added - 25.07.2019 - 16.37.52

  @FindBy(how=How.LINK_TEXT, using= "Customer Security") WebElement Customer_Security;
  
  @FindBy(how=How.XPATH, using= "//input[contains(@class, 'idbox_CUSTOMERSECURITY_PVTCUST')]") WebElement transactionID;
  
  @FindBy(how=How.XPATH, using= "//frame[@target='workarea']") WebElement HeaderFrame;
  
  @FindBy(how=How.XPATH, using= "//frame[contains(@id,'workarea')]") WebElement workArea;
  
  @FindBy(how = How.CLASS_NAME, using = "warningbox") List<WebElement> mandatoryWaring;
  
  //New Object added - 25.07.2019 - 18.19.01

  @FindBy(how=How.LINK_TEXT, using= "Audit") WebElement Audit;
 //New Object added - 25.07.2019 - 18.19.01

  @FindBy(how=How.ID, using= "fieldName:CUSTOMER.TYPE:1") WebElement Client_Type_1;
 //New Object added - 25.07.2019 - 18.19.01

  @FindBy(how=How.ID, using= "fieldName:DEFAULT.DEPOSITORY") WebElement Default_Depository;
 //New Object added - 25.07.2019 - 18.19.01

  @FindBy(how=How.ID, using= "fieldName:EXTERNAL.REPS:1") WebElement Reports_Requested_1;
 //New Object added - 25.07.2019 - 18.19.01

  @FindBy(how=How.ID, using= "fieldName:MX.INSTRUCTION:1") WebElement MX_Instruction_1;
 //New Object added - 25.07.2019 - 18.19.01

  @FindBy(how=How.ID, using= "fieldName:PARENT.DEPOSITORY") WebElement Parent_Depository;
 //New Object added - 25.07.2019 - 18.19.01

  @FindBy(how=How.ID, using= "fieldName:STATEMENT.FREQ") WebElement Statement_Frequency;
 //New Object added - 25.07.2019 - 18.19.01

  @FindBy(how=How.ID, using= "moreactions") WebElement moreactions;
  
  @FindBy(how=How.XPATH, using= "//a[@title='Commit the deal']") WebElement commitTheDeal;
  
  @FindBy (how=How.XPATH, using="//img[@alt='Selection Screen']/..") WebElement searchIcon;
  
  @FindBy(how=How.XPATH, using="//a[@title='View a contract']") WebElement view_Contract;
  
  
  
	public void frame_switchToMainFrame() {	
		driver.switchTo().frame(HeaderFrame);
	}
	
	public void frame_switchToWrokArea() {	
		driver.switchTo().frame(workArea);
	}
	

 public void click_Additional_Dets(){ 
 
 webElementClick(Additional_Dets,"Additional Dets"); 
 } 


 public void click_Additional_Info(){ 
 
 webElementClick(Additional_Info,"Additional Info"); 
 } 


 public void click_Calc_Risk_Profile(){ 
 
 webElementClick(Calc_Risk_Profile,"Calc Risk Profile"); 
 } 


 public void click_Create_Account(){ 
 
 webElementClick(Create_Account,"Create Account"); 
 } 


 public void click_Create_Portfolio(){ 
 
 webElementClick(Create_Portfolio,"Create Portfolio"); 
 } 


 public void click_Customer_Security(){ 
 
 webElementClick(Customer_Security,"Customer Security"); 
 } 
 
 public void enter_transactionID(String sTempValue) {
	 enterInputText(transactionID, sTempValue, "Transaction ID");
 }
 
 public void pressEnter_transactionID() {
	 transactionID.sendKeys(Keys.ENTER);
 }
 
 
 public void frame_defaultContent() {
	 driver.switchTo().defaultContent();
 }
 
 public void click_Audit(){ 
	 
	 webElementClick(Audit,"Audit"); 
	 } 


	 public void select_Client_Type_1(String temp_Client_Type_1){ 
	 
	 selectVisibileText(Client_Type_1,temp_Client_Type_1,"Client Type 1"); 
	 } 


	 public void enter_Default_Depository(String temp_Default_Depository){ 
	 
	 enterInputText(Default_Depository,temp_Default_Depository,"Default Depository (client)"); 
	 } 


	 public void enter_Reports_Requested_1(String temp_Reports_Requested_1){ 
	 
	 enterInputText(Reports_Requested_1,temp_Reports_Requested_1,"Reports Requested 1"); 
	 } 


	 public void enter_MX_Instruction_1(String temp_MX_Instruction_1){ 
	 
	 enterInputText(MX_Instruction_1,temp_MX_Instruction_1,"MX Instruction 1"); 
	 } 


	 public void enter_Parent_Depository(String temp_Parent_Depository){ 
	 
	 enterInputText(Parent_Depository,temp_Parent_Depository,"Parent Depository"); 
	 } 


	 public void enter_Statement_Frequency(String temp_Statement_Frequency){ 
	 
	 enterInputText(Statement_Frequency,temp_Statement_Frequency,"Statement Frequency"); 
	 } 


	 public void select_moreactions(String temp_moreactions){ 
	 
	 selectVisibileText(moreactions,temp_moreactions,"moreactions"); 
	 } 
	 
	 public void click_commitTheDeal() {
		 webElementClick(commitTheDeal, "Commit The Deal");
	 }
	 
	 public void fill_autoWaring() {
			for (int i = 0; i < mandatoryWaring.size(); i++) {
				selectVisibileText(mandatoryWaring.get(i), "YES", mandatoryWaring.get(i).getAttribute("name"));
			}
	}
	 
	 public void check_click_AcceptOverrides() {
			if (AcceptOverrides.size()>0) {
				webElementClick(AcceptOverrides.get(0), "Accept Overrides");
			}
	} 
	 
	 public void click_searchIcon() {
			webElementClick(searchIcon, "Search");
		}
 
	 
	 public void click_view_Contract() {
			webElementClick(view_Contract, "View Contract");
		}
}
