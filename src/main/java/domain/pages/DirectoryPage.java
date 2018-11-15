package domain.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class DirectoryPage {
    private WebDriver driver;
    public String stateTextXpath = "//*[@id='%s']/..//td[2]";
    public final String partyXpath = "(//a[contains(text(),'Byrne, Bradley')])[1]/../following-sibling::td[1]";
    public List<WebElement> states;
    String partyXpathByName = "(//a[contains(text(), '%s')])[1]/../following-sibling::td[1]";


    @FindBy(xpath =  "//h1[contains (text(), 'Directory of Representatives')]")
    private WebElement directoryOfRepresentativesText;

    @FindBy (linkText = "By State and District")
    private WebElement listByStateandDistrict;

    @FindBy (xpath = "//caption[@id='state-alabama']")
    private WebElement alabamaText;

    @FindAll({@FindBy(xpath = "//caption[starts-with(@id,'state')]")})
    private List<WebElement> allStates;


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

    public List<String> getAllRepresentativeNamesForSelectedState(String state){
        String stateXpath = String.format(stateTextXpath, state);
        List<String> representativeNames = new ArrayList<String>();
        List<WebElement> states = driver.findElements(By.xpath(stateXpath));
        for (WebElement stat : states) {
             representativeNames.add(stat.getText());
        }
        return representativeNames;
    }

    public String getPartyXpath(String xpathParty, String representativeName){
        return driver.findElement(By.xpath(String.format(xpathParty, representativeName))).getText();
    }
    public char getPartyByRepresentative(String representativeName){
        return getPartyXpath(partyXpathByName, representativeName).charAt(0);
    }

    public List<String> getAllStates() {
        List<String> allStatesArray = new ArrayList<String>();
        for (WebElement allState:allStates){
            allStatesArray.add(allState.getText());
        }
        return allStatesArray;
    }
}
