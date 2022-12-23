@featureTag @scenarioTag
Feature: This is the login feature for orange HRM
  @scenarioTag
 Scenario Outline: This is a login scenario
    Given The user is in login page screen
    When enter the credentials "<username>" and "<password>"
    And Clicks login button of the login pagescreen
    Then We should be navigate to home pagescreen
Examples:
      |username|password|
      |Admin | admin123 |
      |Admin | admin123 |
