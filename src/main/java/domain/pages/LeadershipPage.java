package domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class LeadershipPage extends HomePage {

    public String expectedResult = "[Majority Leader\n"+
            "Rep. Kevin McCarthy\n"+
            "Represents Republicans on the House floor., Majority Whip\n" +
            "Rep. Steve Scalise\n"+
            "Assists leadership in managing party's legislative program., Republican Conference Chairman\n"+
            "Rep. Cathy McMorris Rodgers\n"+
            "Heads organization of all Republican Party members in the House., Republican Policy Committee Chairman\n" +
            "Rep. Luke Messer\n"+
            "Heads Conference forum for policy development.]";


    @FindBys ({@FindBy(xpath = "(//div[@class='row'])[4]/div[1]/p")})
    private List<WebElement> republicanReps;

    @FindBy(xpath = "//h1[@class='page-header']")
    private WebElement leadershipTitle;

    @FindBy(xpath = "(//a[@href='/leadership'])[1]")
    private WebElement leadershipLink;

    @FindBy(xpath = "//a[@href='http://majorityleader.house.gov']")
    private WebElement leaderLink;


    public LeadershipPage(WebDriver driver){
        super(driver);
    }

    public boolean isLeadershipTitlePresent() {
        leadershipLink.click();
        return leadershipTitle.isDisplayed();
    }


    public List<String> isRepublicanLeadsDisplayed() {
        List<String> leadReps = new ArrayList<String>();
        for (WebElement r:republicanReps){
            leadReps.add(r.getText());
        }
        return leadReps;
    }
}
