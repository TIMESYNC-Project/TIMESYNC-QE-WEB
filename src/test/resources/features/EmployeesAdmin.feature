@Timesync
  Feature: Employees Functionality
    as an admin i want to check every menu in employees

  Scenario: Verify Employees Page is Displayed
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    When Admin click Employees on Navigation Bar
    Then System will be showing Employees page

  Scenario: Search button can input any text
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    When Admin click Employees on Navigation Bar
    Then Admin input "K*zuk1" on search field

  Scenario: Search Employee by Employee Name
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Employees on Navigation Bar
    When Admin input "Alif" on search field
    And Admin click Search button
    Then System will be showing profile with name "Alif"

  Scenario: Search Employee by NIP
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Employees on Navigation Bar
    When Admin input "23001" on search field
    And Admin click Search button
    Then System will be showing profile with name "Alif"

  Scenario: Create New Employee using CSV
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Employees on Navigation Bar
    And Admin click Add to Csv button
    When Admin input "trial.csv" on add csv field
    Then List of Employee successfully created


  Scenario: Create a New Employee
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Employees on Navigation Bar
    And Admin click Create a new employee button
    And Admin add Name field to "Bocchi"
    And Admin add Email field to "kitan@gmail.com"
    And Admin add Password field to "qwerty"
    And Admin add Phone field to "+6255425"
    And Admin select position to "Quality Engineer"
    And Admin add gender to "Female"
    And Admin add Birthdate to 110201
    And Admin add address to "Bogor"
    When Admin click Submit Create New Employee button
    Then New Employee successfully created


  Scenario: Verify when required field is empty, submit button won't be clicked
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Employees on Navigation Bar
    And Admin click Create a new employee button
    And Admin add Name field to "Rise"
    And Admin add Password field to "12345"
    And Admin add address to "Bogor"
    When Admin click Submit Create New Employee button
    Then Submit button will not be created

    Scenario: Verify cancel edit employee button is enabled
      Given Admin login with "admin" as username and "admin" as password to timesync website
      And Admin successfully on landing page
      And Admin click Employees on Navigation Bar
      And Admin click Create a new employee button
      When Admin click cancel add button
      Then System will be showing Employees page

  Scenario: Employee name will redirect to employee profile
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Employees on Navigation Bar
    When Admin click on selected employee name
    Then System will be showing selected employee profile

  Scenario: Verify back button is return to Employees page
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Employees on Navigation Bar
    And Admin click on selected employee name
    And System will be showing selected employee profile
    When Admin click back button on employee profile page
    Then System will redirect back to employee page

  Scenario: Employee position will redirect to employee profile
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Employees on Navigation Bar
    When Admin click on selected employee position
    Then System will be showing selected position employee profile

  Scenario: Edit Employee with all field completed
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Employees on Navigation Bar
    And Admin click Edit button on employee card button
    And Admin edit Name field to "Bulbasaur"
    And Admin edit Email field to "kokorra@gmail.com"
    And Admin edit Password field to "112233"
    And Admin edit Phone field to "+6255153343"
    And Admin edit select position to "Frontend Engineer"
    And Admin edit gender to "Male"
    And Admin edit Birthdate tp 110201
    And Admin edit address to "Bogorr"
    When Admin click edit submit button
    Then Employee data will be updated

  Scenario: Edit employee with no data has changed
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Employees on Navigation Bar
    And Admin click Edit button on employee card button
    When Admin click edit submit button
    Then Employee data will not affected

  Scenario: Verify cancel edit employee button is enabled
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Employees on Navigation Bar
    And Admin click Edit button on employee card button
    When Admin click edit cancel button
    Then System will be showing Employees page

  Scenario: Delete employee will giving warning messages
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Employees on Navigation Bar
    When Admin click delete button on selected card
    Then Warning messages will appeared

    Scenario: Cancel Delete employee
      Given Admin login with "admin" as username and "admin" as password to timesync website
      And Admin successfully on landing page
      And Admin click Employees on Navigation Bar
      When Admin click delete button on selected card
      And Admin click No on warning messages delete employee
      Then Employee will not be deleted

  Scenario: Delete employee
    Given Admin login with "admin" as username and "admin" as password to timesync website
    And Admin successfully on landing page
    And Admin click Employees on Navigation Bar
    When Admin click delete button on selected card
    And Admin click Yes on warning messages delete employee
    Then Employee will successfully deleted




