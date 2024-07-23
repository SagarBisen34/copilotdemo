Feature: Login functionality

@Login
  Scenario: Login with valid credentials
    Given I am on the login page
    When I enter valid username and password
    And I click on the login button
    Then I should be redirected to the home page

@InvalidTest
    Scenario: Login with invalid credentials
      Given I am on the login page
      When I enter invalid username and password
      And I click on the login button
      Then I should see an error message



