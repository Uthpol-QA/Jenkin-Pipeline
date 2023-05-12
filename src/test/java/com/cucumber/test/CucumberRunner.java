package com.cucumber.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = { "json:target/cucumber.json" }, 
		features = { "src/main/resources/Login.feature" }, 
		glue = { "com.cucumber.test" })

public class CucumberRunner extends AbstractTestNGCucumberTests {
}
