package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",  // Path to feature files

        glue ={ "Loginstep"},  // Package where step definitions are located (can be different from the TestRunner package)
        monochrome = true,  // For better readability in console output
        plugin = {
                "pretty",  // Standard output
                "html:target/cucumber-reports.html",  // HTML report
                "json:target/cucumber-reports/cucumber.json"  // JSON report
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
