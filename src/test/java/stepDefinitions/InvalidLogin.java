package stepDefinitions;

import static Pages.P1_HomePage.*;
import static Pages.P2_LoginPage.*;

import org.testng.annotations.Test;
import static stepDefinitions.TestBase.userData;

import com.github.javafaker.Faker;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidLogin{
	Faker faker=new Faker();
	
	@Then("I Enter InValid Email")
	public void i_enter_in_valid_email() {
		LoginName.SendText(faker.name().firstName());
	}

	@Then("I Enter Password")
	public void i_enter_password() {
		LoginPassword.SendText(userData.getTestData("LoginPw"));
	}

	@Then("I Verify Error Message")
	public void i_verify_error_message() {
    	InvalidLogin.VerifyTextContains("Error: Incorrect login or password provided.");

	}


}
