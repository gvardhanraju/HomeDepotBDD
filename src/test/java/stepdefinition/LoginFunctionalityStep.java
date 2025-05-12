package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LogInFuntionality;

public class LoginFunctionalityStep {
	ExtentTest test = Hooks.reports.createTest("Login Functionality Testcase");
	LogInFuntionality logInFuntionality = new LogInFuntionality(test);
	
	@When("I click on the Log In button for Login")
	public void i_click_on_the_log_in_button_for_login() {
	    logInFuntionality.clickOnLogIn();
	}
	
	@When("I click on Sign In from the menu bar for Login")
	public void i_click_on_sign_in_from_the_menu_bar_for_login() {
		logInFuntionality.clickOnSignInOnMenuBar();
	}
	
	@When("I click on the email input field for Login")
	public void i_click_on_the_email_input_field_for_login() {
		logInFuntionality.clickOnEmailInputField();
	}
	
	@When("I enter an invalid email for Login {string}")
	public void i_enter_an_invalid_email_for_login(String string) {
		logInFuntionality.enterInvalidEmail(string);
	}
	
	@When("I click on the email label for Login")
	public void i_click_on_the_email_label_for_login() {
		logInFuntionality.clickOnEmailLabel();
	}
	
	@Then("I should see a username status error message for Login")
	public void i_should_see_a_username_status_error_message_for_login() {
		logInFuntionality.verifyUsernameStatusErrorMessage();
	}
	
	@When("I clear the email input field for Login")
	public void i_clear_the_email_input_field_for_login() {
		logInFuntionality.clearEmailInputField();
	}
	
	@When("I click on the email input field again for Login")
	public void i_click_on_the_email_input_field_again_for_login() {
		logInFuntionality.clickOnEmailInputField();
	}
	
	@When("I enter a valid email for Login {string}")
	public void i_enter_a_valid_email_for_login(String string) {
		logInFuntionality.enterValidEmail(string);
	}
	
	@When("I click on the Continue button for Login")
	public void i_click_on_the_continue_button_for_login() {
		logInFuntionality.clickOnContinueBtn();
	}
	
	@When("I click on the password input field for Login")
	public void i_click_on_the_password_input_field_for_login() {
		logInFuntionality.clickOnPasswordInputField();
	}
	
	@When("I enter my password for Login {string}")
	public void i_enter_my_password_for_login(String string) {
		logInFuntionality.enterPassword(string);
	}
	
	@When("I click on the Sign In button for Login")
	public void i_click_on_the_sign_in_button_for_login() {
		logInFuntionality.clickOnSignInBtn();
	}

}
