@regression
Feature: Parabank Login Functionality

  Scenario: Login using valid credentials
    Given navigation to parabank url
    When enter valid credentials
      | username   | password    |
      | suresh1984 | Welcome2022 |
    And click login button
    Then verify homepage
    And logout from application
    And close the browser
