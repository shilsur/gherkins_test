package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/loginChrome/login.feature", plugin = { "pretty","json:target/cucumberreports.json" },glue={"StepDefinition"})

public class TestRunner {
	
	
}