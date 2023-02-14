@Timesync
Feature: Employee Attendance Already Allow Location Permission
  As an employee i want to check every feature on the home page attendance

  Scenario: Attendance with allow permission of location
    Given Employee login to timesync website with "23036" NIP & "12345" password
    When Employee click login button
    Then Employee successfully on landing page
    And System will showing the location

  Scenario: Clock In Attendance with allow permission of location
    Given Employee login to timesync website with "23036" NIP & "12345" password
    When Employee click login button
    And Employee successfully on landing page
    And System will showing the location
    And Employee click on clock in
    Then System will showing clock in hour on logs today

  Scenario: Two Time Clock In Attendance with allow permission of location
    Given Employee login to timesync website with "23036" NIP & "12345" password
    When Employee click login button
    And Employee successfully on landing page
    And System will showing the location
    And Employee click on clock in
    Then System will showing warning message already clock in "clock in fail, you already clock in today"

  Scenario: Clock Out Attendance
    Given Employee login to timesync website with "23036" NIP & "12345" password
    When Employee click login button
    And Employee successfully on landing page
    And Employee click on clock out
    Then System will showing clock out hour on logs today

   Scenario: Two Time Clock Out Attendance
     Given Employee login to timesync website with "23036" NIP & "12345" password
     When Employee click login button
     And Employee successfully on landing page
     And System will showing the location
     And Employee click on clock out
     Then System will showing warning message already clock out "clock out fail, you already clock out today"

  Scenario: See more.. feature for displaing records page
    Given Employee login to timesync website with "23036" NIP & "12345" password
    When Employee click login button
    And Employee successfully on landing page
    And Employee click on See more feature
    Then System will showing records page