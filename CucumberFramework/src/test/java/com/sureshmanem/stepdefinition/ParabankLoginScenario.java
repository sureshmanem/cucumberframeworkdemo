package com.sureshmanem.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParabankLoginScenario {

	public WebDriver driver;

	@Given("user is navigating to the parabank url")
	public void user_is_navigating_to_the_parabank_url() {
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

	@When("user provides valid username and password")
	public void user_provides_valid_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("surezh1984");
		driver.findElement(By.name("password")).sendKeys("Testdemo1234");
		System.out.println("Enter valid username and password");
	}

	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		System.out.println("Click on Login button");
	}

	@Then("login to be successful")
	public void login_to_be_successful() {
		boolean status = driver.findElement(By.partialLinkText("New Account")).isDisplayed();
		if (status) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login unsuccessful");
		}
		System.out.println("Login to be successful");
	}

	@When("user provides invalid username and password")
	public void user_provides_invalid_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("surezh1984");
		driver.findElement(By.name("password")).sendKeys("");
		System.out.println("Invalid username and password");
	}

	@Then("login to be unsuccessful")
	public void login_to_be_unsuccessful() {
		WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
		System.out.println("Login unsuccessful: error message " + errorMsg.getText());
	}

	@And("close the application")
	public void close_the_application() {
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
		System.out.println("Logout the application");
		driver.close();
	}

}
