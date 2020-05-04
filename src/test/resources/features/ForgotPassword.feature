Feature: Interacting with the Forgot Password page

  Scenario: Resetting a password
    Given the user accesses the Forgot Password page
    When the user submits a password reset
    Then the page displays the password reset was successful