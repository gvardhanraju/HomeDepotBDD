package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HuskyTruckTools;

public class HuskyTruckToolsStep {
	ExtentTest test = Hooks.reports.createTest("Husky Truck Tools Testcase");
	HuskyTruckTools huskyTruckTools = new HuskyTruckTools(test);

	@When("I scroll to the footer for Husky Brand")
	public void i_scroll_to_the_footer_for_husky_brand() {
		huskyTruckTools.scrollToFooter();	    
	}
	
	@When("I click on the Husky brand for Husky Truck Tools")
	public void i_click_on_the_husky_brand_for_husky_truck_tools() {
	    huskyTruckTools.clickOnHuskyBrand();
	}
	
	@When("I click on the Truck Tool Boxes section")
	public void i_click_on_the_truck_tool_boxes_section() {
	  huskyTruckTools.clickOnTruckToolBoxes();
	}
	
	@When("I click on the Vehicle Specific option")
	public void i_click_on_the_vehicle_specific_option() {
	   huskyTruckTools.clickOnVehicleSpecific();
	}
	
	@When("I click on the Finish Color dropdown")
	public void i_click_on_the_finish_color_dropdown() {
		huskyTruckTools.clickOnFinishColor();
	}
	
	@When("I select Matte Black")
	public void i_select_matte_black() {
		huskyTruckTools.clickOnMatteBlack();
	}
	
	@When("I click on the Apply button for Trush Tools")
	public void i_click_on_the_apply_button_for_trush_tools() {
	    huskyTruckTools.clickOnApplyBtn();
	}
	
	@Then("I should see the Matte Black Husky label displayed")
	public void i_should_see_the_matte_black_husky_label_displayed() {
		huskyTruckTools.verifyMatteBlackHuskyLabel();
	}
}
