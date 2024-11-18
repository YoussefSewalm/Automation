package Pages;
import CoreElements.*;
import static Locators.L4_AllProductsPage.*;

public class P4_AllProductsPage {

	//Text
	public static Text Verifyproductpage=new Text(VerifyProductPage);
	public static Text First_Product_Price=new Text(FirstProductPrice);
	public static Text Third_Product_Price=new Text(ThirdProductPrice);
	public static Text ThirdProductName=new Text(ThirdProductNameText);
	//Links
	public static Links FirstProductName=new Links(FirstProductNameLink);
	public static Links AddProductToCart=new Links(AddProductToCartLink);
	public static Links ViewProduct=new Links(ViewProductLink);
	public static Links WriteReview=new Links(WriteReviewLink);
	//DropMenu
	public static DropMenu Sort=new DropMenu(SortDropMenu);
	//Hover
	public static Hover FirstProduct=new Hover(FirstProductHover);
	public static Hover ThirdProduct=new Hover(ThirdProductHover);
}
