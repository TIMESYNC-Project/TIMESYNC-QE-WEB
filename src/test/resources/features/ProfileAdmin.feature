@Timesync
Feature: Profile Functionality
    As an admin i want to check every menu on Profile Company

  Scenario: Profile page is displayed
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    When Admin click Profile on Navigation Bar
    Then System will be showing Profile page

  Scenario: Company Profile is displayed
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    When Admin click Profile on Navigation Bar
    And Admin successfully on Profile page
    Then System will be showing Profile page

  Scenario: Update profile button is enabled
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    When Admin click Profile on Navigation Bar
    And Admin successfully on Profile page
    And Admin click Update Profile button
    Then System will be showing pop-up for edit company profile

  Scenario: Update profile with all field completed
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Profile on Navigation Bar
    And Admin successfully on Profile page
    And Admin click Update Profile button
    And System will be showing pop-up for edit company profile
    When Admin change Name field to "Timesync Company"
    And Admin change Phone field to "+628011111"
    And Admin change Email field to "timesync@company.co.id"
    And Admin change Social Media field to "Twitter: @Timesync"
    And Admin change Address field to "Jl. Jalandikuburan No.13, Kec.Mangga Dua, Kel.Cimanggis, Duren Sawit, Jakarta Timur"
    And Admin change Description field to "We are a company that moves in technology and software industry"
    And Admin change Select Picture field to "Logo_Trial.jpg"
    And Admin click Submit button
    Then System will be showing Profile page

  Scenario: Cancel update profile button with some changes will lost the data changes
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Profile on Navigation Bar
    And Admin successfully on Profile page
    And Admin click Update Profile button
    And System will be showing pop-up for edit company profile
    When Admin change Name field to "TimesyncKu Company"
    And Admin click Cancel button
    Then System will be showing Profile

  Scenario: Update profile with some data changed will updated only changed data
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Profile on Navigation Bar
    And Admin successfully on Profile page
    And Admin click Update Profile button
    And System will be showing pop-up for edit company profile
    When Admin change Name field to "Timesync kUY Company"
    And Admin change Phone field to "+6200111"
    And Admin click Submit button
    Then System will be showing Profile





