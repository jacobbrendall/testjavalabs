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
        driver.get("https://www.house.gov");
        HomePage hp = new PageFactory().initElements(driver, HomePage.class);
        hp.clickRepresentativesLink();
        DirectoryPage dp = new PageFactory().initElements(driver, DirectoryPage.class);
        dp.isDisplayedDirectoryOfRepresentativesText();
        dp.clickListByStateandDistrict();
        dp.isAlabamaTextDisplayed();

    }
}


