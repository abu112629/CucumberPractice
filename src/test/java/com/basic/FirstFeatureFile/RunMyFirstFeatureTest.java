package com.basic.FirstFeatureFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

		@RunWith(Cucumber.class)
		@CucumberOptions(
				
				monochrome=true,
				//dryRun=true,
				features={"src/test/resources/com/basic/FirstFeatureFF/"},
				glue= {"com/basic/FirstFeatureFile/"},
				plugin= {"pretty",
						 "html:target/cucumber-htmlreport",
						 "json:target/cucumber-report.json",
						
					}
				)


		public class RunMyFirstFeatureTest {

}
