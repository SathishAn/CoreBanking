package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import utilities.CoreTapWrappers;

public class T24_IndividualCustomerPage extends CoreTapWrappers {

	private WebDriver driver;


	public T24_IndividualCustomerPage(WebDriver driver) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(this.driver, this);
		if (!verifyTitle("CUSTOMER")) {
			reportStep("This is not a customer Page", "FAIL");
		}
		wait(2000);
		driver.manage().window().maximize();
	}
	
	//New Object added - 17.07.2019 - 15.38.17


	@FindBy(how=How.LINK_TEXT, using= "Audit") WebElement Audit;
	 //New Object added - 17.07.2019 - 15.38.17
	
	@FindBy(how=How.LINK_TEXT, using= "Accept Overrides") List<WebElement> AcceptOverrides;
	  
	  @FindBy(how = How.XPATH, using = "//span[contains(@class, 'iddisplay iddisplay_CUSTOMER')]")	WebElement basicDetails;

	  @FindBy(how=How.ID, using= "CheckBox:fieldName:SECURE.MESSAGE") WebElement CheckBox_SECURE_MESSAGE;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "CheckBox:fieldName:UPDATE.PREV.ADDRESS") WebElement CheckBox_UPDATE_PREV_ADDRESS;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.LINK_TEXT, using= "Communication Details") WebElement Communication_Details;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.LINK_TEXT, using= "Financial Details") WebElement Financial_Details;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.LINK_TEXT, using= "Further Details") WebElement Further_Details;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.LINK_TEXT, using= "ID Doc") WebElement ID_Doc;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.LINK_TEXT, using= "KYC") WebElement KYC;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.LINK_TEXT, using= "Other Details") WebElement Other_Details;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.LINK_TEXT, using= "Relation") WebElement Relation;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.LINK_TEXT, using= "Reporting Details") WebElement Reporting_Details;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.LINK_TEXT, using= "Residential Details") WebElement Residential_Details;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:ACCOUNT.OFFICER") WebElement Account_Officer;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:ADDRESS:1:1") WebElement GB_Address_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:ALLOW.BULK.PROCESS") WebElement ALLOW_BULK_PROCESS;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:AML.RESULT") WebElement AML_RESULT;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:ANNUAL.BONUS:1") WebElement ANNUAL_BONUS_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:AUTO.NEXT.KYC.REVIEW.DATE") WebElement AUTO_NEXT_KYC_REVIEW_DATE;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:AUTO.NEXT.SUIT.REVIEW.DATE") WebElement AUTO_NEXT_SUIT_REVIEW_DATE;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:CALC.RISK.CLASS") WebElement CALC_RISK_CLASS;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:CHANGE.DATE:1") WebElement CHANGE_DATE_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:CHANGE.REASON:1") WebElement CHANGE_REASON_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:COMM.TYPE:1") WebElement COMM_TYPE_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:COMPANY.BOOK") WebElement COMPANY_BOOK;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:CONTACT.DATE") WebElement CONTACT_DATE;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:COUNTRY:1") WebElement GB_Country;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:CR.CALC.RESET.DATE:1") WebElement CR_CALC_RESET_DATE_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:CR.USER.PROFILE.TYPE:1") WebElement CR_USER_PROFILE_TYPE_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:CR.USER.PROFILE:1") WebElement CR_USER_PROFILE_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:CUSTOMER.CURRENCY:1") WebElement CUSTOMER_CURRENCY_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:CUSTOMER.LIABILITY") WebElement CUSTOMER_LIABILITY;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:CUSTOMER.RATING:1") WebElement Customer_Rating_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:CUSTOMER.SINCE") WebElement CUSTOMER_SINCE;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:CUSTOMER.STATUS") WebElement Customer_Status;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:CUSTOMER.TYPE") WebElement Customer_Type;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:DATE.OF.BIRTH") WebElement Date_of_Birth;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:EMAIL.1:1") WebElement Email_Address_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:EMPLOYERS.ADD:1:1") WebElement EMPLOYERS_ADD_1_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:EMPLOYERS.BUSS:1") WebElement EMPLOYERS_BUSS_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:EMPLOYERS.NAME:1") WebElement EMPLOYERS_NAME_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:EMPLOYMENT.START:1") WebElement EMPLOYMENT_START_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:EMPLOYMENT.STATUS:1") WebElement EMPLOYMENT_STATUS_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:FAMILY.NAME") WebElement FAMILY_NAME;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:FAX.1:1") WebElement Fax_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:FORMER.VIS.TYPE:1") WebElement FORMER_VIS_TYPE_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:GIVEN.NAMES") WebElement GIVEN_NAMES;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:HOLDINGS.PIVOT:1") WebElement HOLDINGS_PIVOT_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:INDUSTRY") WebElement Industry;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:INTERESTS:1") WebElement INTERESTS_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:INTRODUCER") WebElement INTRODUCER;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:ISSUE.CHEQUES") WebElement ISSUE_CHEQUES;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:JOB.TITLE:1") WebElement JOB_TITLE_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:KYC.RELATIONSHIP") WebElement KYC_RELATIONSHIP;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:LANGUAGE") WebElement Language;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:LAST.AML.RESULT.DATE") WebElement LAST_AML_RESULT_DATE;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:LAST.KYC.REVIEW.DATE") WebElement LAST_KYC_REVIEW_DATE;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:LAST.SUIT.REVIEW.DATE") WebElement LAST_SUIT_REVIEW_DATE;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:LEGAL.DOC.NAME:1") WebElement LEGAL_DOC_NAME_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:LEGAL.EXP.DATE:1") WebElement LEGAL_EXP_DATE_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:LEGAL.HOLDER.NAME:1") WebElement LEGAL_HOLDER_NAME_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:LEGAL.ID:1") WebElement LEGAL_ID_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:LEGAL.ISS.AUTH:1") WebElement LEGAL_ISS_AUTH_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:LEGAL.ISS.DATE:1") WebElement LEGAL_ISS_DATE_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:MANUAL.NEXT.KYC.REVIEW.DATE") WebElement MANUAL_NEXT_KYC_REVIEW_DATE;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:MANUAL.NEXT.SUIT.REVIEW.DATE") WebElement MANUAL_NEXT_SUIT_REVIEW_DATE;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:MANUAL.RISK.CLASS") WebElement MANUAL_RISK_CLASS;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:MARITAL.STATUS") WebElement Marital_Status;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:MNEMONIC") WebElement Mnemonic;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:MORTGAGE.AMT:1") WebElement MORTGAGE_AMT;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:NAME.1:1") WebElement GB_Full_Name;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:NAME.2:1") WebElement GB_Full_Name_2;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:NATIONALITY") WebElement Nationality;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:NET.MONTHLY.IN") WebElement NET_MONTHLY_IN;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:NET.MONTHLY.OUT") WebElement NET_MONTHLY_OUT;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:NO.OF.DEPENDENTS") WebElement NO_OF_DEPENDENTS;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:OCCUPATION:1") WebElement OCCUPATION_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:OFF.PHONE:1") WebElement Phone_Numbers_Off_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:OTHER.NATIONALITY:1") WebElement OTHER_NATIONALITY_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:OTHER.OFFICER:1") WebElement Second_Officer_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:PHONE.1:1") WebElement Phone_Numbers_Res_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:POST.CODE:1") WebElement GB_Post_Code;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:PREF.CHANNEL:1") WebElement PREF_CHANNEL_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:PREVIOUS.NAME:1") WebElement PREVIOUS_NAME_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:PROB.OF.DEFT:1") WebElement PROB_OF_DEFT_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:REL.CUSTOMER:1") WebElement REL_CUSTOMER_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:REL.DELIV.OPT:1:1") WebElement REL_DELIV_OPT_1_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:RELATION.CODE:1") WebElement RELATION_CODE_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:RESIDENCE") WebElement Residence;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:RESIDENCE.SINCE:1") WebElement RESIDENCE_SINCE;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:RESIDENCE.STATUS:1") WebElement RESIDENCE_STATUS;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:RESIDENCE.TYPE:1") WebElement RESIDENCE_TYPE;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:RESIDENCE.VALUE:1") WebElement RESIDENCE_VALUE;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:RISK.ASSET.TYPE:1") WebElement RISK_ASSET_TYPE_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:RISK.FROM.DATE:1") WebElement RISK_FROM_DATE_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:RISK.LEVEL:1") WebElement RISK_LEVEL_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:RISK.TOLERANCE:1") WebElement RISK_TOLERANCE_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:ROLE.MORE.INFO:1:1") WebElement ROLE_MORE_INFO_1_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:ROLE.NOTES:1:1") WebElement ROLE_NOTES_1_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:ROLE:1:1") WebElement ROLE_1_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:SALARY.DATE.FREQ:1") WebElement SALARY_DATE_FREQ_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:SALARY:1") WebElement SALARY_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:SECTOR") WebElement Sector;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:SHORT.NAME:1") WebElement GB_Short_Name;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:SMS.1:1") WebElement Mobile_Phone_Numbers_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how = How.LINK_TEXT, using = "Physical Address")	WebElement Physical_Address;
	  
	  @FindBy(how=How.ID, using= "fieldName:SPOKEN.LANGUAGE:1") WebElement SPOKEN_LANGUAGE_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:STREET:1") WebElement GB_Street;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:TARGET") WebElement Target;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:TAX.ID:1") WebElement TAX_ID_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:TITLE") WebElement TITLE;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:TOWN.COUNTRY:1") WebElement GB_Town_City;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:VIS.TYPE:1") WebElement VIS_TYPE_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "fieldName:VULNERABILITY:1") WebElement Vulnerability_1;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "moreactions") WebElement moreactions;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "radio:mainTab:GENDER") List<WebElement> radio_mainTab_GENDER;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "radio:tab10:REPORT.TEMPLATE") List<WebElement> radio_tab10_REPORT_TEMPLATE;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "radio:tab7:CONFID.TXT") List<WebElement> radio_tab7_CONFID_TXT;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "radio:tab7:INTERNET.BANKING.SERVICE") List<WebElement> radio_tab7_INTERNET_BANKING_SERVICE;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "radio:tab7:MOBILE.BANKING.SERVICE") List<WebElement> radio_tab7_MOBILE_BANKING_SERVICE;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "radio:tab8:AML.CHECK") List<WebElement> radio_tab8_AML_CHECK;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "radio:tab8:KYC.COMPLETE") List<WebElement> radio_tab8_KYC_COMPLETE;
	 //New Object added - 17.07.2019 - 15.38.17

	  @FindBy(how=How.ID, using= "radio:tab9:NO.UPDATE.CRM") List<WebElement> radio_tab9_NO_UPDATE_CRM;
	  
	  @FindBy(how = How.CLASS_NAME, using = "warningbox") List<WebElement> mandatoryWaring;

	  @FindBy(how = How.XPATH, using = "//td[@class='message']") WebElement TransactionID;
	  
	  @FindBy(how = How.XPATH, using = "//img[@alt= 'Validate a deal']") WebElement validate;

	  @FindBy(how = How.XPATH, using = "//img[@alt= 'Commit the deal']")	WebElement Commit;


	 public void click_Audit(String temp_Audit){ 
	 
	 webElementClick(Audit,"Audit"); 
	 } 


	 public void click_Communication_Details(){ 
	 
	 webElementClick(Communication_Details,"Communication Details"); 
	 } 


	 public void click_Financial_Details(){ 
	 
	 webElementClick(Financial_Details,"Financial Details"); 
	 } 


	 public void click_Further_Details(){ 
	 
	 webElementClick(Further_Details,"Further Details"); 
	 } 


	 public void click_ID_Doc(){ 
	 
	 webElementClick(ID_Doc,"ID Doc"); 
	 } 


	 public void click_KYC(){ 
	 
	 webElementClick(KYC,"KYC"); 
	 } 


	 public void click_Other_Details(){ 
	 
	 webElementClick(Other_Details,"Other Details"); 
	 } 


	 public void click_Relation(){ 
	 
	 webElementClick(Relation,"Relation"); 
	 } 


	 public void click_Reporting_Details(){ 
	 
	 webElementClick(Reporting_Details,"Reporting Details"); 
	 } 


	 public void click_Residential_Details(){ 
	 
	 webElementClick(Residential_Details,"Residential Details"); 
	 } 


	 public void enter_Account_Officer(String temp_Account_Officer){ 
	 
	 enterInputText(Account_Officer,temp_Account_Officer,"Account Officer"); 
	 } 


	 public void enter_GB_Address_1(String temp_GB_Address_1){ 
	 
	 enterInputText(GB_Address_1,temp_GB_Address_1,"GB Address 1"); 
	 } 


	 public void select_ALLOW_BULK_PROCESS(String temp_ALLOW_BULK_PROCESS){ 
	 
	 selectVisibileText(ALLOW_BULK_PROCESS,temp_ALLOW_BULK_PROCESS,"ALLOW BULK PROCESS"); 
	 } 


	 public void select_AML_RESULT(String temp_AML_RESULT){ 
	 
	 selectVisibileText(AML_RESULT,temp_AML_RESULT,"AML RESULT"); 
	 } 


	 public void enter_ANNUAL_BONUS_1(String temp_ANNUAL_BONUS_1){ 
	 
	 enterInputText(ANNUAL_BONUS_1,temp_ANNUAL_BONUS_1,"ANNUAL BONUS 1"); 
	 } 


	 public void enter_AUTO_NEXT_KYC_REVIEW_DATE(String temp_AUTO_NEXT_KYC_REVIEW_DATE){ 
	 
	 enterInputText(AUTO_NEXT_KYC_REVIEW_DATE,temp_AUTO_NEXT_KYC_REVIEW_DATE,"AUTO NEXT KYC REVIEW DATE"); 
	 } 


	 public void enter_AUTO_NEXT_SUIT_REVIEW_DATE(String temp_AUTO_NEXT_SUIT_REVIEW_DATE){ 
	 
	 enterInputText(AUTO_NEXT_SUIT_REVIEW_DATE,temp_AUTO_NEXT_SUIT_REVIEW_DATE,"AUTO NEXT SUIT REVIEW DATE"); 
	 } 


	 public void enter_CALC_RISK_CLASS(String temp_CALC_RISK_CLASS){ 
	 
	 enterInputText(CALC_RISK_CLASS,temp_CALC_RISK_CLASS,"CALC RISK CLASS"); 
	 } 


	 public void enter_CHANGE_DATE_1(String temp_CHANGE_DATE_1){ 
	 
	 enterInputText(CHANGE_DATE_1,temp_CHANGE_DATE_1,"CHANGE DATE 1"); 
	 } 


	 public void enter_CHANGE_REASON_1(String temp_CHANGE_REASON_1){ 
	 
	 enterInputText(CHANGE_REASON_1,temp_CHANGE_REASON_1,"CHANGE REASON 1"); 
	 } 


	 public void select_COMM_TYPE_1(String temp_COMM_TYPE_1){ 
	 
	 selectVisibileText(COMM_TYPE_1,temp_COMM_TYPE_1,"COMM TYPE 1"); 
	 } 


	 public void enter_COMPANY_BOOK(String temp_COMPANY_BOOK){ 
	 
	 enterInputText(COMPANY_BOOK,temp_COMPANY_BOOK,"COMPANY BOOK"); 
	 } 


	 public void enter_CONTACT_DATE(String temp_CONTACT_DATE){ 
	 
	 enterInputText(CONTACT_DATE,temp_CONTACT_DATE,"CONTACT DATE"); 
	 } 


	 public void enter_GB_Country(String temp_GB_Country){ 
	 
	 enterInputText(GB_Country,temp_GB_Country,"GB Country"); 
	 } 


	 public void enter_CR_CALC_RESET_DATE_1(String temp_CR_CALC_RESET_DATE_1){ 
	 
	 enterInputText(CR_CALC_RESET_DATE_1,temp_CR_CALC_RESET_DATE_1,"CR CALC RESET DATE 1"); 
	 } 


	 public void enter_CR_USER_PROFILE_TYPE_1(String temp_CR_USER_PROFILE_TYPE_1){ 
	 
	 enterInputText(CR_USER_PROFILE_TYPE_1,temp_CR_USER_PROFILE_TYPE_1,"CR USER PROFILE TYPE 1"); 
	 } 


	 public void enter_CR_USER_PROFILE_1(String temp_CR_USER_PROFILE_1){ 
	 
	 enterInputText(CR_USER_PROFILE_1,temp_CR_USER_PROFILE_1,"CR USER PROFILE 1"); 
	 } 


	 public void enter_CUSTOMER_CURRENCY_1(String temp_CUSTOMER_CURRENCY_1){ 
	 
	 enterInputText(CUSTOMER_CURRENCY_1,temp_CUSTOMER_CURRENCY_1,"CUSTOMER CURRENCY 1"); 
	 } 


	 public void enter_CUSTOMER_LIABILITY(String temp_CUSTOMER_LIABILITY){ 
	 
	 enterInputText(CUSTOMER_LIABILITY,temp_CUSTOMER_LIABILITY,"CUSTOMER LIABILITY"); 
	 } 


	 public void enter_Customer_Rating_1(String temp_Customer_Rating_1){ 
	 
	 enterInputText(Customer_Rating_1,temp_Customer_Rating_1,"Customer Rating 1"); 
	 } 


	 public void enter_CUSTOMER_SINCE(String temp_CUSTOMER_SINCE){ 
	 
	 enterInputText(CUSTOMER_SINCE,temp_CUSTOMER_SINCE,"CUSTOMER SINCE"); 
	 } 


	 public void enter_Customer_Status(String temp_Customer_Status){ 
	 
	 enterInputText(Customer_Status,temp_Customer_Status,"Customer Status"); 
	 } 


	 public void select_Customer_Type(String temp_Customer_Type){ 
	 
	 selectVisibileText(Customer_Type,temp_Customer_Type,"Customer Type"); 
	 } 


	 public void enter_Date_of_Birth(String temp_Date_of_Birth){ 
	 
	 enterInputText(Date_of_Birth,temp_Date_of_Birth,"Date of Birth"); 
	 } 


	 public void enter_Email_Address_1(String temp_Email_Address_1){ 
	 
	 enterInputText(Email_Address_1,temp_Email_Address_1,"Email Address 1"); 
	 } 


	 public void enter_EMPLOYERS_ADD_1_1(String temp_EMPLOYERS_ADD_1_1){ 
	 
	 enterInputText(EMPLOYERS_ADD_1_1,temp_EMPLOYERS_ADD_1_1,"EMPLOYERS ADD 1 1"); 
	 } 


	 public void enter_EMPLOYERS_BUSS_1(String temp_EMPLOYERS_BUSS_1){ 
	 
	 enterInputText(EMPLOYERS_BUSS_1,temp_EMPLOYERS_BUSS_1,"EMPLOYERS BUSS 1"); 
	 } 


	 public void enter_EMPLOYERS_NAME_1(String temp_EMPLOYERS_NAME_1){ 
	 
	 enterInputText(EMPLOYERS_NAME_1,temp_EMPLOYERS_NAME_1,"EMPLOYERS NAME 1"); 
	 } 


	 public void enter_EMPLOYMENT_START_1(String temp_EMPLOYMENT_START_1){ 
	 
	 enterInputText(EMPLOYMENT_START_1,temp_EMPLOYMENT_START_1,"EMPLOYMENT START 1"); 
	 } 


	 public void select_EMPLOYMENT_STATUS_1(String temp_EMPLOYMENT_STATUS_1){ 
	 
	 selectVisibileText(EMPLOYMENT_STATUS_1,temp_EMPLOYMENT_STATUS_1,"EMPLOYMENT STATUS 1"); 
	 } 


	 public void enter_FAMILY_NAME(String temp_FAMILY_NAME){ 
	 
	 enterInputText(FAMILY_NAME,temp_FAMILY_NAME,"FAMILY NAME"); 
	 } 


	 public void enter_Fax_1(String temp_Fax_1){ 
	 
	 enterInputText(Fax_1,temp_Fax_1,"Fax 1"); 
	 } 


	 public void enter_FORMER_VIS_TYPE_1(String temp_FORMER_VIS_TYPE_1){ 
	 
	 enterInputText(FORMER_VIS_TYPE_1,temp_FORMER_VIS_TYPE_1,"FORMER VIS TYPE 1"); 
	 } 


	 public void enter_GIVEN_NAMES(String temp_GIVEN_NAMES){ 
	 
	 enterInputText(GIVEN_NAMES,temp_GIVEN_NAMES,"GIVEN NAMES"); 
	 } 


	 public void enter_HOLDINGS_PIVOT_1(String temp_HOLDINGS_PIVOT_1){ 
	 
	 enterInputText(HOLDINGS_PIVOT_1,temp_HOLDINGS_PIVOT_1,"HOLDINGS PIVOT 1"); 
	 } 


	 public void enter_Industry(String temp_Industry){ 
	 
	 enterInputText(Industry,temp_Industry,"Industry"); 
	 } 


	 public void enter_INTERESTS_1(String temp_INTERESTS_1){ 
	 
	 enterInputText(INTERESTS_1,temp_INTERESTS_1,"INTERESTS 1"); 
	 } 


	 public void enter_INTRODUCER(String temp_INTRODUCER){ 
	 
	 enterInputText(INTRODUCER,temp_INTRODUCER,"INTRODUCER"); 
	 } 


	 public void select_ISSUE_CHEQUES(String temp_ISSUE_CHEQUES){ 
	 
	 selectVisibileText(ISSUE_CHEQUES,temp_ISSUE_CHEQUES,"ISSUE CHEQUES"); 
	 } 


	 public void enter_JOB_TITLE_1(String temp_JOB_TITLE_1){ 
	 
	 enterInputText(JOB_TITLE_1,temp_JOB_TITLE_1,"JOB TITLE 1"); 
	 } 


	 public void enter_KYC_RELATIONSHIP(String temp_KYC_RELATIONSHIP){ 
	 
	 enterInputText(KYC_RELATIONSHIP,temp_KYC_RELATIONSHIP,"KYC RELATIONSHIP"); 
	 } 


	 public void enter_Language(String temp_Language){ 
	 
	 enterInputText(Language,temp_Language,"Language"); 
	 } 


	 public void enter_LAST_AML_RESULT_DATE(String temp_LAST_AML_RESULT_DATE){ 
	 
	 enterInputText(LAST_AML_RESULT_DATE,temp_LAST_AML_RESULT_DATE,"LAST AML RESULT DATE"); 
	 } 


	 public void enter_LAST_KYC_REVIEW_DATE(String temp_LAST_KYC_REVIEW_DATE){ 
	 
	 enterInputText(LAST_KYC_REVIEW_DATE,temp_LAST_KYC_REVIEW_DATE,"LAST KYC REVIEW DATE"); 
	 } 


	 public void enter_LAST_SUIT_REVIEW_DATE(String temp_LAST_SUIT_REVIEW_DATE){ 
	 
	 enterInputText(LAST_SUIT_REVIEW_DATE,temp_LAST_SUIT_REVIEW_DATE,"LAST SUIT REVIEW DATE"); 
	 } 


	 public void select_LEGAL_DOC_NAME_1(String temp_LEGAL_DOC_NAME_1){ 
	 
	 selectVisibileText(LEGAL_DOC_NAME_1,temp_LEGAL_DOC_NAME_1,"LEGAL DOC NAME 1"); 
	 } 


	 public void enter_LEGAL_EXP_DATE_1(String temp_LEGAL_EXP_DATE_1){ 
	 
	 enterInputText(LEGAL_EXP_DATE_1,temp_LEGAL_EXP_DATE_1,"LEGAL EXP DATE 1"); 
	 } 


	 public void enter_LEGAL_HOLDER_NAME_1(String temp_LEGAL_HOLDER_NAME_1){ 
	 
	 enterInputText(LEGAL_HOLDER_NAME_1,temp_LEGAL_HOLDER_NAME_1,"LEGAL HOLDER NAME 1"); 
	 } 


	 public void enter_LEGAL_ID_1(String temp_LEGAL_ID_1){ 
	 
	 enterInputText(LEGAL_ID_1,temp_LEGAL_ID_1,"LEGAL ID 1"); 
	 } 


	 public void enter_LEGAL_ISS_AUTH_1(String temp_LEGAL_ISS_AUTH_1){ 
	 
	 enterInputText(LEGAL_ISS_AUTH_1,temp_LEGAL_ISS_AUTH_1,"LEGAL ISS AUTH 1"); 
	 } 


	 public void enter_LEGAL_ISS_DATE_1(String temp_LEGAL_ISS_DATE_1){ 
	 
	 enterInputText(LEGAL_ISS_DATE_1,temp_LEGAL_ISS_DATE_1,"LEGAL ISS DATE 1"); 
	 } 


	 public void enter_MANUAL_NEXT_KYC_REVIEW_DATE(String temp_MANUAL_NEXT_KYC_REVIEW_DATE){ 
	 
	 enterInputText(MANUAL_NEXT_KYC_REVIEW_DATE,temp_MANUAL_NEXT_KYC_REVIEW_DATE,"MANUAL NEXT KYC REVIEW DATE"); 
	 } 


	 public void enter_MANUAL_NEXT_SUIT_REVIEW_DATE(String temp_MANUAL_NEXT_SUIT_REVIEW_DATE){ 
	 
	 enterInputText(MANUAL_NEXT_SUIT_REVIEW_DATE,temp_MANUAL_NEXT_SUIT_REVIEW_DATE,"MANUAL NEXT SUIT REVIEW DATE"); 
	 } 


	 public void enter_MANUAL_RISK_CLASS(String temp_MANUAL_RISK_CLASS){ 
	 
	 enterInputText(MANUAL_RISK_CLASS,temp_MANUAL_RISK_CLASS,"MANUAL RISK CLASS"); 
	 } 


	 public void select_Marital_Status(String temp_Marital_Status){ 
	 
	 selectVisibileText(Marital_Status,temp_Marital_Status,"Marital Status"); 
	 } 


	 public void enter_Mnemonic(String temp_Mnemonic){ 
	 
	 enterInputText(Mnemonic,temp_Mnemonic,"Mnemonic"); 
	 } 


	 public void enter_MORTGAGE_AMT(String temp_MORTGAGE_AMT){ 
	 
	 enterInputText(MORTGAGE_AMT,temp_MORTGAGE_AMT,"MORTGAGE AMT"); 
	 } 


	 public void enter_GB_Full_Name(String temp_GB_Full_Name){ 
	 
	 enterInputText(GB_Full_Name,temp_GB_Full_Name,"GB Full Name"); 
	 } 


	 public void enter_GB_Full_Name_2(String temp_GB_Full_Name_2){ 
	 
	 enterInputText(GB_Full_Name_2,temp_GB_Full_Name_2,"GB Full Name 2"); 
	 } 


	 public void enter_Nationality(String temp_Nationality){ 
	 
	 enterInputText(Nationality,temp_Nationality,"Nationality"); 
	 } 


	 public void enter_NET_MONTHLY_IN(String temp_NET_MONTHLY_IN){ 
	 
	 enterInputText(NET_MONTHLY_IN,temp_NET_MONTHLY_IN,"NET MONTHLY IN"); 
	 } 


	 public void enter_NET_MONTHLY_OUT(String temp_NET_MONTHLY_OUT){ 
	 
	 enterInputText(NET_MONTHLY_OUT,temp_NET_MONTHLY_OUT,"NET MONTHLY OUT"); 
	 } 


	 public void enter_NO_OF_DEPENDENTS(String temp_NO_OF_DEPENDENTS){ 
	 
	 enterInputText(NO_OF_DEPENDENTS,temp_NO_OF_DEPENDENTS,"NO OF DEPENDENTS"); 
	 } 


	 public void enter_OCCUPATION_1(String temp_OCCUPATION_1){ 
	 
	 enterInputText(OCCUPATION_1,temp_OCCUPATION_1,"OCCUPATION 1"); 
	 } 


	 public void enter_Phone_Numbers_Off_1(String temp_Phone_Numbers_Off_1){ 
	 
	 enterInputText(Phone_Numbers_Off_1,temp_Phone_Numbers_Off_1,"Phone Numbers Off 1"); 
	 } 


	 public void enter_OTHER_NATIONALITY_1(String temp_OTHER_NATIONALITY_1){ 
	 
	 enterInputText(OTHER_NATIONALITY_1,temp_OTHER_NATIONALITY_1,"OTHER NATIONALITY 1"); 
	 } 


	 public void enter_Second_Officer_1(String temp_Second_Officer_1){ 
	 
	 enterInputText(Second_Officer_1,temp_Second_Officer_1,"Second Officer 1"); 
	 } 


	 public void enter_Phone_Numbers_Res_1(String temp_Phone_Numbers_Res_1){ 
	 
	 enterInputText(Phone_Numbers_Res_1,temp_Phone_Numbers_Res_1,"Phone Numbers Res 1"); 
	 } 


	 public void enter_GB_Post_Code(String temp_GB_Post_Code){ 
	 
	 enterInputText(GB_Post_Code,temp_GB_Post_Code,"GB Post Code"); 
	 } 


	 public void enter_PREF_CHANNEL_1(String temp_PREF_CHANNEL_1){ 
	 
	 enterInputText(PREF_CHANNEL_1,temp_PREF_CHANNEL_1,"PREF CHANNEL 1"); 
	 } 


	 public void enter_PREVIOUS_NAME_1(String temp_PREVIOUS_NAME_1){ 
	 
	 enterInputText(PREVIOUS_NAME_1,temp_PREVIOUS_NAME_1,"PREVIOUS NAME 1"); 
	 } 


	 public void enter_PROB_OF_DEFT_1(String temp_PROB_OF_DEFT_1){ 
	 
	 enterInputText(PROB_OF_DEFT_1,temp_PROB_OF_DEFT_1,"PROB OF DEFT 1"); 
	 } 


	 public void enter_REL_CUSTOMER_1(String temp_REL_CUSTOMER_1){ 
	 
	 enterInputText(REL_CUSTOMER_1,temp_REL_CUSTOMER_1,"REL CUSTOMER 1"); 
	 } 


	 public void select_REL_DELIV_OPT_1_1(String temp_REL_DELIV_OPT_1_1){ 
	 
	 selectVisibileText(REL_DELIV_OPT_1_1,temp_REL_DELIV_OPT_1_1,"REL DELIV OPT 1 1"); 
	 } 


	 public void enter_RELATION_CODE_1(String temp_RELATION_CODE_1){ 
	 
	 enterInputText(RELATION_CODE_1,temp_RELATION_CODE_1,"RELATION CODE 1"); 
	 } 


	 public void enter_Residence(String temp_Residence){ 
	 
	 enterInputText(Residence,temp_Residence,"Residence"); 
	 } 


	 public void enter_RESIDENCE_SINCE(String temp_RESIDENCE_SINCE){ 
	 
	 enterInputText(RESIDENCE_SINCE,temp_RESIDENCE_SINCE,"RESIDENCE SINCE"); 
	 } 


	 public void select_RESIDENCE_STATUS(String temp_RESIDENCE_STATUS){ 
	 
	 selectVisibileText(RESIDENCE_STATUS,temp_RESIDENCE_STATUS,"RESIDENCE STATUS"); 
	 } 


	 public void select_RESIDENCE_TYPE(String temp_RESIDENCE_TYPE){ 
	 
	 selectVisibileText(RESIDENCE_TYPE,temp_RESIDENCE_TYPE,"RESIDENCE TYPE"); 
	 } 


	 public void enter_RESIDENCE_VALUE(String temp_RESIDENCE_VALUE){ 
	 
	 enterInputText(RESIDENCE_VALUE,temp_RESIDENCE_VALUE,"RESIDENCE VALUE"); 
	 } 


	 public void enter_RISK_ASSET_TYPE_1(String temp_RISK_ASSET_TYPE_1){ 
	 
	 enterInputText(RISK_ASSET_TYPE_1,temp_RISK_ASSET_TYPE_1,"RISK ASSET TYPE 1"); 
	 } 


	 public void enter_RISK_FROM_DATE_1(String temp_RISK_FROM_DATE_1){ 
	 
	 enterInputText(RISK_FROM_DATE_1,temp_RISK_FROM_DATE_1,"RISK FROM DATE 1"); 
	 } 


	 public void enter_RISK_LEVEL_1(String temp_RISK_LEVEL_1){ 
	 
	 enterInputText(RISK_LEVEL_1,temp_RISK_LEVEL_1,"RISK LEVEL 1"); 
	 } 


	 public void enter_RISK_TOLERANCE_1(String temp_RISK_TOLERANCE_1){ 
	 
	 enterInputText(RISK_TOLERANCE_1,temp_RISK_TOLERANCE_1,"RISK TOLERANCE 1"); 
	 } 


	 public void enter_ROLE_MORE_INFO_1_1(String temp_ROLE_MORE_INFO_1_1){ 
	 
	 enterInputText(ROLE_MORE_INFO_1_1,temp_ROLE_MORE_INFO_1_1,"ROLE MORE INFO 1 1"); 
	 } 


	 public void enter_ROLE_NOTES_1_1(String temp_ROLE_NOTES_1_1){ 
	 
	 enterInputText(ROLE_NOTES_1_1,temp_ROLE_NOTES_1_1,"ROLE NOTES 1 1"); 
	 } 


	 public void enter_ROLE_1_1(String temp_ROLE_1_1){ 
	 
	 enterInputText(ROLE_1_1,temp_ROLE_1_1,"ROLE 1 1"); 
	 } 


	 public void enter_SALARY_DATE_FREQ_1(String temp_SALARY_DATE_FREQ_1){ 
	 
	 enterInputText(SALARY_DATE_FREQ_1,temp_SALARY_DATE_FREQ_1,"SALARY DATE FREQ 1"); 
	 } 


	 public void enter_SALARY_1(String temp_SALARY_1){ 
	 
	 enterInputText(SALARY_1,temp_SALARY_1,"SALARY 1"); 
	 } 


	 public void enter_Sector(String temp_Sector){ 
	 
	 enterInputText(Sector,temp_Sector,"Sector"); 
	 } 


	 public void enter_GB_Short_Name(String temp_GB_Short_Name){ 
	 
	 enterInputText(GB_Short_Name,temp_GB_Short_Name,"GB Short Name"); 
	 } 


	 public void enter_Mobile_Phone_Numbers_1(String temp_Mobile_Phone_Numbers_1){ 
	 
	 enterInputText(Mobile_Phone_Numbers_1,temp_Mobile_Phone_Numbers_1,"Mobile Phone Numbers 1"); 
	 } 


	 public void click_Physical_Address() {
		 
	 webElementClick(Physical_Address, "Physical Address");
	 }
	 
	 
	 public void enter_SPOKEN_LANGUAGE_1(String temp_SPOKEN_LANGUAGE_1){ 
	 
	 enterInputText(SPOKEN_LANGUAGE_1,temp_SPOKEN_LANGUAGE_1,"SPOKEN LANGUAGE 1"); 
	 } 


	 public void enter_GB_Street(String temp_GB_Street){ 
	 
	 enterInputText(GB_Street,temp_GB_Street,"GB Street"); 
	 } 


	 public void enter_Target(String temp_Target){ 
	 
	 enterInputText(Target,temp_Target,"Target"); 
	 } 
	 
	 public void wait_Target() {		 
		 webElementWait(Target, "3", "Stale Element");
	 }


	 public void enter_TAX_ID_1(String temp_TAX_ID_1){ 
	 
	 enterInputText(TAX_ID_1,temp_TAX_ID_1,"TAX ID 1"); 
	 } 


	 public void select_TITLE(String temp_TITLE){ 
	 
	 selectVisibileText(TITLE,temp_TITLE,"TITLE"); 
	 } 


	 public void enter_GB_Town_City(String temp_GB_Town_City){ 
	 
	 enterInputText(GB_Town_City,temp_GB_Town_City,"GB Town City"); 
	 } 


	 public void enter_VIS_TYPE_1(String temp_VIS_TYPE_1){ 
	 
	 enterInputText(VIS_TYPE_1,temp_VIS_TYPE_1,"VIS TYPE 1"); 
	 } 


	 public void select_Vulnerability_1(String temp_Vulnerability_1){ 
	 
	 selectVisibileText(Vulnerability_1,temp_Vulnerability_1,"Vulnerability 1"); 
	 } 


	 public void select_moreactions(String temp_moreactions){ 
	 
	 selectVisibileText(moreactions,temp_moreactions,"moreactions"); 
	 } 


	 public void select_radio_mainTab_GENDER(String temp_radio_mainTab_GENDER){ 
	 
	 selectRadioButton(radio_mainTab_GENDER, temp_radio_mainTab_GENDER,"radio mainTab GENDER"); 
	 } 


	 public void select_radio_tab10_REPORT_TEMPLATE(String temp_radio_tab10_REPORT_TEMPLATE){ 
	 
	 selectRadioButton(radio_tab10_REPORT_TEMPLATE, temp_radio_tab10_REPORT_TEMPLATE,"radio tab10 REPORT TEMPLATE"); 
	 } 


	 public void select_radio_tab7_CONFID_TXT(String temp_radio_tab7_CONFID_TXT){ 
	 
	 selectRadioButton(radio_tab7_CONFID_TXT, temp_radio_tab7_CONFID_TXT,"radio tab7 CONFID TXT"); 
	 } 


	 public void select_radio_tab7_INTERNET_BANKING_SERVICE(String temp_radio_tab7_INTERNET_BANKING_SERVICE){ 
	 
	 selectRadioButton(radio_tab7_INTERNET_BANKING_SERVICE, temp_radio_tab7_INTERNET_BANKING_SERVICE,"radio tab7 INTERNET BANKING SERVICE"); 
	 } 


	 public void select_radio_tab7_MOBILE_BANKING_SERVICE(String temp_radio_tab7_MOBILE_BANKING_SERVICE){ 
	 
	 selectRadioButton(radio_tab7_MOBILE_BANKING_SERVICE, temp_radio_tab7_MOBILE_BANKING_SERVICE,"radio tab7 MOBILE BANKING SERVICE"); 
	 } 


	 public void select_radio_tab8_AML_CHECK(String temp_radio_tab8_AML_CHECK){ 
	 
	 selectRadioButton(radio_tab8_AML_CHECK, temp_radio_tab8_AML_CHECK,"radio tab8 AML CHECK"); 
	 } 


	 public void select_radio_tab8_KYC_COMPLETE(String temp_radio_tab8_KYC_COMPLETE){ 
	 
	 selectRadioButton(radio_tab8_KYC_COMPLETE, temp_radio_tab8_KYC_COMPLETE,"radio tab8 KYC COMPLETE"); 
	 } 


	 public void select_radio_tab9_NO_UPDATE_CRM(String temp_radio_tab9_NO_UPDATE_CRM){ 
	 
	 selectRadioButton(radio_tab9_NO_UPDATE_CRM, temp_radio_tab9_NO_UPDATE_CRM,"radio tab9 NO UPDATE CRM"); 
	 } 

	 
	 public String get_BasicDetails() {
		String sTempvalue = getTextWebElement(basicDetails, "Basic Details");
		return sTempvalue;
	}
	
		public void fill_autoWaring() {
			for(WebElement ele:mandatoryWaring) {
				selectVisibileText(ele, "RECEIVED", ele.getAttribute("name"));
			}
			
		}
	
		public String get_TransactionMessage() {
			String sTempValue = getTextWebElement(TransactionID, "Transaction Message");
			return sTempValue;
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


}