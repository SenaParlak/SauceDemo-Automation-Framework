Feature: Checkout

  Background:
    Given User is on the login page
    When User logs in with valid credentials
    Then User should see the Products page

    Scenario: User proceeds to checkout

      When User adds product to the cart
      And User open the shopping cart
      And User click to checkout button
      Then User should see checkout information page