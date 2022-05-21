package com.geekbrains.lesson6.HW6;


import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyLoginPage extends MyBasePage {

    public MyLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@data-test='username']")
    private WebElement loginFrame;

    @Step("Переключиться в фрейм логина")
    public MyLoginPage switchToLoginFrame() {
        driver.switchTo().frame(loginFrame);
        return this;
    }

    private final static String LOGIN_INPUT_LOCATOR_BY_ID = "login";
    @FindBy(id = LOGIN_INPUT_LOCATOR_BY_ID)
    public WebElement loginInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

//    убрать
    @FindBy(xpath = "//input[@data-test='username']")
    private WebElement loginButton;
//    убрать

    @Step("Заполнить поле логина")
    public MyLoginPage fillLogin(String login) {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(LOGIN_INPUT_LOCATOR_BY_ID)));
        loginInput.sendKeys(login);
        return this;
    }

    @Step("Заполнить поле пароля")
    public MyLoginPage fillPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    @Step("Клик на кнопку логина")
    public MyMainPage clickLoginButton() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginButton.click();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new MyMainPage(driver);
    }
}
