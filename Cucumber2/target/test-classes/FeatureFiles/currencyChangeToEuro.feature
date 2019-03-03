
  @currencyToEuro @all

    Feature: User  to wants change the currency dollar to euro
      Scenario: user should be able to change the currency
        Given User is on homepage
        When  User select the currency dollar to euro
        And User click on jewelry Button
        Then User is able to see the price in euro