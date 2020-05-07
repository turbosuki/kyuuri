Feature: Interacting with the Javascript page

  Scenario: User selects multiple attributes from the dropdown
    Given the user accesses the Dropdown page
    When multiple options are selected from the dropdown
    Then the page shows multiple options are selected