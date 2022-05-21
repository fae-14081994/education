package com.geekbrains.lesson6;

import com.geekbrains.lesson6.HW6.MyMainPage;
import com.geekbrains.lesson7.CustomLoggerNew;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Story("Работа с авторизацией")
public class SwagLabsPageObjectTest {
    WebDriver driver;
    //EventFiringWebDriver eventFiringWebDriver;
    private final static String SWAGLABS_URL = "https://www.saucedemo.com/";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new EventFiringDecorator(new CustomLoggerNew()).decorate(new ChromeDriver());
        driver.get(SWAGLABS_URL);
    }

    @Test
    void authorization() {
        new MyMainPage(driver)
                .clickLoginButton() //тут я не успел пересмотреть, как привязываются последовательности. Хотел от этого шага избавиться.
                .switchToLoginFrame()
                .fillLogin("standard_user")
                .fillPassword("secret_sauce")
                .clickLoginButton();
    }

    @AfterEach
    void killDriver() {

//        Тут хотел добавить
//        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@data-test='product_sort_container']")));
//        Непомню, как правильно. Идея была в том, чтобы после появления этого элемента на сайте, тест закрывался с успехом


//        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
//        Iterator<LogEntry> iterator = logEntries.iterator();
//
//        while (iterator.hasNext()) {
//            Allure.addAttachment("Лог браузера:", iterator.next().getMessage());
//        }
//
//        for (LogEntry log : logEntries) {
//            Allure.addAttachment("Лог браузера:", log.getMessage());
//        }
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        driver.quit();
    }
}
