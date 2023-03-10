@Timesync
Feature: Employee Records
  As an employee i want to check every feature on the records page

  Scenario: Displaying Employee Records Page
    Given Employee login to timesync website with "23026" NIP & "12345" password
    When Employee click login button
    And Employee successfully on landing page
    And Employee click on records button from home page
    Then System will showing records page

  Scenario: Displaying Employee Records Page by click date from 05 to 09
    Given Employee login to timesync website with "23026" NIP & "12345" password
    When Employee click login button
    And Employee successfully on landing page
    And Employee click on records button from home page
    And System will showing records page
    And Employee input date on calendar field "005" as start date and "009" as end date
    And Employee click on search icon
    Then System will showing records list
