package tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class enterZipCodeTest {

    @Test
    public void isZipCodeCorrect(){
    System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.house.gov");
    HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
    System.out.println(homePage.enterZipCode("23455"));
    driver.quit();
}
    }

