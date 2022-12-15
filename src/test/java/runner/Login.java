package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/feature",
        glue = "steps"
)

public class Login extends AbstractTestNGCucumberTests {
}
