Feature: Strings concatenation

  Scenario: Find the concatenation of two strings
    Given a string with value "iti"
    And a string with value "bo"
    When we concatenate "iti" and "bo"
    Then the result must be "itibo"