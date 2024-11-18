package stepDefinitions;

import static Pages.P1_HomePage.*;
import static Pages.P2_LoginPage.*;
import static Pages.P3_RegisterPage.*;

import org.testng.annotations.Test;
import static stepDefinitions.TestBase.userData;

import com.github.javafaker.Faker;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class InvalidSignUpIgnoringMandatoryFields{

	Faker faker=new Faker();

	
    @Then("I Enter My Address , Company, City, ZipCode and Country, BUT without choosing region")
	public void i_enter_my_address_company_city_zip_code_and_country_but_without_choosing_region() 
	{
	  Company.SendText(userData.getTestData("Company"));
      Address1.SendText(userData.getTestData("Address1"));
      Address2.SendText(userData.getTestData("Address2"));
      City.SendText(userData.getTestData("City"));
      Country.SelectFromDropMenuByVisibleText(userData.getTestData("Country"));
      ZipCode.SendText(userData.getTestData("ZipCode"));
	}
	
    @Then("I Verify Sign Up Fail With Error Message")
	public void i_verify_sign_up_fail_with_error_message() 
	{
		IncorrectSignUp.VerifyTextContains("Please select a region / state!");
	}
}
