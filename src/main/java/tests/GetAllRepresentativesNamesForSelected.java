package tests;

import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class GetAllRepresentativesNamesForSelected {
    @Test
    public void getAllRepsNamesForSelected(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.house.gov");
        HomePage hp = new PageFactory().initElements(driver, HomePage.class);
        hp.clickRepresentativesLink();
        DirectoryPage dp = new PageFactory().initElements(driver, DirectoryPage.class);
        dp.clickListByStateandDistrict();
        System.out.println(dp.getAllRepresentativeNamesForSelectedState("state-alabama").toString());

    }
}
