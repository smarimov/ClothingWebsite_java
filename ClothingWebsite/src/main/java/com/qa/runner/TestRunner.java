package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
		features = "C:\\javaProject\\ClothingWebsite\\src\\main\\java\\com\\qa\\features\\automationpractice.feature", // you give the path where your feature file is available
		glue = {"com\\qa\\runner"},	// you give the path where your stepDefinition file is. Note: you can just give the name of the package instead of full path
		format = {"pretty", "html:test-outout"}, // gives it in html report format
		monochrome = true, //display the output in a proper readable format
		strict = true, //it will check if any step is not defined in a step dfinition file
		dryRun = false // to check the mapping is proper between feature file and step def file
		)

public class TestRunner {

}
