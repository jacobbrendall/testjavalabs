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
     */
    @Test
    public void FindYourRepButtonShouldAppearAfterEnteringZipCode() {
        homePage.enterZipCodeAndSubmit("92656");
        Assert.assertTrue(homePage.isFindYourRepButtonPresent());
    }
}

