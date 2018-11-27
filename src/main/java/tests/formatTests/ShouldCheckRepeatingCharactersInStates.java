package tests.formatTests;

import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import tests.uiTests.UITestBaseClass;

import java.util.*;
import java.util.stream.Collectors;
import org.apache.commons.collections.bidimap.DualHashBidiMap;

public class ShouldCheckRepeatingCharactersInStates extends UITestBaseClass {

    @Test
    public void printTheMostRepeatingCharacterInStates() {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.clickRepresentativesLink();
        DirectoryPage directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        directoryPage.clickListByStateandDistrict();


        Map<String, String> repeatingChars = new HashMap<String, String>();
        Map<String, Integer> countMap = new HashMap<String, Integer>();
        for (String i : directoryPage.getAllStatesSorted()) {
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
