package com.kodilla.selenium.pom;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KodillaStoreSearchTests {

     WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://kodilla.com/pl/test/store");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testSearchNotebook() {
        validateSearchResults("NoteBook", 1); // Spodziewamy się jednego wyniku
    }

    @Test
    public void testSearchSchool() {
        validateSearchResults("School", 1); // Spodziewamy się jednego wyniku
    }

    @Test
    public void testSearchBrand() {
        validateSearchResults("Brand", 1);
    }

    @Test
    public void testSearchBusiness() {
        validateSearchResults("Business", 1);
    }

    @Test
    public void testSearchGaming() {
        validateSearchResults("Gaming", 1);
    }

    @Test
    public void testSearchPowerful() {
        validateSearchResults("Powerful", 1);
    }

    @Test
    public void testCaseInsensitiveSearch() {
        validateSearchResults("notebook", 1);
        validateSearchResults("NOTEBOOK", 1);
        validateSearchResults("nOtEbOoK", 1);
    }

    private void validateSearchResults(String query, int expectedResultsCount) {
        WebElement searchBox = driver.findElement(By.id("search-input"));
        searchBox.clear();
        searchBox.sendKeys(query);
        searchBox.sendKeys(Keys.ENTER);

        List<WebElement> results = driver.findElements(By.className("element"));
        assertEquals(expectedResultsCount, results.size(),
                "Number of results for query \"" + query + "\" is incorrect.");
    }
}