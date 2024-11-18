package stepDefinitions;

import static Pages.P1_HomePage.*;
import static Pages.P4_AllProductsPage.*;
import static Pages.P5_ProductDetailsPage.*;
import static stepDefinitions.TestBase.userData;

import org.testng.annotations.Test;

import io.cucumber.java.en.Then;

public class InvalidPurchaseIgnoringSelectSize{
	
    @Then("I Verify Failure of Adding to cart with error message")    
    public void i_verify_failure_of_adding_to_cart_with_error_message()
    {
    	SelectSizeMessage.VerifyTextContains("UK size: Please select all required options!");
    }
   
}
