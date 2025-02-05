package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class GoogleSearchSteps {

    WebDriver driver;

    @Given("User navigates to Google homepage")
    public void user_navigates_to_google_homepage() {
        // Set up WebDriver (ensure that ChromeDriver is available or WebDriverManager is used)
    	//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        //driver = new ChromeDriver();
    	System.setProperty("webdriver.edge.driver", "D:\\EclipseWorkspace-SHRI\\selenium-testng-cucumber\\drivers\\msedgedriver.exe");
    	WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }

    @When("User searches for {string}")
    public void user_searches_for(String searchQuery) {
        // Perform search by entering query and hitting enter
        driver.findElement(By.name("q")).sendKeys(searchQuery + "\n");
        driver.findElement(By.name("q")).submit();
    }

    @Then("User should see results for {string}")
    public void user_should_see_results_for(String searchQuery) {
        // Validate if the page contains the search query
        Assert.assertTrue(driver.getPageSource().contains(searchQuery), "Search results did not contain: " + searchQuery);
        driver.quit();  // Close the browser
    }
}

/* 
 package stepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.testng.Assert.assertTrue;  // Import TestNG assertion

public class GoogleSearchSteps {

    WebDriver driver;

    @Given("User navigates to Google homepage")
    public void user_navigates_to_google_homepage() {
        // Set path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path_to_your_chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @When("User searches for {string}")
    public void user_searches_for(String searchText) {
        driver.findElement(By.name("q")).sendKeys(searchText);
        driver.findElement(By.name("q")).submit();
    }

    @Then("User should see results for {string}")
    public void user_should_see_results_for(String searchText) {
        assertTrue(driver.getPageSource().contains(searchText));  // TestNG assertion
        driver.quit();
    }
}
*/