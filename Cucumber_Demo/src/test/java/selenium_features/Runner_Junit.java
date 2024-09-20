package selenium_features;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = true,
		monochrome = true,
		features = {"src/test/resources"},
		glue = {"selenium_features"},
		plugin = {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1/json"},
		tags = "@myScenario"
		)

public class Runner_Junit {

}
