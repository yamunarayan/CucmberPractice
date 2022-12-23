@featureTag

Feature: This is the login feature for orange HRM
  Scenario: This is a login scenario
    Given The user  the login page
    When you enter the below credentials
  |Admin | admin123 |
    And Clicks login button
    Then We should be navigate to home page
