
@priceHighToLow @all
Feature: user wants to see price high to low in electronics page

  Scenario: user should be able to see price high to low
    Given User is on homepage
    When user click on electronics page
    And user click on Camera & photo page
    And User click on sort by High to low
    Then User should be able to see price high to low order