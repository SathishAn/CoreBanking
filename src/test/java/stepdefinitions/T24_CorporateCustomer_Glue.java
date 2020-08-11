package stepdefinitions;

import org.openqa.selenium.By;

import cucumber.api.java.en.And;
import pages.T24_CorporateCustomerPage;
import utilities.CoreTapWrappers;

public class T24_CorporateCustomer_Glue extends CoreTapWrappers {
	T24_CorporateCustomerPage corporateCust= new T24_CorporateCustomerPage(getDriver());
	
	
	@And("^enter the Mandate details in the corporate application$")
	public void enter_mandate_details_in_the_corporate_application() {
		corporateCust.call_ObjectExtractor();
	}
	
}
