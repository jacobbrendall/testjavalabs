package domain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage {

    @FindBy(xpath = "//form[contains(text(), 'Enter a zip code:')]")
    private WebElement invalidZipCodeText;

    @FindBy(xpath = "//img[@class='repPhoto']")
    private WebElement imageRepresentative;

    @FindBy(xpath = "(//img[@class='repPhoto'])[2]")
    private WebElement imageSecondRepresentative;

    @FindBy(xpath = "//input[@value='FIND YOUR REP BY ADDRESS']")
    private WebElement findYourRepByAddressButton;

    public boolean isFindYourRepByAddressButtonPresent() {
        return findYourRepByAddressButton.isDisplayed();
    }

    public boolean isRepImagePresent() {
        return imageRepresentative.isDisplayed() || imageSecondRepresentative.isDisplayed();
    }

}
