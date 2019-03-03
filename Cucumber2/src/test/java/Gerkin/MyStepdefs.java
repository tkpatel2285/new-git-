package Gerkin;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class MyStepdefs extends Utils {
    HomePage homepage = new HomePage();
    RegisterPage reg = new RegisterPage();
    LogInButton login = new LogInButton();
    ShoppingCartPage cartpage = new ShoppingCartPage();
    CreditCardDetails card = new CreditCardDetails();
    HighPriceToLow hightolow = new HighPriceToLow();
    CurencyChangeToEuro dollartoeuro = new CurencyChangeToEuro();
    UserShouldBeSentEmailSuccessfully emailtofriend = new UserShouldBeSentEmailSuccessfully();


    @Given("^user is on the home page$")
    public void userIsOnTheHomePage() { }

    @When("^user click register Button$")
    public void userClickRegisterButton() {
        click_Element(By.linkText("Register"));
    }

    @And("^user needs to select gender$")
    public void userNeedsToSelectGender() { click_Element(By.id("gender-male")); }

    @And("^user provide first name,last name and date of birth$")
    public void userProvideFirstNameLastNameAndDateOfBirth() { reg.names(); }

    @And("^user provide Email address,company Name,$")
    public void userProvideEmailAddressCompanyName() {
        reg.emailCompany();
    }

    @And("^user select newsletter$")
    public void userSelectNewsletter() { click_Element(By.id("Newsletter")); }

    @And("^user enter password and reenter password$")
    public void userEnterPasswordAndReenterPassword() {
        reg.passwordAndRenterPassword();
    }

    @And("^user needs to click on Register Page$")
    public void userNeedsToClickOnRegisterPage() {
        click_Element(By.id("register-button"));
    }

    @Then("^user will see welcome message$")
    public void userWillSeeWelcomeMessage() {
        reg.registerSuccessMessage();
    }

    // buy product///


    @Given("^user is in login page$")
    public void userIsInLoginPage() { }

    @When("^user enter register email id and password$")
    public void userEnterRegisterEmailIdAndPassword() {
        login.userDetail();
    }

    @And("^user click on add to cart button in Apple MacBook Pro  inch product$")
    public void userClickOnAddToCartButtonInAppleMacBookProInchProduct() {
        homepage.appleMacBook();
        click_Element(By.xpath("//input[@id=\"add-to-cart-button-4\"]"));
    }


    @And("^user click on shopping cart button$")
    public void userClickOnShoppingCartButton() {
        explicitwait(By.linkText("Shopping cart"));
        click_Element(By.linkText("Shopping cart")); }


    @And("^User select Terms and conditions$")
    public void useSelectTermsAndConditions() {
        click_Element(By.id("termsofservice"));
    }

    @And("^User click on checkout Button$")
    public void userClickOnCheckoutButton() { click_Element(By.id("checkout"));
    }

    @And("^user enter billing and shipping addresses$")
    public void userEnterBillingAndShippingAddresses() {
        cartpage.billinAndShipping();
    }

    @And("^user select shipping method and payment method$")
    public void userSelectShippingMethodAndPaymentMethod() { cartpage.shippingAndPayment(); }

    @And("^user enter valid payment details$")
    public void userEnterValidPaymentDetails() { card.userShouldBeAbleToEnterCardDetails(); }

    @And("^user click on Confirm Button$")
    public void userClickOnConfirmButton() {
        explicitwait(By.xpath("//div[@id=\"confirm-order-buttons-container\"]/input"));
        click_Element(By.xpath("//div[@id=\"confirm-order-buttons-container\"]/input"));
    }

    @Then("^user should see payment confirmation message$")
    public void userShouldSeePaymentConfirmationMessage() {
        card.confirmOrder();
    }
///////////////////High to low/////////////////////////////////////

    @Given("^User is on homepage$")
    public void userIsOnHomepage() { }

    @When("^user click on electronics page$")
    public void userClickOnElectronicsPage() { homepage.electronicaPage(); }

    @And("^user click on Camera & photo page$")
    public void userClickOnCameraPhotoPage() { click_Element(By.linkText("Camera & photo")); }

    @And("^User click on sort by High to low$")
    public void userClickOnSortByHighToLow() { click_Element(By.xpath("//select[@aria-label=\"Select product sort order\"]/option[5]")); }

    @Then("^User should be able to see price high to low order$")
    public void userShouldBeAbleToSeePriceHighToLowOrder() { hightolow.highToLowConfirmation(); }


///////////////////       chnage currency dollar to euro//////////////
    @When("^User select the currency dollar to euro$")
    public void userSelectTheCurrencyDollarToEuro() { dollartoeuro.dollorToEuro(); }

    @And("^User click on jewelry Button$")
    public void userClickOnJewelryButton() {dollartoeuro.jewelleryPage(); }

    @Then("^User is able to see the price in euro$")
    public void userIsAbleToSeeThePriceInEuro() {dollartoeuro.currencyChangeConfirmation(); }

/////////////////////////Email to friend///////////////


    @Given("^User is on loginPage in nopcommerce$")
    public void userIsOnLoginPageInNopcommerce() { homepage.clickOnLogIn(); }

    @When("^User enter valid login credential$")
    public void userEnterValidLoginCredential() { login.userDetail(); }
    @And("^User Click on product Apple MacBook Pro$")
    public void userClickOnProductAppleMacBookPro() { homepage.appleMacBook(); }

    @And("^user click on Email a friend Button and enter friend's email address$")
    public void userClickOnEmailAFriendButtonAndEnterFriendsEmailAddress() { emailtofriend.friendEmail(); }

    @And("^Click on send email Button$")
    public void clickOnSendEmailButton() {click_Element(By.xpath("//form[@method=\"post\"]/div[2]/input"));}

    @Then("^user should see send successfully message$")
    public void userShouldSeeSendSuccessfullyMessage() {
        emailtofriend.sentEmailConfirmation();
    }


    ////////////////unregister user cant send email to friend////

    @And("^User click on Email  friend Button and enter friend's email address$")
    public void userClickOnEmailFriendButtonAndEnterFriendSEmailAddress() {
        emailtofriend.unregisterEmailUserNotBeAble();}

    @And("^User enter user's email address and Click on send email Button$")
    public void userEnterUserSEmailAddressAndClickOnSendEmailButton() { emailtofriend.unregisterEmail(); }

    @Then("^user should not send product details to friend$")
    public void userShouldNotSendProductDetailsToFriend() { emailtofriend.emailTOFriendError(); }



}

