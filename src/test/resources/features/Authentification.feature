Feature: Authentification

  As a user
  I want to see the products
  So that I can request to the api endpoints to login

  Scenario: POST - Register with valid data data and endpoint
    Given I set POST api endpoints register
    When I send POST HTTP request register
    Then I receive valid HTTP response code 200 Authentification

  Scenario: POST - Register without using email
    Given I set POST api endpoints register
    When I send POST HTTP request register2
    Then I receive valid HTTP response code 400 Authentification

  Scenario: POST - Register without using password
    Given I set POST api endpoints register
    When I send POST HTTP request register3
    Then I receive valid HTTP response code 400 Authentification

  Scenario: POST - Register using email that has been registered
    Given I set POST api endpoints register
    When I send POST HTTP request register4
    Then I receive valid HTTP response code 400 Authentification

  Scenario: POST - Register with invalid endpoint
    Given I set POST api endpoints register2
    When I send POST HTTP request register5
    Then I receive valid HTTP response code 404 Authentification

  Scenario: GET - Register with invalid HTTP method
    Given I set GET api endpoints register
    When I send GET HTTP request register
    Then I receive valid HTTP response code 405 Authentification

  Scenario: POST - Login with a valid data and endpoint
    Given I set POST api endpoints login
    When I send POST HTTP request login
    Then I receive valid HTTP response code 200 Authentification

  Scenario: POST - Login with email and password that has leading/trailing spaces
    Given I set POST api endpoints login
    When I send POST HTTP request login1
    Then I receive valid HTTP response code 400 Authentification

  Scenario: POST - Login with email and password that has special characters
    Given I set POST api endpoints login
    When I send POST HTTP request login2
    Then I receive valid HTTP response code 400 Authentification

  Scenario: POST - Login with an incorrect email or password
    Given I set POST api endpoints login
    When I send POST HTTP request login3
    Then I receive valid HTTP response code 400 Authentification

  Scenario: POST - Login with an unregistered email
    Given I set POST api endpoints login
    When I send POST HTTP request login4
    Then I receive valid HTTP response code 400 Authentification

  Scenario: POST - Login with an empty email and password
    Given I set POST api endpoints login
    When I send POST HTTP request login5
    Then I receive valid HTTP response code 400 Authentification

  Scenario: POST - Login with invalid endpoint
    Given I set POST api endpoints login2
    When I send POST HTTP request login6
    Then I receive valid HTTP response code 404 Authentification

  Scenario: GET - Login with invalid HTTP method
    Given I set GET api endpoints login
    When I send GET HTTP request login
    Then I receive valid HTTP response code 405 Authentification