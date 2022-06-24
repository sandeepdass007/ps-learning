Feature: Scenarios outline

  @ValidateName
  Scenario Outline: Get user data
    Given Given user <name>
    When Compare user name
    Then The result should be <result>
    Examples:
    | name      |  result  |
    | "Sapient" |  "true"  |
    | "Sam"     |  "false" |
