package tests.uiTests;

import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertTrue;

public class EnterZipCodeTest extends UITestBaseClass {
    /*Checks whether "find your representative button" appears when there is more than one representative*/
    @Test
    public void isZipCodeCorrect(){
    HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
    homePage.enterZipCodeAndSubmit("92656");
    assert homePage.isFindYourRepButtonPresent();
    }
}

