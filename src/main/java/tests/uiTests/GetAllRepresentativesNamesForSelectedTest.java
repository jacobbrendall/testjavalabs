package tests.uiTests;

import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class GetAllRepresentativesNamesForSelectedTest extends UITestBaseClass {
    String result = "[Byrne, Bradley, Roby, Martha, Rogers, Mike, Aderholt, Robert, Brooks, Mo, Palmer, Gary, Sewell, Terri A.]";
    /*Checks 
    @Test
    public void getAllRepsNamesForSelected(){
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.clickRepresentativesLink();
        DirectoryPage directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        directoryPage.clickListByStateandDistrict();
        assertEquals(result, directoryPage.getAllRepresentativeNamesForSelectedState("state-alabama").toString());
    }
}
