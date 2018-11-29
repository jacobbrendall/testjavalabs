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
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.clickRepresentativesLink();
        DirectoryPage directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        directoryPage.clickListByStateAndDistrict();
        Assert.assertTrue(directoryPage.isAlabamaTextDisplayed());

    }
}


