package tests.uiTests;

import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertTrue;

public class EnterZipCodeTest extends UITestBaseClass {

    @Test
    public void isZipCodeCorrect(){
    HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
    homePage.enterZipCode("92656");
    assert homePage.findyourRepByAddressButton();
    }
}

