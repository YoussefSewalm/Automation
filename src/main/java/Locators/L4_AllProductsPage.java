package Locators;

import org.openqa.selenium.By;

public class L4_AllProductsPage {
   
	//Text
	public static By VerifyProductPage=By.cssSelector("h1[class=\"heading1\"]>span[class=\"maintext\"]");
	public static By FirstProductPrice=By.xpath("(//div[@class=\"oneprice\"])[1]");
	public static By ThirdProductPrice=By.xpath("(//div[@class=\\\"oneprice\\\"])[3]");
	public static By ThirdProductNameText=By.xpath("(//a[@class=\"prdocutname\"])[3]");
	//Links
	public static By FirstProductNameLink=By.xpath("(//a[@class=\"prdocutname\"])[1]");
	public static By AddProductToCartLink=By.xpath("(//a[@title=\"Add to Cart\"])[1]");
	public static By ViewProductLink=By.xpath("(//div[@class=\"shortlinks\"])[1]/a[1]");
	public static By WriteReviewLink=By.xpath("(//div[@class=\"shortlinks\"])[1]/a[2]");	
	//DropMenu
	public static By SortDropMenu=By.cssSelector("select[name=\"sort\"]");
	//Hover
	public static By FirstProductHover=By.xpath("(//div[@class=\"thumbnail\"]/a/img)[1]");
	public static By ThirdProductHover=By.xpath("(//div[@class=\"thumbnail\"]/a/img)[3]");

	
}
