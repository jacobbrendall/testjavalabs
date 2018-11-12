package domain.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DirectoryPage {
    private WebDriver driver;
    public String stateTextXpath = "//*[@id='%s']/..//td[2]";
    public final String partyXpath = "(//a[contains(text(),'Byrne, Bradley')])[1]/../following-sibling::td[1]";
    public List<WebElement> states;


    @FindBy(xpath =  "//h1[contains (text(), 'Directory of Representatives')]")
    private WebElement directoryOfRepresentativesText;
    @FindBy (linkText = "By State and District")
    private WebElement listByStateandDistrict;
    @FindBy (xpath = "//caption[@id='state-alabama']")
    private WebElement alabamaText;
    @FindBy (xpath = partyXpath)
    private WebElement partyName;

    public DirectoryPage (WebDriver driver){
        this.driver = driver;
    }

    public boolean isDisplayedDirectoryOfRepresentativesText(){
        return directoryOfRepresentativesText.isDisplayed();
    }
    public void clickListByStateandDistrict(){
        listByStateandDistrict.click();
    }
    public boolean isAlabamaTextDisplayed(){ return alabamaText.isDisplayed();}
    public void getAllRepresentativeNamesForSelectedState(String state){
        String stateXpath = String.format(stateTextXpath, state);
        List<WebElement> states = driver.findElements(By.xpath(stateXpath));
        for (WebElement stat : states) {
            System.out.println(stat.getText());
        }
    }
    //public char getPartyByRepresentative(String representativeName){

    //}
    //public List<String> getAllStates(){}

}
