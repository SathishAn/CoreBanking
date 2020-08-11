Feature: Customer Portfolio

@CustomerPortfolio
Scenario Outline: CustomerPortfolio |~ <TestName> |@ <SheetName>  	
  
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
 	|"TC01_T24_CustomerPortfolio"|"CustomerPortfolio"|

 	

 	
 	
 	
 	
 	