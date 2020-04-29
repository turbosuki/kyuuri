Feature: Interacting with the Alerts page on The Internet

  Background:
    Given the user accesses the Alerts page

  Scenario: Accepting an alert (Javascript Alert variant)
    Given the user has triggered a Javascript Alert
    When the user accepts the alert
    Then the alert is dismissed

  Scenario: Triggering and cancelling an alert (Javascript Confirm variant)
    Given the user has triggered a Javascript Confirm Alert
    And sees the Javascript Confirm alert text
    When the user dismisses the alert
    Then the page displays that the user cancelled the alert

  Scenario: Triggering and accepting an alert (Javascript Confirm variant)
    Given the user has triggered a Javascript Confirm Alert
    When the user accepts the alert
    Then the page displays that the user accepted the alert

  Scenario: Inputting text into alert (Javascript Prompt variant)
    Given the user has triggered a Javascript Prompt Alert
    When the user inputs "some lovely user text" and accepts the alert
    Then "some lovely user text" is displayed on the webpage