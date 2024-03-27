package com.mjatib.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.mjatib.stepDefinitions", "com.mjatib.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}