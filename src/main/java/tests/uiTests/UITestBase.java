package tests.uiTests;

import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import domain.pages.SearchResultsPage;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class UITestBase {

    public WebDriver driver;
    public HomePage homePage;
    public DirectoryPage directoryPage;
    public SearchResultsPage searchResultsPage;

    @Before
    public void SystemSetUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless","--disable-gpu");
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.house.gov");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        homePage = new PageFactory().initElements(driver, HomePage.class);
        directoryPage = new PageFactory().initElements(driver, DirectoryPage.class);
        searchResultsPage =new PageFactory().initElements(driver, SearchResultsPage.class);
    }

    @After
    public void driverQuit() {
        driver.close();
        driver.quit();
    }
}
