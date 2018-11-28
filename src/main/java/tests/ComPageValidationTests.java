package tests;

import domain.pages.CommitteesPage;
import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ComPageValidationTests {

    @Test
    public void comPageTitleShouldAppear(){
        System.setProperty("WebDriver.chrome.driver", "resources/chrome-driver");
        WebDriver driver = new ChromeDriver();
        CommitteesPage committeesPage = new PageFactory().initElements(driver, CommitteesPage.class);

        driver.get("https://www/house.gov");
        HomePage.isHomePageZipCodeInputPresent();
        HomePage.clickCommitteesLink();
        System.out.println(CommitteesPage.isCommitteesPageAgricultureLinkDisplayed());
        driver.close();

    }
}
