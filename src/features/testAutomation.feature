@testAutomation
Feature: Test Automation Task

  Background: the google chrome opened and the application has started

  Scenario Outline: Test animal items (Exercises 1.)
    Given the google chrome opened and the application has started
    When animal set using letter <letter>
    And max life span set to  <life_span>
    And order is sorted by „Life Span”
    And checkbox is selected to Ascending
    Then result should contain more than 12 items
    Examples:
      |letter |life_span|
      |a |4|

  Scenario Outline: From drop down row item has to be picked (Exercises 2.)
    Given the google chrome opened and the application has started
    When Item contains <exercise>
    And units contains  Ea
    And unit cost greater than <cost>
    Then item has to be picked.
    Examples:
      |exercise| cost |
      |Exercise |1.1|

  Scenario Outline: From drop down row item has to be picked (Exercises 3.)
    Given the google chrome opened and the application has started
    When get all item containing name „Correction
    And  changing subitems „Description” to incremental number starting from 1 and proceeding random 10 characters
    Then result has to have format <examples>
    Examples:
      |examples|
      |1 asdfasdfasdf|
      |2 asdasdasdas|

