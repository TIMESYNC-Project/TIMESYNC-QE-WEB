@Timesync
Feature: Records Functionality
  as an admin i want to check every menu in records page

  Scenario: Verify Records Page is Displayed
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    When Admin click Records on Navigation Bar
    Then System will be showing Records page

  Scenario: Search field can input any text
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    When Admin click Records on Navigation Bar
    And Admin input "4y@T0" on records search field
    Then Search can input any text

  Scenario: Search Records by Employee Name
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Records on Navigation Bar
    When Admin input "Lumine" on records search field
    And Admin click Search button on records page
    Then System will be showing records with name "Lumine"

  Scenario: Search Records by NIP
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Records on Navigation Bar
    When Admin input "23037" on records search field
    And Admin click Search button on records page
    Then System will be showing records with NIP "23037"
#
  Scenario: Employee card will redirect to details record
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Records on Navigation Bar
    When Admin click on selected employee name record
    Then System will be showing records from selected employee profile

  Scenario: Create Attendance button is enabled
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Records on Navigation Bar
    And Admin click on selected employee name record
    When Admin click Create Attendance button
    Then System will be showing Create Attendance Pop-up

  Scenario Outline: Attendance dropdown is enabled
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Records on Navigation Bar
    And Admin click on selected employee name record
    And Admin click Create Attendance button
    When Admin select "<type>" on attendance field
    Then Attendance will change same as Admin selected type

    Examples:
      | type         |
      | Annual Leave |
      | On Leave     |
      | Sick Leave   |

  Scenario: Set date start
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Records on Navigation Bar
    And Admin click on selected employee name record
    And Admin click Create Attendance button
    When Admin input date on date start field
    Then Date start field will be added

  Scenario: Set date end
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Records on Navigation Bar
    And Admin click on selected employee name record
    And Admin click Create Attendance button
    When Admin input date on date end field
    Then Date end field will be added

  Scenario: Cancel New Attendance button
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Records on Navigation Bar
    And Admin click on selected employee name record
    And Admin click Create Attendance button
    And Admin select "Annual Leave" on attendance field
    And Admin input date on date start field
    When Admin click cancel button on Create Attendance
    Then New Attendance will not be created

  Scenario: Create New Attendance button
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Records on Navigation Bar
    And Admin click on selected employee name record
    And Admin click Create Attendance button
    And Admin select "Sick Leave" on attendance field
    And Admin input date on date start field
    And Admin input date on date end field
    When Admin click submit button on Create Attendance
    Then New Attendance should be created