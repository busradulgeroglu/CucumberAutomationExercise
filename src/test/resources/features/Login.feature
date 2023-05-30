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

@wip
  Scenario Outline: Negative scenario-user should be able not to login

    Given The user is on the home page
    When  The user navigate to login page
    Then  The user should be able to see "Login to your account"
    When  The user enters incorrect "<emailAdress>" and "<password>"
    Then The user should be able to see warning message "Your email or password is incorrect!"

    Examples:
      | emailAdress            | password  |
      | sen212121211@gmail.com | 12345678910 |




