package tests.uiTests;

import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import tests.uiTests.UITestBaseClass;

public class RepresentativesPageValidationTest extends UITestBaseClass {

    @Test
    public void representativeTestValidation() {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        DirectoryPage directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        homePage.clickRepresentativesLink();
        assert directoryPage.isDisplayedDirectoryOfRepresentativesText();

    }
}
