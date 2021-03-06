package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\workspace\\CucumberPOM_BDD\\src\\main\\java\\com\\qa\\feature\\hrm.feature",
				 glue= {"com\\qa\\stepDefinitions"},
				 format={"pretty", "html:test-output"},
				 monochrome=true,
				 strict=true,
				 dryRun=false
)
public class TestRunner {

}
