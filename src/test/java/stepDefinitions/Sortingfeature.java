package stepDefinitions;
import static Pages.P1_HomePage.*;
import static Pages.P4_AllProductsPage.*;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Sortingfeature{	
	
	@Then("I Hover on Apparel and Accessories Category")
	public void i_hover_on_apparel_and_accessories_category() {
		ApparelAndAccessoriesMenu.HoverOnDropMenu();
	}

	@Then("I Click On Shoes Category")
	public void i_click_on_shoes_category() {
		ApparelAndAccessoriesDropMenuShoes.click();
	}

	@Then("I Try first Sorting way By Name From A To Z")
	public void i_try_first_sorting_way_by_name_from_a_to_z() {
		Sort.SelectFromDropMenuByVisibleText("Name A - Z");
	}

	@Then("I Verify First Sorting Done Successfully")
	public void i_verify_first_sorting_done_successfully() {
		FirstProductName.VerifyTextContains("FIORELLA PURPLE PEEP TOES");
	}

	@Then("I Try second Sorting way By Name From Z to A")
	public void i_try_second_sorting_way_by_name_from_z_to_a() {
		Sort.SelectFromDropMenuByVisibleText("Name Z - A");
	}

	@Then("I Verify Second Sorting Done Successfully")
	public void i_verify_second_sorting_done_successfully() {
		FirstProductName.VerifyTextContains("WOMENS HIGH HEEL POINT TOE STILETTO SANDALS ANKLE STRAP COURT SHOES");

	}

	@Then("I Try the third Sorting Way By Price from Low To High")
	public void i_try_the_third_sorting_way_by_price_from_low_to_high() {
		Sort.SelectFromDropMenuByVisibleText("Price Low > High");
	}

	@Then("I Verify Third Sorting Done Successfully")
	public void i_verify_third_sorting_done_successfully() {
		First_Product_Price.VerifyTextContains("$26.00");
	}

	@Then("I Try The Last Sorting Way By Price From High to Low")
	public void i_try_the_last_sorting_way_by_price_from_high_to_low() {
		Sort.SelectFromDropMenuByVisibleText("Price High > Low");
	}

	@Then("I Verify Last Sorting Done Successfully")
	public void i_verify_last_sorting_done_successfully() {
		First_Product_Price.VerifyTextContains("$110.00");
	}

}
