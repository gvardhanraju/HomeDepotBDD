@i
Feature: Manage Cards Functionality
  Scenario: Verify email validation while managing cards
    When I scroll to the footer for ManageCards
    And I click on the Pay and Manage Card button for ManageCards
    And I click on the email input field for ManageCards
    And I enter an invalid email for ManageCards "demoemail.com"
    And I click on the email label for ManageCards
    Then I should see a username status error message for ManageCards
    When I click on the email input field again for ManageCards
    And I clear the email input field for ManageCards
    And I enter a valid email for ManageCards "demo@email.com"
    And I click on the Continue button for ManageCards
    Then I should be able to verify the creation of a new account for ManageCards
