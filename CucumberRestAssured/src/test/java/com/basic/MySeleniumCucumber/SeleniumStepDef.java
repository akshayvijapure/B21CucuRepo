package com.basic.MySeleniumCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeleniumStepDef {

	WebDriver driver;
	
	@Given("I hit selenium browser")
	public void I_hit_selenium_browser(){
		driver.get("https://selenium.dev/");
	}
	
	@When("I click project tab")
	public void I_click_project_tab(){
		driver.findElement(By.xpath("//nav/a[contains(text(),'Projects')]")).click();
	}
	
	@Then("I validate project tab")
	public void I_validate_project_tab(){
		Assert.assertTrue(driver.getCurrentUrl().contains("projects"));
	}
}
