package CoreElements;

import java.time.Duration;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import com.shaft.driver.SHAFT;

public class Alerts {
	//hena 3shan l alerts msh 3amla extend ll Elements class f lazm a3rf l driver tany w a3mlo Setter
	
    public static SHAFT.GUI.WebDriver driver;

	public void AlertAccept()
	{
		//Using FluentWait : hena l WebDriver 2ly 3mltlo Import bta3 l Org,Selenium msh l Shaft
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
		//l Fluent Wait b2a by3ml eh??,,badelo wa2t timeout 3ady 10sec msln..w byfdl y3ml Polling kol 300Ms
		//w y5osh fl Until w yshof hal ana 3malt switch to alert fe3ln wla la2 ya3ny hal fe3ln l alert
		//geh wla lesa.. law geh hy3ml switch 3leh w y3ml return true w y5rog mn l loop deh aw l function deh
		//w ykml 3ady w y3ml accept.....tb law mgash lesa hyrg3 tany ystna 300ms kman w b3d keda yro7 ll 
		//Until tany w hakza		
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
