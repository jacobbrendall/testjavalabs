package tests.uiTests;

import domain.pages.LeadershipPage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Map;

public class leadershipTests extends UITestBase{
    @Test
    public void shouldDisplayRepublicanLeadership(){
        LeadershipPage leadershipPage = new PageFactory().initElements(driver, LeadershipPage.class);
        leadershipPage.isLeadershipTitlePresent();
        Assert.assertEquals(leadershipPage.expectedResult.trim(), leadershipPage.isRepublicanLeadsDisplayed().toString());
    }
}
