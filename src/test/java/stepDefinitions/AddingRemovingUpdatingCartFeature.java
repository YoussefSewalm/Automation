package stepDefinitions;

import static Pages.P1_HomePage.*;
import static Pages.P4_AllProductsPage.*;
import static Pages.P5_ProductDetailsPage.*;
import static Pages.P6_CartPage.*;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddingRemovingUpdatingCartFeature{
	
    @Given("I Navigate to Home Page")
	public void i_navigate_to_home_page() {
	    HomePage.click();
	}
    @And("I Choose any Product and View its details")
	public void i_choose_any_product_and_view_its_details() {
	    FirstProductName.click();
	}

    @Then("I Choose Product Size")
    public void i_choose_product_size()
    {
    	Size.Check();
    }
    @Then("I Choose Quantity")
    public void i_choose_quantity()
    {
    	Quantity.SendText("2");
    }
    @And("I Verify Product Total Price in Product details page")
    public void i_verify_product_total_price_in_product_details_page()
    {
    	ProductTotalPriceFromProductDetails.VerifyTextContains("$52.00");
    }
    @Then("I Click Add To Cart button")
	public void i_click_add_to_cart_button() {
    	AddProductToCartFromDetailsPage.click();
	}
 
    @Then("I Verify Product Total Price in The Cart")
    public void i_verify_product_total_price_in_the_cart()
    {
    	TotalPriceForFirstProductInCart.VerifyTextContains("$52.00");
    }
    @Then("I Change Product Quantity From Cart Menu")
    public void i_change_product_quantity_from_cart_menu()
    {
    	QuantityFromCart.SendText("3");
    }
    @Then("I Click Update Cart")
    public void i_click_update_cart()
    {
    	UpdateCart.click();
    }
    @Then("I Verify Product Total Price again in the Cart")
    public void i_verify_product_total_price_again_in_the_cart()
    {
    	TotalPriceForFirstProductInCart.VerifyTextContains("$78.00");
    }
    @Then("I Click Delete Cart Item button")
	public void i_click_delete_cart_item_button() {
    	RemoveFirstItemFromCart.click();
	}
    
    @Then("I Verify Cart is Empty")
	public void i_verify_cart_is_empty() {
    	CartItemsDeleted.VerifyTextContains("Your shopping cart is empty!");
	}


}
