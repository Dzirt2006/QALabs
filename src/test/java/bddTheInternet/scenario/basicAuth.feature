@tag
Feature: Basic Authorization
I want to use this template for my feature file
@tag1
  Scenario Outline: Basic Auth login with User and Password
    Given I am on the page
    When I enter technical single "<keyword>" into user and password
    Then I validate the status of the outcome

    Examples:
      | keyword |
      | admin   |
