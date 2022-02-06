package testproject.tests;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import testproject.managers.DriverManager;
import testproject.managers.LogManager;

public class BaseTest {
    protected WebDriver driver;
    protected Logger log = LogManager.getLogger();

    @BeforeEach
    protected void setUp() {
        log.info("Initialize driver before test");
        driver = new DriverManager().createDriverInstance();
    }

    @AfterEach()
    protected void tearDown() {
        log.info("Destroy driver after test");
        driver.quit();
    }

//    @Attachment(type = "image/png")
//    public byte[] attachScreenShot() {
//        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//    }
}
