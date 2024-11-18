@Smoke
Feature: Login Functionality
      As a User
      I Want to Login to my Account
      So That I Can access the platform

  Scenario: Login Successfully From The Home Drop List
    Given I Navigate to Home Page
    When I Verify Navigating to Home Page Successfully
    And I Hover on Home Page
    Then I Hover on Account
    And I Click On Login
    And I Enter Valid Email
    And I Enter Valid Password
    And I Click on Submit Login
    Then I Verify Logged in Successfully

  Scenario: Login With Invalid Email
    Given I Navigate To Home Page
    And I Hover on Home Page
    Then I Hover on Account
    And I Click On Login
    And I Enter InValid Email
    And I Enter Password
    And I Click on Submit Login
    Then I Verify Error Message
      