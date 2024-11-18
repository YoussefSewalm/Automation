package Locators;

import org.openqa.selenium.By;

public class L2_LoginPage {
	 //Text
    public static By AccountLoginText=By.className("heading1");
    public static By AccountLoggedInText=By.cssSelector("div[class=\"menu_text\"]");
    public static By IncorrectLoginText=By.cssSelector("div[class=\"alert alert-error alert-danger\"]");
	//FormField
    public static By LoginNameFormField=By.id("loginFrm_loginname");
    public static By LoginPasswordFormField=By.id("loginFrm_password");
	//Buttons
    public static By SubmitLoginButton=By.xpath("(//button[@type=\"submit\"])[2]");
    public static By ContinueToSignUpButton=By.xpath("(//button[@type=\"submit\"])[1]");
	//Links
    public static By ForgotLoginPasswordLink=By.xpath("//a[contains(text(),\"password\")]");
    public static By ForgotLoginNameLink=By.xpath("//a[contains(text(),\"login\")]");

}
