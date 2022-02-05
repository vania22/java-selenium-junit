package testproject.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitManager {
    private WebDriver driver;

    public WaitManager(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForArgument(By by, String attributeName, String attributeValue, Duration duration) {
        WebDriverWait wait = new WebDriverWait(driver, duration);
//        try {
//            wait.until(driver -> {
//                try {
//                    return driver.findElement(by).getAttribute(attributeName).equals(attributeValue);
//                } catch (Exception e) {
//                    return false;
//                }
//            });
//        } catch (TimeoutException e) {
//           throw new TimeoutException("Attribute '" + attributeName + "' for element with locator '" + by.toString() + "' doesn't have a value of '" + attributeValue + "'");
//        }

        wait
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class)
                .withMessage("Attribute '" + attributeName + "' for element with locator '" + by.toString() + "' doesn't have a value of '" + attributeValue + "'")
                .until(driver -> driver.findElement(by).getAttribute(attributeName).equals(attributeValue));
    }

    public void waitForElementToBeVisible(By by, Duration duration) {
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
