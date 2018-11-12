package domain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    public boolean isHomePageLogoPresent() {
        //boolean Driver = false;
        boolean verify = findElement(By.xpath("//*[@id='search']")).isDisplayed();
       if (verify){
           return true;
       }else{
           return false;
       }
    }
    private WebElement findElement(By xpath) {
    return null;
    }
}
