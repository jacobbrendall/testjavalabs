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
        System.setProperty("webdriver.chrome.driver", "resources/chrome-driver");
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        CommitteesPage committeesPage = new PageFactory().initElements(driver, CommitteesPage.class);

        driver.get("https://www.house.gov");
        homePage.isHomePageZipCodeInputPresent();
        homePage.clickCommitteesLink();
        System.out.println(committeesPage.isCommitteesPageAgricultureLinkDisplayed());
        driver.close();

    }
}
