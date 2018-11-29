package domain.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class DirectoryPage {
    private WebDriver driver;
    public String stateTextXpath = "//*[@id='%s']/..//td[2]";
    public final String partyXpath = "(//a[contains(text(),'Byrne, Bradley')])[1]/../following-sibling::td[1]";
    public List<WebElement> states;
    String partyXpathByName = "(//a[contains(text(), '%s')])[1]/../following-sibling::td[1]";
    String rowInfoXpathForAlabama = "//caption[@id='state-alabama']/../tbody/tr/td[5]";
    String regex = "^[(][0-9]{3}[)][' '][0-9]{3}[-][0-9]{4}$";
    String rowsXpath = "//caption[@id='state-alabama']/../tbody/tr";


    @FindBy(xpath =  "//h1[contains (text(), 'Directory of Representatives')]")
    private WebElement directoryOfRepresentativesText;

    @FindBy (linkText = "By State and District")
    private WebElement listByStateandDistrictButton;

    @FindBy (xpath = "//caption[@id='state-alabama']")
    private WebElement alabamaText;

    @FindBys({@FindBy ( xpath = "//caption[starts-with(@id,'state')]")})
    private List<WebElement> allStates;



    public DirectoryPage (WebDriver driver){
        this.driver = driver;
    }

    public boolean isDisplayedDirectoryOfRepresentativesText(){
        return directoryOfRepresentativesText.isDisplayed();
    }
    public void clickListByStateAndDistrict(){
        listByStateandDistrictButton.click();
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

    public String getParty(String xpathParty, String representativeName){
        return driver.findElement(By.xpath(String.format(xpathParty, representativeName))).getText().trim();
    }

    public String getPartyByRepresentative(String representativeName){
        return getParty(partyXpathByName, representativeName);
    }

    public List<String> getAllStates() {
        List<String> allStatesList = new ArrayList<String>();
        for (WebElement allState : allStates) {
            allStatesList.add(allState.getText());
        }
        return allStatesList;
    }

    public List<String> getAllStatesStartingWithA(){
        List <String> statesStartingWithA = getAllStates().stream().filter(s->s.startsWith("A")).collect(toList());
        return statesStartingWithA;
    }

    public List<String> getSortedStates(){
        List <String> sortedStates = getAllStates().stream().sorted().collect(toList());
        return sortedStates;
    }

    public List<String> getRepInfoForState(String state){
        List<WebElement> rowsAll = driver.findElements(By.xpath(rowsXpath));
        WebElement rows = driver.findElement(By.xpath(String.format(rowInfoXpathForAlabama, state)));
        List<String> phones = new ArrayList<String>();
        for (WebElement e:rowsAll) {
            phones.add(rows.getText());
        }
        return phones;
    }

    public boolean isPhoneFormatForSelectedStateCorrect(String state){
        Pattern pattern = Pattern.compile(regex);
        Boolean result = false;
        for (String phone:getRepInfoForState(state)) {
            Matcher matcher = pattern.matcher(phone);
            if (matcher.matches()){
                result = true;
            }
        }
        return result;
    }
}