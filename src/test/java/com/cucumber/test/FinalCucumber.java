package com.cucumber.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = { "json:target/cucumber.json" },
		features = { "src/main/resources/final_003.feature" }, 
		glue = { "com.cucumber.test" }
		
		)


public class FinalCucumber extends AbstractTestNGCucumberTests{

	

}
