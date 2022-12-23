@featureTag

Feature: This is the login feature for orange HRM
  Scenario: This is login scenario
    Given The user in the login page
    When The user enters the valid "Admin" and "admin123"
    And Clicks on login button
    Then User should be navigate to home page
