package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static Pages.P1_HomePage.*;
import static Pages.P2_LoginPage.*;
import static stepDefinitions.TestBase.userData;

import org.testng.annotations.Test;
public class ValidLogin{
	
	@Given("I Navigate To Home Page")
	public void i_navigate_to_home_page()
	{
		HomePage.click();
	}
	
    @When("I Verify Navigating to Home Page Successfully")
	public void i_verify_navigating_to_home_page_successfully() 
	{
		VerifyHomePage.VerifyTextContains("HOME");
	}
	
	@When("I Hover on Home Page")
	public void i_hover_on_home_page() {
		HomePageMenu.HoverOnDropMenu();
	}

	@Then("I Hover on Account")
	public void i_hover_on_account() {
		HomeDropMenuAccountMenu.HoverOnDropMenu();

	}

	@Then("I Click On Login")
	public void i_click_on_login() {
		MyAccountDropMenuLogin.click();
	}

	@Then("I Verify Navigating to Login Page Successfully")
	public void i_verify_navigating_to_login_page_successfully() {
		BeforeLogin.VerifyTextContains("ACCOUNT LOGIN");
	}

	@Then("I Enter Valid Email")
	public void i_enter_valid_email() {
		LoginName.SendText(userData.getTestData("LoginName"));
	}

	@Then("I Enter Valid Password")
	public void i_enter_valid_password() {
		LoginPassword.SendText(userData.getTestData("LoginPw"));
	}

	@Then("I Click on Submit Login")
	public void i_click_on_submit_login() {
		SubmitLogin.click();
	}

	@Then("I Verify Logged in Successfully")
	public void i_verify_logged_in_successfully() {
		AfterLogin.VerifyTextContains("Welcome");
	}
}
