package com.spring_Jenkins.demo.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.hamcrest.Matchers.containsString;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class HelloStepDefinitions {

    private Response response;

    @Given("the API is running")
    public void the_api_is_running() {
        // Normally, we'd check if the app is running
    }

    @When("I send a GET request to {string}")
    public void i_send_a_get_request_to(String endpoint) {
        response = given()
                .baseUri("http://localhost:8080")
                .when()
                .get(endpoint);
    }

    @Then("the response status should be {int}")
    public void the_response_status_should_be(int statusCode) {
        response.then().statusCode(statusCode);
    }

    @Then("the response body should contain {string}")
    public void the_response_body_should_contain(String expectedText) {
        response.then().body(containsString(expectedText));
    }
}
