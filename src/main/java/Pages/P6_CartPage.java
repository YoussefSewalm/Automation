package Pages;
import CoreElements.*;

import static Locators.L6_CartPage.*;
public class P6_CartPage {
	
	//Text
	public static Text FirstUnitPriceInCart=new Text(FirstUnitPriceInCartText);
	public static Text SecondUnitPriceInCart=new Text(SecondUnitPriceInCartText);
	public static Text TotalPriceForFirstProductInCart=new Text(TotalPriceForFirstProductText);
	public static Text TotalPriceForSecondProductInCart=new Text(TotalPriceForSecondProductText);
	public static Text TotalPriceOfAllProductsBeforeTaxInCart=new Text(TotalPriceOfAllProductsBeforeTaxText);
	public static Text TotalPriceOfAllProductsAfterTaxInCart=new Text(TotalPriceOfAllProductsAfterTaxText);
	public static Text CartItemsDeleted=new Text(CartItemsDeletedText);
	//Links
	public static Links FirstProductNameInCart=new Links(FirstProductNameInCartLink);
	public static Links SecondProductNameInCart=new Links(SecondProductNameInCartLink);
	public static Links TopCheckOut=new Links(CheckOutLink);
	public static Links BottomCheckOut=new Links(CheckOutLink_2);
	public static Links RemoveFirstItemFromCart=new Links(RemoveFirstItemFromCartLink);
	public static Links RemoveSecondItemFromCart=new Links(RemoveSecondItemFromCartLink);
	public static Links ContinueShopping=new Links(ContinueShoppingLink);
	//Buttons
	public static Buttons UpdateCart=new Buttons(UpdateCartButton);
	//FormField
	public static FormField QuantityFromCart=new FormField(QuantityFromCartPage);
}
