package cucumberTest;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "test/Feature"
		,glue={"main/stepDefinition"},
		plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber.json"},
				
//				dryRun = true,
				monochrome = true
		)

public class TestRunner {

}