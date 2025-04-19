Feature: Client Count Scenario

  Scenario: Verify the number of clients present
    Given the API is running
    When I send a GET request to "/clientCount"
    Then the response status should be 200
    And the ClientCount response body should contain "20"
