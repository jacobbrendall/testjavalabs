package domain.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

        WebDriver driver;

        @FindBy (xpath = "//input[@id='header-find-rep-zip-code']")
        private static WebElement homePageZipCodeInput;

        @FindBy (xpath = "(//a[href='/representatives'])[1]")
        private static WebElement representativesLink;

        public HomePage(WebDriver driver) {
            this.driver = driver;
        }

        public static boolean isHomePageZipCodeInputPresent(){
            return homePageZipCodeInput.isDisplayed();
        }

        public static void clickRepresentativesLink(){
            representativesLink.click();
        }
    }

