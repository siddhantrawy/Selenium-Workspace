package rediff_features;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = true,
		monochrome = true,
		features = {"src/test/resources"},
		glue = {"rediff_features"},
		plugin = {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1/json"},
		tags = "@Successful_LogIn_LogOut and @Unsuccessful_Login"
		)

public class Rediff_Runner_Junit {

}
