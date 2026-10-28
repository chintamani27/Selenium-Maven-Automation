Feature: OpenCart  register and login
	Background:
	
		Given page should be launched
	
	Scenario: Verify registration success after entering valid details
		
		When enter all required details correctly
		Then registration should be successfull
		
	Scenario: Verify login with valid credentials
		
		When user enters valid credentials
		Then login should be successful after entering valid credentials
		 
 
 