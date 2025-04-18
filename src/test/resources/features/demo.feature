Feature: Hello API Test

  Scenario: Verify that the API returns a Hello message
    Given the API is running
    When I send a GET request to "/hello"
    Then the response status should be 200
    And the response body should contain "Hello, World!"



