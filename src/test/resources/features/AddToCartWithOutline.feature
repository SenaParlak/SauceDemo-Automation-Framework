Feature: Add to cart with outline

  Background:
    Given User is on the login page
    When User logs in with valid credentials
    Then User should see the Products page

    Scenario Outline: User adds a product to the cart

      When User adds "<product>" to the cart
      Then The "<product>" should be successfully added.

      Examples:
      |product|
      |Sauce Labs Backpack|
      |Sauce Labs Bike Light|
      |Sauce Labs Bolt T-Shirt|
      |Sauce Labs Fleece Jacket|
      |Sauce Labs Onesie|
      |Test.allTheThings() T-Shirt (Red)|