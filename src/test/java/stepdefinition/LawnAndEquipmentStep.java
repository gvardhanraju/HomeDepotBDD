package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LawnAndEquipment;

public class LawnAndEquipmentStep {
	ExtentTest test = Hooks.reports.createTest("Lawn and Equipment Testcase");
	LawnAndEquipment lawnAndEquipment = new LawnAndEquipment(test);
	
	@When("I click on My Store")
	public void i_click_on_my_store() {
		lawnAndEquipment.clickOnMyStore();
	}
	
	@When("I click on Curbside services")
	public void i_click_on_curbside_services() {
		lawnAndEquipment.clickOnCurbsides();
	}
	
	@When("I scroll down to reach the Learn More section")
	public void i_scroll_down_to_reach_the_learn_more_section() {
		lawnAndEquipment.scroll(0, 200);
		lawnAndEquipment.scroll(0, 200);
	}
	
	@When("I click on Learn More")
	public void i_click_on_learn_more() {
		lawnAndEquipment.clickonLearnMore();
	}
	
	@When("I scroll down multiple times to reach the Rentals section")
	public void i_scroll_down_multiple_times_to_reach_the_rentals_section() {
		lawnAndEquipment.scroll(0, 2000);
	}
	
	@When("I click on Rentals")
	public void i_click_on_rentals() {
		lawnAndEquipment.clickOnRentals();
	}
	
	@When("I scroll down to reach the Rent Now button")
	public void i_scroll_down_to_reach_the_rent_now_button() {
		lawnAndEquipment.scroll(0, 200);
		lawnAndEquipment.scroll(0, 200);
	}
	
	@When("I click on Rent Now")
	public void i_click_on_rent_now() {
		lawnAndEquipment.clickOnRentNow();
	}
	
	@Then("I should see the info label displayed")
	public void i_should_see_the_info_label_displayed() {
		lawnAndEquipment.verifyInfoLabel();
	}
}
