@l
Feature: Order Cancellation Functionality
  Scenario: Verify order cancellation process and email validation
    When I scroll down multiple times to reach the Order Cancellation section for Order Cancellation
    And I click on Order Cancellation for Order Cancellation
    And I scroll down multiple times for Order Cancellation
    And I click on the Go button for Order Cancellation
    Then I should see an error for empty input for Order Cancellation
    When I click on the footer email input field for Order Cancellation
    And I enter an invalid email for Order Cancellation "testgmail.com"
    And I click on the Go button again for Order Cancellation
    Then I should see an error for invalid email for Order Cancellation
    When I clear the email input field for Order Cancellation
    And I enter a valid email for Order Cancellation "test@gmail.com"
    And I click on the Go button again for third time under Order Cancellation
    Then I should see confirmation for valid email for Order Cancellation
