@Regression_1
Feature: End-To-End Scenario of customer creation, Account creation, Private customer creation, Buy & Execute the order.
@CustomerCreation
Scenario Outline: Individual Customer creation |~ <TestName> |@ <SheetName>  	
  
#@CustomerCreation 

    Given Launch the "T24" appliaction
    When I sign in with "adminUser" user 
    And navigate to "Individual Customer" under the user menu
    And enter the Mandate details in the application
    And Provide values for the required fields in Physical Address Section
		And Provide values for the required fields in ID Doc Section
		And Provide values for the required fields in Relation Section
		And Provide values for the required fields in Further Details Section
		And Provide values for the required fields in Financial Details Section
		And Provide values for the required fields in Residential Details Section
		And Provide values for the required fields in Communication Details Section
		And Provide values for the required fields in KYC Section
		And Provide values for the required fields in Other Details Section
		And Provide values for the required fields in Reporting Details Section
		Then click validate and commit button
		
#@Authorization		

		Given Launch the "T24" appliaction
    When I sign in with "authoriseUser" user
    And navigate to "Authorise Customer" under the user menu
    And Authorise the customer
    Then view the contract of customer creation
    
 Examples:
 	|TestName|SheetName|
 	|"TC01_T24_Create Individual Customer"|"Individual_Customer"|
 	

########################################################### Account Creation ####################################
@All
Scenario Outline: Customer Account creation |~ <TestName> |@ <SheetName>  	
  
#@AccountCreation 

    Given Launch the "T24" appliaction
    When I sign in with "adminUser" user 
    And navigate to "Open Saving Account" under the user menu
    And enter the mandate fields in Saving Account
    And click on the validate button    
    
#@Authorization

		Given Launch the "T24" appliaction
    When I sign in with "authoriseUser" user
    And navigate to "Authorise Account" under the user menu
    And Authorise the Account 
    
  Examples:
 	|TestName|SheetName|
 	|"TC01_T24_AccountCreation"|"Account_Creation"|
 	
###########################################################Cash Deposit Creation ####################################
@All
Scenario Outline: Cash Deposit |~ <TestName> |@ <SheetName>  	
  
#@CashDeposit

    Given Launch the "T24" appliaction
    When I sign in with "tellerUser" user 
    And navigate to "cash deposit" under the user menu
    And enter the Mandatiory details in the application
    Then click on commit button
    And Validate the completed transaction
    When Search with TransactionId
    And Validate Audit Tab
    Then Select more actions and validate the list of entries
   
    
 Examples:
 	|TestName|SheetName|
 	|"TC01_T24_CashDeposit"|"Cash_Deposit"| 	
 	
 	
###########################################################Private Account Creation #################################### 	
@All
 Scenario Outline: Security Private Customer creation |~ <TestName> |@ <SheetName>  	
  
#@PrivateCustomerCreation 

    Given Launch the "T24" appliaction
    When I sign in with "authoriseUser" user 
    And navigate to "Private Customer" under the user menu
   	And click on the "Customer Security" in private customer
   	And enter the mandatory fields in private customer application
   	And click on the commit the deal button
   	Then Verify the Authorization in private customer
   	
 Examples:
 	|TestName|SheetName|
 	|"TC01_T24_PrivateCustomer"|"Private_Customer"|
 	


 	
###########################################################Portfolio Creation #################################### 	
 @All
Scenario Outline: Customer Portfolio |~ <TestName> |@ <SheetName>  	
  
#@CustomerPortfolioMake 

    Given Launch the "T24" appliaction
    When I sign in with "adminUser" user 
    And navigate to "customer portfolio" under the user menu
    And enter the Portfolio number in the application
    And enter the manditory fields in the private customer page
    And click on commit
    And Enter the Portfolio generated
    And Validate the audit tab
   
   
    
 Examples:
 	|TestName|SheetName|
 	|"TC01_T24_CustomerPortfolio"|"Customer_Portfolio"| 	
 	
###########################################################Buy Order#################################### 
 @All_1
Scenario Outline: Buy Order |~ <TestName> |@ <SheetName>  	
  
#@BuyOrder 

    Given Launch the "T24" appliaction
    When I sign in with "authoriseUser" user 
    And navigate to "Buy Order" under the user menu
   	And enter the mandatory fields to Buy the Order
   	And Provide values for the required fields in Client Details Section under Buy Order
   	And click on the Commit the deal button in buy order
   	Then view buy Order contract
 Examples:
 	|TestName|SheetName|
 	|"TC01_T24_BuyOrder"|"Buy_Order"|
 	
###########################################################Execute Order#################################### 
@All
 	Scenario Outline: Execute Order |~ <TestName> |@ <SheetName>  	
  
#@ExecuteOrder

    Given Launch the "T24" appliaction
    When I sign in with "executeOrderUser" user 
    And navigate to "Private Operations" under the user menu
    And search for the portfolio name in dealer blotter page and Execute
    And navigate to Broker section and enter values for the mandatory fields
    And click on the commit to deal button to execute order
		And search and view contract of the order

		   
 Examples:
 	|TestName|SheetName|
 	|"TC01_T24_Execute_Order"|"Execute_Order"|
 	
###########################################################Authorise Order#################################### 

@All
 	Scenario Outline: Authorise Settlement |~ <TestName> |@ <SheetName>  	
  
#@AuthoriseSettlement

    Given Launch the "T24" appliaction
    When I sign in with "authoriseUser" user 
    And navigate to "Security Transaction" under the user menu
    And Find the Security Trade Transaction
    Then validate the "RECORD WAS READ FROM HOLD FILE" message
   	When click on the commit the deal to Authorise
   	And view the contract of security Authorisation
   	And select the value "List of entries (authorised)" in more Action
   	And Validate the list of entries and customer position
   	And select the value "Customer positions" in more Action
   	Then validate the position summary
   	
   	
 Examples:
 	|TestName|SheetName|
 	|"TC01_T24_AuthoriseSettlement"|"Authorise_Settlement"|
 	
 	