package com.spring_Jenkins.demo.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class HelloStepDefinitions {

    private Response response;

    @LocalServerPort
    private int port;

    public static Logger logger = LoggerFactory.getLogger(HelloStepDefinitions.class);

    @Given("the API is running")
    public void the_api_is_running() {
        // Normally, we'd check if the app is running
    }

    @When("I send a GET request to {string}")
    public void i_send_a_get_request_to(String endpoint) {
        logger.info("*************** port: "+port);
        response = given()
                .baseUri("http://localhost:"+port)
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
