package com.basic.HeadersValidationSD;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeadersVallidationSD {
	Response res;
	
	@Given("^user start the rest assured test")
	public void user_start_the_rest_assured_test() throws Throwable{
		System.out.println("Staring of the GET script");
	}
	
	@When("^user checks headers \"([^\"]*)\" have \"([^\"]*)\" values$")
	public void user_hit_the_get_request(String headerName, String headerValue){
		res = RestAssured.given().relaxedHTTPSValidation().get("https://ergast.com/api/f1/2017/circuits.json");
		String completeResponse = res.asString();
		System.out.println("============"+completeResponse);
	
	
	Headers heds = res.getHeaders();
	String actualHeaderValue = heds.getValue(headerName);
	Assert.assertTrue(actualHeaderValue.equals(headerValue));
	}
	
}
