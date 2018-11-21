package tests.uiTests;

import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class GetAllRepresentativesNamesForSelectedTest extends UITestBaseClass {
    String result = "[Byrne, Bradley, Roby, Martha, Rogers, Mike, Aderholt, Robert, Brooks, Mo, Palmer, Gary, Sewell, Terri A.]";

    /**
     * Check if landed homepage
     * Click representatives link
     * List by state and district
     * call getAllRepresentativeNamesForSelectedState method from directory page
     * put state as argument in the format "state-...."
     * Convert into string format
     * Prepare a string variable for expected result with respective values
     * Check if actual and expected matches
     */
    @Test
    public void areAllRepsNamesForSelectedStateDisplayed(){
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.isHomePageLogoDisplayed();
        homePage.clickRepresentativesLink();
        DirectoryPage directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        directoryPage.clickListByStateandDistrict();
        assertEquals(result, directoryPage.getAllRepresentativeNamesForSelectedState("state-alabama").toString());
    }
}
