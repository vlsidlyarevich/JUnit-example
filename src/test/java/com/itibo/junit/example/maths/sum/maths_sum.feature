Feature: Arithmetical sum

  Scenario: Find the sum of two numbers
    Given a number with value 4
    And another number with value 3
    When we sum two numbers: 4 and 3
    Then the result must be 7