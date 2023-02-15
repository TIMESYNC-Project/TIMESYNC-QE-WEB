@Timesync
Feature: Logout Employee
  As an employee i want to logout from website timesync

  @PositiveCase
  Scenario: Logout Functionality
    Given Employee open the website timesync
    When Employee input "23026" as NIP and input "12345" as password
    And Employee click login button
    And Employee successfully on landing page
    And Employee click on logout button
    And Employee click yes button
    Then Login page is displayed

