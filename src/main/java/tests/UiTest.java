package tests;

import domain.pages.DirectoryPage;

import java.sql.DriverManager;

public class UiTest {

    WebDriver driver;

    DirectoryPage directoryPage = PageFactory.initElements(driver, DirectoryPage.class);

}


https://www.house.gov