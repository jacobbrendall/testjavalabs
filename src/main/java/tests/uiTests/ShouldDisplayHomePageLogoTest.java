package tests.uiTests;

import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import tests.uiTests.UITestBaseClass;

public class ShouldDisplayHomePageLogoTest extends UITestBaseClass {
    /**
     * Validate if landed on homepage
     */
    @Test
    public void isHomePageLogoDisplayed(){
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        assert homePage.isHomePageLogoDisplayed();
    }
}
