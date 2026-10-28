Feature: Gmail Login

  Scenario: Verify Gmail login with valid credentials
    Given User should be registered
    When User opens Gmail page and enters valid credentials
    Then Gmail login should be successful