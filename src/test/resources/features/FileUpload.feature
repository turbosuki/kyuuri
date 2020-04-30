Feature: Interacting with the File Upload page

  Scenario: User uploads a file and sees confirmation of the file they uploaded
    Given the user accesses the File Upload page
    When they upload a file
    Then the user sees the name of the file they uploaded on the page