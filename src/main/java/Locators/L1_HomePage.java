package Locators;

import org.openqa.selenium.By;


public class L1_HomePage {

	//Buttons
    public static By SearchButton=By.cssSelector("div[class=\"button-in-search\"]");
	//Links
	public static By HeaderHomePageLink=By.xpath("(//a[@href=\"https://automationteststore.com/\"])[1]");
    public static By CartLink=By.xpath("(//a[@href=\"https://automationteststore.com/index.php?rt=checkout/cart\"])[1]");
    public static By LoginOrRegisterLink=By.xpath("(//a[@href=\"https://automationteststore.com/index.php?rt=account/login\"])[1]");
    public static By CheckOutLink=By.xpath("(//a[@href=\"https://automationteststore.com/index.php?rt=checkout/shipping\"])[1]");
    public static By MyAccountLink=By.xpath("(//a[@class=\"top menu_account\"])[1]");
    public static By ApparelAndAccessoriesLink=By.cssSelector("a[href=\"https://automationteststore.com/index.php?rt=product/category&path=68\"]");
	public static By HomePageLink=By.cssSelector("a[class=\"active menu_home\"]");
    //Home Drop Menu Links
    public static By HomeDropMenuCheckOutLink=By.xpath("(//a[@href=\"https://automationteststore.com/index.php?rt=checkout/shipping\"])[3]");
    public static By HomeDropMenuLoginLink=By.xpath("(//a[@href=\"https://automationteststore.com/index.php?rt=account/login\"])[3]");
    public static By HomeDropMenuCheckOrderLink=By.xpath("(//a[@href=\"https://automationteststore.com/index.php?rt=account/invoice\"])[2]");
    public static By HomeDropMenuCartLink=By.xpath("(//a[@href=\"https://automationteststore.com/index.php?rt=checkout/cart\"])[4]");
    public static By HomeDropMenuAccountLink=By.xpath("(//a[@class=\"top menu_account\"])[2]");
    //Cart Drop Menu Links
    public static By CartDropMenuCartLink=By.xpath("(//a[@href=\"https://automationteststore.com/index.php?rt=checkout/cart\"])[2]");
    public static By CartDropMenuCheckOutLink=By.xpath("(//a[@href=\"https://automationteststore.com/index.php?rt=checkout/shipping\"])[2]");
    //My Account Drop Menu Links
    public static By MyAccountDropMenuLoginLink=By.xpath("(//ul[@class=\"sub_menu dropdown-menu\"]/li[@data-id=\"menu_login\"])[2]");
    public static By MyAccountDropMenuCheckOrderLink=By.xpath("(//a[@href=\"https://automationteststore.com/index.php?rt=account/invoice\"])[1]");
    //Currency Drop Menu Links
    public static By CurrencyDropMenuUSDollarsLink=By.cssSelector("ul[class=\"dropdown-menu currency\"]>li>a[href=\"https://automationteststore.com/index.php?rt=index/home&currency=USD\"]");
    public static By CurrencyDropMenuEuroLink=By.cssSelector("ul[class=\"dropdown-menu currency\"]>li>a[href=\"https://automationteststore.com/index.php?rt=index/home&currency=EUR\"]");
    public static By CurrencyDropMenuPoundSterlingLink=By.cssSelector("ul[class=\"dropdown-menu currency\"]>li>a[href=\"https://automationteststore.com/index.php?rt=index/home&currency=GBP\"]"); 
    //Apparel And Accessories Drop Menu Links
    public static By ApparelAndAccessoriesDropMenuShoesLink=By.xpath("//a[contains(text(),\"Shoes\")]");
    public static By ApparelAndAccessoriesDropMenuTshirtsLink=By.xpath("//a[contains(text(),\"T-shirts\")]");
    //DropMenu
    public static By HomeDropMenuAccountDropMenu=By.xpath("(//a[@class=\"top menu_account\"])[2]");
    public static By MyAccountDropMenu=By.xpath("(//a[@class=\"top menu_account\"])[1]");
    public static By CartDropMenu=By.xpath("(//a[@href=\"https://automationteststore.com/index.php?rt=checkout/cart\"])[2]");
	public static By HomePageDropMenu=By.cssSelector("a[class=\"active menu_home\"]");
	public static By CurrencyDropMenu=By.xpath("(//a[@class=\"dropdown-toggle\"])[1]");
    public static By ApparelAndAccessoriesDropMenu=By.cssSelector("a[href=\"https://automationteststore.com/index.php?rt=product/category&path=68\"]");
	//FormField
	public static By SearchTextField=By.cssSelector("div[class=\"btn-group search-bar\"]>input");
	//Text
	public static By HomePageText=By.cssSelector("a[class=\"active menu_home\"]");

}


