Feature: Добавление фильма в избранное

  Background:
    Given Пользователь авторизовался на сайте
@close_browser
  Scenario Outline:
    When Пользователь кликает на фильм '<filmName>'
    When Пользователь лайкает фильм
    Then Пользователь видит плашку с сообщением об успешном добавлении фильма в избранное
    Examples:
      | filmName |
      | День     |
      | Фильм    |
