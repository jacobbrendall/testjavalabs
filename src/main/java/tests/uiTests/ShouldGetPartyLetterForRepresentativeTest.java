package tests.uiTests;

import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import tests.uiTests.UITestBaseClass;

import static org.junit.Assert.assertEquals;

public class ShouldGetPartyLetterForRepresentativeTest extends UITestBaseClass {
    /**
     * Go to representatives.
     * List by state and district.
     * Call for getPartyByRepresentative method from directory page to retrieve party name of selected representative.
     */
    @Test
    public void getPartyByReps(){
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.clickRepresentativesLink();
        DirectoryPage directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        directoryPage.clickListByStateandDistrict();
        assertEquals("D", directoryPage.getPartyByRepresentative("Grijalva"));
    }
}
