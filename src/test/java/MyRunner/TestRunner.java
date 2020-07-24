package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/WorkingFolder/CustomerDetails/FeatureFiles",
		glue = {"StepDefinitions"},
		plugin = {"pretty","html:test-output"},
		monochrome = true
		
		)

public class TestRunner {

}
