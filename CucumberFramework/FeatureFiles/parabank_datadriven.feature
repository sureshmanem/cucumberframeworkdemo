Feature: Parabank Login Functionality

  Scenario Outline: Parabank Login using valid credentials
    Given Launch parabank url
    When valid credentials to be entered "<username>" and "<password>"
    And login to applicaton
    Then verify the user in homepage
    And application to be closed
    And browser to be closed

    Examples: 
      | username   | password    |
      | suresh1984 | Welcome2022 |
