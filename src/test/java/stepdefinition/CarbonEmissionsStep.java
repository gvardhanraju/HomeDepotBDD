package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CarbonEmissions;

public class CarbonEmissionsStep {
	ExtentTest test = Hooks.reports.createTest("Carbon Emission Testcase");
	CarbonEmissions carbonEmissions = new CarbonEmissions(test);
	
	@Given("I scroll down")
	public void i_scroll_down() {
	    carbonEmissions.scroll(0, 2500);
	}
	
	@When("I click on Eco Actions")
	public void i_click_on_eco_actions() {
	    carbonEmissions.clickOnEcoActions();
	}
	
	@When("I close the popup")
	public void i_close_the_popup() {
	    carbonEmissions.closePopUp();
	}
	
	@When("I hover over Our Pillars")
	public void i_hover_over_our_pillars() {
	    carbonEmissions.hoverOverOurPillars();
	}
	
	@When("I click on Carbon Emissions")
	public void i_click_on_carbon_emissions() {
	    carbonEmissions.clickOnCarbonEmissions();
	}
	
	@When("I scroll down to Carbon Emissions Products")
	public void i_scroll_down_to_carbon_emissions_products() {
	    carbonEmissions.scroll(0, 2200); 
	}

	@When("I click on Carbon Emissions Products")
	public void i_click_on_carbon_emissions_products() {
	    carbonEmissions.clickOnCarbonEmissionsProducts();
	}
	
	@Then("I verify the Product Index Label")
	public void i_verify_the_product_index_label() {
	    carbonEmissions.verifyProductIndexLabel();
	}


}
