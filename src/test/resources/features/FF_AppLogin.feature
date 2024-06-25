@regression
Feature: Testing Login End point

  Scenario Outline: Happy Path Login End point and validate
    Then User calls Login End-point and validates '<message>','<username>'
    Examples:
      | message                | username |
      | Logged in successfully | test_dev |