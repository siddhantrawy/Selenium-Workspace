package selenium_features;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun = true,
		monochrome = true,
		features = {"src/test/resources"},
		glue = {"selenium_features"},
		plugin = {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1/json"},
		tags = "@myScenario"
		)

public class Runner_Testng extends AbstractTestNGCucumberTests{

}
