package com.perscholas.cucumber_basics.automation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/javas/com/perscholas/cucumber_basics/features/SignupTest.feature", 
		glue = "src/test/java/com/perscholas/cucumber_basics/step_definitions")
public class SignupTestRunner {

}


