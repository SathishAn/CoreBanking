Feature: Cash Deposit

@CashDeposit
Scenario Outline: Cash Deposit |~ <TestName> |@ <SheetName>  	
  
#@CashDeposit1 

    Given Launch the "T24" appliaction
    When I sign in with "authoriseUser" user 
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

 	

 	
 	
 	
 	
 	