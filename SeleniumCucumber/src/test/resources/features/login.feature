@loginFlight
Feature: Login
  login to flight application

  @login
  Scenario Outline: Checking the login functionality flight application
    Given i am on login page
    When i am entering the login credential "<Username>" and "<Password>"
    Then i am validating the home page

    Examples: 
      | Username | Password |
      | mercury  | mercury  |
