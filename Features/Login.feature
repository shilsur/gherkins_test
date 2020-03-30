@Login

Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Verify the site is  accessible for users
    Given User opens chrome browser and lauch application
    Then  user should navigate to login page
    
    Scenario Outline: Login fail - possible combinations
    When I enter username as "<UserName>"
    And I enter password as "<Password>"
    Then Login should fail
    Examples:
      |UserName            |Password               |
      |user123             |invalidpass001         |
      |qa@greenflag.com    |wrong          				 |
      |wrongusername       |Password1              |
    
    Scenario Outline: Successful Login
    When user enter username as "<username>"
    And enter password as "<password>"
    And click on Login button
    Then  "Successfully logged in!" message displayed to user
    Examples:
     |username             |password         |
     |qa@greenflag.com     |Password1        |