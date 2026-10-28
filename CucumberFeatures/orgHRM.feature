Feature: orgHRM login functionality
	
	Scenario: verify login functionality of orgHRM website
		
		Given launch orgHRM website
		When enter username as "Admin" and password as "admin123"
		And click on login button of orgHRM website
		Then orgHRM login should be successful
 