package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "usage", "html:target/cucumber-reports" } ,
        features = "src/test/resources/features",
        glue = "stepDefinition",
        monochrome = true)

public class TestRunner
{
}