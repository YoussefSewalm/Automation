package TestRunner;



import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features={"src/main/resources"},
		glue= {"stepDefinitions"},
		plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
		,tags="@Smoke"
)
		
@Test
public class TestRunner extends AbstractTestNGCucumberTests  {

	
}
