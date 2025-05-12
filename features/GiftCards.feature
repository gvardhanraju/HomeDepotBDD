@d
Feature: Gift Cards Purchase Flow
  Scenario: Validate email input during Gift Card purchase
    When I scroll down multiple times to reach the Gift Cards section
    And I click on the Gift Cards button
    And I scroll down multiple times to reach the Get Started option
    And I click on Get Started
    And I click on the email input field
    And I click on the email label
    And I enter an invalid email "demogmail.com"
    Then I should see a username status error message
    When I click on the email input field again
    And I clear the email input field
    And I enter a valid email "rakesh23@gmail.com"
    And I click on the Continue button
    Then I should be able to verify the creation of a new account
