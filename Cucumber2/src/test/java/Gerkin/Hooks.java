package Gerkin;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage  {


    @Before
    public void setUp() {
     chrome_Driver();
       // browser.selectBrowser();
    }


    @After

    public void afterMethod(){

        driver.quit();
    }
//    public void after(ITestResult result)
//    {
//        if (ITestResult.FAILURE == result.getStatus())
//        {
//            try
//            {
//                TakesScreenshot ts = (TakesScreenshot) driver;
//                File source = ts.getScreenshotAs(OutputType.FILE);
//                FileUtils.copyFile(source, new File("src\\test\\Resources\\Screenshot" + result.getName() + ".png"));
//                System.out.println("Screenshot taken");
//            }
//            catch (Exception e)
//            {
//                System.out.println("exception while taking Screenshot " + e.getMessage());
//            }
//
//        }


    }







