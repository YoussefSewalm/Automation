package stepDefinitions;

import static Pages.P1_HomePage.*;
import static Pages.P2_LoginPage.*;
import static Pages.P4_AllProductsPage.*;
import static Pages.P5_ProductDetailsPage.*;
import static Pages.P6_CartPage.*;
import static Pages.P7_CheckOutPage.*;
import static stepDefinitions.TestBase.userData;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CheckOutFeatureCases{
	
    @Then("I Choose One Quantity")
    public void i_choose_one_quantity()
    {
    	Quantity.SendText("1");
    }
    @And("I Verify Shoes Product Total Price in The Cart")
    public void i_verify_shoes_product_total_prince_in_the_cart()
    {
    	TotalPriceForFirstProductInCart.VerifyTextContains("$26.00");
    }

    @Then("I Hover Again on Apparel and Accessories Category")
	public void i_hover_again_on_apparel_and_accessories_category() {
		ApparelAndAccessoriesMenu.HoverOnDropMenu();
	}
	
    @And("I Click On T-shirts Category")
	public void i_click_on_t_shirts_category() {
		ApparelAndAccessoriesDropMenuTshirts.click();
	}
	
    @And("I Choose any Tshirt Product and View its details")
	public void i_choose_any_tshirt_product_and_view_its_details() {
		ThirdProductName.click();
	}
	
    @Then("I Click Add To Cart")
	public void i_click_add_to_cart() {
    	AddProductToCartFromDetailsPage.click();
	}
	
    @And("I Verify Tshirt Product Total Price in The Cart")
	public void i_verify_tshirt_product_total_price_in_the_cart() {
    	TotalPriceForSecondProductInCart.VerifyTextContains("$32.00");
	}
	
    @Then("I Verify Total Products Price Before Tax in The Cart")
	public void i_verify_total_products_price_before_tax_in_the_cart() {
		TotalPriceOfAllProductsBeforeTaxInCart.VerifyTextContains("$58.00");
	}
	
    @Then("I Verify Total Products Price After Tax in The Cart")
	public void i_verify_total_products_price_after_tax_in_the_cart() {
		TotalPriceOfAllProductsAfterTaxInCart.VerifyTextContains("$60.00");
	}
	
    @And("I Click CheckOut")
	public void i_click_check_out() {
		TopCheckOut.click();
	}
	
    @Then("I Verify  Navigating To CheckOut Page Successfully")
	public void i_verify_navigating_to_check_out_page_successfully() {
		CheckOutPage.VerifyTextContains("CHECKOUT CONFIRMATION");
	}
	
    @And("I Verify Name and Mobile Shipping Details")
	public void i_verify_name_and_mobile_shipping_details() {
		NameAndMobileShippingDetails.VerifyTextContains(userData.getTestData("LastName"));
	}
	
    @And("I Verify Country and City Shipping Details")
	public void i_verify_country_and_city_shipping_details() {
		CountryAndCityShippingDetails.VerifyTextContains(userData.getTestData("Address2"));
	}
	
    @And("I Verify Name and Mobile Payment Details")
	public void i_verify_name_and_mobile_payment_details() {
		NameAndMobilePaymentDetails.VerifyTextContains(userData.getTestData("FirstName"));
	}
	
    @And("I Verify Country and City Payment Details")
	public void i_verify_country_and_city_payment_details() {
		CountryAndCityPaymentDetails.VerifyTextContains(userData.getTestData("Address1"));
	}
	
    @And("I Verify Total Products Price Before Tax in Checkout")
	public void i_verify_total_products_price_before_tax_in_checkout() {
		TotalProductsPriceBeforeTaxInCheckOut.VerifyTextContains("$58.00");
	}
	
    @And("I Verify Total Products Price After Tax in Checkout")
	public void i_verify_total_products_price_after_tax_in_checkout() {
		TotalProductsPriceAfterTaxInCheckOut.VerifyTextContains("$60.00");
	}
	
    @Then("I Click Confirm Order")
	public void i_click_confirm_order() {
		ConfirmOrder.click();
	}
    @And("I Verify Order is Processed Successfully")
	public void i_verify_order_is_processed_successfully() {
		OrderCompleted.VerifyTextContains("YOUR ORDER HAS BEEN PROCESSED!");
	}
}
