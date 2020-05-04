Feature: Interacting with the Frames pages

  Scenario: User views text in iframes
    Given the user accesses the Frames page
    When the user loads the Nested Frames page
    Then the page displays text in iframes