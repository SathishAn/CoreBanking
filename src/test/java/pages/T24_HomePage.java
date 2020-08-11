package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import utilities.CoreTapWrappers;

public class T24_HomePage  extends CoreTapWrappers {
	

	private WebDriver driver;

	public T24_HomePage(WebDriver driver) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(this.driver, this);
		/*if (!verifyTitle("Sat")) {
			reportStep("This is not Page", "FAIL");
		}*/
	}
	
	
	@FindBy(how=How.XPATH, using="//frame[contains(@id,'menu')]") WebElement Hompageframe;
	
	@FindBy(how=How.XPATH, using="//span[text()='User Menu']") WebElement userMenu;
	
	@FindBy(how=How.XPATH, using="//span[text()='Customer']") WebElement customerMenu;	
	
	@FindBy(how=How.XPATH, using="//span[text()='Account']") WebElement accountMenu;	
	
	@FindBy(how=How.XPATH, using="//span[text()='Private Operations']") WebElement privateOperationsMenu;
	
	@FindBy(how=How.XPATH, using="//span[text()='Securities']") WebElement securitiesMenu;
	
	@FindBy(how=How.XPATH, using="(//span[text()='Front Office'])[7]") WebElement frontOfficeMenu;
	
	@FindBy(how=How.XPATH, using="(//span[text()='Back Office'])[6]") WebElement backOfficeMenu;
	
	@FindBy(how=How.XPATH, using="//span[text()='Securities Authorisation']") WebElement securitiesAuthorisationMenu;
	
	@FindBy(how=How.XPATH, using="//span[text()='Direct Ordering']") WebElement directOrderingMenu;
	
	@FindBy(how=How.XPATH, using="//span[text()='Single Orders']") WebElement singleOrdersMenu;
	
	@FindBy(how=How.XPATH, using="//span[text()='Order Entry']") WebElement orderEntryMenu;
	
	@FindBy(how=How.XPATH, using="//span[text()='Client Maintenance']") WebElement clientMaintenanceMenu;
	
	@FindBy(how=How.XPATH, using="//span[text()='Private Customer']") WebElement privateCustomerMenu;	
	
@FindBy(how=How.XPATH, using="//span[text()='Retail Operations']") WebElement retailOperationsMenu;
	
	@FindBy(how=How.XPATH, using="//span[text()='Account Transactions']") WebElement accountTransactionMenu;
	
	@FindBy(how=How.XPATH, using="//span[text()='Teller']") WebElement tellerMenu;
	
	@FindBy(how=How.XPATH, using="//span[text()='Teller Operations']") WebElement tellerOperationsMenu;
	
	@FindBy(how=How.XPATH, using="//span[text()='Teller Cash']") WebElement tellerCashMenu;	
	
	@FindBy(how=How.XPATH, using="//span[text()='Loan Transactions']") WebElement loanTransactionsMenu;
	
	@FindBy(how=How.XPATH, using="(//span[text()='Arrangement Activities (FT)'])[2]") WebElement arrangementActivitiesFTMenu;
	
	
	@FindBy(how=How.LINK_TEXT, using="Cash deposit Local") WebElement cashDepositLocal;
	
	@FindBy(how=How.LINK_TEXT, using="Open Savings Account") WebElement openSavingAccount;
	
	@FindBy(how=How.LINK_TEXT, using="Individual Customer") WebElement individualCustomerMenu;
	
	@FindBy(how=How.LINK_TEXT, using="Corporate Customer") WebElement corporateCustomerMenu;
	
	@FindBy(how=How.LINK_TEXT, using="Authorise/Delete Customer") WebElement AuthoriseCustomerMenu;
	
	@FindBy(how=How.LINK_TEXT, using="Authorise/Delete Account") WebElement AuthoriseAccountMenu;
	
	@FindBy(how=How.LINK_TEXT, using="Private Customer") WebElement privateCustomerLinkMenu;
	
	@FindBy(how=How.LINK_TEXT, using="Buy Order") WebElement buyOrderMenu;
	
	@FindBy(how=How.LINK_TEXT, using="Unauthorised Security Transactions") WebElement unauthoriseSecurityTransaction;
	
	@FindBy(how=How.XPATH, using="//span[text()='Middle Office']") WebElement middleOfficeMenu;
	
	@FindBy(how=How.XPATH, using="//span[text()='Client Order Execution']") WebElement clientOrderExecutionMenu;
	
	@FindBy(how=How.XPATH, using="//span[text()='Order execution']") WebElement orderExecutionMenu;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"pane_\"]/ul[1]/li/ul/li[13]/ul/li[1]/ul/li[2]/ul/li[2]/ul/li[1]/ul/li[3]/a") WebElement dealerBlotterMenu;
	
	@FindBy(how=How.LINK_TEXT, using="AA Disbursement") WebElement AADisbursement;
	
	@FindBy(how=How.LINK_TEXT, using="Authorise/Delete Arrangements (FT)") WebElement Authorise_DeleteFT;
	
	@FindBy(how=How.LINK_TEXT, using="Find Loan") WebElement findLoanMenu;
	
	@FindBy(how=How.XPATH, using="(//a[contains(text(),'Product Catalog')])[2]") WebElement productCatalog;
	 
	public void switchFrame() {
		driver.switchTo().frame(Hompageframe);
		
	}
	
	public void click_UserMenu() {
		webElementClick(userMenu, "User Menu");
	}
	
	public void click_CustomerMenu() {
		webElementClick(customerMenu, "Customer Menu");
	}
	
	public void click_AccountMenu() {
		webElementClick(accountMenu, "Account Menu");
	}
	
	
	public void click_privateOperationsMenu() {
		webElementClick(privateOperationsMenu, "Private Operations Menu");
	}
	
	public void click_securitiesMenu() {
		webElementClick(securitiesMenu, "Securities Menu");
	}
	
	public void click_frontOfficeMenu() {
		webElementClick(frontOfficeMenu, "Front Office Menu");
	}
	
	public void click_backOfficeMenu() {
		webElementClick(backOfficeMenu, "Back Office Menu");
	}
	
	public void click_securitiesAuthorisationMenu() {
		webElementClick(securitiesAuthorisationMenu, "Securities Authorisation Menu");
	}
	
	public void Wait_frontOfficeMenu() {
		webElementWait(frontOfficeMenu, "10", "clickable");
	}
	
	public void click_directOrderingMenu() {
		webElementClick(directOrderingMenu, "Direct Ordering Menu");
	}
	
	public void click_singleOrdersMenu() {
		webElementClick(singleOrdersMenu, "Single Orders Menu");
	}
	
	public void click_orderEntryMenu() {
		webElementClick(orderEntryMenu, "Order Entry Menu");
	}
	
	public void click_clientMaintenanceMenu() {
		webElementClick(clientMaintenanceMenu, "Client Maintenance Menu");
	}
	
	public void click_privateCustomerMenu() {
		webElementClick(privateCustomerMenu, "Private Customer Menu");
	}
	
	public void click_retailOperations() {
		webElementClick(retailOperationsMenu, "Open Retail Operations Menu");
		
	
	}
	
	public void click_accountTransactions() {
		webElementClick(accountTransactionMenu, "Open account Transaction Menu");
	
	}
	
	public void click_teller() {
		webElementClick(tellerMenu, "Open Teller Menu");
		
	
	}
	
	public void click_tellerOperations() {
		webElementClick(tellerOperationsMenu, "Open Teller Operations Menu");
		
	
	} 
	
		
	public void click_tellerCash() {
		webElementClick(tellerCashMenu, "Open Teller Cash Menu");
		
	} 
	
	public void click_middleOfficeMenu() {
		webElementClick(middleOfficeMenu, "Middle Office Menu");
	}
	
	public void click_clientOrderExecutionMenu() {
		webElementClick(clientOrderExecutionMenu, "Client Order Execution Menu");
	}
	
	public void click_0rderExecutionMenu() {
		webElementClick(orderExecutionMenu, "Client Order Execution Menu");
	}
	
	
	
	
	public void click_loanTransactionsMenu() {
		webElementClick(loanTransactionsMenu, "Loan Transactions Menu");
	}
	
	
	public void click_arrangementActivitiesFTMenu() {
		webElementClick(arrangementActivitiesFTMenu, "Arrangement Activities FT Menu");
	}
	
	public void click_dealerBlotterMenu() {
		webElementClick(dealerBlotterMenu, "Dealer Blotter Menu");
		driver.switchTo().defaultContent();
		switchToLastWindow();
	}
	
	public void click_cashDepositLocal() {
		webElementClick(cashDepositLocal, "Cash Deposit Local");
		driver.switchTo().defaultContent();
		switchToLastWindow();
	
	}	
	
	
	public void click_IndividualCustomerMenu() {
		webElementClick(individualCustomerMenu, "Individual Customer Menu");
		driver.switchTo().defaultContent();
		switchToLastWindow();
	}
	
	public void click_AuthoriseCustomerMenu() {
		webElementClick(AuthoriseCustomerMenu, "Authorise Customer Menu");
		driver.switchTo().defaultContent();
		switchToLastWindow();
	}
	
	public void click_AuthoriseAccountMenu() {
		webElementClick(AuthoriseAccountMenu, "Authorise Account Menu");
		driver.switchTo().defaultContent();
		switchToLastWindow();
	}
	
	public void click_corporateCustomerMenu() {
		webElementClick(corporateCustomerMenu, "Corporate Customer Menu");
		driver.switchTo().defaultContent();
		switchToLastWindow();
	}
	public void click_openSavingAccount() {
		webElementClick(openSavingAccount, "Open Saving Account Menu");
		driver.switchTo().defaultContent();
		switchToLastWindow();
	
	}
	
	public void click_privateCustomerLinkMenu() {
		webElementClick(privateCustomerLinkMenu, "Private Customer Link Menu");
		driver.switchTo().defaultContent();
		switchToLastWindow();
	}
	
	public void click_buyOrderMenu() {
		webElementClick(buyOrderMenu, "Buy Order Menu");
		driver.switchTo().defaultContent();
		switchToLastWindow();
	}
	
	public void click_unauthoriseSecurityTransaction() {
		webElementClick(unauthoriseSecurityTransaction, "Unauthorise Security Transaction Menu");
		driver.switchTo().defaultContent();
		switchToLastWindow();
	}
	
	public void click_AADisbursement() {
		webElementClick(AADisbursement, "AA Disbursement");
		driver.switchTo().defaultContent();
		switchToLastWindow();
	}
	
	public void click_Authorise_DeleteFT() {
		webElementClick(Authorise_DeleteFT, "Authorise Delete FT");
		driver.switchTo().defaultContent();
		switchToLastWindow();
	}
	
	public void click_findLoanMenu() {
		webElementClick(findLoanMenu, "Find Loan");
		driver.switchTo().defaultContent();
		switchToLastWindow();
	}
	
	public void click_productCatalog() {
		webElementClick(productCatalog, "Product catalog Menu");
		driver.switchTo().defaultContent();
		switchToLastWindow();
	}
	
}
