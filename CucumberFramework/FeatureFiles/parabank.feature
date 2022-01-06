@regression
Feature: Parabank Login Functionality

  Scenario: Login using valid credentials
    Given user is navigating to the parabank url
    When user provides valid username and password
    And click on login button
    Then login to be successful
    And logout the application
    And close the application

@sanity
  Scenario: Login using invalid credentials
    Given user is navigating to the parabank url
    When user provides invalid username and password
    And click on login button
    Then login to be unsuccessful
    And close the application
