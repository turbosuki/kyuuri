Feature: Navigating around the application

  Scenario: User opens link in new tab
    Given the user accesses the Dynamic Loading page
    When the user opens the Example 2 link in a new tab
    Then the start button is displayed on the page in the new tab

  Scenario: User performs a series of navigation around the app
    Given the user accesses the Dynamic Loading page
    When the user visits the Example 1 page
    And backtracks and refreshes the page then navigates forward
    Then the user sees the Example 1 page