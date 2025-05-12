@k
Feature: My Preference Center Functionality
  Scenario: Verify email validation and preference settings
    When I scroll down multiple times to reach My Preference Center for MyPreferences
    And I click on My Preference Center for MyPreferences
    And I click on the email input field for MyPreferences
    And I enter an invalid email for MyPreferences "demoemail.com"
    And I click on the phone number input field for MyPreferences
    And I enter my phone number for MyPreferences "98765410210"
    Then I should see an email error message for MyPreferences
    When I click on the email input field again for MyPreferences
    And I clear the email input field for MyPreferences
    And I enter a valid email for MyPreferences "demo@email.com"
    And I click on the Search button for MyPreferences
    Then I should see marketing emails displayed for MyPreferences
