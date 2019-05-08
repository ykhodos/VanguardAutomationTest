package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty", "html:reports/cucumber-html-report", "json:reports/cucumber.json" },
    tags = {"@run","~@ignore"},
    features = {"src/test/resources"},
    glue = {"steps"}
)

public class TestRunner {

}
