Feature:login
  Background:
    Given go login page
  Scenario Outline: invalid login
    When user add email "<email>" password "<password>"
    And user click login
    Then assert unsuccessful login
    Examples:
      |     email      | password  |
      |ali02@gmail.com|12345678    |
      |ali025@gmail.com|1234567    |
      |ali02@gmail.com|1234567     |
  Scenario Outline:valid login

    When user add email "<email>" password "<password>"
    Then user click login
  Examples:
    |     email      | password  |
    |a12@gmail.com   |12345678   |
