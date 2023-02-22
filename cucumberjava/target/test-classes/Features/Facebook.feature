Feature: Test login functionality

  Scenario: Check login is successful with valid credentials
    Given browser is launched
    And user is on facebook login page
    When user enters username and password
    And user clicks on login button
    Then user is navigated to facebook home page
    And user navigates to facebook home page
    
