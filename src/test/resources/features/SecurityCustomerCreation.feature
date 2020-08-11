Feature: Individual Customer creation
@All_1
Scenario Outline: Individual Customer creation |~ <TestName> |@ <SheetName>  	
  
#@CustomerCreation 

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
 	

 	
 	
 	