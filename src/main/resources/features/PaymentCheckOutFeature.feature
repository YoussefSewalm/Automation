@Smoke
Feature: Payment and CheckOut Functionality
      As a User
      I Want to be able to Purchase Products Successfully

  Scenario: Full Purchase Process Already Logged In
    Given I Navigate to Home Page
    And I Hover on Home Page
    Then I Hover on Account
    And I Click On Login
    And I Enter Valid Email
    And I Enter Valid Password
    And I Click on Submit Login
    Then I Hover on Apparel and Accessories Category
    And I Click On Shoes Category
    And I Choose any Product and View its details
    Then I Choose Product Size
    Then I Choose One Quantity
    Then I Click Add To Cart button
    And I Verify Shoes Product Total Price in The Cart
    Then I Hover Again on Apparel and Accessories Category
    And I Click On T-shirts Category
    And I Choose any Tshirt Product and View its details
    Then I Click Add To Cart
    And I Verify Tshirt Product Total Price in The Cart
    Then I Verify Total Products Price Before Tax in The Cart
    Then I Verify Total Products Price After Tax in The Cart
    And I Click CheckOut
    Then I Verify  Navigating To CheckOut Page Successfully
    And I Verify Name and Mobile Shipping Details 
    And I Verify Country and City Shipping Details
    And I Verify Name and Mobile Payment Details
    And I Verify Country and City Payment Details
    And I Verify Total Products Price Before Tax in Checkout
    And I Verify Total Products Price After Tax in Checkout
    Then I Click Confirm Order
    And I Verify Order is Processed Successfully
    
 
   Scenario: Full Purchase Process Not Logged In
    Given I Navigate to Home Page
    Then I Hover on Apparel and Accessories Category
    And I Click On Shoes Category
    And I Choose any Product and View its details
    Then I Choose Product Size
    Then I Choose One Quantity
    Then I Click Add To Cart button
    Then I Hover Again on Apparel and Accessories Category
    And I Click On T-shirts Category
    And I Choose any Tshirt Product and View its details
    Then I Click Add To Cart
    And I Click CheckOut
    And I Click on Continue Registration
    And I Enter My Personal Details Like FirstName,LastName,Email,Telephone,Fax
    Then I Enter My Address , Company, City, Region, ZipCode and Country
    Then I Enter My Login Details Like Login name,Login password and Confirm password
    Then I Choose to Subscribe for Newsletter
    And I Check That I have read and Agree to the Privacy Policy
    And I Click On Continue
    Then I Click Confirm Order
    And I Verify Order is Processed Successfully
