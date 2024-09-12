package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
        "src/test/java/featureFile"},
        glue = "stepDefinition",
        monochrome = true,
        plugin = {"json:target/jsonReports/cucumber.json"}
)
public class runner {
}
