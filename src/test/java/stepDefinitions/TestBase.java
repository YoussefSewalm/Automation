package stepDefinitions;

import java.time.Duration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.shaft.driver.SHAFT;

import Pages.DriverInitiator;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class TestBase {

    public static SHAFT.GUI.WebDriver driver;
    public static SHAFT.TestData.JSON userData;

	@Before
	public static void navigate()
	{
        userData = new SHAFT.TestData.JSON("src/test/resources/testDataFiles/DynamicData.json");
		DriverInitiator.startDriverSession();
	}
	
	
	
	
	@After
	public static void CloseBrowser()
	{
		DriverInitiator.EndDriverSession();
    }
}
