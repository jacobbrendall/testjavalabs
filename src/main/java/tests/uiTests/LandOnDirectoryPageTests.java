package tests.uiTests;

import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class LandOnDirectoryPageTests extends UITestBase {
    /**
     * Go to representatives
     * Validate if directory of representatives text displayed.
     */
    @Test
    public void directoryOfRepresentativesShouldDisplayed() {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.clickRepresentativesLink();
        DirectoryPage directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        Assert.assertTrue(directoryPage.isDisplayedDirectoryOfRepresentativesText());

    }
}
