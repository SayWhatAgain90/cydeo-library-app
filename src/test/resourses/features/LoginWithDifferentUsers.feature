Feature: Log in with different usernames and passwords
@wip
  Scenario Outline: Verify user information
    Given user is on the login page
    When I login using "<email>" and "<password>"
    Then account holder name should be "<name>"
    @student
    Examples:
      | name            | email             | password |
      | Test Student 10 | student10@library | F8u6OrI2 |
      | Test Student 11 | student11@library | 4VRMTsAB |
      | Test Student 12 | student12@library | 8ENtWqOe |
      | Test Student 13 | student13@library | Y0kaXNMa |
      | Test Student 14 | student14@library | bL1twuqT |
      | Test Student 15 | student15@library | 9WB9sVtF |
      | Test Student 16 | student16@library | 2Ziw6vOx |
      | Test Student 17 | student17@library | FmmXHzpF |
      | Test Student 18 | student18@library | qxt5XZgZ |
      | Test Student 19 | student19@library | xDxywYeJ |
      | Test Student 20 | student20@library | nGdNzH1e |

    @librarian
    Examples:
      | name              | email               | password |
      | Test Librarian 10 | librarian10@library | ZIkOcbCa |
      | Test Librarian 11 | librarian11@library | fsRRgXxB |
      | Test Librarian 12 | librarian12@library | wHhJQDSK |
      | Test Librarian 13 | librarian13@library | YCJCbmU3 |
      | Test Librarian 14 | librarian14@library | bWN7YaaB |
      | Test Librarian 15 | librarian15@library | YLu0ZIMj |
      | Test Librarian 16 | librarian16@library | MnG7Xy72 |
      | Test Librarian 17 | librarian17@library | adE5UAha |
      | Test Librarian 18 | librarian18@library | FZLa1m9D |
      | Test Librarian 19 | librarian19@library | f7q2SyVX |
      | Test Librarian 20 | librarian20@library | MVI4SRzg |