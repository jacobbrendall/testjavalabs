package tests;

import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageValidation {

    @Test
    public void verifyHomePageLogo(){
        System.setProperty("webdriver.chrome.driver", "resources/chrome-driver");
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);

        driver.get("https://www.house.gov");
        System.out.println(homePage.isHomePageZipCodeInputPresent());
        driver.close();
    }
}
