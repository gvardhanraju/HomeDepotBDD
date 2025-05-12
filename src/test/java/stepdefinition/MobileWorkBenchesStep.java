package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MobileWorkBenches;

public class MobileWorkBenchesStep {
	ExtentTest test = Hooks.reports.createTest("Mobile Work Benches Testcase");
	MobileWorkBenches mobileWorkBenches = new MobileWorkBenches(test);
	
	@When("I scroll to the footer For Mobile Work Bench")
	public void i_scroll_to_the_footer_for_mobile_work_bench() {
	    mobileWorkBenches.scrollToFooter();
	}
	
	@When("I click on the Husky brand For Mobile Work Bench")
	public void i_click_on_the_husky_brand_for_mobile_work_bench() {
		mobileWorkBenches.clickOnHuskyBrand();
	}
	
	@When("I click on the Mobile Work Benches section For Mobile Work Bench")
	public void i_click_on_the_mobile_work_benches_section_for_mobile_work_bench() {
		mobileWorkBenches.clickOnMobileWorkBenches();
	}
	
	@When("I click on the Black color filter For Mobile Work Bench")
	public void i_click_on_the_black_color_filter_for_mobile_work_bench() {
		mobileWorkBenches.clickOnBlackColorFilter();	    
	}
	
	@Then("I should see the Black Husky Mobile Work Benches label displayed For Mobile Work Bench")
	public void i_should_see_the_black_husky_mobile_work_benches_label_displayed_for_mobile_work_bench() {
		mobileWorkBenches.verifyBlackHuskyMobileWorkBenchesLabel();
	}

}
