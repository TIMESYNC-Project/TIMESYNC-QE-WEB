@Timesync
Feature: Inbox Functionality
  as an admin i want to check every menu in settings page

  Scenario: Verify settings button is enabled
    Given Admin login with "admin" as username and "admin" as password to timesync website
    When Admin successfully on landing page
    And Admin click Settings button
    Then Settings button can be clicked

  Scenario: Verify settings page is displayed
    Given Admin login with "admin" as username and "admin" as password to timesync website
    When Admin successfully on landing page
    And Admin click Settings button
    Then System will be showing Settings page

  Scenario: Set office hours field
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Settings button
    When Admin input start office hours to "08:00"
    Then Set start office hours field can be inputted

  Scenario: Set end office hours field
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Settings button
    When Admin input end office hours to "19:00"
    Then Set end office hours field can be inputted

  Scenario: Set office start hour tolerancy
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Settings button
    When Admin input set office start hours tolerancy to 25
    Then Set start office hours tolerancy field can be inputted

  Scenario: Set end office hours field
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Settings button
    When Admin input end office hours to "19:00"
    Then Set end office hours field can be inputted


  Scenario: Set employees annual leaves
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Settings button
    When Admin input set employee annual leaves to 9
    Then Set employee annual leaves can be inputted

  Scenario: Save settings
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Settings button
    When Admin input start office hours to "08:00"
    And Admin input end office hours to "17:00"
    And Admin input set office start hours tolerancy to 25
    And Admin input set employee annual leaves to 7
    And Admin click save settings button
    Then settings office will be updated