package CoreElements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.shaft.gui.element.internal.Actions;

public class DropMenu extends Elements{

	public DropMenu(By locator) {
		super(locator);
		// TODO Auto-generated constructor stub
	}
	
	public void HoverOnDropMenu()
	{
		Actions action=new Actions(driver.getDriver());
		action.hover(elementLocator).performElementAction();
	}
	public void SelectFromDropMenuByVisibleText(String Item)
	{
      Select select_1=new Select(driver.getDriver().findElement(elementLocator));
      select_1.selectByVisibleText(Item);
	}
	public void SelectFromDropMenuByIndex(int Index)
	{
      Select select_1=new Select(driver.getDriver().findElement(elementLocator));
      select_1.selectByIndex(Index);
	}

}
