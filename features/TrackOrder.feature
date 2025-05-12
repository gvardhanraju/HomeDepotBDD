@q
Feature: Track an Order in Customer Service Center

  Scenario: Verify order tracking error message
    When I scroll to the footer for Customer Service Center
    And I click on the Customer Service Center
    And I scroll down to reach the Track an Order section
    And I click on Track an Order
    And I click on the Order Number input field
    And I enter the order number "H987654321"
    And I click on the Phone Number input field
    And I enter my phone number "9876543210"
    And I click on the Track Order button
    Then I should see the order tracking error message

    