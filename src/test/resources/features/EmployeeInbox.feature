@Timesync
Feature: Employee Inbox
  As an employee i want to check every feature on the inbox page

  Scenario: Displaying Employee Inbox
    Given Employee login to timesync website with "23026" NIP & "12345" password
    When Employee click login button
    And Employee successfully on landing page
    And Employee click on inbox button from home page
    And System will showing inbox page
    And Employee click on detail inbox message
    And System will showing modal box detail inbox message
    Then Employee click on close detail inbox message

  Scenario: Back to Home Page Attendance with click Timesync logo
    Given Employee login to timesync website with "23026" NIP & "12345" password
    When Employee click login button
    And Employee successfully on landing page
    And Employee click on inbox button from home page
    And System will showing inbox page
    And Employee click Timesync logo
    Then System bring back to home page attendance



