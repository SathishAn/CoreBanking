@Regression_1
Feature: Execute Order

@ExecuteOrder
Scenario Outline: Execute Order |~ <TestName> |@ <SheetName>  	
  
#@CustomerCreation 

    Given Launch the "T24" appliaction
    When I sign in with "executeOrderUser" user 
    #And navigate to "Private Operations" under the user menu
    #And search for the portfolio name in dealer blotter page and Execute
    #And navigate to Broker section and enter values for the mandatory fields
#		And search and view contract of the order

		   
 Examples:
 	|TestName|SheetName|
 	|"TC01_T24_Execute_Order"|"Execute_Order"|
 
 	

 	
 	
 	
 	
 	