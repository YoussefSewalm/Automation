package CoreElements;

import org.openqa.selenium.By;
import com.shaft.gui.element.internal.Actions;

public class Hover extends Elements {

	public Hover(By locator) {
		super(locator);
		// TODO Auto-generated constructor stub
	}
	public void HoverOn()
	{
		Actions action=new Actions(driver.getDriver());
		action.hover(elementLocator).performElementAction();
	}

}
