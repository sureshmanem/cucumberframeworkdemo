@sanity
Feature: Parabank Login Functionality

  Scenario: Login using valid credentials
    Given navigate to parabank url
    When enter valid "suresh1984" and "Welcome2022"
    And login to the application
    Then verify login is successful
    And application logout
    And application close
