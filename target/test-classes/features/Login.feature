@featureTag

Feature: Test cases related to the leads

  @Login
  Scenario: Login test case
    Given The user is on the login page
    When Entered the username "mailtokannama"
    And Entered the password "Pavi143@"
    And Click on login button
    Then Validate user logged in successfully

  @logout
  Scenario: Click compose email
    Given The user is on the login page
    When Entered the username "mailtokannama"
    And Entered the password "Pavi143@"
    And Click on login button
    Then Validate user logged in successfully
    And Logout from rediff mail
