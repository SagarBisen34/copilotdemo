package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
    public static void main(String[] args) {

        // Launch ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().browserVersion("114.0.5735.91").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless"); 
        WebDriver driver = new ChromeDriver();

        driver.get("https://edockets.qa.alncorp.com");

        login(driver);
        clickButton(driver);
        driver.quit();
    }

    private static void login(WebDriver driver) {
        if (driver.findElement(By.name("Username")).isDisplayed()) {
            driver.findElement(By.name("Username")).sendKeys("ppalle@alncorp.com");
            System.out.println("User is on the login page");
        }
    }

    private static void clickButton(WebDriver driver) {
        if (driver.findElement(By.name("button")).isEnabled()) {
            driver.findElement(By.name("button")).click();
            System.out.println("User clicked on the button");
        }
    }
}
