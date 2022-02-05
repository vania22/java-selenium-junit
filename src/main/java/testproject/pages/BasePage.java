package testproject.pages;

import org.openqa.selenium.WebDriver;
import testproject.utils.WaitManager;

public class BasePage {
    protected WebDriver driver;
    protected WaitManager wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitManager(driver);
    }
}
