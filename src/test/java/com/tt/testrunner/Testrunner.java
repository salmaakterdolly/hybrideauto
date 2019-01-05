package com.tt.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"Feature"},
		glue = {"com.tt.stepDef"},
		tags = {"@sampleFeature"}
		//why do i did those functions?

)


public class Testrunner extends AbstractTestNGCucumberTests {

}
