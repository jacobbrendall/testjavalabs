package tests.uiTests;

import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import tests.uiTests.UITestBaseClass;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class GetAllStatesTest extends UITestBaseClass {

    String allstates = "[Alabama, Alaska, American Samoa, Arizona, Arkansas]";
    @Test
    public void getAllStatesOfReps() {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.clickRepresentativesLink();
        DirectoryPage directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        directoryPage.isDisplayedDirectoryOfRepresentativesText();
        directoryPage.clickListByStateandDistrict();
        directoryPage.isAlabamaTextDisplayed();

        assertEquals (allstates, directoryPage.getAllStatesWithA().toString());
    }
}
