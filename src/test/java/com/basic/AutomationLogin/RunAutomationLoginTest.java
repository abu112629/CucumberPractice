package com.basic.AutomationLogin;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

		@RunWith(Cucumber.class)
		@CucumberOptions(
				
				monochrome=true,
				//dryRun=true,
				features={"src/test/resources/com/basic/AutomationFF/"},
				glue= {"com/basic/AutomationLogin/"},
				plugin= {"pretty",
						 "html:target/cucumber-htmlreport",
						 "json:target/cucumber-report.json",
						
					}
				)


		public class RunAutomationLoginTest {

}
