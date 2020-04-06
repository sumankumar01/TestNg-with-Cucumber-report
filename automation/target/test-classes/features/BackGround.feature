@BackGroundcucumber
Feature: Login123
  login to flight application

  Background: User is Logged In
    Given i am on login page

  @login5
  Scenario: Checking the login functionality flight application
    When i am entering the login credential
    Then i am validating the home page

  @Registration
  Scenario: Checking the Registration functionality flight application
    When i am entering the Registration details
      | Field         | Value     |       |        |
      | Firstname     | xyz       |       |        |
      | LastName      | def       |       |        |
      | AddressLine_2 | Whitfield |       |        |
      | City          | Bangalore |       |        |
      | Country       | India     |       |        |
      | phoneNum      |   0000000 | 11111 | 555555 |
    Then i am validating the home page
Background: User is Logged In
	Given I navigate to the login page
	When I submit username and password
	Then I should be logged in 

Scenario: Search a product and add the first product to the User basket
	Given User search for Lenovo Laptop
	When Add the first laptop that appears in the search result to the basket
	Then User basket should display with added item

Scenario: Navigate to a product and add the same to the User basket
	Given User navigate for Lenovo Laptop
	When Add the laptop to the basket
	Then User basket should display with added item
