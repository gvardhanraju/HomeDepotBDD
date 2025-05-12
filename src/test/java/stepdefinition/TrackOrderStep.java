package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TrackOrder;

public class TrackOrderStep {
	ExtentTest test = Hooks.reports.createTest("Track Order Testcase");
	TrackOrder trackOrder = new TrackOrder(test);
	
	@When("I scroll to the footer for Customer Service Center")
	public void i_scroll_to_the_footer_for_customer_service_center() {
	  	trackOrder.scrollToFooter();
	}
	
	@When("I click on the Customer Service Center")
	public void i_click_on_the_customer_service_center() {
		trackOrder.clickOnCustomerServiceCenter();
	}
	
	@When("I scroll down to reach the Track an Order section")
	public void i_scroll_down_to_reach_the_track_an_order_section() {
		trackOrder.scroll(0, 200);
	}
	
	@When("I click on Track an Order")
	public void i_click_on_track_an_order() {
		trackOrder.clickOnTrackAnOrder();
	}
	
	@When("I click on the Order Number input field")
	public void i_click_on_the_order_number_input_field() {
		trackOrder.clickOnOrderNumberInputField();
	}
	
	@When("I enter the order number {string}")
	public void i_enter_the_order_number(String string) {
		trackOrder.enterOrderNumber(string);
	}
	
	@When("I click on the Phone Number input field")
	public void i_click_on_the_phone_number_input_field() {
	   trackOrder.clickOnPhoneNumberInputField();
	}

	@When("I enter my phone number {string}")
	public void i_enter_my_phone_number(String string) {
		trackOrder.enterPhoneNumber(string);
	}
	
	@When("I click on the Track Order button")
	public void i_click_on_the_track_order_button() {
		trackOrder.clickOnTrackOrderBtn();
	}
	
	@Then("I should see the order tracking error message")
	public void i_should_see_the_order_tracking_error_message() {
	    trackOrder.verifyTrackOrderErrorMessage();
	}
}
