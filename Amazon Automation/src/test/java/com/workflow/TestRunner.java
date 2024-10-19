package com.workflow;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/", // Path to your feature files
        glue = "com.workflow.StepDef" // Package containing step definitions
)
public class TestRunner {

}
