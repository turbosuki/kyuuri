Feature: Interacting with the Login page

  Scenario: User logs in to the website
    Given the user accesses the Form Authentication page
    When the user enters their username and password and logs in
    Then they are logged in and the secure area page is displayed