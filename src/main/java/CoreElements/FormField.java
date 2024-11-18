package CoreElements;

import org.openqa.selenium.By;

public class FormField extends Elements {

	public FormField(By locator) {
		super(locator);
		// TODO Auto-generated constructor stub
	}
	public void SendText(String Text)
	{
		driver.element().clear(elementLocator);
		driver.element().type(elementLocator,Text);
	}
}
