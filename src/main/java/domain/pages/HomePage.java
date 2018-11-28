package domain.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

        WebDriver driver;

        @FindBy (xpath = "//input[@id='header-find-rep-zip-code']")
        private static WebElement homePageZipCodeInput;

        @FindBy (xpath = "(//a[href='/representatives'])")
        private static WebElement representativesLink;

        @FindBy (xpath = "(//a[href='/committees'])")
        private static WebElement committeesLink;

        public HomePage(WebDriver driver) {
            this.driver = driver;
        }

        public static boolean isHomePageZipCodeInputPresent(){
            return homePageZipCodeInput.isDisplayed();
        }

        public static void clickRepresentativesLink(){
            representativesLink.click();
        }

        public static void clickCommitteesLink(){
            committeesLink.click();

    }
    }

