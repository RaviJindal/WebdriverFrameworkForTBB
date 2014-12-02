package com.seleniumtests.cucumbertest.java;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

/**
 * An example of using TestNG when the test class does not inherit from 
 * AbstractTestNGCucumberTests.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
				features = {"src/test/resources/com/seleniumtests/cucumbertest/features/"},
				//glue = {"com.seleniumtests.cucumbertest.java"},
				format = {"pretty", "html:target/cucumber-html-reports.html", "json:target/cucumber-report-composite.json"},
				monochrome = true,
				tags = {"@run", "~@wip", "~@notImplemented"}
				)
public class RunCucumberTests {
}