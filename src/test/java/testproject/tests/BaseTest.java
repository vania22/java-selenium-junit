package testproject.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import testproject.utils.DriverManager;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    protected void setUp() {
        System.out.println("BeforeEach");
        driver = new DriverManager().createDriverInstance();
    }

    @AfterEach()
    protected void tearDown() {
        driver.quit();
    }

//    @Attachment(type = "image/png")
//    public byte[] attachScreenShot() {
//        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//    }
}
