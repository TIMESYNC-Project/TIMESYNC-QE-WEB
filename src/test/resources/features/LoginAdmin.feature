#@Timesync
#Feature: Login Admin
#  As an admin i want to login to website timesync
#
#  Scenario: Login with valid NIP and Password
#    Given Admin open the website timesync
#    When Admin input "admin" as NIP and input "admin" as password
#    And Admin click login button
#
#  Scenario Outline: Invalid login
#    Given Admin open the website timesync
#    When Admin input "<NIP>" as NIP and input "<password>" as password
#    And Admin click login button
#    Then Admin can see error "<errorMessage>" on login page
#    And Admin click OK button
#
#    Examples:
#      | NIP    | password | errorMessage               |
#      | admin1 | 112233   | account not registered     |
#      | 230061 |          | password not allowed empty |
#      |        | 2247     | nip not allowed empty      |