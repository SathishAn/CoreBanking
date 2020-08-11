Feature: Individual Customer creation

@Regression_1
Scenario Outline: Individual Customer creation |~ <TestName> |@ <SheetName>  	
  
#@CustomerCreation 

    Given Launch the "T24" appliaction
    When I sign in with "adminUser" user 
    #And navigate to "Corporate Customer" under the user menu
    #And enter the Mandate details in the corporate application
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
    
 Examples:
 	|TestName|SheetName|
 	|"TC01_T24_Create Individual Customer_Male"|"Individual_Customer"|
 
 	

 	
 	
 	
 	
 	