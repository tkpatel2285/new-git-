

@registration @all
Feature: user should be able to register successfully
  Scenario: User should be able to register
    Given user is on the home page
    When  user click register Button
    And  user needs to select gender
    And      user provide first name,last name and date of birth
    And      user provide Email address,company Name,
    And      user select newsletter
    And      user enter password and reenter password
    And      user needs to click on Register Page
    Then     user will see welcome message

