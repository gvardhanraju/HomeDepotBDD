package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HeavyDutyTools;

public class HeavyDutyToolsStep {
	ExtentTest test = Hooks.reports.createTest("Heavy Duty Tools Testcase");
	HeavyDutyTools heavyDutyTools = new HeavyDutyTools(test);
	
	@When("I scroll to the footer")
	public void i_scroll_to_the_footer() {
	   heavyDutyTools.scrollToFooter();
	}
	
	@When("I click on the Husky brand")
	public void i_click_on_the_husky_brand() {
	   heavyDutyTools.clickOnHuskyBrand();
	}
	
	@When("I click on the Tool Chest section")
	public void i_click_on_the_tool_chest_section() {
	   heavyDutyTools.clickOnToolChest();
	}
	
	@When("I scroll down to the Shop Now button")
	public void i_scroll_down_to_the_shop_now_button() {
	   heavyDutyTools.scroll(0, 200);
	}
	
	@When("I click on Shop Now")
	public void i_click_on_shop_now() {
	    heavyDutyTools.clickOnShopNow();
	}
	
	@When("I click on the grade dropdown")
	public void i_click_on_the_grade_dropdown() {
	    heavyDutyTools.clickOnGradeDropdown();
	}
	
	@When("I select the Heavy Duty option")
	public void i_select_the_heavy_duty_option() {
	   heavyDutyTools.clickOnHeavyDuty();
	}
	
	@When("I click on the Apply button")
	public void i_click_on_the_apply_button() {
	   heavyDutyTools.clickOnApplyBtn();
	}
	
	@Then("I should see the Husky Tool Chests label displayed")
	public void i_should_see_the_husky_tool_chests_label_displayed() {
	   heavyDutyTools.verifyHuskyToolChestsLabel();
	}
	
}
