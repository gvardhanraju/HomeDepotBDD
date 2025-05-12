@f
Feature: Truck Tool Boxes Selection
  Scenario: Filter and verify Matte Black Husky Truck Tool Boxes
    When I scroll to the footer for Husky Brand
    And I click on the Husky brand for Husky Truck Tools
    And I click on the Truck Tool Boxes section
    And I click on the Vehicle Specific option
    And I click on the Finish Color dropdown
    And I select Matte Black
    And I click on the Apply button for Trush Tools
    Then I should see the Matte Black Husky label displayed
