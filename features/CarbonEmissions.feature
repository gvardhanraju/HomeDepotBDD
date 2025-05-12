@b
Feature: Eco Actions and Carbon Emissions

  Scenario: Verify Carbon Emissions Product Index Label
    Given I scroll down
    When I click on Eco Actions
    And I close the popup
    And I hover over Our Pillars
    And I click on Carbon Emissions
    And I scroll down to Carbon Emissions Products
    And I click on Carbon Emissions Products
    Then I verify the Product Index Label
