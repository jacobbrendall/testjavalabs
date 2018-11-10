package domain.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(css = "#block-mainnavigation > ul > li:nth-child(1) > a")
    private WebElement representativesLink;

    @FindBy(xpath = "//input[@id='header-find-rep-zip-code']")
    private WebElement homePageZipCodeInput;

    @FindBy(css = "#block-mainnavigation > ul > li:nth-child(2) > a")
    private WebElement leadershipLink;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRepresentativesLink() {
        representativesLink.click();
    }

    public boolean isHomePageZipCodeInputPresent() {
        return homePageZipCodeInput.isDisplayed();
    }

    public void clickLeaderShipLink() {
        leadershipLink.click();
    }
}
