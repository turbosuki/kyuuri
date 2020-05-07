Feature: Interacting with the Horizontal Slider page

  Scenario: Slider shows correct value
    Given the user accesses the Horizontal Slider page
    When the user moves the slider to position "4"
    Then the page displays the slider was moved to position "4"