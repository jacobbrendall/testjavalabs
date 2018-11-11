package domain.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DirectoryPage extends HomePage {
    private WebDriver driver;

    public DirectoryPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath =  "//h1[contains (text(), 'Directory of Representatives')]")
    private WebElement directoryOfRepresentativesText;

    public void isDisplayedDirectoryOfRepresentativesText(){
        directoryOfRepresentativesText.isDisplayed();
    }

    @FindBy (linkText = "By State and District")
    private WebElement listByStateandDistrict;

    public void clickListByStateandDistrict(){
        listByStateandDistrict.click();
    }



}
