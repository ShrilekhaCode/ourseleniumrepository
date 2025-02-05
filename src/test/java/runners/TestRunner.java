package runners;

import org.testng.annotations.BeforeMethod;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
    features = "src/test/resources/features", // Relative Path to feature files
    glue = "stepDefinitions",                //  Package where step definitions are located
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
	@BeforeMethod
	public void setup() {
        // Setup code here (optional, for example initializing WebDriver)
        System.out.println("Running before scenario");
    }
}