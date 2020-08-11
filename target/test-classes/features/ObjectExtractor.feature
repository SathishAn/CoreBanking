Feature: Object Extractor

@Regression_1

Scenario Outline: Individual Customer creation |~ <TestName> |@ <SheetName> 
Given Launch the "T24" appliaction
When I sign in with "adminUser" user
And navigate to "Individual Customer" under the user menu
And call Object Extractor "CustomerCreation"

Examples:
|TestName|SheetName|
|TC001_Object_Extraction|ObjectExraction|