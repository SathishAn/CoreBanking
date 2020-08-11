
Feature: End-To-End Scenario of customer creation, Account creation, Private customer creation, Buy & Execute the order.


@Regression
Scenario Outline: Individual Customer creation |~ <TestName> |@ <SheetName>  	
  
#@CustomerCreation 

    Given Launch the "T24" appliaction
    When I sign in with "adminUser" user 
    And navigate to "Individual Customer" under the user menu
    #And call Field Extractor "Customer Creation"
    #And enter the Mandate details in the application
    #And Provide values for the required fields in Physical Address Section
#		And Provide values for the required fields in ID Doc Section
#		And Provide values for the required fields in Relation Section
#		And Provide values for the required fields in Further Details Section
#		And Provide values for the required fields in Financial Details Section
#		And Provide values for the required fields in Residential Details Section
#		And Provide values for the required fields in Communication Details Section
#		And Provide values for the required fields in KYC Section
#		And Provide values for the required fields in Other Details Section
#		And Provide values for the required fields in Reporting Details Section
#		Then click validate and commit button
#		
#@Authorization		
#
#		Given Launch the "T24" appliaction
    #When I sign in with "authoriseUser" user
    #And navigate to "Authorise Customer" under the user menu
    #And Authorise the customer
    #Then view the contract of customer creation
    
 Examples:
 	|TestName|SheetName|
 	|"TC01_T24_Create Individual Customer"|"Individual_Customer"|
 	

########################################################### Account Creation ####################################
@All
Scenario Outline: Customer Account creation |~ <TestName> |@ <SheetName>  	
  
#@AccountCreation 
#
    Given Launch the "T24" appliaction
    When I sign in with "adminUser" user 
    And navigate to "Open Saving Account" under the user menu
    And enter the mandate fields in Saving Account
    And click on the validate button    
    
#@Authorization
#
		Given Launch the "T24" appliaction
    When I sign in with "authoriseUser" user
    And navigate to "Authorise Account" under the user menu
    And Authorise the Account 
    
  Examples:
 	|TestName|SheetName|
 	|"TC01_T24_AccountCreation"|"Account_Creation"|

@Loans
Scenario Outline: Loans |~ <TestName> |@ <SheetName>  
  #
#@Loans 

    Given Launch the "T24" appliaction
    When I sign in with "adminUser" user 
    And navigate to "product catalog" under the user menu
    And Select new arrangements in Personal loan
    And Enter the manditory fields in New arrangement page
    And Enter the fields in commitment tab and commit the deal
    And Validate the completed Loan transaction
    And view the loan created
    
#@Authorize
    
    Given Launch the "T24" appliaction
    When I sign in with "authoriseUser" user 
    And navigate to "Authorise Loan" under the user menu
    And search for the loan number in the AA Arangement page and Approve
    And Validate the completed authorised Loan transaction
    
 Examples:
 	|TestName|SheetName|
 	|"TC01_T24_LoanCreation"|"Loans"|

@LoanDisbursement
Scenario Outline: Loan disbursement|~ <TestName> |@ <SheetName>  	
  
#@LoanDisbursement

    Given Launch the "T24" appliaction
    When I sign in with "adminUser" user 
    And navigate to "AA Disbursement" under the user menu
    And enter the mandatory details for loan disbursement
    And click on the validate and commit the deal
    
#@AuthorizeFT

		Given Launch the "T24" appliaction
    When I sign in with "authoriseUser" user 
    And navigate to "Authorise FT" under the user menu
   	And Authorise the AA Disbursement
   	And navigate to "Find Loan" under the user menu
   	And find the loan with Arrangement
   	
   	

 Examples:
 	|TestName|SheetName|
 	|"TC01_T24_Loan_Disbursement"|"Loan_Disbursement"|
 	
 	