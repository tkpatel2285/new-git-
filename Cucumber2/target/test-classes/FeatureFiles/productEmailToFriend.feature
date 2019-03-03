

@all
    Feature: User wants to send product details to friend
      @emailToFriend
      Scenario: user should be able to send product details to friend with register email

        Given User is on loginPage in nopcommerce
        When User enter valid login credential
        And User Click on product Apple MacBook Pro
        And user click on Email a friend Button and enter friend's email address
        And Click on send email Button
        Then user should see send successfully message

        @email

        Scenario: user should not be able to send product details to friend with unregister email

          Given User is on homepage
          When  User Click on product Apple MacBook Pro
          And   User click on Email  friend Button and enter friend's email address
          And  User enter user's email address and Click on send email Button
          Then user should not send product details to friend
