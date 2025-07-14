@tag
Feature: Get all Products from the API 


  @tag1
  Scenario: Verify the Get API for the Products 
    Given I hit the URL of get products API Endpoint 
    When I pass the URL of products in the Request
    Then I receive the response code as 200
    
