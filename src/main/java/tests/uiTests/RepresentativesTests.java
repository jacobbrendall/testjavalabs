package tests.uiTests;

import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class RepresentativesTests extends UITestBase {
    String result = "[Byrne, Bradley, Roby, Martha, Rogers, Mike, Aderholt, Robert, Brooks, Mo, Palmer, Gary, Sewell, Terri A.]";

    /**
     * Click representatives link
     * List by state and district
     * call getAllRepresentativeNamesForSelectedState method from directory page
     * put state as argument in the format "state-...."
     * Convert into string format
     * Prepare a string variable for expected result with respective values
     * Check if actual and expected matches
     */
    @Test
    public void allRepsNamesForSelectedStateShouldDisplayed(){
        homePage.clickRepresentativesLink();
        directoryPage.clickListByStateAndDistrictLink();
        Assert.assertEquals(result, directoryPage.getAllRepresentativeNamesForSelectedState("state-alabama").toString());
    }
}
