package tests.uiTests;

import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class PartyTests extends UITestBase {
    /**
     * Go to representatives.
     * List by state and district.
     * Call for getPartyByRepresentative method from directory page to retrieve party name of selected representative.
     */
    @Test
    public void partyOfRepShouldDemonstrated(){
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.clickRepresentativesLink();
        DirectoryPage directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        directoryPage.clickListByStateAndDistrict();
        Assert.assertEquals("D", directoryPage.getPartyByRepresentative("Grijalva"));
    }
}
