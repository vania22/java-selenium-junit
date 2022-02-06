package testproject.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import testproject.managers.LogManager;
import testproject.managers.WaitManager;

public class BasePage {
    protected WebDriver driver;
    protected WaitManager wait;
    protected Logger log = LogManager.getLogger();

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitManager(driver);
    }
}
