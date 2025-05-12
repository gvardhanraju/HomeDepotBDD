package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AffiliateProgram;

public class AffiliateProgramStep {
	ExtentTest test = Hooks.reports.createTest("Affiliate Testcase");
	AffiliateProgram affiliateProgram = new AffiliateProgram(test);
	
	@When("I scroll down the page")
	public void i_scroll_down_the_page() {
		affiliateProgram.scroll(0, 500);
		affiliateProgram.scroll(0, 500);
		affiliateProgram.scroll(0, 500);
		affiliateProgram.scroll(0, 500);
	}
	
	@When("I click on affiliate program")
	public void i_click_on_affiliate_program() {
		affiliateProgram.clickOnAffiliateProgram();
	}
	
	@When("I scroll down again")
	public void i_scroll_down_again() {
		affiliateProgram.scroll(0, 500);
		affiliateProgram.scroll(0, 500);
	}
	
	@When("I click on get started")
	public void i_click_on_get_started() {
		affiliateProgram.clickOnGetStarted();
	}
	
	@When("I click on sign button")
	public void i_click_on_sign_button() {
		affiliateProgram.clickOnSignBtn();
	}
	
	@When("I click on forgot password")
	public void i_click_on_forgot_password() {
		affiliateProgram.clickOnForgotPassword();
	}
	
	@When("I enter invalid email {string}")
	public void i_enter_invalid_email(String string) {
		affiliateProgram.enterInvalidEmail(string);
	}
	
	@When("I verify invalid email error message")
	public void i_verify_invalid_email_error_message() {
		affiliateProgram.verifyInvalidEmailErrorMessage();
	}
	
	@When("I enter valid email {string}")
	public void i_enter_valid_email(String string) {
		affiliateProgram.enterValidEmail(string);
	}
	
	@When("I click on submit button")
	public void i_click_on_submit_button() {
		affiliateProgram.clickOnSubmitBtn();
	}
	
	@Then("I verify successfull email")
	public void i_verify_successfull_email() {
		affiliateProgram.verifySuccessfullEmail();
	}
}
