
@tag
Feature: Add Asset in admin site.
  I want to use this template for my feature file
  
  
Background:
Given I landed on Admin site


  @tag2
  Scenario Outline: Postive Test of create new asset
    Given Logged in with <email> and <password>
    When I add asset <assetname>
 

    Examples: 
      | email                 |  password  | assetname |
      |patoliya.dm1@gmail.com |  Password@1| HP        |
 
