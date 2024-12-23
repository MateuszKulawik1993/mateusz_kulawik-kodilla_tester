package com.kodilla.testcontainers;

import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.containers.DefaultRecordingFileFactory;
import org.testcontainers.shaded.org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL;

public class BrowserTest {

    public BrowserWebDriverContainer chromeContainer;

    @BeforeEach
    public void setUp() {
        chromeContainer = new BrowserWebDriverContainer()
                .withCapabilities(new ChromeOptions());
        chromeContainer.start();
    }

    @Test
    public void chromeTest() throws IOException {
        RemoteWebDriver driver = chromeContainer.getWebDriver();
        driver.get("http://allegro.pl");

        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,
                new File("./build/screenshots/" + screenshot.getName()));
    }
    @Rule
    public BrowserWebDriverContainer firefox =
            new BrowserWebDriverContainer()
                    .withCapabilities(new FirefoxOptions())
                    .withRecordingMode(RECORD_ALL, new File("./build/"))
                    .withRecordingFileFactory(new DefaultRecordingFileFactory());

    @AfterEach
    public void tearDown() {
        chromeContainer.stop();
    }

}
