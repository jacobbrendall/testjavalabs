package tests.uiTests;

import domain.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class LandOnHomePageTests extends UITestBase {
    /**
     * Validate if landed on homepage
     */
    @Test
    public void homePageLogoShouldDisplayed(){
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        Assert.assertTrue(homePage.isHomePageLogoDisplayed());
    }
}
