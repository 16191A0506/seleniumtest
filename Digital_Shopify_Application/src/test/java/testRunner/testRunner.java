package testRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"src/test/resources/features"},
        glue = {"stepDefinitions"},
        plugin = {"pretty","html:Report1"},
        tags = {"@UITest"},
        dryRun = false,
        monochrome = true

)
public class testRunner {

}
