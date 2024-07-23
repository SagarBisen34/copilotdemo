package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = {"D:/AI-CopilotDemo/aicopilotdemo/src/test/resources/features/login.feature"},
        glue ={"stepdefinitions"},
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@invalidLogin" 
)
public class junittTestRunner {

}