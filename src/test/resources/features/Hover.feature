Feature: Interacting with the Hover page

  Scenario: User is shown correct information about a user they hover over
    Given the user accesses the Hover page
    When the user hovers over a user
    Then the page displays information about the user