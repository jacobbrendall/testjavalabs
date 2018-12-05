package tests.uiTests;

import com.fasterxml.jackson.core.JsonProcessingException;
import domain.Pojos.AllStatesRepPojo;
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
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RepresentativesTests extends UITestBase {
    String result = "[Byrne, Bradley, Roby, Martha, Rogers, Mike, Aderholt, Robert, Brooks, Mo, Palmer, Gary, Sewell, Terri A.]";


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
        //firstAlabamaRep.setState("alabama");
        firstAlabamaRep.setOfficeRoom(directoryPage.getRepsOfficeRooms("state-alabama").get(0));
        Assert.assertEquals("Byrne, Bradley", firstAlabamaRep.getName());
        Assert.assertEquals("R", firstAlabamaRep.getParty());
        Assert.assertEquals("1st", firstAlabamaRep.getDistrict());
        //Assert.assertEquals("alabama", firstAlabamaRep.getState());
        Assert.assertEquals("119 CHOB", firstAlabamaRep.getOfficeRoom());
        Assert.assertEquals("{\n" +
                "  \"state\" : \"alabama\",\n" +
                "  \"name\" : \"Byrne, Bradley\",\n" +
                "  \"district\" : \"1st\",\n" +
                "  \"party\" : \"R\",\n" +
                "  \"officeRoom\" : \"119 CHOB\"\n" +
                "}", directoryPage.serializeRepInfoWithJackson(firstAlabamaRep));
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
                "}", directoryPage.serializeRepInfoWithJackson(allAlabamaReps));

        System.out.println(directoryPage.getAllRepresentativeNamesForSelectedState("state-alabama"));
    }

    @Test
    public void alabamaRepsInfoShouldSerialized() throws JsonProcessingException {
        homePage.clickRepresentativesLink();
        directoryPage.clickListByStateAndDistrictLink();
        Representatives firstAlabamaRep = new Representatives();
        Representatives secondAlabamaRep = new Representatives();
        //firstAlabamaRep.setState("Alabama");
        firstAlabamaRep.setDistrict("1st");
        firstAlabamaRep.setName("Jacob");
        firstAlabamaRep.setOfficeRoom("119 CHOB");
        firstAlabamaRep.setParty("R");
        firstAlabamaRep.setPhone("111222333");
        //secondAlabamaRep.setState("Alabama");
        secondAlabamaRep.setDistrict("12nd");
        secondAlabamaRep.setName("Gox");
        secondAlabamaRep.setOfficeRoom("212 CHOB");
        secondAlabamaRep.setParty("D");
        secondAlabamaRep.setPhone("222111444");
        List<Representatives> alabamaRepsList = new ArrayList<Representatives>();
        alabamaRepsList.add(firstAlabamaRep);
        alabamaRepsList.add(secondAlabamaRep);
        AllStatesRepPojo allStatesRepPojo = new AllStatesRepPojo(alabamaRepsList);
        allStatesRepPojo.setState("Alabama");
        System.out.println(directoryPage.serializeRepInfoWithJackson(allStatesRepPojo));
        Assert.assertEquals("{\n" +
                "  \"state\" : \"Alabama\",\n" +
                "  \"repsList\" : [ {\n" +
                "    \"name\" : \"Jacob\",\n" +
                "    \"district\" : \"1st\",\n" +
                "    \"party\" : \"R\",\n" +
                "    \"officeRoom\" : \"119 CHOB\",\n" +
                "    \"phone\" : \"111222333\",\n" +
                "    \"committee_assignment\" : null\n" +
                "  }, {\n" +
                "    \"name\" : \"Gox\",\n" +
                "    \"district\" : \"12nd\",\n" +
                "    \"party\" : \"D\",\n" +
                "    \"officeRoom\" : \"212 CHOB\",\n" +
                "    \"phone\" : \"222111444\",\n" +
                "    \"committee_assignment\" : null\n" +
                "  } ]\n" +
                "}", directoryPage.serializeRepInfoWithJackson(allStatesRepPojo));
    }
}

