package tests.uiTests;

import domain.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertTrue;

@RunWith(Parameterized.class)
public class ZipCodePositiveTests extends UITestBase {

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


    @Parameterized.Parameter(0)
    public String zipCodePositive;

    @Parameterized.Parameters(name="positive test data")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"63367"},
                {"23454"}
        });
    }

    @Test
    public void singleRepSearchWithZipSearchShouldPassForPositiveData() {
        searchResultsPage.enterZipCodeAndSubmit(zipCodePositive);
        Assert.assertTrue(searchResultsPage.isRepImagePresent());
    }

    //TODO consider using soft assertions
    @Test
    public void multipleRepSearchWithZipSearchShouldPass() {
        searchResultsPage.enterZipCodeAndSubmit("92656");
        Assert.assertTrue(searchResultsPage.isRepImagePresent());
        Assert.assertTrue(searchResultsPage.isFindYourRepByAddressButtonPresent());
    }

}

