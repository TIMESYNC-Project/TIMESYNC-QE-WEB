@Timesync
Feature: Clock In & Clock Out Employee Whitout Location
  As an employee i want to clock in whitout location permission at website timesync

  @NegativeCase
  Scenario: Clock In Attendance without location permission
    Given Employee login to timesync website with "23026" NIP & "12345" password
    When Employee click login button
    And Employee successfully on landing page
    And Employee click on clock in
    Then System will showing error message clock in "error message clock in"

  @NegativeCase
  Scenario: Clock Out Attendance without location permission
    Given Employee login to timesync website with "23026" NIP & "12345" password
    When Employee click login button
    And Employee successfully on landing page
    And Employee click on clock out
    Then System will showing error message clock out "error message clock out"

