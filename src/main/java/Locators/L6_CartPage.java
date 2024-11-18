package Locators;

import org.openqa.selenium.By;

public class L6_CartPage {

	//Text
	public static By FirstUnitPriceInCartText=By.xpath("(//td[@class=\"align_right\"])[1]");
	public static By SecondUnitPriceInCartText=By.xpath("(//td[@class=\"align_right\"])[3]");
	public static By TotalPriceForFirstProductText=By.xpath("(//td[@class=\"align_right\"])[2]");
	public static By TotalPriceForSecondProductText=By.xpath("(//td[@class=\"align_right\"])[4]");
	public static By TotalPriceOfAllProductsBeforeTaxText=By.xpath("(//span[@class=\"bold \"])[1]");
	public static By TotalPriceOfAllProductsAfterTaxText=By.cssSelector("span[class=\"bold totalamout\"]");
	public static By CartItemsDeletedText=By.cssSelector("div[class=\"contentpanel\"]");
	//Links
	public static By FirstProductNameInCartLink=By.xpath("(//td[@class=\"align_left\"])[1]");
	public static By SecondProductNameInCartLink=By.xpath("(//td[@class=\"align_left\"])[3]");
        public static By CheckOutLink=By.id("cart_checkout1");
        public static By CheckOutLink_2=By.id("cart_checkout2");
        public static By RemoveFirstItemFromCartLink=By.xpath("(//a[@class=\"btn btn-sm btn-default\"])[1]");
        public static By RemoveSecondItemFromCartLink=By.xpath("(//a[@class=\"btn btn-sm btn-default\"])[2]");
        public static By ContinueShoppingLink=By.xpath("(//a[@href=\"https://automationteststore.com/\"])[4]");
	//Buttons
	public static By UpdateCartButton=By.id("cart_update");
	//FormField
	public static By QuantityFromCartPage=By.id("cart_quantity11621744a646c83c69d17e35569a5a3267f");
}
