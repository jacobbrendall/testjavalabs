package tests.uiTests;

import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import tests.uiTests.UITestBaseClass;

public class HomePageValidationTest extends UITestBaseClass {

    @Test
    public void homePageValidation(){
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        assert homePage.validateHomePage();
    }
}
