Feature: Individual Customer creation
@All_1
Scenario Outline: Buy Order |~ <TestName> |@ <SheetName>  	
  
#@CustomerCreation 

    Given Launch the "T24" appliaction
    When I sign in with "authoriseUser" user 
    #And navigate to "Buy Order" under the user menu
   #	And enter the mandatory fields to Buy the Order
   #	And Provide values for the required fields in Client Details Section under Buy Order
   #	And click on the Commit the deal button in buy order
   #	Then view buy Order contract
 Examples:
 	|TestName|SheetName|
 	|"TC01_T24_BuyOrder"|"Buy_Order"|
 	

 	
 	
 	