Feature: User page columns verification

@test
  Scenario: Table column names
    Given user is on the login page
    When user logs in with username "librarian16@library" and password 'MnG7Xy72'
    And user clicks on "Users" link
    Then table should have following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |