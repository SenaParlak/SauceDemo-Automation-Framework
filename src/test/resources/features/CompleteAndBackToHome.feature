Feature: Back to home

  Background:
    Given User is on the login page
    When User logs in with valid credentials
    Then User should see the Products page

  Scenario: User back to home page

    When User adds product to the cart
    And User open the shopping cart
    And User click to checkout button
    And User enter checkout information with "Sena", "Parlak" and "34000"
    And User click to finish button
    And User click to back to home button
    Then User should see the Products page