#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Feature:
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: As a user I want to use add and remove buttons
    Given I am on home page
    And I need to redirect to add/remove page
    When I click add button <addTimes>
    And delete button <deleteTimes>
    Then I validate amount of click buttons "<addTimes>" and "<deleteTimes>"

    Examples:
      | addTimes | deleteTimes |
      | 9        | 5           |
      | 3        | 1           |

