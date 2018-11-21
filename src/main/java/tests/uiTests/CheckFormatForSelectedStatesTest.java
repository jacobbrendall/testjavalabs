package tests.uiTests;

import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class CheckFormatForSelectedStatesTest extends UITestBaseClass{
    /**
     * Create a desired format in "checkFormatInTheRowsForSelectedState" method in HomePage.
     * Select a state as an argument for the same method in the form "state-.....".
     * Check if you have landed on Homepage.
     * Click representatives link.
     * Check if all values in respective columns match with regex format.
     * return boolean
     */
    @Test
    public void isMatchWithDesiredFormat(){
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        DirectoryPage directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        homePage.isHomePageLogoDisplayed();
        homePage.clickRepresentativesLink();
        directoryPage.isDisplayedDirectoryOfRepresentativesText();
        Assert.assertTrue(directoryPage.checkFormatInTheRowsForSelectedState("state-alabama"));
    }
}
