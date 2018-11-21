package tests.uiTests;

import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertTrue;

public class EnterZipCodeTest extends UITestBaseClass {
    /**
     * Call for enterZipCode method from Homepage.
     * Put zipcode as an argument.
     * Check one of the expected result:
     * isRepPhotoDisplayed or
     * IsAtleastTwoRepresentativesFound
     * isFindYourRepButtonPresent.
     */
    @Test
    public void isFindYourRepButtonAppearAfterEnteringZipCode(){
    HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
    homePage.enterZipCodeAndSubmit("92656");
    assert homePage.isFindYourRepButtonPresent();
    }
}

