Feature: Interacting with the WYSIWYG Editor page

  Scenario: User inputs text into editor
    Given the user accesses the WYSIWYG Editor page
    When the user inputs "race" and "car" and indents
    Then "racecar" is displayed in the textbox