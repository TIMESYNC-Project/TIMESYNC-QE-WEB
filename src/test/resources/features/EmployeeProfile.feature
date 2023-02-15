@Timesync
Feature: Employee Profile
  As an employee i want to check every feature on the profile page

  Scenario: Displaying Employee Profile Page
    Given Employee login to timesync website with "23026" NIP & "12345" password
    When Employee click login button
    And Employee successfully on landing page
    And Employee click on profile button
    Then System will showing profile page

  Scenario: Company Profile
    Given Employee login to timesync website with "23026" NIP & "12345" password
    When Employee click login button
    And Employee successfully on landing page
    And Employee click on profile button
    And Employee click on company profile
    And System will showing company profile page
    And Employee click back to employee's profile
    Then System will showing profile page

  Scenario: Cancel Update Photo
    Given Employee login to timesync website with "23026" NIP & "12345" password
    When Employee click login button
    And Employee successfully on landing page
    And Employee click on profile button
    And System will showing profile page
    And Employee click on update photo button
    And Employee click cancel update photo
    Then System will showing profile page

  Scenario: Cancel Update Password
    Given Employee login to timesync website with "23026" NIP & "12345" password
    When Employee click login button
    And Employee successfully on landing page
    And Employee click on profile button
    And System will showing profile page
    And Employee click on update password button
    And Employee click cancel update password
    Then System will showing profile page

  Scenario Outline: Update Photo with .jpg and .png file
    Given Employee login to timesync website with "<NIP>" NIP & "<password>" password
    When Employee click login button
    And Employee successfully on landing page
    And Employee click on profile button
    And System will showing profile page
    And Employee click on update photo button
    And Employee choose image input photo "<imageFile>"
    And Employee click update button for photo
    Then System will showing profile page
    Examples:
      | NIP   | password | imageFile   |
      | 23026 | 12345    | Elon.jpg    |
      | 23026 | 12345    | Babbage.png |

  @Negativecase
  Scenario Outline: Update Photo with .txt file
    Given Employee login to timesync website with "<NIP>" NIP & "<password>" password
    When Employee click login button
    And Employee successfully on landing page
    And Employee click on profile button
    And System will showing profile page
    And Employee click on update photo button
    And Employee choose image input photo "<imageFile>"
    And Employee click update button for photo
    Then System will showing profile page
    Examples:
      | NIP   | password | imageFile             |
      | 23026 | 12345    | negative_scenario.txt |

  @Negativecase
  Scenario Outline: Update Photo with image size more than 500 kb
    Given Employee login to timesync website with "<NIP>" NIP & "<password>" password
    When Employee click login button
    And Employee successfully on landing page
    And Employee click on profile button
    And System will showing profile page
    And Employee click on update photo button
    And Employee choose image input photo "<imageFile>"
    And Employee click update button for photo
    Then System will showing error message for profile image upload "file size max 500 kb"
    Examples:
      | NIP   | password | imageFile           |
      | 23026 | 12345    | more_than_500kb.jpg |

  Scenario: Update Password
    Given Employee login to timesync website with "23026" NIP & "12345" password
    When Employee click login button
    And Employee successfully on landing page
    And Employee click on profile button
    And System will showing profile page
    And Employee click on update password button
    And Employee input new password with "12345"
    And Employee click update button for password
    Then System will showing profile page

  @Negativecase
  Scenario Outline: Update Password with special char
    Given Employee login to timesync website with "23026" NIP & "12345" password
    When Employee click login button
    And Employee successfully on landing page
    And Employee click on profile button
    And System will showing profile page
    And Employee click on update password button
    And Employee input new password with "<specialChar>"
    And Employee click update button for password
    Then System will showing warning "<warningMsg>"
    Examples:
      | specialChar | warningMsg                      |
      | !@#$%       | validate: 123@# is not alphanum |
