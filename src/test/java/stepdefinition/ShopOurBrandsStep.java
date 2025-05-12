package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ShopOurBrands;

public class ShopOurBrandsStep {
	ExtentTest test = Hooks.reports.createTest("Shop Our Brands Testcase");
	ShopOurBrands shopOurBrands = new ShopOurBrands(test);
	
	@When("I scroll to the footer for Shop Our Brands")
	public void i_scroll_to_the_footer_for_shop_our_brands() { 
		shopOurBrands.scrollToFooter();
	}
	
	@When("I click on the Shop Our Brands section for Shop Our Brands")
	public void i_click_on_the_shop_our_brands_section_for_shop_our_brands() {
		shopOurBrands.clickOnShopOurBrands();
	}
	
	@When("I click on the Anvil brand for Shop Our Brands")
	public void i_click_on_the_anvil_brand_for_shop_our_brands() {
	    shopOurBrands.clickOnAnvilBrand();
	}
	
	@When("I scroll down to reach the sorting options for Shop Our Brands")
	public void i_scroll_down_to_reach_the_sorting_options_for_shop_our_brands() {
	    shopOurBrands.scroll(0, 200);
	}
	
	@When("I click on the Sort By dropdown for Shop Our Brands")
	public void i_click_on_the_sort_by_dropdown_for_shop_our_brands() {
	    shopOurBrands.clickOnSortByDropdown();
	}
	
	@When("I select Price Low to High for Shop Our Brands")
	public void i_select_price_low_to_high_for_shop_our_brands() {
		shopOurBrands.selectPriceLowToHigh();
	}
	
	@Then("I should see the Price Low to High label displayed for Shop Our Brands")
	public void i_should_see_the_price_low_to_high_label_displayed_for_shop_our_brands() {
	    shopOurBrands.verifyPriceLowToHighLabel();
	}
	
}
