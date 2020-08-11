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

public class T24_ExecuteOrderPage extends CoreTapWrappers {
	private WebDriver driver;


	public T24_ExecuteOrderPage(WebDriver driver) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(this.driver, this);
		if (!verifyTitle("Dealer Blotter")) {
			reportStep("This is not a Dealer Blotter Page", "FAIL");
		}
		wait(2000);
		driver.manage().window().maximize();
	}
	@FindBy(how = How.XPATH, using = "//img[@alt= 'Selection Screen']") WebElement dealerBlotterSearch;
	
	@FindBy(how=How.ID, using= "value:4:1:1") WebElement portfolioSearch;
	
	@FindBy(how = How.XPATH, using = "//a[@alt= 'Run Selection']") WebElement clickOnFind;
	
	@FindBy(how = How.XPATH, using = "(//a[@title='Select Drilldown'])[1]") WebElement executePortfolio;
	
	@FindBy(how=How.ID, using= "fieldName:TRADE.DATE") WebElement tradeDate;
	
	@FindBy(how=How.ID, using= "fieldName:VALUE.DATE") WebElement valueDate;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Broker']") WebElement clickOnBrokerSection;
	
	@FindBy(how=How.ID, using= "fieldName:BROKER.NO:1") WebElement brokerNo1;
	
	@FindBy(how=How.ID, using= "fieldName:BROKER.TYPE:1") WebElement Broker_Type_1;
	
	@FindBy(how=How.ID, using= "fieldName:NOMINAL.RECD:1") WebElement nominalRecd1;
	
	@FindBy(how=How.ID, using= "fieldName:PRICE:1") WebElement price_1;
	
	@FindBy(how=How.ID, using= "fieldName:DELIVERY.INSTR:1") WebElement delivery_instr_1;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Commit the deal']") WebElement clickValidate;
	
	@FindBy(how = How.XPATH, using = "//span[contains(@class,'iddisplay_SCEXESECORDERS_EXECUTE')]") WebElement executionRefNo;
	 
	@FindBy(how = How.XPATH, using = "//input[contains(@class,'idbox_SCEXESECORDERS_EXECUTE')]") WebElement inputexecutionRefNo;
	
	@FindBy(how = How.XPATH, using = "//a[@title='View a contract']") WebElement viewContract;
	
	@FindBy(how = How.LINK_TEXT, using = "Audit") WebElement Audit;
	
	
	public void click_dealerBlotterSearch() {

		driver.manage().window().maximize();

		webElementClick(dealerBlotterSearch, "Validate");

	}

	public void click_viewContract() {
		webElementClick(viewContract, "View Contract");
	}

	public void click_Audit() {
		webElementClick(Audit, "Audit");
	}

	public void enter_inputexecutionRefNo(String tempValue) {
		enterInputText(inputexecutionRefNo, tempValue, "Execution Ref No");
	}

	public String get_executionRefNo() {
		return getTextWebElement(executionRefNo, "Execution Ref No");
	}

	public void portfolio_Search(String temp_Portfolio_Search) {

		enterInputText(portfolioSearch, temp_Portfolio_Search, "PortfolioSearch");
	}

	public void portfolio_Find() {

		webElementClick(clickOnFind, "Portfolio Details");

	}

	public void execute_Portfolio() {

		webElementClick(executePortfolio, "Execute Portfolio Details");

		driver.manage().window().maximize();

	}

	public void click_On_BrokerSection() {

		webElementClick(clickOnBrokerSection, "click On BrokerSection");

	}

	public void broker_No_1(String temp_broker_No_1) {

		enterInputText(brokerNo1, temp_broker_No_1, "BrokerNo1");
	}

	public void select_Broker_Type_1(String temp_Broker_Type_1) {

		selectVisibileText(Broker_Type_1, temp_Broker_Type_1, "BrokerType1");
	}

	public void nominal_Recd_1(String temp_nominal_Recd_1) {

		enterInputText(nominalRecd1, temp_nominal_Recd_1, "NominalRecd1");
	}

	public void price_1(String temp_price_1) {

		enterInputText(price_1, temp_price_1, "Price1");
	}

	public void delivery_instr_1(String temp_delivery_instr_1) {

		enterInputText(delivery_instr_1, temp_delivery_instr_1, "DeliveryInstr1");
	}

	public void click_Validate() {

		webElementClick(clickValidate, "click On Validate");

	}
 
	public void enter_tradeDate(String tempTradeDate) {
		enterInputText(tradeDate, tempTradeDate, "Trade Date");
	}
	
	public void enter_ValueDate(String tempValueDate) {
		enterInputText(valueDate, tempValueDate, "Value Date");
	}
}
