package tests.uiTests;

import domain.pages.DirectoryPage;

import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import tests.uiTests.UITestBaseClass;


public class ShouldListByStateAndDistrictTest extends UITestBaseClass {


    @Test
    public void listByStateandDistrict() {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.clickRepresentativesLink();
        DirectoryPage directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        directoryPage.isDisplayedDirectoryOfRepresentativesText();
        directoryPage.clickListByStateandDistrict();
        assert directoryPage.isAlabamaTextDisplayed();

    }
}


