package cucumber.steps;

import base.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginSteps extends BaseTest {

    LoginPage loginPage;

    @Given("^User is on Login page$")
    public void user_is_on_Login_page()  {
        loginPage = openApp("pixel 10").clickLoginMenuButton();
    }

    @When("^User click login button$")
    public void user_click_login_button()  {
        loginPage.clickLoginButton();
    }

    @Then("^User should see error message \"([^\"]*)\"$")
    public void user_should_see_error_message(String errorText)  {
        loginPage.checkLoginErrorText(errorText);
    }


    @When("^User set login:  (\\w+)$")
    public void user_set_login_Bill(String name) {
//        метод для примера, просто выводим значение логина.
        System.out.println(name);
    }

    @When("^User set password: (\\d+)$")
    public void user_set_password(int password) {
//        метод для примера, просто выводим значение пароля.
        System.out.println(password);
    }

    @Then("^User should see welcome message\\.$")
    public void user_should_see_welcome_message()  {
        System.out.println("Пользователь залогинился!");
    }
}

