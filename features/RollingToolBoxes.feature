@o
Feature: Rolling Toolboxes Selection
  Scenario: Filter and verify Ridgid Rolling Toolboxes
    When I scroll to the footer for Rolling Toolbox
    And I click on the Husky brand for Rolling Toolbox
    And I click on the Rolling Toolboxes section for Rolling Toolbox
    And I scroll down to reach the brand filter for Rolling Toolbox
    And I click on the brand filter for Rolling Toolbox
    And I click on the Ridgid brand for Rolling Toolbox
    Then I should see the correct page URL displayed for Rolling Toolbox
