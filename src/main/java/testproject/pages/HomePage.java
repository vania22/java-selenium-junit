package testproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    By firstRow = By.xpath("(//div[@id='content']/div)[2]");

    public void navigate() {
        driver.get("http://the-internet.herokuapp.com/dynamic_content");
    }

    public void waitForChangedArgument() {
        wait.waitForArgument(firstRow, "class", "newrow", Duration.ofSeconds(20));
    }
}
