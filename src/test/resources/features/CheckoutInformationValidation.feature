Feature: Checkout Information Validation

Background:
Given User is on the login page
When User logs in with valid credentials
Then User should see the Products page

  Scenario Outline: User cannot continue checkout with missing required information

When User adds product to the cart
And User open the shopping cart
And User click to checkout button
And User enter checkout information with "<firstName>", "<lastName>" and "<postalCode>"
Then User should see "<errorMessage>"

  Examples:
    |firstName|lastName|postalCode|errorMessage                   |
    |         |Yücel   |45455     |Error: First Name is required  |
    |Ayşe     |        |45455     |Error: Last Name is required   |
    |Ayşe     |Yücel   |          |Error: Postal Code is required |