@p
Feature: Shop Our Brands Selection
  Scenario: Filter and verify Anvil brand sorted by price
    When I scroll to the footer for Shop Our Brands
    And I click on the Shop Our Brands section for Shop Our Brands
    And I click on the Anvil brand for Shop Our Brands
    And I scroll down to reach the sorting options for Shop Our Brands
    And I click on the Sort By dropdown for Shop Our Brands
    And I select Price Low to High for Shop Our Brands
    Then I should see the Price Low to High label displayed for Shop Our Brands
