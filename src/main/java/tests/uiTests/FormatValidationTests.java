package tests.uiTests;

import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class FormatValidationTests extends UITestBase {
    /**
     * Create a desired format in "checkFormatInTheRowsForSelectedState" method in HomePage.
     * Select a state as an argument for the same method in the form "state-.....".
     * Check if all values in respective columns match with regex format.
     * return boolean
     */
    @Test
    public void repTableRowContentShouldMatchFormat(){
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.clickRepresentativesLink();
        DirectoryPage directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        Assert.assertTrue("true", directoryPage.checkPhoneFormatForSelectedState("state-alabama"));
    }
}
