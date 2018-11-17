package tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import domain.pages.DirectoryPage;
import domain.pages.HomePage;
import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertTrue;

public class EnterZipCodeTest extends UITestBaseClass{

    @Test
    public void isZipCodeCorrect(){
    HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
    homePage.enterZipCode("92656");
    assert homePage.findyourRepByAddressButton();
    }
}

