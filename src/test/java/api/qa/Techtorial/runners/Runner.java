package api.qa.Techtorial.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", //content_root
        glue = "api/qa/Techtorial/stepdefinitions",//source_root
        dryRun = false,
        tags = "@regression",
        plugin = {"pretty","html:target/apiReport.html","rerun:target/apiFailedTests.txt",
        "json:target/cucumber-reports/cucumber.json"}
)
public class Runner {
}
