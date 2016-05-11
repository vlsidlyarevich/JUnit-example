Feature: Deleting char from string

  Scenario: Delete the char with specific position from string
    Given a string with value "itiibo"
    And a position of char to delete: 3
    When we delete char with number 3 from itiibo string
    Then the result must be "itibo"