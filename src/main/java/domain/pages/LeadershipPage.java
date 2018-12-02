package domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class LeadershipPage {

    WebDriver driver;



    @FindBy(xpath = "//h1[@class='page-header']")
    private WebElement leadershipTitle;

    @FindBy(xpath = "(//a[@href='/leadership'])[1]")
    private WebElement leadershipLink;

    @FindBy(xpath = "//a[@href='http://majorityleader.house.gov']")
    private WebElement leaderLink;


    public LeadershipPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isLeadershipTitlePresent() {
        leadershipLink.click();
        return leadershipTitle.isDisplayed();
    }


    public List<String> isRepublicanLeadsDisplayed() {
        List<String> leadReps = new ArrayList<String>();
        for (int i = 1; i < 5; i++) {
            String xpathValue = "(//div[@class='row'])[4]/div[1]/p[" + i + "]";
            leadReps.add(driver.findElement(By.xpath(xpathValue)).getText());
        }
        return leadReps;
    }
}
