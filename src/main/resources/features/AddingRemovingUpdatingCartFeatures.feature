@Smoke
Feature: Adding Or Removing From Cart Functionality
      As a User
      I Want to be able to add or remove items from cart

  Scenario: Adding Item To Cart then Remove It
    Given I Navigate to Home Page
    Then I Hover on Apparel and Accessories Category
    And I Click On Shoes Category
    And I Choose any Product and View its details
    Then I Choose Product Size
    Then I Choose Quantity
    And I Verify Product Total Price in Product details page
    Then I Click Add To Cart button
    And I Verify Product Total Price in The Cart
    Then I Change Product Quantity From Cart Menu
    And I Click Update Cart
    Then I Verify Product Total Price again in the Cart
    Then I Click Delete Cart Item button
    Then I Verify Cart is Empty
    
  Scenario: Adding to Cart Without Specifying the product size
    Given I Navigate to Home Page
    Then I Hover on Apparel and Accessories Category
    And I Click On Shoes Category
    And I Choose any Product and View its details
    Then I Choose One Quantity
    Then I Click Add To Cart button
    Then I Verify Failure of Adding to cart with error message    