package com.sureshmanem.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParabankLoginDataTable {
	public WebDriver driver;
	
	@Given("navigation to parabank url")
	public void navigation_to_parabank_url() {
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

	@When("enter valid credentials")
	public void enter_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String,String>> credentials = dataTable.asMaps(String.class, String.class);
		driver.findElement(By.name("username")).sendKeys(credentials.get(0).get("username"));
		driver.findElement(By.name("password")).sendKeys(credentials.get(0).get("password"));
		System.out.println("Enter valid username and password");
	}

	@And("click login button")
	public void click_login_button() {
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		System.out.println("Click on Login button");
	}
	
	@Then("verify homepage")
	public void verify_homepage() {
		boolean status = driver.findElement(By.partialLinkText("New Account")).isDisplayed();
		if (status) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login unsuccessful");
		}
		System.out.println("Login to be successful");
	}

	@And("logout from application")
	public void logout_from_application() {
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
		System.out.println("Logout the application");
	}

	@And("close the browser")
	public void close_the_browser() {
		driver.close();
		System.out.println("Close the browser");
	}


}
