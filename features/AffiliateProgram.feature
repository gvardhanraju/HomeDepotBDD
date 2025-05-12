@a
Feature: Affiliate Program Forgot Password
	Scenario: User tring to reset password
	
		When I scroll down the page
		And I click on affiliate program
		And I scroll down again
		And I click on get started
		And I click on sign button
		And I click on forgot password
		And I enter invalid email "testgmail.com"
		And I verify invalid email error message
		And I enter valid email "test@gmail.com"
		And I click on submit button
		Then I verify successfull email