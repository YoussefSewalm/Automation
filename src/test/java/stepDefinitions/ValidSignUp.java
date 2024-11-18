package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static Pages.P1_HomePage.*;
import static Pages.P2_LoginPage.*;
import static Pages.P3_RegisterPage.*;
import static stepDefinitions.TestBase.userData;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class ValidSignUp{
	Faker faker = new Faker();
	
    @And("I Click on Continue Registration")
	public void i_click_on_continue_registration() 
	{
		ContinueToSignUp.click();
	}
	
    @And("I Enter My Personal Details Like FirstName,LastName,Email,Telephone,Fax")
	public void i_enter_my_personal_details_like_first_name_last_name_email_telephone_fax()
	{
       FirstName.SendText(userData.getTestData("FirstName"));
       LastName.SendText(userData.getTestData("LastName"));
       Email.SendText(faker.internet().emailAddress());//l 7agat 2ly ht2sar m3ya kol test b3mlha bl faker 
       //3shan kol mrh y3`yrha w bl taly l test case mtfailsh mny..3shan keda 5leto kol mrh ytl3 mo5tlf
       TelephoneNumber.SendText(userData.getTestData("Telephone"));
       Fax.SendText(userData.getTestData("Fax"));
	}
	
    @Then("I Enter My Address , Company, City, Region, ZipCode and Country")
	public void i_enter_my_address_company_city_region_zip_code_and_country() 
	{
	  Company.SendText(userData.getTestData("Company"));
      Address1.SendText(userData.getTestData("Address1"));
      Address2.SendText(userData.getTestData("Address2"));
      Country.SelectFromDropMenuByVisibleText(userData.getTestData("Country"));
      City.SendText(userData.getTestData("City"));
      Region.SelectFromDropMenuByIndex(10);
      ZipCode.SendText(userData.getTestData("ZipCode"));
	}
	
    @Then("I Enter My Login Details Like Login name,Login password and Confirm password")
	public void i_enter_my_login_details_like_login_name_login_password_and_confirm_password() 
	{
        LoginName_1.SendText(faker.name().username());//5leto bl Faker 3shan 3ayez kol mrh ytl3 b esm mo5tlf
        LoginPassword_1.SendText(userData.getTestData("LoginPw"));
        PasswordConfirm.SendText(userData.getTestData("ConfirmPw"));
	}
	
    @Then("I Choose to Subscribe for Newsletter")
	public void i_choose_to_subscribe_for_newsletter()
	{
		NewsLetterYes.Check();
	}
	
    @And("I Check That I have read and Agree to the Privacy Policy")
	public void i_check_that_i_have_read_and_agree_to_the_privacy_policy()
	{
        PrivacyPolicy.Check();
	}
	
	@Then("I Click On Continue")
	public void i_click_on_continue()
	{
		ContinueRegistration.click();
	}

	
    @Then("I Verify Account Created Successfully")
	public void i_verify_account_created_successfully() 
	{
		VerifyAccountCreated.VerifyTextContains("Welcome");
	}

}
