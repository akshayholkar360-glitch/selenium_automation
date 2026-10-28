Feature: opencart register | login 
Scenario: verify user can create opencart accountand register successfully
Given opencart website should be lunch
When click on register button on langing page
And enter username ,firstname, lastname
And enter email,country and password
And click on register button
Then user should create account and register should be successfull

Scenario:
verify after entring valid credintails login successfull
Given opencart website should be login
When click on login button on landing page
And enter email and password
And  click on login button
Then user login should be successfull