@featureTag

Feature: This is the login feature for orange HRM
  Scenario: This is a login scenario
    Given The user is in login page
    When enter the below credentials
  |Username|Password|
  |Admin | admin123 |
    And Clicks login button of the login page
    Then We should be navigate to home page screen
