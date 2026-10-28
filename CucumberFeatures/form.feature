Feature: Student Registration Form

  Scenario: Verify name, surname and email insertion
    Given user should launch website
    When user enters name and email
    Then it should accept values