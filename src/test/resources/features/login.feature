Feature: Login Feature Test
  Scenario Outline: Login with invalid credential
    Given user navigate login page of the application
    And user enter invalid "<username>" in user text box
    And user enter valid "<password>" in password text box
    When user click on submit button
    Then user redirect to user dashboard
    Examples:
    |username| |password|
    |        | |        |
