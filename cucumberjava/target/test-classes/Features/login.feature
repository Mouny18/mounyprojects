#Author: Mounika G
#Description: Testing My Login Page

Feature: feature to test login functionality

 
  Scenario: check login is successful with valid credentials
    
    Given user is on login page
    When user enters Username and Password
    And clicks on login page
    Then user is navigated to home page
