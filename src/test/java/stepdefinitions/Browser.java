package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://edockets.qa.alncorp.com");

        login(driver);
        clickButton(driver);
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
