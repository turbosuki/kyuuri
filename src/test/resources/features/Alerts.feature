Feature: Interacting with the Alerts page on The Internet

  Background:
    Given the user accesses the Alerts page

  Scenario: Accepting an alert
    Given the user has triggered a Javascript Alert
    When the user accepts the alert
    Then the alert is dismissed