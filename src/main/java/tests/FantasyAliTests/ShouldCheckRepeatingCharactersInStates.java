package tests.FantasyAliTests;

import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import tests.uiTests.UITestBase;

import java.util.*;


public class ShouldCheckRepeatingCharactersInStates extends UITestBase {

    @Test
    public void printTheMostRepeatingCharacterInStates() {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.clickRepresentativesLink();
        DirectoryPage directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        directoryPage.clickListByStateAndDistrictLink();


        Map<String, String> repeatingChars = new HashMap<String, String>();
        Map<String, Integer> countMap = new HashMap<String, Integer>();
        for (String i : directoryPage.getSortedStates()) {
            char[] count = i.toLowerCase().toCharArray();
            for (char chr : count) {
                if (countMap.containsKey(Character.toString(chr))) {
                    countMap.put(Character.toString(chr), countMap.get(Character.toString(chr)) + 1);
                } else {
                    countMap.put(Character.toString(chr), 1);
                }
            }
            int maxValue = (Collections.max(countMap.values()));
            for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() == maxValue) {
                    repeatingChars.put(i, entry.getKey());
                }
            }

            countMap.clear();
        }
        System.out.println(Collections.singletonList(repeatingChars));
    }
}
