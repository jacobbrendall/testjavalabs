package tests;

import domain.pages.DirectoryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class UiTest {

    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        DirectoryPage directoryPage = PageFactory.initElements(driver, DirectoryPage.class);
        driver.get("https://www.amazon.com");
        System.out.println(System.getProperty("webdriver.chrome.driver"));

    }


}
