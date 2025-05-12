package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MyPreferenceCenter;

public class MyPreferenceCenterStep {
	ExtentTest test = Hooks.reports.createTest("My Preference Center Testcase");
	MyPreferenceCenter myPreferenceCenter = new MyPreferenceCenter(test);
	
	@When("I scroll down multiple times to reach My Preference Center for MyPreferences")
	public void i_scroll_down_multiple_times_to_reach_my_preference_center_for_my_preferences() {
	    myPreferenceCenter.scroll(0, 500);
	    myPreferenceCenter.scroll(0, 500);
	    myPreferenceCenter.scroll(0, 500);
	    myPreferenceCenter.scroll(0, 500);
	}
	
	@When("I click on My Preference Center for MyPreferences")
	public void i_click_on_my_preference_center_for_my_preferences() {
		myPreferenceCenter.clickOnMyPreferenceCenter();
	}
	
	@When("I click on the email input field for MyPreferences")
	public void i_click_on_the_email_input_field_for_my_preferences() {
		myPreferenceCenter.scroll(0, 300);
		myPreferenceCenter.clickOnEmailInputField();
	}

	@When("I enter an invalid email for MyPreferences {string}")
	public void i_enter_an_invalid_email_for_my_preferences(String string) {
		myPreferenceCenter.enterInvalidEmail(string);
	}
	
	@When("I click on the phone number input field for MyPreferences")
	public void i_click_on_the_phone_number_input_field_for_my_preferences() {
		myPreferenceCenter.clickOnPhoneNumberInput();
	}
	
	@When("I enter my phone number for MyPreferences {string}")
	public void i_enter_my_phone_number_for_my_preferences(String string) {
		myPreferenceCenter.enterPhoneNumber(string);
	}
	
	@Then("I should see an email error message for MyPreferences")
	public void i_should_see_an_email_error_message_for_my_preferences() {
		myPreferenceCenter.verifyEmailErrorMessage();
	}
	
	@When("I click on the email input field again for MyPreferences")
	public void i_click_on_the_email_input_field_again_for_my_preferences() {
		myPreferenceCenter.clickOnEmailInputField();
	}
	
	@When("I clear the email input field for MyPreferences")
	public void i_clear_the_email_input_field_for_my_preferences() {
		myPreferenceCenter.clearEmailInputField();
	}
	
	@When("I enter a valid email for MyPreferences {string}")
	public void i_enter_a_valid_email_for_my_preferences(String string) {
		myPreferenceCenter.enterValidEmail(string);
	}
	
	@When("I click on the Search button for MyPreferences")
	public void i_click_on_the_search_button_for_my_preferences() {
		myPreferenceCenter.clickOnSearchBtn();
	}
	
	@Then("I should see marketing emails displayed for MyPreferences")
	public void i_should_see_marketing_emails_displayed_for_my_preferences() {
	    myPreferenceCenter.verifyMarketingEmails();
	}
}
