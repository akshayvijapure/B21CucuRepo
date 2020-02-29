package com.basic.MyGoogleRestAssured;



import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyF1Def {

	Response res;
	
	@When("I hit the F1 race application")
	public void i_hit_the_F_race_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		res = RestAssured.get("https://ergast.com/api/f1/2017/circuits.json");

	}
	
	@Then("I validate the status code of F1 app")
	public void i_validate_the_status_code_of_F_app() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		int actualStatCode = res.getStatusCode();
		System.out.println("actualStatCode="+actualStatCode);
		Assert.assertTrue(200==actualStatCode);

	}

		
}
	

