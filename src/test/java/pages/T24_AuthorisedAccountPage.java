package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import utilities.CoreTapWrappers;

public class T24_AuthorisedAccountPage extends CoreTapWrappers {
	
	private WebDriver driver;
	
	public T24_AuthorisedAccountPage(WebDriver driver) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(this.driver, this);
		if (!verifyTitle("Authorise/Delete Account - R18TJPLAY")) {
			reportStep("This is not a UnAuthorised customer Page", "FAIL");
		}
		wait(2000);
		driver.manage().window().maximize();
	}
	
	@FindBy (how=How.XPATH, using="//img[@alt='Selection Screen']/..") WebElement searchIcon;
	
	@FindBy(how=How.ID, using="value:1:1:1") WebElement searchwithID;
	
	@FindBy (how=How.XPATH, using="//a[@alt='Run Selection']/..") WebElement Find;
	
	@FindBy(how=How.XPATH, using="//table[@class='enquirydata enquirydata_CUSTOMERNAU']/tbody/tr") List<WebElement> searchDataTable;
	
	@FindBy(how=How.XPATH, using="//a[@title='Authorise']") WebElement Authorise;
	
	@FindBy(how=How.XPATH, using="//a[@title='Authorises a deal']") WebElement Authorise_Deal;
	
	@FindBy(how=How.XPATH, using ="//input[@class='idbox idbox_ACCOUNT idbox_ACCOUNT_AUTH']") WebElement trasactionId;
	
	@FindBy(how=How.XPATH, using="//td[@class='message']") WebElement TransactionIDMessage;
	
	@FindBy(how=How.XPATH, using="//a[@title='View a contract']") WebElement view_Contract;
	
	@FindBy(how=How.XPATH, using= "//span[text()='Audit']") WebElement Audit;
	
	public void click_searchIcon() {
		webElementClick(searchIcon, "Search");
	}
	
	public void enter_SearchWithID(String tempValue) {
		
		enterInputText(searchwithID, tempValue, "Search With ID");
	}
	
	public void click_find() {
		webElementClick(Find, "Find");
	}
	
	public void click_Authorise() {
		webElementClick(Authorise, "Authorise");
	}
	
	
	public void  click_Authorise_Deal() {
		webElementClick(Authorise_Deal, "Authorise a deal");
	}
	
	public void find_Authorise(String transID) {		
		
		for(int i=0; i < searchDataTable.size(); i++) {			
			List<WebElement> customerNo = searchDataTable.get(i).findElements(By.tagName("td"));
			if(customerNo.get(0).getText().equals(transID)) {
				break;
			}
			
		}
		
	}
	
	
	public void enter_TranasactionId(String stempValue) {
		enterInputText(trasactionId, stempValue, "Trasaction Id");
		String Temp=null;
	}
	
	
	public String get_TransactionMessage() {
		
		String sTempValue = getTextWebElement(TransactionIDMessage, "Transaction Message");
		
		return sTempValue;
		
	}
	
	public void click_view_Contract() {
		webElementClick(view_Contract, "View Contract");
	}
	
	public void click_Audit() {
		webElementClick(Audit, "Audit");
	}
	
	

}
