Feature: Login

#  простой пример, аналог теста CheckErrorTextTest
#  сценарий делает тоже самое, что и LoginErrorMessage.feature. Обратите внимание, что название сценария должны буть уникальны!!
  Scenario: Login without email single

    Given User is on Login page
    When User click login button
    Then User should see error message "Please enter a valid email address"
