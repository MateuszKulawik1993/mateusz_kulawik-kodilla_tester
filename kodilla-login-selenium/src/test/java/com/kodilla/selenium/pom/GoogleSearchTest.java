package com.kodilla.selenium.pom;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoogleSearchTests {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testGoogleSearchAndClickRandomResult() {
        String searchQuery = "Kodilla";
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchQuery);
        searchBox.sendKeys(Keys.ENTER);

        List<WebElement> results = driver.findElements(By.cssSelector("div.yuRUbf > a"));
        assertTrue(results.size() > 0, "No results found!");


        int randomIndex = (int) (Math.random() * results.size());
        WebElement selectedResult = results.get(randomIndex);
        String selectedUrl = selectedResult.getAttribute("href");

        selectedResult.click();

        assertEquals(selectedUrl, driver.getCurrentUrl(),
                "Opened URL does not match the selected result.");
    }
}