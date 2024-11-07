package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        glue = {"StepDefinition","Hook"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/json-report/cucumber.json",
                "junit:target/resources/feature"
        },
        //monochrome = true,
        tags = "@Senaryo7",
        dryRun = false//-> adımları görmeden testi gerçekleştirir
)
public class TestRunner {

}


