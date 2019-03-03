
@buyingProduct @all
Feature: user should be able to buy product

  Scenario: user able to buy product
    Given user is in login page
    When user enter register email id and password
    And user click on add to cart button in Apple MacBook Pro  inch product
    And user click on shopping cart button
    And User select Terms and conditions
    And User click on checkout Button
    And user enter billing and shipping addresses
    And user select shipping method and payment method
    And user enter valid payment details
    And user click on Confirm Button
    Then user should see payment confirmation message
