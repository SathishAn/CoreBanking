package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import utilities.CoreTapWrappers;

public class T24_SecuritiesTransactionPage extends CoreTapWrappers {
	
	private WebDriver driver;



	public T24_SecuritiesTransactionPage(WebDriver driver) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(this.driver, this);
		wait(2000);
		driver.manage().window().maximize();
	}
	
	@FindBy(how=How.LINK_TEXT, using= "Audit") WebElement Audit;	
	
	@FindBy(how=How.ID, using= "value:1:1:1") WebElement portfolio;
	
	@FindBy(how=How.ID, using= "moreactions") WebElement moreactions;
	
	@FindBy(how=How.XPATH, using= "(//a[@title='View Entry'])[1]") WebElement viewEntry;
	
	@FindBy(how=How.XPATH, using= "//a[@title='Go']") WebElement go;
	
	@FindBy(how=How.XPATH, using= "//frame[contains(@id, 'Tabs')]") WebElement frameTabs;
	
	@FindBy(how=How.XPATH, using= "//frame[contains(@id, 'BLANK')]") WebElement frameBlank;
	
	@FindBy(how=How.XPATH, using= "//frame[contains(@id,'workarea')]") WebElement frameWorkarea;
	
	@FindBy(how=How.LINK_TEXT, using= "Find") WebElement find;
	
	@FindBy(how=How.XPATH, using= "//span[contains(@class,'iddisplay_SECTRADE_COMPLETE')]") WebElement AuthorisationRefNo;
	
	@FindBy(how=How.XPATH, using= "//input[contains(@class,'idbox_SECTRADE_COMPLETE')]") WebElement inputAuthRefNo;
	
	@FindBy(how=How.XPATH, using= "(//a[@title='Select Drilldown'])[1]") WebElement selectDrilldown;	
	
	@FindBy(how=How.XPATH, using= "//table[@id='messages']/tbody/tr[1]/td[2]") WebElement message;
	
	@FindBy(how=How.XPATH, using= "//a[@title='Commit the deal']") WebElement commitTheDeal;
	  
	@FindBy (how=How.XPATH, using="//img[@alt='Selection Screen']/..") WebElement searchIcon;
	  
	@FindBy(how=How.XPATH, using="//a[@title='View a contract']") WebElement view_Contract;
	
	 @FindBy(how=How.LINK_TEXT, using= "Accept Overrides") List<WebElement> AcceptOverrides;
	
	
	
	public void switch_ToFrames(String frameName) {
		switch (frameName.toLowerCase()) {
		case "tabs":
			driver.switchTo().frame(frameTabs);
			break;

		case "blank":

			driver.switchTo().frame(frameBlank);
			break;
		case "workarea":

			driver.switchTo().frame(frameWorkarea);
			break;

		case "default":
			driver.switchTo().defaultContent();
			break;
		default:
			break;
		}

	}
	
	public void select_MoreAction(String stempValue) {
		selectVisibileText(moreactions, stempValue, "More Action");
	}

	public String get_AuthorisationRefNo() {
		return getTextWebElement(AuthorisationRefNo, "AuthorisationRefNo");
	}

	public void enter_portfolio(String tempPortfolio) {
		enterInputText(portfolio, tempPortfolio, "Portfolio");
	}

	public void click_find() {
		webElementClick(find, "Find");
	}

	public void click_selectDrilldown() {
		webElementClick(selectDrilldown, "Select Drill down");
	}

	public void verify_Message(String tempMessage) {
		verifyTextContains(message, tempMessage);
	}

	public void click_commitTheDeal() {
		webElementClick(commitTheDeal, "Commit The Deal");
	}

	public void click_searchIcon() {
		webElementClick(searchIcon, "Search");
	}

	public void click_view_Contract() {
		webElementClick(view_Contract, "View Contract");
	}

	public void enter_inputAuthRefNo(String tempAuthNo) {
		enterInputText(inputAuthRefNo, tempAuthNo, "Authorisation Reference Number");
	}
	
	public void click_Audit() {
		webElementClick(Audit, "Audit");
	}
	
	public void click_Go() {
		webElementClick(go, "Go");
	}
	
	public void click_viewEntry() {
		webElementClick(viewEntry, "View Entry");
	}
	
	public boolean check_click_AcceptOverrides() {
		boolean bFlag = false;
		if (AcceptOverrides.size() > 0) {
			webElementClick(AcceptOverrides.get(0), "Accept Overrides");
			bFlag= true;
		}
		return bFlag;
	}
	
}
