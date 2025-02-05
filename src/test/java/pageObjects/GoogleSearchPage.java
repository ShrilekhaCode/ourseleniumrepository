package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
    WebDriver driver;

    // Constructor
    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By searchBox = By.name("q");
    By searchButton = By.name("btnK");

    // Actions
    public void enterSearchTerm(String searchTerm) {
        driver.findElement(searchBox).sendKeys(searchTerm);
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).submit();
    }
}