package tests.uiTests;

import domain.pages.LeadershipPage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Map;

public class leadershipTests extends UITestBase{
    @Test
    public void shouldDisplayLeadership(){
        String actualResult = " ";
        String expectedResult = "Majority Leader\n"+
        "Rep. Kevin McCarthy\n"+
        "Represents Republicans on the House floor.Majority Whip\n" +
        "Rep. Steve Scalise\n"+
        "Assists leadership in managing party's legislative program.Republican Conference Chairman\n"+
        "Rep. Cathy McMorris Rodgers\n"+
        "Heads organization of all Republican Party members in the House.Republican Policy Committee Chairman\n" +
        "Rep. Luke Messer\n"+
        "Heads Conference forum for policy development.";
        LeadershipPage leadershipPage = new PageFactory().initElements(driver, LeadershipPage.class);
        leadershipPage.isLeadershipTitlePresent();
        for(String e:leadershipPage.partyLeads()) {
            actualResult = actualResult + e;
        }
        Assert.assertEquals(actualResult.trim(), expectedResult.trim());
    }
}
