@c
Feature: Corporate Responsibility Page Navigation
	Scenario: Verify navigation through Corporate Responsibility and About Us sections
	    When I scroll down multiple times to reach the Corporate Responsibility section
	    And I click on the Corporate Responsibility link
	    And I hover over Living Our Values
	    And I click on We Are THD
	    And I scroll down to reach the About Us section
	    And I click on the About Us link
	    And I scroll down to reach the morals section
	    Then I should see the morals section displayed