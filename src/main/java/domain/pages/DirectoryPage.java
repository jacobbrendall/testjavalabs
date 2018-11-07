package domain.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DirectoryPage extends HomePage {

    WebDriver driver;

    public DirectoryPage(WebDriver driver) {
    }

    @FindBy(xpath ="")
    private WebElement state;


    public String getState() {
        return state.getText();
    }



}
