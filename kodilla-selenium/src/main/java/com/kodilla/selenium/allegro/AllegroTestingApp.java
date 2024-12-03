package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://allegro.pl//test/store");

        WebElement categoryDropdown = driver.findElement(By.xpath("//select[contains(@aria-label,'Kategoria')]"));
        categoryDropdown.click();
        WebElement electronicsCategory = driver.findElement(By.xpath("//option[text()='Elektronika']"));
        electronicsCategory.click();

        WebElement searchField = driver.findElement(By.xpath("//input[@type='search']"));
        searchField.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.xpath("//button[contains(@data-role,'search-button')]"));
        searchButton.click();

    }
}
