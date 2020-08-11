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

public class T24_OpenSavingAccountPage extends CoreTapWrappers {

	private WebDriver driver;


	public T24_OpenSavingAccountPage(WebDriver driver) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(this.driver, this);
		if (!verifyTitle("Account")) {
			reportStep("This is not a Account Page", "FAIL");
		}
		wait(2000);
		driver.manage().window().maximize();
	}
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.LINK_TEXT, using= "Audit") WebElement Audit;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.LINK_TEXT, using= "Event Setup") WebElement Event_Setup;
 //New Object added - 25.07.2019 - 12.09.07
  
  @FindBy(how=How.XPATH, using="//span[contains(@class, 'iddisplay iddisplay_ACCOUNT')]") WebElement transactionID;
  
  @FindBy(how=How.XPATH, using= "//a[@title='Commit the deal']") WebElement CommitTheDeal;

  @FindBy(how=How.ID, using= "fieldName:ACCOUNT.OFFICER") WebElement Account_Officer;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:ACCOUNT.TITLE.1:1") WebElement GB_Account_Name_1;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:ACCOUNT.TITLE.2:1") WebElement GB_Account_Name_2;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:ALT.ACCT.ID:1") WebElement Alt_Acct_No__1;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:ALT.ACCT.ID:2") WebElement Alt_Acct_No__2;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:ALT.ACCT.ID:3") WebElement Alt_Acct_No__3;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:CATEGORY") WebElement Product_Code;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:CURRENCY") WebElement Currency;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:CUSTOMER") WebElement Customer_ID;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:EVENT:1") WebElement EVENT_1;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:FIELD:1:1") WebElement FIELD_1_1;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:INT.LIQU.ACCT:1") WebElement Int_Liquidation_Acct_1;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:INT.LIQU.TYPE:1") WebElement Int_Liquidation_Type_1;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:JOINT.HOLDER:1") WebElement Joint_Holder_ID_1;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:JOINT.NOTES:1:1") WebElement Relation_Notes_1_1;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:MNEMONIC") WebElement Mnemonic;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:OPERAND:1:1") WebElement OPERAND_1_1;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:OTHER.OFFICER:1") WebElement Other_Officer_1;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:RELATION.CODE:1") WebElement Joint_Relation_Code_1;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:SHORT.TITLE:1") WebElement GB_Short_Name;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "fieldName:VALUE:1:1") WebElement VALUE_1_1;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "moreactions") WebElement moreactions;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "radio:tab1:LINK.TO.LIMIT") List<WebElement> radio_tab1_LINK_TO_LIMIT;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "radio:tab1:PASSBOOK") List<WebElement> radio_tab1_PASSBOOK;
 //New Object added - 25.07.2019 - 12.09.07

  @FindBy(how=How.ID, using= "radio:tab1:SINGLE.LIMIT") List<WebElement> radio_tab1_SINGLE_LIMIT;


 public void click_Audit(){ 
 
 webElementClick(Audit,"Audit"); 
 } 


 public void click_Event_Setup(){ 
 
 webElementClick(Event_Setup,"Event Setup"); 
 } 

 
 public void click_commitTheDeal() {
	 webElementClick(CommitTheDeal, "Commit The Deal");
 }

 public void enter_Account_Officer(String temp_Account_Officer){ 
 
 enterInputText(Account_Officer,temp_Account_Officer,"Account Officer"); 
 } 


 public void enter_GB_Account_Name_1(String temp_GB_Account_Name_1){ 
 
 enterInputText(GB_Account_Name_1,temp_GB_Account_Name_1,"GB Account Name 1"); 
 } 


 public void enter_GB_Account_Name_2(String temp_GB_Account_Name_2){ 
 
 enterInputText(GB_Account_Name_2,temp_GB_Account_Name_2,"GB Account Name 2"); 
 } 


 public void enter_Alt_Acct_No__1(String temp_Alt_Acct_No__1){ 
 
 enterInputText(Alt_Acct_No__1,temp_Alt_Acct_No__1,"Alt Acct No  1"); 
 } 


 public void enter_Alt_Acct_No__2(String temp_Alt_Acct_No__1){ 
 
 enterInputText(Alt_Acct_No__2,temp_Alt_Acct_No__1,"Alt Acct No  2"); 
 } 


 public void enter_Alt_Acct_No__3(String temp_Alt_Acct_No__1){ 
 
 enterInputText(Alt_Acct_No__3,temp_Alt_Acct_No__1,"Alt Acct No  3"); 
 } 


 public void enter_Product_Code(String temp_Product_Code){ 
 
 enterInputText(Product_Code,temp_Product_Code,"Product Code"); 
 } 


 public void enter_Currency(String temp_Currency){ 
 
 enterInputText(Currency,temp_Currency,"Currency"); 
 } 


 public void enter_Customer_ID(String temp_Customer_ID){ 
 
 enterInputText(Customer_ID,temp_Customer_ID,"Customer ID"); 
 } 


 public void enter_EVENT_1(String temp_EVENT_1){ 
 
 enterInputText(EVENT_1,temp_EVENT_1,"EVENT 1"); 
 } 


 public void enter_FIELD_1_1(String temp_FIELD_1_1){ 
 
 enterInputText(FIELD_1_1,temp_FIELD_1_1,"FIELD 1 1"); 
 } 


 public void enter_Int_Liquidation_Acct_1(String temp_Int_Liquidation_Acct_1){ 
 
 enterInputText(Int_Liquidation_Acct_1,temp_Int_Liquidation_Acct_1,"Int Liquidation Acct 1"); 
 } 


 public void select_Int_Liquidation_Type_1(String temp_Int_Liquidation_Type_1){ 
 
 selectVisibileText(Int_Liquidation_Type_1,temp_Int_Liquidation_Type_1,"Int Liquidation Type 1"); 
 } 


 public void enter_Joint_Holder_ID_1(String temp_Joint_Holder_ID_1){ 
 
 enterInputText(Joint_Holder_ID_1,temp_Joint_Holder_ID_1,"Joint Holder ID 1"); 
 } 


 public void enter_Relation_Notes_1_1(String temp_Relation_Notes_1_1){ 
 
 enterInputText(Relation_Notes_1_1,temp_Relation_Notes_1_1,"Relation Notes 1 1"); 
 } 


 public void enter_Mnemonic(String temp_Mnemonic){ 
 
 enterInputText(Mnemonic,temp_Mnemonic,"Mnemonic"); 
 } 


 public void select_OPERAND_1_1(String temp_OPERAND_1_1){ 
 
 selectVisibileText(OPERAND_1_1,temp_OPERAND_1_1,"OPERAND 1 1"); 
 } 


 public void enter_Other_Officer_1(String temp_Other_Officer_1){ 
 
 enterInputText(Other_Officer_1,temp_Other_Officer_1,"Other Officer 1"); 
 } 


 public void enter_Joint_Relation_Code_1(String temp_Joint_Relation_Code_1){ 
 
 enterInputText(Joint_Relation_Code_1,temp_Joint_Relation_Code_1,"Joint Relation Code 1"); 
 } 


 public void enter_GB_Short_Name(String temp_GB_Short_Name){ 
 
 enterInputText(GB_Short_Name,temp_GB_Short_Name,"GB Short Name"); 
 } 


 public void enter_VALUE_1_1(String temp_VALUE_1_1){ 
 
 enterInputText(VALUE_1_1,temp_VALUE_1_1,"VALUE 1 1"); 
 } 


 public void select_moreactions(String temp_moreactions){ 
 
 selectVisibileText(moreactions,temp_moreactions,"moreactions"); 
 } 


 public void select_radio_tab1_LINK_TO_LIMIT(String temp_radio_tab1_LINK_TO_LIMIT){ 
 
 selectRadioButton(radio_tab1_LINK_TO_LIMIT, temp_radio_tab1_LINK_TO_LIMIT,"radio tab1 LINK TO LIMIT"); 
 } 


 public void select_radio_tab1_PASSBOOK(String temp_radio_tab1_PASSBOOK){ 
 
 selectRadioButton(radio_tab1_PASSBOOK, temp_radio_tab1_PASSBOOK,"radio tab1 PASSBOOK"); 
 } 


 public void select_radio_tab1_SINGLE_LIMIT(String temp_radio_tab1_SINGLE_LIMIT){ 
 
 selectRadioButton(radio_tab1_SINGLE_LIMIT, temp_radio_tab1_SINGLE_LIMIT,"radio tab1 SINGLE LIMIT"); 
 } 
 
 public String get_transactionID() {
		String sTempvalue = getTextWebElement(transactionID, "Transaction ID");
		return sTempvalue;
	}
 
}
