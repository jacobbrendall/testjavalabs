package tests;

import domain.pages.HomePage;
import domain.pages.RepresentativesPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class RepPageValidationTests {

    @Test
    public void repPageLogoShouldAppear(){
        System.setProperty("WebDriver.chrome.driver", "resources/chrome-driver");
        WebDriver driver = new ChromeDriver();
        RepresentativesPage representativesPage = new PageFactory().initElements(driver, RepresentativesPage.class);

        HomePage.clickRepresentativesLink();
        System.out.println(RepresentativesPage.isRepresentativesPageStateNameDisplayed());
    }
}
