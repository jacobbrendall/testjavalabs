package tests.uiTests;

import domain.pages.DirectoryPage;

import domain.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;


public class SortingOrderTests extends UITestBase {

    /**
     * Go to representatives.
     * List by state and district.
     * Check if Alabama is the first state to validate listed by state and district.
     */
    @Test
    public void shouldListedByStateAndDistrict() {
        homePage.clickRepresentativesLink();
        directoryPage.clickListByStateAndDistrict();
        Assert.assertTrue(directoryPage.isAlabamaTextDisplayed());

    }
}


