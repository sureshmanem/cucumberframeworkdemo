package com.sureshmanem.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./FeatureFiles/parabank_datadriven.feature",
		glue="com.sureshmanem.stepdefinition",
		dryRun = false,
		monochrome = false,
		plugin = {"html:reports/cucumber-report.html","json:reports/webreport.json","pretty"}
		)
public class RunnerClass {

}
