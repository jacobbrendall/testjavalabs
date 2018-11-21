package tests.uiTests;

import domain.pages.DirectoryPage;

import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import tests.uiTests.UITestBaseClass;


public class ShouldListByStateAndDistrictTest extends UITestBaseClass {

    /**
     * Check if landed on homepage.
     * Go to representatives.
     * List by state and district.
     * Check if Alabama is the first state to validate listed by state and district.
     */
    @Test
    public void isListedByStateAndDistrict() {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.isHomePageLogoDisplayed();
        homePage.clickRepresentativesLink();
        DirectoryPage directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        directoryPage.isDisplayedDirectoryOfRepresentativesText();
        directoryPage.clickListByStateandDistrict();
        assert directoryPage.isAlabamaTextDisplayed();

    }
}


