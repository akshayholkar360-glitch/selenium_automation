Feature: student registretion form
Scenario: verify name, surname and email insertes succesfully
Given practice form should launcgh
When enter name, surname and email
And select male option succesfully,enter mobile number
And enter subjects, select hobbies,choose pictures
And enter current address, select state , select city
And click on submite button
Then name,surname and email should insert succesfully
