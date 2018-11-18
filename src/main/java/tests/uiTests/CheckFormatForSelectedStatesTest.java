package tests.uiTests;

import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class CheckFormatForSelectedStatesTest extends UITestBaseClass{

    @Test
    public void checkFormat(){
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        DirectoryPage directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        homePage.validateHomePage();
        homePage.clickRepresentativesLink();
        directoryPage.isDisplayedDirectoryOfRepresentativesText();
        directoryPage.checkFormatInTheRowsForSelectedState("state-alabama");
    }
}
