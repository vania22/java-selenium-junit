package testproject.managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    public WebDriver createDriverInstance() {
        WebDriver driver;
        String browser = System.getProperty("Browser");

        if (browser == null) {
            browser = "chrome";
        }

        switch (browser.toLowerCase()) {
            case "chrome":
                driver = initializeChromeDriver();
                driver.manage().window().maximize();
                break;
            case "firefox":
                driver = initializeFirefoxDriver();
                driver.manage().window().maximize();
                break;
            default:
                throw new InvalidArgumentException("Browser property passed to mvn: '" + browser + "' is not supported");
        }

        return driver;
    }

    private WebDriver initializeChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private WebDriver initializeFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
}
