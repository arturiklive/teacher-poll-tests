package com.edurio.testrunners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/scenarios"},
        glue = {"com.edurio.steps"}
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}