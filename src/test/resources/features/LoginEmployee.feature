@Timesync
Feature: Login Employee
  As an employee i want to login to website timesync

  @PositiveCase
  Scenario Outline: Password field validation with check book functionality
    Given Employee open the website timesync
    When Employee input "<NIP>" as NIP and input "<password>" as password
    And Employee click on check box password
    Examples:
      | NIP | password   |
      |     | abcdefghi  |
      |     | ABCDEFGHI  |
      |     | 1234567890 |

  @PositiveCase
  Scenario: Login with valid NIP and Password
    Given Employee open the website timesync
    When Employee input "23026" as NIP and input "12345" as password
    And Employee click login button
    Then Employee successfully on landing page

  @NegativeCase
  Scenario Outline: Invalid login
    Given Employee open the website timesync
    When Employee input "<NIP>" as NIP and input "<password>" as password
    And Employee click login button
    Then Employee can see error "<errorMessage>" on login page
    And Employee click OK button
    Examples:
      | NIP     | password | errorMessage               |
      | 23026   | 001100   | password not match         |
      | febrian | 12345    | account not registered     |
      | 001100  | 001100   | account not registered     |
      |         | 12345    | nip not allowed empty      |
      | 23026   |          | password not allowed empty |
      |         |          | nip not allowed empty      |