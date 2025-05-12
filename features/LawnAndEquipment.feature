@g
Feature: Lawn and Equipment Rentals
  Scenario: Navigate and verify rental services
    When I click on My Store
    And I click on Curbside services
    And I scroll down to reach the Learn More section
    And I click on Learn More
    And I scroll down multiple times to reach the Rentals section
    And I click on Rentals
    And I scroll down to reach the Rent Now button
    And I click on Rent Now
    Then I should see the info label displayed
