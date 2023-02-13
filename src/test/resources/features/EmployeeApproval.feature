@Timesync
Feature: Employee Approval
  As an employee i want to check every feature on the approval page

  Scenario: Displaying Employee Approval Page
    Given Employee login to timesync website with "23026" NIP & "12345" password
    When Employee click login button
    Then Employee successfully on landing page
    And Employee click on approval button from home page
    Then System will showing approval page

  Scenario Outline: Request Approval
    Given Employee login to timesync website with "<nip>" NIP & "<password>" password
    When Employee click login button
    Then Employee successfully on landing page
    And Employee click on approval button from home page
    Then System will showing approval page
    And Employee click on request approval
    Then System showing request approval page
    Then Employee choose approval type to "<approvalType>"
    And Employee choose start date at "<startDate>" to "<endDate>"
    Then Employee input description "<description>"
    And Employee upload file for evidence "<image>"
    Then Employee click submit
    And System will showing approval page
  Examples:
    | nip   | password | approvalType | startDate | endDate  | description     | image           |
    | 23026 | 12345    | Annual Leave | 17022023  | 20022023 | Beranfkat Umroh | annualLeave.jpg |
    | 23026 | 12345    | On Leave     | 10022023  | 12022023 | Cuti Hamil      | onLeave.jpg     |
    | 23026 | 12345    | Sick Leave   | 11022023  | 13022023 | Izin Sakit      | sickLeave.jpg   |

  @NegativeCase
  Scenario Outline: Request Approval without input anything
    Given Employee login to timesync website with "<nip>" NIP & "<password>" password
    When Employee click login button
    Then Employee successfully on landing page
    And Employee click on approval button from home page
    Then System will showing approval page
    And Employee click on request approval
    Then System showing request approval page
    Then Employee click submit
    Then System showing request approval page
    Examples:
      | nip   | password | approvalType | startDate | endDate  | description     | image           |
      | 23026 | 12345    | Annual Leave | 17022023  | 20022023 | Beranfkat Umroh | annualLeave.jpg |
      | 23026 | 12345    | On Leave     | 10022023  | 12022023 | Cuti Hamil      | onLeave.jpg     |
      | 23026 | 12345    | Sick Leave   | 11022023  | 13022023 | Izin Sakit      | sickLeave.jpg   |

  @NegativeCase
  Scenario Outline: Request Approval without choose approval type
    Given Employee login to timesync website with "<nip>" NIP & "<password>" password
    When Employee click login button
    Then Employee successfully on landing page
    And Employee click on approval button from home page
    Then System will showing approval page
    And Employee click on request approval
    Then System showing request approval page
    And Employee choose start date at "<startDate>" to "<endDate>"
    Then Employee input description "<description>"
    And Employee upload file for evidence "<image>"
    Then Employee click submit
    Then System showing request approval page
    Examples:
      | nip   | password | approvalType | startDate | endDate  | description     | image           |
      | 23026 | 12345    | Annual Leave | 17022023  | 20022023 | Beranfkat Umroh | annualLeave.jpg |

  @NegativeCase
  Scenario Outline: Request Approval without choose a date
    Given Employee login to timesync website with "<nip>" NIP & "<password>" password
    When Employee click login button
    Then Employee successfully on landing page
    And Employee click on approval button from home page
    Then System will showing approval page
    And Employee click on request approval
    Then System showing request approval page
    Then Employee choose approval type to "<approvalType>"
    Then Employee input description "<description>"
    And Employee upload file for evidence "<image>"
    Then Employee click submit
    Then System showing request approval page
    Examples:
      | nip   | password | approvalType | startDate | endDate  | description | image       |
      | 23026 | 12345    | On Leave     | 10022023  | 12022023 | Cuti Hamil  | onLeave.jpg |

  @NegativeCase
  Scenario Outline: Request Approval without input description
    Given Employee login to timesync website with "<nip>" NIP & "<password>" password
    When Employee click login button
    Then Employee successfully on landing page
    And Employee click on approval button from home page
    Then System will showing approval page
    And Employee click on request approval
    Then System showing request approval page
    Then Employee choose approval type to "<approvalType>"
    And Employee choose start date at "<startDate>" to "<endDate>"
    And Employee upload file for evidence "<image>"
    Then Employee click submit
    Then System showing request approval page
    Examples:
      | nip   | password | approvalType | startDate | endDate  | description | image         |
      | 23026 | 12345    | Sick Leave   | 11022023  | 13022023 | Izin Sakit  | sickLeave.jpg |

  @NegativeCase
  Scenario Outline: Request Approval
    Given Employee login to timesync website with "<nip>" NIP & "<password>" password
    When Employee click login button
    Then Employee successfully on landing page
    And Employee click on approval button from home page
    Then System will showing approval page
    And Employee click on request approval
    Then System showing request approval page
    Then Employee choose approval type to "<approvalType>"
    And Employee choose start date at "<startDate>" to "<endDate>"
    Then Employee input description "<description>"
    Then Employee click submit
    Then System will showing approval page
    Examples:
      | nip   | password | approvalType | startDate | endDate  | description | image         |
      | 23026 | 12345    | Sick Leave   | 11022023  | 13022023 | Izin Sakit  | sickLeave.jpg |


  Scenario: Displaying Detail Approval
    Given Employee login to timesync website with "23026" NIP & "12345" password
    When Employee click login button
    Then Employee successfully on landing page
    And Employee click on approval button from home page
    Then System will showing approval page
    And Employee click on detail approval
    Then System will showing modal box detail approval
    Then Employee click on close detail approval