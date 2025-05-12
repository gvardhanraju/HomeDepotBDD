package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CorporateResponsibility;

public class CorporateResponsibilityStep {
	ExtentTest test = Hooks.reports.createTest("Corporate Responsibility Testcase");
	CorporateResponsibility corporateResponsibility = new CorporateResponsibility(test);
	
	@When("I scroll down multiple times to reach the Corporate Responsibility section")
	public void i_scroll_down_multiple_times_to_reach_the_corporate_responsibility_section() {
		corporateResponsibility.scroll(0,500);
		corporateResponsibility.scroll(0,500);
		corporateResponsibility.scroll(0,500);
		corporateResponsibility.scroll(0,500);
	}
	
	@When("I click on the Corporate Responsibility link")
	public void i_click_on_the_corporate_responsibility_link() {
		corporateResponsibility.clickOnCoporateResponsibility();
	}
	
	@When("I hover over Living Our Values")
	public void i_hover_over_living_our_values() {
		corporateResponsibility.hoverOverLivingOurValues();
	}
	
	@When("I click on We Are THD")
	public void i_click_on_we_are_thd() {
	    corporateResponsibility.clickOnWeAreTHD();
	}
	
	@When("I scroll down to reach the About Us section")
	public void i_scroll_down_to_reach_the_about_us_section() {
	    corporateResponsibility.scroll(0,500);
	    corporateResponsibility.scroll(0,500);
	    corporateResponsibility.scroll(0,500);
	}
	
	@When("I click on the About Us link")
	public void i_click_on_the_about_us_link() {
		corporateResponsibility.clickOnAboutUs();
	}
	
	@When("I scroll down to reach the morals section")
	public void i_scroll_down_to_reach_the_morals_section() {
	    corporateResponsibility.scroll(0, 500);
	}
	
	@Then("I should see the morals section displayed")
	public void i_should_see_the_morals_section_displayed() {
	    corporateResponsibility.verifyMorals();
	}
}
