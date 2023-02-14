@Timesync
Feature: Inbox Functionality
  as an admin i want to check every menu in inbox page

  Scenario: Verify Inbox button is enabled
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    When Admin click Inbox on Navigation Bar
    Then Admin can click Inbox on Navigation Bar

  Scenario: Verify Inbox page is displayed
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    When Admin click Inbox on Navigation Bar
    Then System will be showing Inbox page

  Scenario: Verify create inbox button is enabled
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Inbox on Navigation Bar
    And System will be showing Inbox page
    When Admin click on Create Inbox button
    Then System will be showing Create Inbox pop-up

  Scenario: Verify create inbox content is displayed with proper format
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Inbox on Navigation Bar
    And System will be showing Inbox page
    When Admin click on Create Inbox button
    Then System will be showing Create Inbox pop-up with proper format

  Scenario: Verify "To" field is enabled
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Inbox on Navigation Bar
    And System will be showing Inbox page
    And Admin click on Create Inbox button
    When Admin input "23111" on "To" field
    Then "To" field is enabled

  Scenario: Verify "To" field can get any text
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Inbox on Navigation Bar
    And System will be showing Inbox page
    And Admin click on Create Inbox button
    When Admin input "K@zuh4" on "To" field
    Then "To" field is accepting any text

  Scenario: Verify "Title" field is enabled
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Inbox on Navigation Bar
    And System will be showing Inbox page
    And Admin click on Create Inbox button
    When Admin input "Testing" on "Title" field
    Then "Title" field is enabled

  Scenario: Verify "Title" field can get any text
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Inbox on Navigation Bar
    And System will be showing Inbox page
    And Admin click on Create Inbox button
    When Admin input "t3st!ng" on "To" field
    Then "Title" field is accepting any text

  Scenario: Verify "Messages" field is enabled
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Inbox on Navigation Bar
    And System will be showing Inbox page
    And Admin click on Create Inbox button
    When Admin input "This is Testing Messages" on "Messages" field
    Then "Messages" field is enabled

  Scenario: Verify "Messages" field can get any text
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Inbox on Navigation Bar
    And System will be showing Inbox page
    And Admin click on Create Inbox button
    When Admin input "4y@t0" on "Messages" field
    Then "Messages" field is accepting any text

  Scenario: Create Inbox with valid NIP, but without title and messages
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Inbox on Navigation Bar
    And System will be showing Inbox page
    And Admin click on Create Inbox button
    When Admin input "23037" on "To" field
    And Admin click "Submit" create inbox button
    Then Message will be sent to NIP "23037"

  Scenario: Close button Inbox
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Inbox on Navigation Bar
    And System will be showing Inbox page
    And Admin click on Create Inbox button
    When Admin click on Close Create Inbox button
    Then Create Inbox pop-up will be closed

  Scenario: Verify list card inbox
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    When Admin click Inbox on Navigation Bar
    Then System will be showing list Inbox page

  Scenario: Verify date card inbox
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    When Admin click Inbox on Navigation Bar
    Then System will be showing date created messages on Inbox page

  Scenario: Add new Inbox
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Inbox on Navigation Bar
    And System will be showing Inbox page
    And Admin click on Create Inbox button
    And Admin input "Testing" on "Title" field
    And Admin input "This is Testing Messages" on "Messages" field
    When Admin click "Submit" create inbox button
    Then Messages will be sent to all employee

  Scenario: Detail Inbox
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Inbox on Navigation Bar
    And System will be showing Inbox page
    When Admin click on Inbox card
    Then System will be showing detailed inbox

  Scenario: Delete Inbox
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Inbox on Navigation Bar
    And System will be showing Inbox page
    When Admin click on Delete Inbox button
    And System showing warning delete inbox message
    And Admin click Yes on warning message delete inbox
    Then Inbox will be deleted

  Scenario: Delete Inbox showing pop-up warning messages
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Inbox on Navigation Bar
    And System will be showing Inbox page
    When Admin click on Delete Inbox button
    Then System showing warning delete inbox message

  Scenario: No button warning messages
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Inbox on Navigation Bar
    And System will be showing Inbox page
    When Admin click on Delete Inbox button
    And System showing warning delete inbox message
    And Admin click No on warning message delete inbox
    Then Inbox will not deleted

  Scenario: Yes button warning messages
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Inbox on Navigation Bar
    And System will be showing Inbox page
    When Admin click on Delete Inbox button
    And System showing warning delete inbox message
    And Admin click Yes on warning message delete inbox
    Then Inbox will be deleted