package Pages;

import CoreElements.*; //Lazem a7ot .* fl a5er
import static Locators.L1_HomePage.*; //lazem Static w Lazem a7ot .* fl a5er

public class P1_HomePage {

	//Buttons
        public static Buttons Search=new Buttons(SearchButton);
	//Links
	public static Links HeaderHomePage=new Links(HeaderHomePageLink);
	public static Links CartPage=new Links(CartLink);
	public static Links LoginOrRegister=new Links(LoginOrRegisterLink);
	public static Links CheckOut=new Links(CheckOutLink);
	public static Links MyAccount=new Links(MyAccountLink);
	public static Links ApparelAndAccessories=new Links(ApparelAndAccessoriesLink);
	public static Links HomePage=new Links(HomePageDropMenu);
	public static Links HomeDropMenuCheckOut=new Links(HomeDropMenuCheckOutLink);
	public static Links HomeDropMenuLogin=new Links(HomeDropMenuLoginLink);
	public static Links HomeDropMenuCheckOrder=new Links(HomeDropMenuCheckOrderLink);
	public static Links HomeDropMenuCart=new Links(HomeDropMenuCartLink);
	public static Links HomeDropMenuAccount=new Links(HomeDropMenuAccountLink);
	public static Links CartDropMenuCart=new Links(CartDropMenuCartLink);
	public static Links MyAccountDropMenuLogin=new Links(MyAccountDropMenuLoginLink);
	public static Links MyAccountDropMenuCheckOrder=new Links(MyAccountDropMenuCheckOrderLink);
	public static Links CurrencyDropMenuUSDollars=new Links(CurrencyDropMenuUSDollarsLink);
	public static Links CurrencyDropMenuEuro=new Links(CurrencyDropMenuEuroLink);
	public static Links CurrencyDropMenuPoundSterling=new Links(CurrencyDropMenuPoundSterlingLink);
	public static Links ApparelAndAccessoriesDropMenuShoes=new Links(ApparelAndAccessoriesDropMenuShoesLink);
	public static Links ApparelAndAccessoriesDropMenuTshirts=new Links(ApparelAndAccessoriesDropMenuTshirtsLink);
	//FormField
	public static FormField SearchField=new FormField(SearchTextField);
	//Text
        public static Text VerifyHomePage=new Text(HomePageText);
	//DropMenu
	public static DropMenu HomeDropMenuAccountMenu=new DropMenu(HomeDropMenuAccountDropMenu);
	public static DropMenu MyAccountMenu=new DropMenu(MyAccountDropMenu);
	public static DropMenu CartMenu=new DropMenu(CartDropMenu);
	public static DropMenu HomePageMenu=new DropMenu(HomePageDropMenu);
	public static DropMenu CurrencyMenu=new DropMenu(CurrencyDropMenu);
	public static DropMenu ApparelAndAccessoriesMenu=new DropMenu(ApparelAndAccessoriesDropMenu);

}
