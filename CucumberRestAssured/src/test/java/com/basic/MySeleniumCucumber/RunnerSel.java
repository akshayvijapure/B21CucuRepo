package com.basic.MySeleniumCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/com/basic/MySeleniumCucumber/MyFeatureSelenium.feature"},
		glue = {"com/basic/MySeleniumCucumber/"},
		monochrome=true
		
		)

public class RunnerSel {

}
