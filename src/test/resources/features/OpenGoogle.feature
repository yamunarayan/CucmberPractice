@BackGroundExample

Feature: This is to test google search
  Background: TEsting with the Backdround
    Given BackgroundstepOne
    Given Backgroundstep2

  @senarioTag
  Scenario: Google search scenario
    Given user entering google.co.in
    When user is typing the search term "Testing"
    And Enters the return key
    Then User should see the search results
  @senarioTag
  Scenario: Google search scenario test
    Given user entering google.co.in
    When user is typing the search term "Testing"
    And Enters the return key
    Then User should see the search results