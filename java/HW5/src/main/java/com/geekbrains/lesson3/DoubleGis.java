package com.geekbrains.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DoubleGis {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://2gis.ru/moscow");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@value='']")).click();
        driver.findElement(By.xpath("//input[@value='']")).sendKeys("Казань");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@title='Казань']/../..")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}