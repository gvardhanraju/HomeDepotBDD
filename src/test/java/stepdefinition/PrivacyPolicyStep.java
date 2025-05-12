package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PrivacyPolicy;

public class PrivacyPolicyStep {
	ExtentTest test = Hooks.reports.createTest("Privacy Policy Testcase");
	PrivacyPolicy privacyPolicy = new PrivacyPolicy(test);
	
	@When("I click on My Store for Privacy Policy")
	public void i_click_on_my_store_for_privacy_policy() {
		privacyPolicy.clickOnMyStore();
	}
	
	@When("I scroll down to reach the Workshops section for Privacy Policy")
	public void i_scroll_down_to_reach_the_workshops_section_for_privacy_policy() {
		privacyPolicy.scroll(0, 200);
		privacyPolicy.scroll(0, 200);
	}
	
	@When("I click on Workshops for Privacy Policy")
	public void i_click_on_workshops_for_privacy_policy() {
		privacyPolicy.clickOnWorkshops();
	}
	
	@When("I scroll down to reach the Learn More button for Privacy Policy")
	public void i_scroll_down_to_reach_the_learn_more_button_for_privacy_policy() {
		privacyPolicy.scroll(0, 200);
		privacyPolicy.scroll(0, 200);    
	}
	
	@When("I click on Learn More for Privacy Policy")
	public void i_click_on_learn_more_for_privacy_policy() {
		privacyPolicy.clickOnLearnMore();
	}
	
	@When("I scroll to the footer for Privacy Policy")
	public void i_scroll_to_the_footer_for_privacy_policy() {
		privacyPolicy.scrollToFooter();
	}
	
	@Then("I should see the info label displayed for Privacy Policy")
	public void i_should_see_the_info_label_displayed_for_privacy_policy() {
	    privacyPolicy.verifyInfoLabel();
	}
	
	@When("I click on the Privacy Policy link for Privacy Policy")
	public void i_click_on_the_privacy_policy_link_for_privacy_policy() {
		privacyPolicy.clickOnPrivacyPolicy();
	}
}
