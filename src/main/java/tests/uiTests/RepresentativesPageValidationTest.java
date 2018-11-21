package tests.uiTests;

import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import tests.uiTests.UITestBaseClass;

public class RepresentativesPageValidationTest extends UITestBaseClass {
    /**
     * Check if landed homepage.
     * Go to representatives
     * Validate if directory of representatives text displayed.
     */
    @Test
    public void isDirectoryOfRepresentativesDisplayedTest() {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.isHomePageLogoDisplayed();
        homePage.clickRepresentativesLink();
        DirectoryPage directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        assert directoryPage.isDisplayedDirectoryOfRepresentativesText();

    }
}
