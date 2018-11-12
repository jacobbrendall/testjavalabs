package tests;

import domain.pages.DirectoryPage;

import java.lang.System;

import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.PageFactory;


public class UiTest {


    @Test
    public void listByStateandDistrict() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        HomePage hp = new PageFactory().initElements(driver, HomePage.class);
        DirectoryPage dp = new PageFactory().initElements(driver, DirectoryPage.class);
        driver.get("https://www.house.gov");
        hp.clickRepresentativesLink();
        dp.isDisplayedDirectoryOfRepresentativesText();
        dp.clickListByStateandDistrict();
        dp.isAlabamaTextDisplayed();

    }
}


