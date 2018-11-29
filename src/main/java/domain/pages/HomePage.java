package domain.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomePage {
    Boolean result;
    String regex = "^[0-9]{5}(?:-[0-9]{4})?$";

    @FindBy (xpath = "//a[@title='Home']")
    private WebElement homePageLogo;

    @FindBy(xpath = "(//a[@href = '/representatives'])[1]")
    private WebElement representativesLink;

    @FindBy(xpath = "//button[@value='Look up'][1]")
    private WebElement lookUpZipCodeButton;

    @FindBy(xpath = "//input[@id='header-find-rep-zip-code']")
    private WebElement inputZipCode;

    @FindBy(xpath = "//form[contains(text(), 'Enter a zip code:')]")
    private WebElement invalidZipCodeText;

    @FindBy(xpath = "//img[@class='repPhoto']")
    private WebElement imageRepresentative;

    @FindBy(xpath = "(//img[@class='repPhoto'])[2]")
    private WebElement moreThanOneRepresentativeFound;

    @FindBy(xpath = "//input[@value='FIND YOUR REP BY ADDRESS']")
    private WebElement findYourRepByAddressButton;

    public void clickRepresentativesLink() {
        representativesLink.click();
    }

    public void enterZipCodeAndSubmit(String zipCode) {
        inputZipCode.clear();
        inputZipCode.sendKeys(zipCode);
        lookUpZipCodeButton.click();
    }

    public boolean isRepPhotoDisplayed(){
        return imageRepresentative.isDisplayed();
    }

    public boolean isAtleastTwoRepresentativesFound() {
        return moreThanOneRepresentativeFound.isDisplayed();
    }

    public boolean isFindYourRepButtonPresent(){
         return findYourRepByAddressButton.isDisplayed();
    }

    public boolean isHomePageLogoDisplayed(){
       return homePageLogo.isDisplayed();
    }
}
