package tests;

import domain.pages.DirectoryPage;

import java.lang.System;

import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.PageFactory;


public class ListByStateAndDistrictTest extends UITestBaseClass{


    @Test
    public void listByStateandDistrict() {
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        homePage.clickRepresentativesLink();
        DirectoryPage directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        directoryPage.isDisplayedDirectoryOfRepresentativesText();
        directoryPage.clickListByStateandDistrict();
        assert directoryPage.isAlabamaTextDisplayed();

    }
}


