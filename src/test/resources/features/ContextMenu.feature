Feature: Interacting with the Context Menu page

  Scenario: Right clicking the hotspot to produce an alert
    Given the user accesses the Context Menu page
    When the user right clicks the hotspot
    Then the page displays an alert
