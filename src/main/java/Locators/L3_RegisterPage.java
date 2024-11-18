package Locators;

import org.openqa.selenium.By;

public class L3_RegisterPage {
	
	//Text
	public static By VerifyRegisterPageText=By.cssSelector("span[class=\"maintext\"]");
	public static By VerifyAccountCreatedText=By.cssSelector("div[class=\"menu_text\"]");
	public static By IncorrectSignUpText=By.cssSelector("div[class=\"alert alert-error alert-danger\"]");
	//Links
	public static By LoginPageLink=By.xpath("//a[contains(text(),\"login page\")]");
	//Buttons
	public static By ContinueRegistrationButton=By.cssSelector("button[title=\"Continue\"]");
	//FormField
        public static By FirstNameTextField=By.id("AccountFrm_firstname");
	public static By LastNameTextField=By.id("AccountFrm_lastname");
	public static By EmailTextField=By.id("AccountFrm_email");
	public static By TelephoneNumberTextField=By.id("AccountFrm_telephone");
	public static By FaxTextField=By.id("AccountFrm_fax");
	public static By CompanyTextField=By.id("AccountFrm_company");
	public static By Address1TextField=By.id("AccountFrm_address_1");
	public static By Address2TextField=By.id("AccountFrm_address_2");
	public static By CityTextField=By.id("AccountFrm_city");
	public static By ZipCodeTextField=By.id("AccountFrm_postcode");
	public static By LoginNameTextField=By.id("AccountFrm_loginname");
	public static By LoginPasswordTextField=By.id("AccountFrm_password");
	public static By PasswordConfirmTextField=By.id("AccountFrm_confirm");
	//DropMenu
	public static By RegionDropMenu=By.id("AccountFrm_zone_id");
	public static By CountryDropMenu=By.cssSelector("select[name=\"country_id\"]");
	//CheckBox
	public static By NewsletterYesCheckBox=By.id("AccountFrm_newsletter1");
	public static By NewsLetterNoCheckBox=By.id("AccountFrm_newsletter0");
	public static By PrivacyPolicyCheckBox=By.id("AccountFrm_agree");
}
