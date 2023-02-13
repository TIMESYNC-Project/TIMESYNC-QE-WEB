#@Timesync
#Feature: Login Employee
#  As an employee i want to login to website timesync
#
#  Scenario: Login with valid NIP and Password
#    Given Employee open the website timesync
#    When Employee input "23006" as NIP and input "223344" as password
#    And Employee click login button
#
#  Scenario Outline: Invalid login
#    Given Employee open the website timesync
#    When Employee input "<NIP>" as NIP and input "<password>" as password
#    And Employee click login button
#    Then Employee can see error "<errorMessage>" on login page
#    And Employee click OK button
#
#    Examples:
#      | NIP     | password | errorMessage               |
#      | febrian | 112233   | account not registered     |
#      | 23006   |          | password not allowed empty |
#      |         | 224      | nip not allowed empty      |