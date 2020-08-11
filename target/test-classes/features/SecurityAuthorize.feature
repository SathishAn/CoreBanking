Feature: Individual Customer creation
@All_1
Scenario Outline: Individual Customer creation |~ <TestName> |@ <SheetName>  	
  
#@CustomerCreation 

    Given Launch the "T24" appliaction
    When I sign in with "authoriseUser" user 
    And navigate to "Security Transaction" under the user menu
    And Find the Security Trade Transaction
    Then validate the "RECORD WAS READ FROM HOLD FILE" message
   	When click on the commit the deal to Authorise
   	And select the value "List of entries (authorised)" in more Action
   	And Validate the list of entries and customer position
   	And select the value "Customer Positions" in more Action
   	Then validate the position summary
   	
   	
 Examples:
 	|TestName|SheetName|
 	|"TC01_T24_AuthoriseSettlement"|"Authorise_Settlement"|
 	

 	
 	
 	