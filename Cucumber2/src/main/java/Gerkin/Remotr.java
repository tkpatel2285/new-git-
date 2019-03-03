package Gerkin;

import org.openqa.selenium.By;

public class Remotr {
    public class LogInButton extends Utils {

        HomePage hm = new HomePage();
        LoadProp loadProp = new LoadProp();
        By _enteremail = By.id("Email");
        By _enterpassword = By.id("Password");
        By _loginbuttonfinal = By.xpath("//input[@value='Log in']");
        By _logout = By.linkText("Log out");

        public void userDetail() {

        }
    }}