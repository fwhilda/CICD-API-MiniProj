Feature: Categories

  As a user
  I want to retrieve a list of categories
  So that I can access information about different product categories

  Scenario: POST - Create a new category with valid endpoint
    Given I set POST api endpoints categories
    When I send POST HTTP request categories
    Then I receive valid HTTP response code 200 categories

  Scenario: POST - Create a new category with invalid endpoint
    Given I set POST api endpoints categories2
    When I send POST HTTP request categories2
    Then I receive valid HTTP response code 404 categories


  Scenario: GET - Get all categories with valid endpoint
    Given I set GET api endpoints categories
    When I send GET HTTP request categories
    Then I receive valid HTTP response code 200 categories

  Scenario: GET - Get category by ID with valid endpoint
    Given I set GET api endpoints categories
    When I send GET HTTP request categories2
    Then I receive valid HTTP response code 200 categories

  Scenario: GET - Get category by ID with invalid endpoint
    Given I set GET api endpoints categories2
    When I send GET HTTP request categories3
    Then I receive valid HTTP response code 404 categories

  Scenario: GET - Get all categories with invalid endpoint
    Given I set GET api endpoints categories3
    When I send GET HTTP request categories4
    Then I receive valid HTTP response code 404 categories

  Scenario: DELETE - Delete a category with valid endpoint
    Given I set DEL api endpoints categories
    When I send DEL HTTP request categories
    Then I receive valid HTTP response code 200 categories

  Scenario: DELETE - Delete a category with invalid endpoint
    Given I set DEL api endpoints categories2
    When I send DEL HTTP request categories2
    Then I receive valid HTTP response code 500 categories
