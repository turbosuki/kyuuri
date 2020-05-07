Feature: Interacting with the Dynamic Loading pages

  Background:
    Given the user accesses the Dynamic Loading page

  Scenario: User views loading in Example 1 page
    Given the user accesses Example 1
    When the user clicks the Example 1 start button
    Then the Example 1 page displays confirmation text after loading finishes

  Scenario: User views loading in Example 2 page
    Given the user accesses Example 2
    When the user clicks the Example 2 start button
    Then the Example 2 page displays confirmation text after loading finishes