@e
Feature: Heavy Duty Tools Selection
  Scenario: Filter and verify Husky heavy-duty tool chests
    When I scroll to the footer
    And I click on the Husky brand
    And I click on the Tool Chest section
    And I scroll down to the Shop Now button
    And I click on Shop Now
    And I click on the grade dropdown
    And I select the Heavy Duty option
    And I click on the Apply button
    Then I should see the Husky Tool Chests label displayed
