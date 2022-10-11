Feature: Login functionality
  Background: Land to Home page
    Given Go to login page
  @smoke
    Scenario: Positive: Login with valid credentials as Admin
      Given Enter "alibek" in userName or Email input field
      And Enter "jantay1207" in password input field
      When user click on login button
      Then user should successfully logged in









