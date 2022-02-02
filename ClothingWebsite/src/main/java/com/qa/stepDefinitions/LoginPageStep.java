package com.qa.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class LoginPageStep {
	
	WebDriver driver;
	
	@Given("^user opens website$")
	public void user_opens_website() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	}

	@When("^user clicks on sign in$")
	public void user_clicks_on_sign_in() {
		
		driver.findElement(By.xpath("//a[@class=\"login\"]")).click();
	}

	@Then("^user is on the login page$")
	public void user_is_on_the_login_page() {
		
		String title = driver.getTitle();
		assertEquals("Login - My Store", title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("mya@gmail.com");
		driver.findElement(By.id("password")).sendKeys("olim123#");
	}

	@Then("^user clicks login button$")
	public void user_clicks_login_button() {
		driver.findElement(By.id("SubmitLogin")).click();
	}

}
