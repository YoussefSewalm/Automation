@Smoke
Feature: SignUp Functionality
      As a User
      I Want to Create and Account
      So That I Can access the platform with it

  Scenario: SignUp Successfully From The Home Drop List
    Given I Navigate to Home Page
    And I Hover on Home Page
    Then I Hover on Account
    And I Click On Login
    And I Click on Continue Registration
    And I Enter My Personal Details Like FirstName,LastName,Email,Telephone,Fax
    Then I Enter My Address , Company, City, Region, ZipCode and Country
    Then I Enter My Login Details Like Login name,Login password and Confirm password
    Then I Choose to Subscribe for Newsletter
    And I Check That I have read and Agree to the Privacy Policy
    And I Click On Continue
    Then I Verify Account Created Successfully

  Scenario: Invalid SignUp (Ignoring Mandatory Fields)
    Given I Navigate to Home Page
    And I Hover on Home Page
    Then I Hover on Account
    And I Click On Login
    And I Click on Continue Registration
    And I Enter My Personal Details Like FirstName,LastName,Email,Telephone,Fax
    Then I Enter My Address , Company, City, ZipCode and Country, BUT without choosing region
    Then I Enter My Login Details Like Login name,Login password and Confirm password
    Then I Choose to Subscribe for Newsletter
    And I Check That I have read and Agree to the Privacy Policy
    And I Click On Continue
    Then I Verify Sign Up Fail With Error Message

  Scenario: Invalid SignUp (Using Previously Used Email)
    Given I Navigate to Home Page
    And I Hover on Home Page
    Then I Hover on Account
    And I Click On Login
    And I Click on Continue Registration
    And I Enter My Personal Details Like FirstName,LastName,PREVIOUSLY REGISTERED Email,Telephone,Fax
    Then I Enter My Address , Company, City, Region, ZipCode and Country
    Then I Enter My Login Details Like Login name,Login password and Confirm password
    Then I Choose to Subscribe for Newsletter
    And I Check That I have read and Agree to the Privacy Policy
    And I Click On Continue
    Then I Verify Sign Up Fail With Email Already Reg Error Message
