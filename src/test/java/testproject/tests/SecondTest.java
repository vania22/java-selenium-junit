package testproject.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import testproject.pages.HomePage;

public class SecondTest extends BaseTest {

    @DisplayName("Second Test")
    @Tag("still-must-run")
    @Test
    public void secondTest() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
    }

    @DisplayName("Third Test")
    @Tag("exclude-this")
    @Test
    public void thirdTest() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
    }
}
