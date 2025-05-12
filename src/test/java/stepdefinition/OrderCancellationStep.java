package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OrderCancellation;

public class OrderCancellationStep {
	ExtentTest test = Hooks.reports.createTest("Order Cancellation Testcase");
	OrderCancellation orderCancellation = new OrderCancellation(test);
	
	@When("I scroll down multiple times to reach the Order Cancellation section for Order Cancellation")
	public void i_scroll_down_multiple_times_to_reach_the_order_cancellation_section_for_order_cancellation() {
	    orderCancellation.scroll(0, 500);
	    orderCancellation.scroll(0, 500);
	    orderCancellation.scroll(0, 500);
	    orderCancellation.scroll(0, 500);
	}
	
	@When("I click on Order Cancellation for Order Cancellation")
	public void i_click_on_order_cancellation_for_order_cancellation() {
		orderCancellation.clickOnOrderCancellation();
	}
	
	@When("I scroll down multiple times for Order Cancellation")
	public void i_scroll_down_multiple_times_for_order_cancellation() {
		orderCancellation.scroll(0, 500);
		orderCancellation.scroll(0, 500);
		orderCancellation.scroll(0, 500);
		orderCancellation.scroll(0, 500);
	}
	
	@When("I click on the Go button for Order Cancellation")
	public void i_click_on_the_go_button_for_order_cancellation() {
		orderCancellation.clickOnGoBtn();
	}
	
	@Then("I should see an error for empty input for Order Cancellation")
	public void i_should_see_an_error_for_empty_input_for_order_cancellation() {
		orderCancellation.verifyForEmptyInput();
	}
	
	@When("I click on the footer email input field for Order Cancellation")
	public void i_click_on_the_footer_email_input_field_for_order_cancellation() {
		orderCancellation.clickFooterEmailInputField();
	}

	@When("I enter an invalid email for Order Cancellation {string}")
	public void i_enter_an_invalid_email_for_order_cancellation(String string) {
		orderCancellation.enterInvalidEmail(string);
	}
	
	@When("I click on the Go button again for Order Cancellation")
	public void i_click_on_the_go_button_again_for_order_cancellation() {
		orderCancellation.clickOnGoBtn();
	}
	
	@Then("I should see an error for invalid email for Order Cancellation")
	public void i_should_see_an_error_for_invalid_email_for_order_cancellation() {
		orderCancellation.verifyForInvalidEmail();
	}
	
	@When("I clear the email input field for Order Cancellation")
	public void i_clear_the_email_input_field_for_order_cancellation() {
		orderCancellation.clearEmailInputField();
	}
	
	
	@When("I enter a valid email for Order Cancellation {string}")
	public void i_enter_a_valid_email_for_order_cancellation(String string) {
		orderCancellation.enterValidEmail(string);
	}
	
	@When("I click on the Go button again for third time under Order Cancellation")
	public void i_click_on_the_go_button_again_for_third_time_under_order_cancellation() {
		orderCancellation.clickOnGoBtn();
	}
	
	@Then("I should see confirmation for valid email for Order Cancellation")
	public void i_should_see_confirmation_for_valid_email_for_order_cancellation() {
		orderCancellation.verifyForValidEmail();
	}
}
