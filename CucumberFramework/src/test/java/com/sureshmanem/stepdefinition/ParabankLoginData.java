package com.sureshmanem.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParabankLoginData {
	
	public WebDriver driver;
	
	@Given("navigate to parabank url")
	public void navigate_to_parabank_url() {
		// Set System Property
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

				// Create Driver object in Driver interface
				driver = new ChromeDriver();

				// Maximize the window
				driver.manage().window().maximize();

				// Deleting all the cookies
				driver.manage().deleteAllCookies();

				// Launch the URL
				driver.get("https://parabank.parasoft.com/parabank/index.htm");

				System.out.println("Navigate to application");
	}

	@When("enter valid {string} and {string}")
	public void enter_valid_and(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		System.out.println("Enter valid username and password");
	}

	@And("login to the application")
	public void login_to_the_application() {
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		System.out.println("Click on Login button");
	}

	@Then("verify login is successful")
	public void verify_login_is_successful() {
		boolean status = driver.findElement(By.partialLinkText("New Account")).isDisplayed();
		if (status) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login unsuccessful");
		}
		System.out.println("Login to be successful");
	}

	@And("application logout")
	public void application_logout() {
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
		System.out.println("Logout the application");
	}

	@And("application close")
	public void application_close() {
		driver.close();
		System.out.println("Close the browser");
	}


}
