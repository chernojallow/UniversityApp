package com.perscholas.cucumber_basics.step_definitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class SignupTestDefinitions {
	private WebDriver driver;
	private WebElement pageHeading = null;

	@Given("^the user navigates to the Signup page$")
	public void the_user_navigates_to_the_signup_page() throws Throwable {
		System.out.println("User navigates to the Signup page");

		System.setProperty("webdriver.chrome.driver", "//Users/chernojallow/Desktop//chromedriver"
				);

		driver = new ChromeDriver();
     	driver.get("http://localhost:8080/qeb_selenium_lesson/");

//		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("munirujallow");
//		driver.findElement(By.cssSelector("#inputPassword")).sendKeys("muniru");
//		driver.findElement(By.cssSelector("#form-signin > div:nth-child(3) > button[type=submit]")).click();
//		
		
     
        pageHeading = driver.findElement(By.cssSelector("#pageHeader"));
        
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("munirujallow");
        // Test that the page heading font color is black to begin with
        String actual = pageHeading.getAttribute("color");
        String expected = "munirujallow";
        assertEquals(actual, expected);
		
		

	}

	@When("^the user clicks the \"([^\"]*)\" button$")
	public void the_user_clicks_the_something_button(String strArg1) throws Throwable {
		driver.findElement(By.cssSelector("#form-signin > div:nth-child(3) > button[type=submit]")).click();
	}

	@Then("^the page should direct to Login page$")
	public void the_page_should_direct_to_Home_page() throws Throwable {
		
		
	   String name  = driver.findElement(By.cssSelector(
				  "form > div > input"))
				.getAttribute("value");
	   String expected = "chernojallow";
	   assertEquals(name, expected);
//	   
//	    String expected = "rgba(0, 128, 0, 1)";
//	    assertEquals(actual, expected);
//	    driver.close();

	}
}