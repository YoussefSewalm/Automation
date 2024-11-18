package Locators;

import org.openqa.selenium.By;

public class L7_CheckOutPage {

	//Text
	public static By VerifyCheckOutPageText=By.cssSelector("span[class=\"maintext\"]");
	public static By OrderCompletedText=By.cssSelector("h1[class=\"heading1\"]>span[class=\"maintext\"]");
	public static By NameAndMobileShippingDetailsText=By.xpath("(//td[@class=\"align_left\"])[1]");
	public static By CountryAndCityShippingDetailsText=By.xpath("(//td[@class=\"align_left\"])[2]");
	public static By NameAndMobilePaymentDetailsText=By.xpath("(//td[@class=\"align_left\"])[4]");
	public static By CountryAndCityPaymentDetailsText=By.xpath("(//td[@class=\"align_left\"])[5]");
	public static By TotalProductsPriceBeforeTaxInCheckOutText=By.xpath("(//span[@class=\"cart_block_total\"])[8]");
	public static By TotalProductsPriceAfterTaxInCheckOutText=By.xpath("(//span[@class=\"cart_block_total\"])[12]");
	//Links
	public static By InvoicePageLink=By.xpath("//a[contains(text(),\"invoice page\")]");
	public static By ContinueToShopLink=By.cssSelector("a[title=\"Continue\"]");
	//Button
	public static By ConfirmOrderButton=By.id("checkout_btn");		
}
