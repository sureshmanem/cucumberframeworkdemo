package com.sureshmanem.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParabankLoginScenario {
	
	@Given("user is navigating to the parabank url")
	public void user_is_navigating_to_the_parabank_url() {
	    System.out.println("Navigating to URL");
	}

	@When("user provides valid username and password")
	public void user_provides_valid_username_and_password() {
	    System.out.println("Enter username and password");
	}
	
	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Click on Login button");
	}

	@Then("login to be successful")
	public void login_to_be_successful() {
	   System.out.println("Login to be successful");
	}

	@And("close the application")
	public void close_the_application() {
	    System.out.println("Logout the application");
	}

}
