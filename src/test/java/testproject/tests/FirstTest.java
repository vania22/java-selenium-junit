package testproject.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import testproject.pages.HomePage;

public class FirstTest extends BaseTest {

    @DisplayName("First Test")
    @Tag("must-run")
    @Test
    public void firstTest() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        // homePage.waitForChangedArgument();
    }
}
