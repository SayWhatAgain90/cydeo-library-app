Feature: Library app login feature
  User story:
  As a user, I should be able to login with correct credentials to different accounts

  Background: Assuming user is ont the login page
    Given user is on the login page

    @librarian @employee @smoke
      Scenario: Login as librarian
      When user enters librarian username
      And user enters librarian password
      Then user should see the dashboard

      @student @smoke
      Scenario: Login as student
        When user enters student username
        And user enters student password
        Then books should be displayed