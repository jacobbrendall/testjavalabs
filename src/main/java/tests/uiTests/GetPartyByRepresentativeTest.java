package tests.uiTests;

import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import tests.uiTests.UITestBaseClass;

import static org.junit.Assert.assertEquals;

public class GetPartyByRepresentativeTest extends UITestBaseClass {

    @Test
    public void getPartyByReps(){
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.clickRepresentativesLink();
        DirectoryPage directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        directoryPage.isDisplayedDirectoryOfRepresentativesText();
        directoryPage.clickListByStateandDistrict();
        directoryPage.isAlabamaTextDisplayed();
        assertEquals("D", directoryPage.getPartyByRepresentative("Grijalva"));
    }
}
