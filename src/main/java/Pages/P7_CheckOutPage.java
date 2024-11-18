package Pages;
import CoreElements.*;
import static Locators.L7_CheckOutPage.*;

public class P7_CheckOutPage {
	
	//Text
	public static Text CheckOutPage=new Text(VerifyCheckOutPageText);
	public static Text OrderCompleted=new Text(OrderCompletedText);
	public static Text NameAndMobileShippingDetails=new Text(NameAndMobileShippingDetailsText);
	public static Text CountryAndCityShippingDetails=new Text(CountryAndCityShippingDetailsText);
	public static Text NameAndMobilePaymentDetails=new Text(NameAndMobilePaymentDetailsText);
	public static Text CountryAndCityPaymentDetails=new Text(CountryAndCityPaymentDetailsText);
	public static Text TotalProductsPriceBeforeTaxInCheckOut=new Text(TotalProductsPriceBeforeTaxInCheckOutText);
	public static Text TotalProductsPriceAfterTaxInCheckOut=new Text(TotalProductsPriceAfterTaxInCheckOutText);
	//Links
	public static Links InvoicePage=new Links(InvoicePageLink);
	public static Links ContinueToShop=new Links(ContinueToShopLink);
	//Buttons
	public static Buttons ConfirmOrder=new Buttons(ConfirmOrderButton);
}
