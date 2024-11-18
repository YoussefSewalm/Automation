package stepDefinitions;

import static Pages.P1_HomePage.*;
import static Pages.P2_LoginPage.*;
import static Pages.P3_RegisterPage.*;

import org.testng.annotations.Test;
import static stepDefinitions.TestBase.userData;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class InvalidSignUpUsingPreviousRegEmail{

    @And("I Enter My Personal Details Like FirstName,LastName,PREVIOUSLY REGISTERED Email,Telephone,Fax")
	public void i_enter_my_personal_details_like_first_name_last_name_previously_registered_email_telephone_fax()
	{
       FirstName.SendText(userData.getTestData("FirstName"));
       LastName.SendText(userData.getTestData("LastName"));
       Email.SendText(userData.getTestData("Email"));
       TelephoneNumber.SendText(userData.getTestData("Telephone"));
       Fax.SendText(userData.getTestData("Fax"));
	}	
	
    @Then("I Verify Sign Up Fail With Email Already Reg Error Message")
	public void i_verify_sign_up_fail_with_email_already_reg_error_message() 
	{
		IncorrectSignUp.VerifyTextContains("Error: E-Mail Address is already registered!");
	}
}
