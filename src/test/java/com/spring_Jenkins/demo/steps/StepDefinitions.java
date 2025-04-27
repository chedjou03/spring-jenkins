package com.spring_Jenkins.demo.steps;

import com.spring_Jenkins.demo.model.Client;
import com.spring_Jenkins.demo.model.ClientCreditGrade;
import com.spring_Jenkins.demo.service.ClientCreditGradeService;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.server.LocalServerPort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class StepDefinitions {

    private Response response;

    private List<Client> listOfClient;

    private List<ClientCreditGrade> listOfExpectedClientCreditGrade;

    Map<Integer, Character> expectedClientCreditGradeMap = new HashMap<>();
    Map<Integer, Character> actualClientCreditGradeMap = new HashMap<>();

    @Autowired
    ClientCreditGradeService clientCreditGradeService;


    @LocalServerPort
    private int port;

    public static Logger logger = LoggerFactory.getLogger(StepDefinitions.class);

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

    @Then("the ClientCount response body should contain {string}")
    public void the_ClientCount_response_body_should_contain(String expectedText) {
        response.then().body(containsString(expectedText));
    }


    @When("We have five clients with their credit limit and usage")
    public void readClientTable(DataTable dataTable) {
        listOfClient = dataTable.asList(Client.class);
    }

    @When("calculate their credit score grade")
    public  void calculateClientCreditScoreGrade(){
        listOfExpectedClientCreditGrade = new ArrayList<>();
        for(Client aClient: listOfClient){
            ClientCreditGrade aClientCreditGrade = new ClientCreditGrade();
            aClientCreditGrade = clientCreditGradeService.calculateClientCreditGrade(aClient);
            listOfExpectedClientCreditGrade.add(aClientCreditGrade);
            expectedClientCreditGradeMap.put(Integer.valueOf(aClientCreditGrade.getClient().getId()),Character.valueOf(aClientCreditGrade.getCreditGrade()));
        }

    }


    @Then("we should have these grade")
    public void the_ClientCount_response_body_should_contain(DataTable dataTable) {
        List<ClientCreditGrade> listOfActualClientCreditGrade = new ArrayList<>();
        listOfActualClientCreditGrade = dataTable.asList(ClientCreditGrade.class);
        for(ClientCreditGrade aClientCreditGrade : listOfActualClientCreditGrade){
            Assertions.assertEquals(expectedClientCreditGradeMap.get(aClientCreditGrade.getClient().getId()), Character.valueOf(aClientCreditGrade.getCreditGrade()));
        }

    }


}
