package tests;

import domain.pages.DirectoryPage;

import java.lang.System;
import java.sql.DriverManager;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;


public class UiTest {

    WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/resources/chromedriver4");
        driver = new ChromeDriver();

    }
    @Test
    public void listByStateandDistrict() {
        driver.get("https://www.house.gov")
        DirectoryPage dp = new DirectoryPage(driver);
        dp.clickRepresentativesLink();
        dp.isDisplayedDirectoryOfRepresentativesText();
        dp.clickListByStateandDistrict();
    }
}


