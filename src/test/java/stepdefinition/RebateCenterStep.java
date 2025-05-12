package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RebateCenter;

public class RebateCenterStep {
	ExtentTest test = Hooks.reports.createTest("Rebate Center Testcase");
	RebateCenter rebateCenter = new RebateCenter(test);
	
	@When("I scroll down multiple times to reach the Eco Actions section for Rebate Test")
	public void i_scroll_down_multiple_times_to_reach_the_eco_actions_section_for_rebate_test() {
	    rebateCenter.scroll(0, 500);
	    rebateCenter.scroll(0, 500);
	    rebateCenter.scroll(0, 500);
	    rebateCenter.scroll(0, 500);
	}
	
	@When("I click on Eco Actions for Rebate Test")
	public void i_click_on_eco_actions_for_rebate_test() {
		rebateCenter.clickOnEcoActions();
	}
	
	@When("I close the pop-up for Rebate Test")
	public void i_close_the_pop_up_for_rebate_test() {
		rebateCenter.closePopUp();
	}
	
	@When("I scroll to the footer for Rebate Test")
	public void i_scroll_to_the_footer_for_rebate_test() {
		rebateCenter.scrollToFooter();
	}
	
	@When("I click on the Rebate Center for Rebate Test")
	public void i_click_on_the_rebate_center_for_rebate_test() {
		rebateCenter.clickOnRebateCenter();
	}
	
	@When("I click on the Home button for Rebate Test")
	public void i_click_on_the_home_button_for_rebate_test() {
		rebateCenter.clickOnHomeBtn();
	}
	
	@When("I navigate back for Rebate Test")
	public void i_navigate_back_for_rebate_test() {
		rebateCenter.navigateBack();
	}
	
	@Then("I should see the Rebate Center label displayed for Rebate Test")
	public void i_should_see_the_rebate_center_label_displayed_for_rebate_test() {
		rebateCenter.verifyRebateCenterLabel();
	}
}
