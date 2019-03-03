package Gerkin;

import org.openqa.selenium.By;


public class UserShouldBeSentEmailSuccessfully extends Utils
{     LogInButton loginbuton    = new LogInButton();
      LoadProp loadprop         = new LoadProp();
      HomePage homepage         = new HomePage();



        By clickemailfriend     = By.xpath("//div[@class=\"overview-buttons\"]/div[3]");
        By friend_email         = By.xpath("//input[@id='FriendEmail']");
        By youremail = By.xpath("//input[@id='YourEmailAddress']");
        By sendemailbutton = By.xpath("//form[@method=\"post\"]/div[2]/input");

        public void UserShouldBeSentEmailSuccessfully()
        {
        loginbuton.userDetail();
        homepage.appleMacBook();
        }
    //enter friend's email address
        public void friendEmail()
        {
        click_Element(clickemailfriend);//click on "Email a friend" Button
        send_keys(friend_email,loadprop.getproperty("FriendEmail"));
        }


        public void sentEmailConfirmation()
        {
        String AculatMessgae = driver.findElement(By.xpath("//div[@class=\'result\']")).getText();
        assert_element(AculatMessgae,"Your message has been sent.", "Email address is not valis");//expected result "Your message has been sent"
        //actual result "Your message has been sent"
        //test case pass
        }

        public void unregisterEmailUserNotBeAble()
        {
        click_Element(clickemailfriend);////click on "Email a friend" Button
        send_keys(friend_email,loadprop.getproperty("FriendEmail"));
        }

        public void unregisterEmail()
        {

        send_keys(youremail,"tkpaagv@gmail.com");//enter unregister email address
        click_Element(sendemailbutton);
        }

         public void emailTOFriendError()
         {
        String actualerrormessage = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]")).getText();
        assert_element(actualerrormessage,"Only registered customers can use email a friend feature", "You need to Register ur email address");
        //expected result = "Only registered customers can use email a friend feature"
        //actual result = "Only registered customers can use email a friend feature"
        //Test case pass

         }
}