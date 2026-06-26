Feature: Login

  Scenario: login with invalid credentials

    Given User is on the login page
    When User logs in with invalid credentials
    Then User should see the error message