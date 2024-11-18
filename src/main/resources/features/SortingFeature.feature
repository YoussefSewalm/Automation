@Smoke
Feature: Sorting Products Functionality
      As a User
      I Want to be able to Sort Items 
      So That I Can Find my desired Products easier 

  Scenario: Sorting Products Successfully
    Given I Navigate to Home Page
    And I Hover on Home Page
    Then I Hover on Apparel and Accessories Category
    And I Click On Shoes Category
    And I Try first Sorting way By Name From A To Z
    Then I Verify First Sorting Done Successfully
    And I Try second Sorting way By Name From Z to A
    Then I Verify Second Sorting Done Successfully
    And I Try the third Sorting Way By Price from Low To High
    Then I Verify Third Sorting Done Successfully
    And I Try The Last Sorting Way By Price From High to Low
    Then I Verify Last Sorting Done Successfully


