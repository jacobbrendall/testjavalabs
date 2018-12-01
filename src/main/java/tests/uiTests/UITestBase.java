package tests.uiTests;

import domain.pages.HomePage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class UITestBase {

    public WebDriver driver;

    @Before
    public void SystemSetUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.house.gov");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

    }

    @After
    public void driverQuit(){
        driver.close();
        driver.quit();
    }
}
