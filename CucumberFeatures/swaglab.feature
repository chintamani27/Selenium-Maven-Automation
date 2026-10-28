Feature: sauceDemo login functionality

  Scenario Outline: verify login logout of swaglab website
    Given launch swaglab website
    When enter username as "<username>" and password as "<password>" and click on login and logout button
    Then verify expected result as "<exp_res>"

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |
