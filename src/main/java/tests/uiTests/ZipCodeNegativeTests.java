package tests.uiTests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class ZipCodeNegativeTests extends UITestBase {

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
    public String zipCodeNegative;

    @Parameterized.Parameters(name="negaitive test data")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"6336"},
                {"001aarg"}
        });
    }

    //TODO add more data
    @Test
    public void singleRepSearchWithZipSearchShouldPassForPositiveData() {
        searchResultsPage.enterZipCodeAndSubmit(zipCodeNegative);
        Assert.assertFalse(searchResultsPage.isRepImagePresent());
    }

}

