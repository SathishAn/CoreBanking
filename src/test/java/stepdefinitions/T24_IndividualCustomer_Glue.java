package stepdefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import TechMQA.ExcelWriter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.T24_IndividualCustomerPage;
import utilities.CoreTapWrappers;
import utilities.DataProvider;

public class T24_IndividualCustomer_Glue extends CoreTapWrappers {
	DataProvider dataprovider = new DataProvider();
	T24_IndividualCustomerPage IndividualCust = new T24_IndividualCustomerPage(getDriver());
	
	
	@And("^enter the Mandate details in the application$")
	public void enter_Basic_Details() throws InterruptedException, AWTException {
			
		IndividualCust.select_TITLE(excelHashMapValues.get("Title"));
		IndividualCust.enter_GIVEN_NAMES(excelHashMapValues.get("GivenName"));
		IndividualCust.enter_FAMILY_NAME(excelHashMapValues.get("FamilyName"));		
		String Mnemonic = excelHashMapValues.get("GivenName").substring(0,1) + excelHashMapValues.get("FamilyName").substring(0,1) ;
		System.out.println(Mnemonic);
		excelHashMapValues.put("CustomerID", IndividualCust.get_BasicDetails());
		
		//Excel Updation
		try {
			dataprovider.insertExcelData(excelHashMapValues.get("scenarioName"), "CustomerID" , excelHashMapValues.get("sheetName"),  excelHashMapValues.get("CustomerID"));
			dataprovider.insertpreRequesitExcelData(excelHashMapValues.get("scenarioName"), "CustomerID" , "Account_Creation",  excelHashMapValues.get("CustomerID"));
			dataprovider.insertpreRequesitExcelData(excelHashMapValues.get("scenarioName"), "CustomerID" , "Private_Customer",  excelHashMapValues.get("CustomerID"));
			dataprovider.insertpreRequesitExcelData(excelHashMapValues.get("scenarioName"), "CustomerID" , "Buy_Order",  excelHashMapValues.get("CustomerID"));
			dataprovider.insertpreRequesitExcelData(excelHashMapValues.get("scenarioName"), "CustomerID" , "Customer_Portfolio",  excelHashMapValues.get("CustomerID"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		excelHashMapValues.put("Mnemonic", Mnemonic + IndividualCust.get_BasicDetails());
		IndividualCust.enter_Mnemonic(excelHashMapValues.get("Mnemonic"));
		IndividualCust.enter_GB_Full_Name(excelHashMapValues.get("GBFullName"));
		IndividualCust.enter_GB_Short_Name(excelHashMapValues.get("GBShortName"));
		IndividualCust.select_radio_mainTab_GENDER(excelHashMapValues.get("Gender"));
		IndividualCust.select_Marital_Status(excelHashMapValues.get("MaritalStatus"));
		IndividualCust.enter_Account_Officer(excelHashMapValues.get("AccountOfficer"));
		IndividualCust.enter_Sector(excelHashMapValues.get("Sector"));		
		IndividualCust.wait_Target();
		/*Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);		
		Thread.sleep(3000);*/
		IndividualCust.enter_Target(excelHashMapValues.get("Target"));
		IndividualCust.enter_Industry(excelHashMapValues.get("Industry"));
		IndividualCust.enter_Customer_Status(excelHashMapValues.get("CustomerStatus"));
		IndividualCust.enter_Nationality(excelHashMapValues.get("Nationality"));
		IndividualCust.enter_Residence(excelHashMapValues.get("Residence"));
		IndividualCust.select_Customer_Type(excelHashMapValues.get("CustomerType"));
		IndividualCust.enter_Customer_Rating_1(excelHashMapValues.get("CustomerRating"));
		IndividualCust.enter_Date_of_Birth(excelHashMapValues.get("DateOfBirth"));
		IndividualCust.enter_Language(excelHashMapValues.get("Language"));		
		captureScreenshot("Customer Basic Details");
	}
	
	@And("^Provide values for the required fields in Physical Address Section$")
	public void enter_physical_address() {
		IndividualCust.click_Physical_Address();
		IndividualCust.enter_GB_Street(excelHashMapValues.get("GBStreet"));
		IndividualCust.enter_GB_Address_1(excelHashMapValues.get("GBAddress"));
		IndividualCust.enter_GB_Town_City(excelHashMapValues.get("GBTown_City"));
		IndividualCust.enter_GB_Post_Code(excelHashMapValues.get("GBPostCode"));
		IndividualCust.enter_GB_Country(excelHashMapValues.get("GBCountry"));
		IndividualCust.enter_Phone_Numbers_Res_1(excelHashMapValues.get("PhoneNumbersRes"));
		IndividualCust.enter_Mobile_Phone_Numbers_1(excelHashMapValues.get("MobilePhoneNumbers"));
		IndividualCust.enter_Email_Address_1(excelHashMapValues.get("EmailAddress"));
		captureScreenshot("Customer Physical Address");
		
	}
	@And("^Provide values for the required fields in ID Doc Section$")
	public void enter_ID_Doc() {
		IndividualCust.click_ID_Doc();
		IndividualCust.enter_LEGAL_ID_1(excelHashMapValues.get("LegalID"));
		IndividualCust.select_LEGAL_DOC_NAME_1(excelHashMapValues.get("DocumentName"));
		IndividualCust.enter_LEGAL_HOLDER_NAME_1(excelHashMapValues.get("NameOnID"));
		IndividualCust.enter_LEGAL_ISS_AUTH_1(excelHashMapValues.get("IssueAuthority"));
		IndividualCust.enter_LEGAL_ISS_DATE_1(excelHashMapValues.get("IssueDate"));
		IndividualCust.enter_LEGAL_EXP_DATE_1(excelHashMapValues.get("ExpirationDate"));
		captureScreenshot("ID Doc");
		
	}
	@And("^Provide values for the required fields in Relation Section$")
	public void enter_Relation() {
		IndividualCust.click_Relation();		
		captureScreenshot("Relation");
	}
	@And("^Provide values for the required fields in Further Details Section$")
	public void enter_FurtherDetails() {
		IndividualCust.click_Further_Details();		
		captureScreenshot("Further Details");
	}
	@And("^Provide values for the required fields in Financial Details Section$")
	public void enter_Financial_Details() {
		IndividualCust.click_Financial_Details();
		IndividualCust.select_EMPLOYMENT_STATUS_1(excelHashMapValues.get("EmploymentStatus"));
		IndividualCust.enter_OCCUPATION_1(excelHashMapValues.get("Occupation"));
		IndividualCust.enter_JOB_TITLE_1(excelHashMapValues.get("JobTitle"));
		IndividualCust.enter_EMPLOYERS_NAME_1(excelHashMapValues.get("EmployersName"));
		captureScreenshot("Financial Details");
		
	}
	@And("^Provide values for the required fields in Residential Details Section$")
	public void enter_Residance_Details() {
		IndividualCust.click_Residential_Details();
		IndividualCust.select_RESIDENCE_STATUS(excelHashMapValues.get("ResidenceStatus"));
		IndividualCust.select_RESIDENCE_TYPE(excelHashMapValues.get("ResidenceType"));
		IndividualCust.enter_RESIDENCE_SINCE(excelHashMapValues.get("ResidenceSince"));
		captureScreenshot("Residential Details");
		
	}
	@And("^Provide values for the required fields in Communication Details Section$")
	public void enter_Communication_Details() {
		IndividualCust.click_Communication_Details();
		IndividualCust.select_COMM_TYPE_1(excelHashMapValues.get("CommType"));
		IndividualCust.enter_PREF_CHANNEL_1(excelHashMapValues.get("PrefChannel"));
		IndividualCust.select_radio_tab7_CONFID_TXT(excelHashMapValues.get("Confidential"));
		
		captureScreenshot("Communication Details");
	}
	
	@And("^Provide values for the required fields in KYC Section$")
	public void enter_KYC() {
		IndividualCust.click_KYC();
		IndividualCust.enter_CONTACT_DATE(excelHashMapValues.get("ContactDate"));
		IndividualCust.enter_KYC_RELATIONSHIP(excelHashMapValues.get("KycRelationship"));
		IndividualCust.select_AML_RESULT(excelHashMapValues.get("AMLCheck"));
		IndividualCust.select_AML_RESULT(excelHashMapValues.get("AMLResult"));
		
		captureScreenshot("KYC");
		
	}
	@And("^Provide values for the required fields in Other Details Section$")
	public void enter_Other_Details() {
		IndividualCust.click_Other_Details();
		
		captureScreenshot("Other Details");
	}
	
	@And("^Provide values for the required fields in Reporting Details Section$")
	public void enter_Reporting_Details() {
		IndividualCust.click_Reporting_Details();
		IndividualCust.select_radio_tab10_REPORT_TEMPLATE(excelHashMapValues.get("ReportTemplate"));
		captureScreenshot("Reporting Details");
	}
	
	@Then("^click validate and commit button$")
	public void click_on_the_validate_button() {
		IndividualCust.click_validate();
		captureScreenshot("After Validation");
		IndividualCust.click_Commit();		
		IndividualCust.fill_autoWaring();
		captureScreenshot("After Commit");
		if(!IndividualCust.check_click_AcceptOverrides()) {
			IndividualCust.click_Commit();
		}		
		IndividualCust.get_TransactionMessage();
		captureScreenshot("Transaction Complete");
		closeAllBrowsers();
	}
	
	
}
