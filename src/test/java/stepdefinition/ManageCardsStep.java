package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ManageCards;

public class ManageCardsStep {
	ExtentTest test = Hooks.reports.createTest("Manage Cards Testcase");
	ManageCards manageCards = new ManageCards(test);
	
	@When("I scroll to the footer for ManageCards")
	public void i_scroll_to_the_footer_for_manage_cards() {
		manageCards.scrollToFooter();
	}
	
	@When("I click on the Pay and Manage Card button for ManageCards")
	public void i_click_on_the_pay_and_manage_card_button_for_manage_cards() {
		manageCards.clickOnPayAndManageCardBtn();
	}
	
	@When("I click on the email input field for ManageCards")
	public void i_click_on_the_email_input_field_for_manage_cards() {
		manageCards.clickOnEmailInputField();
	}
	
	@When("I enter an invalid email for ManageCards {string}")
	public void i_enter_an_invalid_email_for_manage_cards(String string) {
		manageCards.enterInvalidEmail(string);
	}
	
	@When("I click on the email label for ManageCards")
	public void i_click_on_the_email_label_for_manage_cards() {
		manageCards.clickOnEmailLabel();
	}
	
	@Then("I should see a username status error message for ManageCards")
	public void i_should_see_a_username_status_error_message_for_manage_cards() {
		manageCards.verifyUsernameStatusErrorMessage();
	}
	
	@When("I click on the email input field again for ManageCards")
	public void i_click_on_the_email_input_field_again_for_manage_cards() {
		manageCards.clickOnEmailInputField();
	}
	
	@When("I clear the email input field for ManageCards")
	public void i_clear_the_email_input_field_for_manage_cards() {
		manageCards.clearEmailInputField();
	}
	
	@When("I enter a valid email for ManageCards {string}")
	public void i_enter_a_valid_email_for_manage_cards(String string) {
		manageCards.enterValidEmail(string);
	}
	
	@When("I click on the Continue button for ManageCards")
	public void i_click_on_the_continue_button_for_manage_cards() {
		manageCards.clickOnContinueBtn();
	}
	
	@Then("I should be able to verify the creation of a new account for ManageCards")
	public void i_should_be_able_to_verify_the_creation_of_a_new_account_for_manage_cards() {
		manageCards.verifyNewAccount();
	}
}
