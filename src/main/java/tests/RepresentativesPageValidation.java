package tests;

import domain.pages.RepresentativesPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class RepresentativesPageValidation {

    @Test
    public void verifyRepresentativesPageLogo(){
        System.setProperty("WebDriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        RepresentativesPage representativesPage = new PageFactory().initElements(driver, RepresentativesPage.class);

        driver.get("https://www.house.gov");
        driver.findElement(By.linkText("Representatives")).click();
        System.out.println(RepresentativesPage.isRepresentativesPageStateNameDisplayed());
    }
}
