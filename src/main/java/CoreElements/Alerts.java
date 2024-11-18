package CoreElements;

import java.time.Duration;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import com.shaft.driver.SHAFT;

public class Alerts {
	
    public static SHAFT.GUI.WebDriver driver;

	public void AlertAccept()
	{
		Wait<WebDriver> wait=new FluentWait<>(driver.getDriver())
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofMillis(300))
				.ignoring(NoAlertPresentException.class);
		
		wait.until(
				d -> {
				   driver.getDriver().switchTo().alert();
				   return true;
		         	});
		
		driver.getDriver().switchTo().alert().accept();
	}
	public void AlertConfirmation(String ExpectedAlertMessage)
	{
		Wait<WebDriver> wait=new FluentWait<>(driver.getDriver())
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofMillis(300))
				.ignoring(NoAlertPresentException.class);
		
		wait.until(
				d -> {
				   driver.getDriver().switchTo().alert();
				   return true;
		         	});
		String ActualAlertMessage=driver.getDriver().switchTo().alert().getText();
		Assert.assertEquals(ActualAlertMessage, ExpectedAlertMessage);
	}
	
	

}
