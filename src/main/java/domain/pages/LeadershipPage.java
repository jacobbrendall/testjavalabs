package domain.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadershipPage extends HomePage {



    @FindBy(xpath = "//h1[@class='page-header']")
    private WebElement leadershipTitle;

    public LeadershipPage(WebDriver driver){
        super(driver);
        //this.driver = driver;
    }

    public boolean isLeadershipTitlePresent() {
        return leadershipTitle.isDisplayed();
    }
}
