Feature: Add to cart

  Background:
    Given User is on the login page
    When User logs in with valid credentials
    Then User should see the Products page

    Scenario: User adds a product to the cart

      When User adds product to the cart
      Then The product should be successfully added.