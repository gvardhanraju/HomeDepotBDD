package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RollingToolBoxes;

public class RollingToolBoxesStep {
	ExtentTest test = Hooks.reports.createTest("Rolling Tool Boxes Testcase");
	RollingToolBoxes rollingToolBoxes = new RollingToolBoxes(test);
	
	@When("I scroll to the footer for Rolling Toolbox")
	public void i_scroll_to_the_footer_for_rolling_toolbox() {
	    rollingToolBoxes.scrollToFooter();
	}
	
	@When("I click on the Husky brand for Rolling Toolbox")
	public void i_click_on_the_husky_brand_for_rolling_toolbox() {
		rollingToolBoxes.clickOnHuskyBrand();
	}
	
	@When("I click on the Rolling Toolboxes section for Rolling Toolbox")
	public void i_click_on_the_rolling_toolboxes_section_for_rolling_toolbox() {
		rollingToolBoxes.scroll(0, 200);
		rollingToolBoxes.clickOnRollingToolBoxes();
	}
	
	@When("I scroll down to reach the brand filter for Rolling Toolbox")
	public void i_scroll_down_to_reach_the_brand_filter_for_rolling_toolbox() {
		rollingToolBoxes.scroll(0, 200);
	}
	
	@When("I click on the brand filter for Rolling Toolbox")
	public void i_click_on_the_brand_filter_for_rolling_toolbox() {
		rollingToolBoxes.clickOnBrand();
	}
	
	@When("I click on the Ridgid brand for Rolling Toolbox")
	public void i_click_on_the_ridgid_brand_for_rolling_toolbox() {
		rollingToolBoxes.clickOnRidgidBrand();
	}
	
	@Then("I should see the correct page URL displayed for Rolling Toolbox")
	public void i_should_see_the_correct_page_url_displayed_for_rolling_toolbox() {
		rollingToolBoxes.verifyPageUrl();
	}
}
