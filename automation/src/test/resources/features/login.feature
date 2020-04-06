@loginmain
Feature: Login
  login to flight application

  @login
  Scenario: Checking the login functionality flight application
    Given i am on login page
    When i am entering the login credential
    Then i am validating the home page

  @login1
  Scenario Outline: Checking the login functionality flight application
    Given i am on login page
    When i am entering the login credential "<Username>" and "<Password>"
    Then i am validating the home page

    Examples: 
      | Username   | Password |
      | Mercury123 | Mercury  |
      | Mercury123 | Mercury  |
      | Mercury123 | Mercury  |
      | Mercury123 | Mercury  |

  @login2
  Scenario: Checking the login functionality flight application
    Given i am on login page
    When i am entering the login credential "Mercury123" and "Mercury"
    Then i am validating the home page

  @Registration
  Scenario: Checking the Registration functionality flight application
    Given i am on login page
    When i am entering the Registration details
      | Field         | Value     |       |        |
      | Firstname     | xyz       |       |        |
      | LastName      | def       |       |        |
      | AddressLine_2 | Whitfield |       |        |
      | City          | Bangalore |       |        |
      | Country       | India     |       |        |
      | phoneNum      |   0000000 | 11111 | 555555 |
    Then i am validating the home page
