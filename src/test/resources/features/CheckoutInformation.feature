Feature: Checkout Information

  Background:
    Given User is on the login page
    When User logs in with valid credentials
    Then User should see the Products page

  Scenario: User enter valid checkout information

    When User adds product to the cart
    And User open the shopping cart
    And User click to checkout button
    And User enter checkout information with "Sena", "Parlak" and "34000"
    Then User should see the checkout overview page