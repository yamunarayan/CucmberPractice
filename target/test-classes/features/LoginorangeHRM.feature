@featureTag

Feature: This is the login feature for orange HRM
  Scenario: This is login scenario
    Given The user is in the login page
    When The user enters the valid username and password
    And Clicks on the login button
    Then User should be navigate to the home page
