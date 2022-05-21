package com.geekbrains.lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class DoubleGisTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;
    private final static String DOUBLEGIS_URL = "https://2gis.ru/moscow";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        driver.get(DOUBLEGIS_URL);
    }
    @Test
    void windowsTest() throws InterruptedException {
        driver.get("https://2gis.ru/moscow");
        driver.findElement(By.xpath("//input[@value='']")).click();
        driver.findElement(By.xpath("//input[@value='']")).sendKeys("Казань");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@title='Казань']/../..")).click();
        Thread.sleep(5000);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
