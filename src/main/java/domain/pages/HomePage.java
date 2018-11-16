package domain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomePage {
    Boolean result;
    String regex = "^[0-9]{5}(?:-[0-9]{4})?$";

    @FindBy (xpath = "(//a[@href = '/representatives'])[1]")
    private WebElement representativesLink;

    @FindBy (xpath = "//button[@value='Look up'][1]")
    private WebElement lookUpZipCodeButton;

    @FindBy (xpath = "//input[@id='header-find-rep-zip-code']")
    private WebElement inputZipCode;

    @FindBy (xpath = "//*[contains(text(), 'You submitted an invalid Zip Code')] ")
    private WebElement invalidZipCodeText;

    @FindBy (xpath = "//img[@class='repPhoto'] ")
    private WebElement representativePhoto;

    @FindBy (xpath = "//div[@name='RepeatReps']")
    private WebElement atLeastTwoRepresentativesFound;

    @FindBy (xpath = "//input[@value='FIND YOUR REP BY ADDRESS']")
    private WebElement findYourRepByAddressButton;

    public void clickRepresentativesLink(){
        representativesLink.click();
    }

    public String enterZipCode(String zipCode) {
        Pattern pattern =Pattern.compile(regex);
        Matcher matcher =pattern.matcher(zipCode);
        inputZipCode.sendKeys(zipCode);
        lookUpZipCodeButton.click();
        if (matcher.matches()){
            if(atLeastTwoRepresentativesFound.isDisplayed()) {
                result = findYourRepByAddressButton.isDisplayed();
            } else if(representativePhoto.isDisplayed())
            result = representativePhoto.isDisplayed();
        }
        else {
            result = invalidZipCodeText.isDisplayed();
        }
        return result.toString();
    }

}
