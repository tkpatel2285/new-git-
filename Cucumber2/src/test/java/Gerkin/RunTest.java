package Gerkin;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features=".",tags = "@all",format = {"pretty","html:target/cucumber-reports"})

public class RunTest  {

}



