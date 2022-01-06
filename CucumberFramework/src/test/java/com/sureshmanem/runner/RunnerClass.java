package com.sureshmanem.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./FeatureFiles/parabank_parameter.feature",glue="com.sureshmanem.stepdefinition")
public class RunnerClass {

}
