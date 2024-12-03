package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AllegotestingApp2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://allegro.pl//test/store");

        WebElement categoryDropdown = driver.findElement(By.cssSelector("select[aria-label*='Kategoria']"));
        categoryDropdown.click();
        WebElement electronicsCategory = driver.findElement(By.cssSelector("option[value='Elektronika']"));
        electronicsCategory.click();

        // Wprowadź frazę wyszukiwania w pole
        WebElement searchField = driver.findElement(By.cssSelector("input[type='search']"));
        searchField.sendKeys("Mavic mini");

        // Kliknij przycisk wyszukiwania
        WebElement searchButton = driver.findElement(By.cssSelector("button[data-role='search-button']"));
        searchButton.click();

        // Znajdź wszystkie karty produktów
        List<WebElement> productCards = driver.findElements(By.cssSelector("section > article"));

    }
}
