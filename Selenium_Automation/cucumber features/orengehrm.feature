Feature: orangehrm website login functionality
Scenario: verify login successfull with valid credentials
Given launch orangehrm website
When enter username as "Admin" also enter password as "admin123"
And click on login button of orangehrm website
Then orangehrm login should be successfull
