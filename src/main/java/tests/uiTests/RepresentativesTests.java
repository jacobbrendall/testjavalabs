package tests.uiTests;

import com.fasterxml.jackson.core.JsonProcessingException;
import domain.Pojos.PojoRepList;
import domain.Pojos.Representatives;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.BeanUtils;


import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class RepresentativesTests extends UITestBase {
    String result = "[Byrne, Bradley, Roby, Martha, Rogers, Mike, Aderholt, Robert, Brooks, Mo, Palmer, Gary, Sewell, Terri A.]";

    //TODO get the data of the first (top in the table) rep of ALABAMA
// create object (firstAlambamaRep) from Representatives class
    // set object values of that firstAlabamaRep.setName(driver.findElemeny)

    /**
     * Click representatives link
     * List by state and district
     * call getAllRepresentativeNamesForSelectedState method from directory page
     * put state as argument in the format "state-...."
     * Convert into string format
     * Prepare a string variable for expected result with respective values
     * Check if actual and expected matches
     */
    @Test
    public void allRepsNamesForSelectedStateShouldDisplayed() {
        homePage.clickRepresentativesLink();
        directoryPage.clickListByStateAndDistrictLink();
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(result, directoryPage.getAllRepresentativeNamesForSelectedState("state-alabama").toString());
    }

    @Test
    public void firstAlabamaRepresentative() throws JsonProcessingException {
        homePage.clickRepresentativesLink();
        directoryPage.clickListByStateAndDistrictLink();
        Representatives firstAlabamaRep = new Representatives();
        firstAlabamaRep.setDistrict(directoryPage.getDistrictsForSelectedState("state-alabama").get(0));
        firstAlabamaRep.setName(directoryPage.getAllRepresentativeNamesForSelectedState("state-alabama").get(0));
        firstAlabamaRep.setParty(directoryPage.getPartysForSelectedState("state-alabama").get(0));
        firstAlabamaRep.setState("alabama");
        firstAlabamaRep.setOfficeRoom(directoryPage.getRepsOfficeRooms("state-alabama").get(0));
        Assert.assertEquals("Byrne, Bradley", firstAlabamaRep.getName());
        Assert.assertEquals("R", firstAlabamaRep.getParty());
        Assert.assertEquals("1st", firstAlabamaRep.getDistrict());
        Assert.assertEquals("alabama", firstAlabamaRep.getState());
        Assert.assertEquals("119 CHOB", firstAlabamaRep.getOfficeRoom());
        Assert.assertEquals("{\n" +
                "  \"state\" : \"alabama\",\n" +
                "  \"name\" : \"Byrne, Bradley\",\n" +
                "  \"district\" : \"1st\",\n" +
                "  \"party\" : \"R\",\n" +
                "  \"officeRoom\" : \"119 CHOB\"\n" +
                "}", directoryPage.repInfoToJson(firstAlabamaRep));
    }


    @Test
    public void firstAndSecondAlabamaRepresentative() throws JsonProcessingException {
        homePage.clickRepresentativesLink();
        directoryPage.clickListByStateAndDistrictLink();
        PojoRepList allAlabamaReps = new PojoRepList();

        allAlabamaReps.setDistrict(directoryPage.getDistrictsForSelectedState("state-alabama"));
        allAlabamaReps.setName(directoryPage.getAllRepresentativeNamesForSelectedState("state-alabama"));
        allAlabamaReps.setParty(directoryPage.getPartysForSelectedState("state-alabama"));
        allAlabamaReps.setOfficeRoom(directoryPage.getRepsOfficeRooms("state-alabama"));
        allAlabamaReps.setState("alabama");

        Assert.assertEquals("{\n" +
                "  \"state\" : \"alabama\",\n" +
                "  \"name\" : [ \"Byrne, Bradley\", \"Roby, Martha\", \"Rogers, Mike\", \"Aderholt, Robert\", \"Brooks, Mo\", \"Palmer, Gary\", \"Sewell, Terri A.\" ],\n" +
                "  \"district\" : [ \"1st\", \"2nd\", \"3rd\", \"4th\", \"5th\", \"6th\", \"7th\" ],\n" +
                "  \"party\" : [ \"R\", \"R\", \"R\", \"R\", \"R\", \"R\", \"D\" ],\n" +
                "  \"officeRoom\" : [ \"119 CHOB\", \"442 CHOB\", \"2184 RHOB\", \"235 CHOB\", \"2400 RHOB\", \"330 CHOB\", \"2201 RHOB\" ],\n" +
                "  \"phone\" : null,\n" +
                "  \"committee_assignment\" : null\n" +
                "}", directoryPage.repInfoToJson(allAlabamaReps));

        System.out.println(directoryPage.repInfoToJson(allAlabamaReps));
    }
}

