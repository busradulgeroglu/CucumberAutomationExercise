Feature: Login Test

  Scenario Outline: Positive scenario-user should be able to login

    Given The user is on the home page
    When  The user navigate to login page
    Then  The user should be able to see "Login to your account"
    When  The user enters "<emailAdress>" and "<password>"
    Then The welcome message contains "<username>"

    Examples:
      | emailAdress            | password  | username |
      | sen212121211@gmail.com | 123456789 | sen2121  |




