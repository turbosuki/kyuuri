Feature: Interacting with cookies in the app

  Scenario: A cookie is deleted
    Given a cookie is created
    When the user deletes a cookie
    Then the cookie is deleted