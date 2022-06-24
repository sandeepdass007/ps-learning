Feature: Cucumber Java

  @IdInput
  Scenario: Get Unique List of users
    Given User with input present
      | 1  |
      | 2  |
    When Submit get user  request
    Then Should get Unique list of users

