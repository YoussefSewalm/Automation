package Pages;

import com.shaft.driver.SHAFT;

import CoreElements.Elements;

public class DriverInitiator {

    public static SHAFT.GUI.WebDriver driver;

    public static void startDriverSession(){
        String siteURL = "https://automationteststore.com/";
        String siteTitle = "A place to practice your automation skills!";
        // Create new driver object
        driver = new SHAFT.GUI.WebDriver();
        // Go to the website
        Elements.setDriver(driver);

        driver.browser().navigateToURL(siteURL);
        // To ensure that the site loaded and there is no problem in the connection
        driver.verifyThat().browser().title().isEqualTo(siteTitle).perform();
    }

    public static void EndDriverSession(){
        // Quit the WebDriver instance
        driver.quit();
    }
}
