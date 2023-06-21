Feature: Sample API Tests

Scenario: Test a sampl Get API

Given url 'https://reqres.in/api/users?page=2'
When method GET
Then status 200
