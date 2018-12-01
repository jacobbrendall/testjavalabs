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
            System.setProperty("webdriver.chrome.driver", "resources/chrome-driver");
            WebDriver driver = new ChromeDriver();
            HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
            RepresentativesPage representativesPage = new PageFactory().initElements(driver, RepresentativesPage.class);


            driver.get("https://www.house.gov");
            homePage.isHomePageZipCodeInputPresent();
            homePage.clickRepresentativesLink();
            System.out.println(representativesPage.isRepresentativesPageStateNameDisplayed());
            driver.close();
        }
    }

