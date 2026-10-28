
	
	
	Feature: gmail login

	Scenario: verify after entering valid email password and gmail login succesfull
	Given User should be registered
	When open gmail login page, enter valid credentials
	Then Gmail should be successfull
