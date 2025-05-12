package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GiftCards;

public class GiftCardsStep {
	ExtentTest test = Hooks.reports.createTest("Gift Cards Testcase");
	GiftCards giftCards = new GiftCards(test);
	
	@When("I scroll down multiple times to reach the Gift Cards section")
	public void i_scroll_down_multiple_times_to_reach_the_gift_cards_section() {
		giftCards.scroll(0, 6000);
	}
	
	@When("I click on the Gift Cards button")
	public void i_click_on_the_gift_cards_button() {
	  giftCards.clickOnGiftCardsBtn();
	}
	
	@When("I scroll down multiple times to reach the Get Started option")
	public void i_scroll_down_multiple_times_to_reach_the_get_started_option() {
	  giftCards.scroll(0, 2500);
	}
	
	@When("I click on Get Started")
	public void i_click_on_get_started() {
	  giftCards.clickOnGetStarted();	   
	}
	
	@When("I click on the email input field")
	public void i_click_on_the_email_input_field() {
		giftCards.clickOnEmailInputField();
	}

	@When("I click on the email label")
	public void i_click_on_the_email_label() {
		giftCards.clickOnEmailLabel();
	}
	
	@When("I enter an invalid email {string}")
	public void i_enter_an_invalid_email(String string) {
		giftCards.enterInvalidEmail(string);
	}
	
	@Then("I should see a username status error message")
	public void i_should_see_a_username_status_error_message() {
		giftCards.verifyUsernameStatusErrorMessage();  
	}
	
	@When("I click on the email input field again")
	public void i_click_on_the_email_input_field_again() {
		giftCards.clickOnEmailInputField();
	}
	
	@When("I clear the email input field")
	public void i_clear_the_email_input_field() {
		giftCards.clearEmailInputField();
	}
	
	@When("I enter a valid email {string}")
	public void i_enter_a_valid_email(String string) {
		giftCards.enterValidEmail(string);
	}
	
	@When("I click on the Continue button")
	public void i_click_on_the_continue_button() {
		giftCards.clickOnContinueBtn();
	}
	
	@Then("I should be able to verify the creation of a new account")
	public void i_should_be_able_to_verify_the_creation_of_a_new_account() {
	  giftCards.verifyNewAccount();
	}
}
