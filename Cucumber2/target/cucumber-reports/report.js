$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/FeatureFiles/buyingproduct.feature");
formatter.feature({
  "line": 3,
  "name": "user should be able to buy product",
  "description": "",
  "id": "user-should-be-able-to-buy-product",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@buyingProduct"
    },
    {
      "line": 2,
      "name": "@all"
    }
  ]
});
formatter.before({
  "duration": 18790484315,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "user able to buy product",
  "description": "",
  "id": "user-should-be-able-to-buy-product;user-able-to-buy-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter register email id and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click on add to cart button in Apple MacBook Pro  inch product",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on shopping cart button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User select Terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on checkout Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enter billing and shipping addresses",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user select shipping method and payment method",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user enter valid payment details",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user click on Confirm Button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user should see payment confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsInLoginPage()"
});
formatter.result({
  "duration": 545515428,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userEnterRegisterEmailIdAndPassword()"
});
formatter.result({
  "duration": 3103011098,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnAddToCartButtonInAppleMacBookProInchProduct()"
});
formatter.result({
  "duration": 1816005730,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//input[@id\u003d\"add-to-cart-button-4\"]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MISHU\u0027, ip: \u0027192.168.1.25\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat Gerkin.Utils.click_Element(Utils.java:24)\r\n\tat Gerkin.MyStepdefs.userClickOnAddToCartButtonInAppleMacBookProInchProduct(MyStepdefs.java:71)\r\n\tat ✽.And user click on add to cart button in Apple MacBook Pro  inch product(src/test/Resources/FeatureFiles/buyingproduct.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnShoppingCartButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.useSelectTermsAndConditions()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.userClickOnCheckoutButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.userEnterBillingAndShippingAddresses()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.userSelectShippingMethodAndPaymentMethod()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.userEnterValidPaymentDetails()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.userClickOnConfirmButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.userShouldSeePaymentConfirmationMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 711167704,
  "status": "passed"
});
formatter.uri("src/test/Resources/FeatureFiles/currencyChangeToEuro.feature");
formatter.feature({
  "line": 4,
  "name": "User  to wants change the currency dollar to euro",
  "description": "",
  "id": "user--to-wants-change-the-currency-dollar-to-euro",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@currencyToEuro"
    },
    {
      "line": 2,
      "name": "@all"
    }
  ]
});
