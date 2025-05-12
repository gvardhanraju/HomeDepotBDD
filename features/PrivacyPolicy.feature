@m
Feature: Privacy Policy Navigation
  Scenario: Access and verify Privacy Policy section
    When I click on My Store for Privacy Policy
    And I scroll down to reach the Workshops section for Privacy Policy
    And I click on Workshops for Privacy Policy
    And I scroll down to reach the Learn More button for Privacy Policy
    And I click on Learn More for Privacy Policy
    And I scroll to the footer for Privacy Policy
    Then I should see the info label displayed for Privacy Policy
    When I click on the Privacy Policy link for Privacy Policy