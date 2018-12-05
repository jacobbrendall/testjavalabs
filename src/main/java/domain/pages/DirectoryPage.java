package domain.pages;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectWriter;
import domain.Pojos.PojoRepList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.toList;

public class DirectoryPage extends HomePage {

    private String stateTextXpath = "//*[@id='%s']/..//td[2]";
    private String districtXpath = "//*[@id='%s']/..//td[1]";
    private String partyXpath = "//*[@id='%s']/..//td[3]";
    private String officeRoomXpath = "//*[@id='%s']/..//td[4]";
    private String partyXpathByName = "(//a[contains(text(), '%s')])[1]/../following-sibling::td[1]";
    private String rowInfoXpathForAlabama = "//caption[@id='state-alabama']/../tbody/tr/td[5]";
    private String regex = "^[(][0-9]{3}[)][' '][0-9]{3}[-][0-9]{4}$";
    private String rowsXpath = "//caption[@id='state-alabama']/../tbody/tr";
    private String rowXpathForFirstState = "(//table[@class='table'])[1]/tbody/tr";
    private String repRowXpath = "//caption[@id='state-alabama']/../tbody/tr";

    @FindBy(xpath =  "//h1[contains (text(), 'Directory of Representatives')]")
    private WebElement directoryOfRepresentativesText;

    @FindBy (linkText = "By State and District")
    private WebElement listByStateandDistrictButton;

    @FindBy (xpath = "//caption[@id='state-alabama']")
    private WebElement alabamaText;

    @FindBys ({@FindBy (xpath = "(//table[@class='table'])[1]/tbody/tr)")})
    private List<WebElement> firstStateRows;

    @FindBys({@FindBy (xpath = "//caption[starts-with(@id,'state')]")})
    private List<WebElement> allStates;

    public DirectoryPage (WebDriver driver){
        super(driver);
    }

    public boolean isDisplayedDirectoryOfRepresentativesText(){
        return directoryOfRepresentativesText.isDisplayed();
    }

    public void clickListByStateAndDistrictLink(){
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

    public List<String> getDistrictsForSelectedState(String state){
        String districtXpathFormatted = String.format(districtXpath, state);
        List<String> districtNames = new ArrayList<String>();
        List<WebElement> districts = driver.findElements(By.xpath(districtXpathFormatted));
        for (WebElement district : districts) {
            districtNames.add(district.getText());
        }
        return districtNames;
    }

    public List<String> getPartysForSelectedState(String state){
        String partyXpathFormatted = String.format(partyXpath, state);
        List<String> partyNames = new ArrayList<String>();
        List<WebElement> partys = driver.findElements(By.xpath(partyXpathFormatted));
        for (WebElement  party : partys) {
            partyNames.add(party.getText());
        }
        return partyNames;
    }

    public List<String> getRepsOfficeRooms(String state){
        String officeRoomXpathFormatted = String.format(officeRoomXpath, state);
        List<String> officeRooms = new ArrayList<String>();
        List<WebElement> offices = driver.findElements(By.xpath(officeRoomXpathFormatted));
        for (WebElement  office : offices) {
            officeRooms.add(office.getText());
        }
        return officeRooms;
    }

    public String serializeRepInfoWithJackson(Object obj) throws JsonProcessingException {
        ObjectWriter mapper = new ObjectMapper().writer().withDefaultPrettyPrinter();
        //mapper.enable(SerializationFeature.INDENT_OUTPUT);
        return mapper.writeValueAsString(obj);
    }


    public String getPartyByRepresentative(String representativeName){
        return getParty(partyXpathByName, representativeName);
    }

    public List<String> getAllStatesStartingWithA(){
        List <String> statesStartingWithA = getAllStates().stream().filter(s->s.startsWith("A")).collect(toList());
        return statesStartingWithA;
    }

    public List<String> getSortedStates(){
        List <String> sortedStates = getAllStates().stream().sorted().collect(toList());
        return sortedStates;
    }

    public List<String> getRepPhoneInfoForState(String state){
        List<WebElement> rowsAll = driver.findElements(By.xpath(rowsXpath));
        WebElement rows = driver.findElement(By.xpath(String.format(rowInfoXpathForAlabama, state)));
        List<String> phones = new ArrayList<String>();
        for (WebElement e:rowsAll) {
            phones.add(rows.getText());
        }
        return phones;
    }

    public List<String> getFirstRepInfoForState(String lineNum ){
        List<WebElement> rowsAll = driver.findElements(By.xpath(String.format(repRowXpath, lineNum)));
        List<String> repInfo = new ArrayList<>();
        for (WebElement e:rowsAll) {
            repInfo.add(e.getText());
        }
        return repInfo;
    }

    public boolean isPhoneFormatForSelectedStateCorrect(String state){
        Pattern pattern = Pattern.compile(regex);
        boolean result = false;
        for (String phone:getRepPhoneInfoForState(state)) {
            Matcher matcher = pattern.matcher(phone);
            if (matcher.matches()){
                result = true;
            }
        }
        return result;
    }

    private String getParty(String xpathParty, String representativeName){
        return driver.findElement(By.xpath(String.format(xpathParty, representativeName))).getText().trim();
    }

    private List<String> getAllStates() {
        List<String> allStatesList = new ArrayList<String>();
        for (WebElement allState : allStates) {
            allStatesList.add(allState.getText());
        }
        return allStatesList;
    }
}
