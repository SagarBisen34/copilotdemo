package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {

        
        public  WebDriver driver;

        @Given("I am on the login page")
        public void iAmOnLoginPage() {
            // Implementation code to navigate to the login page
            System.setProperty("webdriver.chrome.driver", "D:\\AI-CopilotDemo\\aicopilotdemo\\drivers\\chromedriver.exe");
            // Create a new instance of ChromeDriver
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://edockets.qa.alncorp.com/");
            // Wait for submit button to be clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.name("button")));
            System.out.println("User is on Login Page");
        }   

    @When("I enter valid username and password")
    public void iEnterValidUsernameAndPassword() {
        // Implementation code to enter valid username and password
        WebElement username = driver.findElement(By.name("Username"));
        WebElement password = driver.findElement(By.name("Password"));
        username.sendKeys("ppalle@alncorp.com");
        password.sendKeys("P@ssw0rd");
        
    }

    @When("I click on the login button")
    public void iClickOnLoginButton() {
        // Implementation code to click on the login button
        WebElement submitButton = driver.findElement(By.name("button"));
        submitButton.click();
    }

    @Then("I should be redirected to the home page")
    public void iShouldBeRedirectedToHomePage() {
        // Implementation code to verify redirection to the home page
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//mat-icon[text()='search']")));
        System.out.println("User is on Home Page");
    }

    @When("I enter invalid username and password")
    public void iEnterInvalidUsernameAndPassword() {
        // Implementation code to enter invalid username and password
        WebElement username = driver.findElement(By.name("Username"));
        WebElement password = driver.findElement(By.name("Password"));
        username.sendKeys("ppalle@alncorp.com");
        password.sendKeys("hdushs");
    }

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
        // Implementation code to verify the presence of an error message
        WebElement errorMessage = driver.findElement(By.xpath("//div[contains(@class,'validation-summary-errors')]//li[1]"));
        String message = errorMessage.getText();
        System.out.println("Error message: " + message);

        
    }


}
