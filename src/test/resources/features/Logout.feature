Feature: Logout

Background:
  Given User is on the login page
  When User logs in with valid credentials
  Then User should see the Products page

  Scenario: User logout successfully

    When User click to hamburger menu and logout button
    Then User should see the login page