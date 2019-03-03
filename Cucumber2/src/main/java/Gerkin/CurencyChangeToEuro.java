package Gerkin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class CurencyChangeToEuro extends Utils

{

    HomePage homepage = new HomePage();
    SoftAssert softAssert = new SoftAssert();

    public void dollorToEuro()
    {
        homepage.changeCurrencyToEuro();
    }

    public void jewelleryPage()
    {
        homepage.jewelryPage();

    }
    public void currencyChangeConfirmation()
    {
        List<WebElement> list = findElements(By.xpath("//div[@class=\"item-grid\"]/div[1]/div/div[2]/div[3]/div[1]/span"));
        for (WebElement ab: list)
        {
            String symbol = ab.getText();
            String price = symbol.replaceAll("[,.1234567890]", "");//to conver only in euro sign
            System.out.println(price); // to make sure we get euro sign
            assert_element(price, "Ђ per  day(s)", "U need to click on euro");//comapare with sign

        }

    }
}
