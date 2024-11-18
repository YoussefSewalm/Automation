package Pages;
import CoreElements.*;
import static Locators.L2_LoginPage.*;
public class P2_LoginPage {

	//Text
	public static Text BeforeLogin=new Text(AccountLoginText);
	public static Text AfterLogin=new Text(AccountLoggedInText);
	public static Text InvalidLogin=new Text(IncorrectLoginText);
	//FormField
	public static FormField LoginName=new FormField(LoginNameFormField);
	public static FormField LoginPassword=new FormField(LoginPasswordFormField);
	//Buttons
	public static Buttons SubmitLogin=new Buttons(SubmitLoginButton);
	public static Buttons ContinueToSignUp=new Buttons(ContinueToSignUpButton);
	//Links
	public static Links ForgotLoginPassword=new Links(ForgotLoginPasswordLink);
	public static Links ForgotLoginName=new Links(ForgotLoginNameLink);
}
