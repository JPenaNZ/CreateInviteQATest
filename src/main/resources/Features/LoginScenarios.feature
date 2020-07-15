Feature: Login Scenarios in Fileinvite App

  @LoginTests
  Scenario: Successful user login
    Given Launch chrome browser
    When Open Fileinvite app
    Then Enter login details successfully
    Then Logout from the app

  @LoginTests
  Scenario: Successful opening of My Profile
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter login details successfully
    Then Open My profile
    Then Logout from the app

  @LoginTests
  Scenario: Unsuccessful user login with error message
    Given Launch chrome browser
    When Open Fileinvite app
    When Enter dummy login details
    Then Verify login error message
    Then Close the app
