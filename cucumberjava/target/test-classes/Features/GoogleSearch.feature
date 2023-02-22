Feature: Feature to test google search functionality

  Scenario: To validate google search working
  
    Given browser is open
    And user is on google search
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results
