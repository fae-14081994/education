package com.geekbrains.lesson6.HW6;

import org.openqa.selenium.WebElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MyMainPage extends MyBasePage {

    public MyMainPage(WebDriver driver) {
        super(driver);
    }

//    избавиться
    @FindBy(xpath = "//input[@data-test='login-button']")
    private WebElement loginButton;

    @Step("Клик на кнопку логина главной страницы")
    public MyLoginPage clickLoginButton() {
        loginButton.click();
        return new MyLoginPage(driver);
    }
//    избавиться

    private WebElement test;
}
