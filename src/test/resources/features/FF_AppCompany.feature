@regression
Feature: Testing Company End Points

  Scenario Outline: Happy Path Company End-Point and validate Information
    Then User calls company endpoint and validates '<message>','<companyName>','<companyEmail>','<companyPhone>'

    Examples:
      | message                               | companyName | companyEmail      | companyPhone |
      | Application data fetched successfully | techtorial  | company@email.com | 1234567891   |
