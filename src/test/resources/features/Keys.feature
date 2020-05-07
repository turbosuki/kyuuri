Feature: Interacting with the Keys page

  Scenario: User sees the key they pressed displayed on the page
    Given the user accesses the Key Presses page
    When they input a backspace
    Then the page displays that backspace was pressedke