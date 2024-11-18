package Pages;
import CoreElements.*;
import static Locators.L5_ProductDetailsPage.*;
public class P5_ProductDetailsPage {
	
	//Text
	public static Text ProductNameInProductDetails=new Text(ProductNameInProductDetailsText);
	public static Text ProductPriceInProductDetails=new Text(ProductPriceInProductDetailsText);
	public static Text ProductTotalPriceFromProductDetails=new Text(ProductTotalPriceFromProductDetailsText);
	public static Text SelectSizeMessage=new Text(SelectSizeText);
	//Links
	public static Links AddProductToCartFromDetailsPage=new Links(AddProductToCartLink);
	//FormField
	public static FormField Quantity=new FormField(QuantityTextField);
	//DropMenu
	public static DropMenu ColorMenu=new DropMenu(ColorDropMenu);
	//CheckBox
	public static CheckBox Size=new CheckBox(FirstSizeCheckBox);
}
