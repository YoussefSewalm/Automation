package CoreElements;

import org.openqa.selenium.By;

public class CheckBox extends Elements {

	public CheckBox(By locator) {
		super(locator);
		// TODO Auto-generated constructor stub
	}
	public void Check()
	{
		driver.element().click(elementLocator);
	}
	
}
