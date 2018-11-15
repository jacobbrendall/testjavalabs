package domain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy (xpath = "(//a[@href = '/representatives'])[1]")
    private WebElement representativesLink;

    public void clickRepresentativesLink(){
        representativesLink.click();
    }

    public void enterZipCode(String zipCode){}


}
