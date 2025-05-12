@n
Feature: Rebate Center Functionality
  Scenario: Navigate and verify Rebate Center
    When I scroll down multiple times to reach the Eco Actions section for Rebate Test
    And I click on Eco Actions for Rebate Test
    And I close the pop-up for Rebate Test
    And I scroll to the footer for Rebate Test
    And I click on the Rebate Center for Rebate Test
    And I click on the Home button for Rebate Test
    And I navigate back for Rebate Test
    Then I should see the Rebate Center label displayed for Rebate Test
