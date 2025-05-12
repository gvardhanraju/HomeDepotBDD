@h
Feature: User Login Functionality
  Scenario: Verify login process with email and password
    When I click on the Log In button for Login
    And I click on Sign In from the menu bar for Login
    And I click on the email input field for Login
    And I enter an invalid email for Login "demoemail.com"
    And I click on the email label for Login
    Then I should see a username status error message for Login
    When I clear the email input field for Login
    And I click on the email input field again for Login
    And I enter a valid email for Login "kocata1650@cotigz.com"
    And I click on the Continue button for Login
    And I click on the password input field for Login
    And I enter my password for Login "@Cotigz.com"
    And I click on the Sign In button for Login
