Feature: Login

#  простой пример, аналог теста CheckErrorTextTest
  Scenario: Login without email

    Given User is on Login page
    When User click login button
    Then User should see error message "Please enter a valid email address"

#    пример со списком значений
  Scenario Outline: Login with valid data

    Given User is on Login page
    When User set login:  <login>
    And User set password: <password>
    And User click login button
    Then User should see welcome message.
    Examples:
      |login|password|
      |Bill|12345678|
      |Ann|876544321|
