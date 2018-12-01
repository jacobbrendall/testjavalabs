package tests.uiTests;

import domain.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertTrue;

public class ZipCodeTests extends UITestBase {

    /**
     * Call for enterZipCode method from Homepage.
     * Put zipcode as an argument.
     * Check one of the expected result:
     * isRepPhotoDisplayed or
     * IsAtleastTwoRepresentativesFound
     * isFindYourRepButtonPresent.
     * Assert find your rep txt is present
     * Assert zip code is the same as entry
     */
    @Test
    public void singleRepSearchWithZipSearchShouldPass() {
        homePage.enterZipCodeAndSubmit("63367");
        Assert.assertTrue(searchResultsPage.isRepImagePresent());
    }

    //TODO consider using soft assertions
    @Test
    public void multipleRepSearchWithZipSearchShouldPass() {
        homePage.enterZipCodeAndSubmit("92656");
        Assert.assertTrue(searchResultsPage.isRepImagePresent());
        Assert.assertTrue(searchResultsPage.isFindYourRepByAddressButtonPresent());
    }

}

