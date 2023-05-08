Feature: Product

#  As a user
#  I want to see the product on store
#  So that I can make see product list

  Scenario: POST - Create a new product with valid HTTP Method
    Given I set POST api endpoints product
    When I send POST HTTP request product
    Then I receive valid HTTP response code 200 product

  Scenario: POST - Create a new product with invalid body
    Given I set POST api endpoints product
    When I send POST HTTP request product2
    Then I receive valid HTTP response code 500 product

  Scenario: GET -   Get product By ID with valid endpoint
    Given I set GET api endpoints product
    When I send GET HTTP request product
    Then I receive valid HTTP response code 200 product

  Scenario: GET - Get all products with valid endpoint
    Given I set GET api endpoints product2
    When I send GET HTTP request product2
    Then I receive valid HTTP response code 200 product

  Scenario: GET - Get product By ID with invalid endpoint
    Given I set GET api endpoints product3
    When I send GET HTTP request product3
    Then I receive valid HTTP response code 404 product

  Scenario: GET - Get all products with invalid endpoint
    Given I set GET api endpoints product4
    When I send GET HTTP request product4
    Then I receive valid HTTP response code 404 product

  Scenario: DELETE - Delete a product with valid endpoint
    Given I set DEL api endpoints product
    When I send DEL HTTP request product
    Then I receive valid HTTP response code 200 product

  Scenario: DELETE - Delete a product with invalid endpoint
    Given I set DEL api endpoints product2
    When I send DEL HTTP request product2
    Then I receive valid HTTP response code 404 product

  Scenario: POST - Assign a product rating with valid endpoint
    Given I set POST api endpoints rating
    When I send POST HTTP request rating
    Then I receive valid HTTP response code 200 product

  Scenario: POST - Assign a product rating with invalid endpoint
    Given I set POST api endpoints rating2
    When I send POST HTTP request rating2
    Then I receive valid HTTP response code 500 product

  Scenario: GET - Get product ratings with valid endpoint
    Given I set GET api endpoints rating
    When I send GET HTTP request rating
    Then I receive valid HTTP response code 200 product

  Scenario: GET - Get product ratings with invalid endpoint
    Given I set GET api endpoints rating2
    When I send GET HTTP request rating2
    Then I receive valid HTTP response code 500 product

  Scenario: POST - Create a comment for product with valid endpoint
    Given I set POST api endpoints comment
    When I send POST HTTP request comment
    Then I receive valid HTTP response code 200 product

  Scenario: POST - Create a comment for product with invalid endpoint
    Given I set POST api endpoints comment2
    When I send POST HTTP request comment2
    Then I receive valid HTTP response code 500 product

  Scenario: GET - Get product comments with valid endpoint
    Given I set GET api endpoints comment
    When I send GET HTTP request comment
    Then I receive valid HTTP response code 200 product

  Scenario: GET - Get product comments with invalid endpoint
    Given I set GET api endpoints comment2
    When I send GET HTTP request comment2
    Then I receive valid HTTP response code 404 product