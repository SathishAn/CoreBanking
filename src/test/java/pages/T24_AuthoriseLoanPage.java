package pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import utilities.CoreTapWrappers;

public class T24_AuthoriseLoanPage extends CoreTapWrappers {
	private WebDriver driver;



	public T24_AuthoriseLoanPage(WebDriver driver) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(this.driver, this);
		if (!verifyTitle("AA Arrangement - R18TJPLAY")) {
			reportStep("This is not a AA Arrangement Page", "FAIL");
		}
		wait(2000);
		driver.manage().window().maximize();
	}
	
	 @FindBy(how=How.LINK_TEXT, using= "Audit") WebElement Audit;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Unauthorised']") WebElement clickUnauthorisedSection;
	
	@FindBy(how=How.XPATH, using= "//label[text() ='Arrangement']/../../following-sibling::td[2]/input") WebElement loanSearch;
	
	@FindBy(how = How.XPATH, using = "//a[@alt= 'Run Selection']") WebElement clickOnFind;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Overview']") WebElement clickOnOverview;
		
	@FindBy(how = How.XPATH, using = "//a[@title='Select Drilldown']") WebElement clickOnApprove;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Authorises a deal']") WebElement authoriseADeal;
	
	@FindBy(how=How.XPATH, using= "//td[@class='message']") WebElement LoanTransRefNo;
	
	@FindBy(how=How.XPATH, using= "//td/input[@id='transactionId']") WebElement LoanTransRefNoSearch;
	
	@FindBy(how = How.XPATH, using = "//td/a[@title='View a contract']") WebElement clickOnSearch;
	
	

	public void click_unauthorised_section() {

		driver.manage().window().maximize();

		webElementClick(clickUnauthorisedSection, "Unauthorised Section");

	}

	public void loan_Search(String temp_Loan_Search) {
		loanSearch.clear();

		enterInputText(loanSearch, temp_Loan_Search, "LoanID");
	}

	public void Find_Loan() {

		webElementClick(clickOnFind, "Loan Details");

	}

	public void click_On_Overview() {

		webElementClick(clickOnOverview, "Click on Overview");

	}

	public void click_On_Approve() {

		switchToLastWindow();

		driver.manage().window().maximize();

		webElementClick(clickOnApprove, "Approve the Loan");

	}

	public void authorise_A_Deal() {

		switchToLastWindow();

		driver.manage().window().maximize();

		webElementClick(authoriseADeal, "Authorise a Deal");

	}

	public String validate_loanAuthorisation() {
		String s1 = getTextWebElement(LoanTransRefNo, "Loan Transaction Number");
		String[] trans = s1.split(" ");
		String Trans_Number = trans[2];
		System.out.println(Trans_Number);
		return Trans_Number;
	}

	public void enter_loan_TransactionRefNo(String temp_LoanTransRefNoSearch) {

		enterInputText(LoanTransRefNoSearch, temp_LoanTransRefNoSearch, "LoanTransRefNoSearch");
	}

	public void click_On_Search() {

		webElementClick(clickOnSearch, "Search for Loan Reference No");

	}

	public void click_Audit() {

		webElementClick(Audit, "Audit");
	}

	
}
