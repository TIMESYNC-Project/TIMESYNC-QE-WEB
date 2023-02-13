#@Timesync
#Feature: Approval Functionality
#  as an admin i want to check every menu in approval page
#
#  Scenario: Verify approval page is displayed
#    Given Admin login with "admin" as username and "admin" as password to timesync website
#    And Admin successfully on landing page
#    When Admin click Approval on Navigation Bar
#    Then System will be showing Approval request page
#
#  Scenario: Approval request employee list
#    Given Admin login with "admin" as username and "admin" as password to timesync website
#    And Admin successfully on landing page
#    When Admin click Approval on Navigation Bar
#    Then System will be showing Approval request page
#
#  Scenario: Detail approval is displayed
#    Given Admin login with "admin" as username and "admin" as password to timesync website
#    And Admin successfully on landing page
#    When Admin click Approval on Navigation Bar
#    And Admin click selected any employee card
#    Then Detail approval will be displayed
#
#  Scenario: Approve approval request
#    Given Admin login with "admin" as username and "admin" as password to timesync website
#    And Admin successfully on landing page
#    And Admin click Approval on Navigation Bar
#    And Admin click selected pending employee card
#    And Detail approval will be displayed
#    When Admin click Approve approval button
#    Then Approval request will be Approved
#
#  Scenario: Reject approval request
#    Given Admin login with "admin" as username and "admin" as password to timesync website
#    And Admin successfully on landing page
#    And Admin click Approval on Navigation Bar
#    And Admin click selected any pending employee card
#    And Detail approval will be displayed
#    When Admin click Reject approval button
#    Then Approval request will be Rejected
