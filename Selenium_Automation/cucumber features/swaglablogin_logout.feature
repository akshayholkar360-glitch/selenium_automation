Feature: saucedemo login logout functionality

  Scenario Outline: verify login and logout should be successfull
    Given Launch Saucedemo website
    When enter  username as "<username>" also password as "<password>"
    And Click on login button also click on logout
    Then user should see expected result as "<expectedresult>"

    Examples: 
      | username                | password     | expectedresult |
      | standard_user           | secret_sauce | Success        |
      | problem_user            | secret_sauce | Success        |
      | performance_glitch_user | secret_sauce | Success        |
      | error_user              | secret_sauce | Success        |
      | visual_user             | secret_sauce | Success        |
      | locked_out_user         | secret_sauce | Fail           |