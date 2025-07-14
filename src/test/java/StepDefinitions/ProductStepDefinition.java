package StepDefinitions;


import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ProductStepDefinition {
	
	@Given("I hit the URL of get products API Endpoint")
	public void i_hit_the_url_of_get_products_API_Endpoint() {
		
		RestAssured.baseURI = "https://api.restful-api.dev/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("objects");
		
		
		int ResponseCode = response.getStatusCode();
		
		assertEquals(ResponseCode, 200);
		
	}
	
	@When("I pass the URL of products in the Request")
	public void i_pass_the_url_of_products_in_the_request() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I receive the response code as {int}")
	public void i_receive_the_response_code_as(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
