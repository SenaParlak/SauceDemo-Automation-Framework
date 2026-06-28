Feature: Remove product from cart with outline

  Background:
    Given User is on the login page
    When User logs in with valid credentials
    Then User should see the Products page

  Scenario Outline: User removes a product from the cart

    When User adds "<product>" to the cart
    And User open the shopping cart
    And User removes "<product>" from the cart
    Then The cart should be empty

    Examples:
      |product|
      |Sauce Labs Backpack|
      |Sauce Labs Bike Light|
      |Sauce Labs Bolt T-Shirt|
      |Sauce Labs Fleece Jacket|
      |Sauce Labs Onesie|
      |Test.allTheThings() T-Shirt (Red)|