Feature: Post API Demo

  Background: 
    *url 'https://reqres.in/api'
    *header Accept = 'application/json'
    *def expectedOutput = read("response1.json")


  #Simple post request
  Scenario: Post Demo 1
    Given url 'https://reqres.in/api/users'
    And request {"name": "morpheus","job": "leader"}
    When method POST
    Then status 201
    And print response

  #Using Background post request
  Scenario: Post Demo 2
    Given path '/users'
    And request {"name": "morpheus","job": "leader"}
    When method POST
    Then status 201
    And print response

  #Post with assertion
  Scenario: Post Demo 3
    Given path '/users'
    And request {"name": "morpheus","job": "leader"}
    When method POST
    Then status 201
    And match response ==  {"name": "morpheus","job": "leader","id": "#string","createdAt": "#ignor"}

  #Post with read response from file
  Scenario: Post Demo 4
    Given path '/users'
    And request {"name": "morpheus","job": "leader"}
    When method POST
    Then status 201
    And match response ==  expectedOutput
    And print response

  #Post with read request body from file
  Scenario: Post Demo 5
    Given path '/users'
    And def requestBody = read("request1.json")
    And request requesBody
    When method POST
    Then status 201
    And match response == expectedOutput
    And match $ == expectedOutput
    And print response
