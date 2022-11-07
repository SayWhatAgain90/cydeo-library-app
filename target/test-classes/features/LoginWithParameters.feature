Feature: Login with parameters

  Background:
    Given user is on the login page

  @librarian
  Scenario: Login as librarian 11
    When user enter username "librarian11@library"
    And user enter password 'fsRRgXxB'
    And user click the sign in button
    Then user should see the dashboard

  @librarian
  Scenario: Login as librarian 12
    When user enter username "librarian12@library"
    And user enter password 'wHhJQDSK'
    And user click the sign in button
    Then user should see the dashboard
    And there should 1327 users

  @student
  Scenario: Login as student 14
    When user enter username "student14@library"
    And user enter password 'bL1twuqT'
    And user click the sign in button
    Then books should be displayed

  @student
  Scenario: Login as student 15
    When user enter username "student15@library"
    And user enter password '9WB9sVtF'
    And user click the sign in button
    Then books should be displayed

  Scenario: Login as librarian in the same line
    When user logs in with username "librarian16@library" and password 'MnG7Xy72'
    Then user should see the dashboard
    And there should 1327 users