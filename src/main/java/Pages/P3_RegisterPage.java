package Pages;
import CoreElements.*;
import static Locators.L3_RegisterPage.*;
public class P3_RegisterPage {

   //Texts
   public static Text VerifyRegisterPage=new Text(VerifyRegisterPageText);
   public static Text VerifyAccountCreated=new Text(VerifyAccountCreatedText);
   public static Text IncorrectSignUp=new Text(IncorrectSignUpText);
   //Links
   public static Links LoginPage=new Links(LoginPageLink);
   //Buttons
   public static Buttons ContinueRegistration=new Buttons(ContinueRegistrationButton);
   //FormField
   public static FormField FirstName=new FormField(FirstNameTextField);
   public static FormField LastName=new FormField(LastNameTextField);
   public static FormField Email=new FormField(EmailTextField);
   public static FormField TelephoneNumber=new FormField(TelephoneNumberTextField);
   public static FormField Fax=new FormField(FaxTextField);
   public static FormField Company=new FormField(CompanyTextField);
   public static FormField Address1=new FormField(Address1TextField);
   public static FormField Address2=new FormField(Address2TextField);
   public static FormField City=new FormField(CityTextField);
   public static FormField ZipCode=new FormField(ZipCodeTextField);
   public static FormField LoginName_1=new FormField(LoginNameTextField);
   public static FormField LoginPassword_1=new FormField(LoginPasswordTextField);
   public static FormField PasswordConfirm=new FormField(PasswordConfirmTextField);
   //DropMenu
   public static DropMenu Region=new DropMenu(RegionDropMenu);
   public static DropMenu Country=new DropMenu(CountryDropMenu);
   //CheckBox
   public static CheckBox NewsLetterYes=new CheckBox(NewsletterYesCheckBox);
   public static CheckBox NewsLetterNo=new CheckBox(NewsLetterNoCheckBox);
   public static CheckBox PrivacyPolicy=new CheckBox(PrivacyPolicyCheckBox);
}
