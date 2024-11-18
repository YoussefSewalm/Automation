package Locators;

import org.openqa.selenium.By;


public class L5_ProductDetailsPage {
	
	//Text
	public static By ProductNameInProductDetailsText=By.className("bgnone");
	public static By ProductPriceInProductDetailsText=By.className("productfilneprice");
    public static By ProductTotalPriceFromProductDetailsText=By.cssSelector("label[class=\"control-label\"]>span[class=\"total-price\"]");
    public static By SelectSizeText=By.cssSelector("div[class=\"alert alert-error alert-danger\"]");
	//Links
	public static By AddProductToCartLink=By.cssSelector("a[class=\"cart\"]");
	//FormField
	public static By QuantityTextField=By.id("product_quantity");
	//DropMenu
	public static By ColorDropMenu=By.id("option345");
	//CheckBox
	public static By FirstSizeCheckBox=By.id("option344747");
}
