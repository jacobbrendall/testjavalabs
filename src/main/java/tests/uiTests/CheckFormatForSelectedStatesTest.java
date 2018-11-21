package tests.uiTests;

import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class CheckFormatForSelectedStatesTest extends UITestBaseClass{
    /* Should test whether all elements matches with regex are returned correctly*/
    @Test
    public void shouldCheckDesiredFormat(){
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        DirectoryPage directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        homePage.isHomePageLogoDisplayed();
        homePage.clickRepresentativesLink();
        directoryPage.isDisplayedDirectoryOfRepresentativesText();
        directoryPage.checkFormatInTheRowsForSelectedState("state-alabama");
        Assert.assertTrue(directoryPage.checkFormatInTheRowsForSelectedState("state-alabama"));
    }
}
