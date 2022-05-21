package MATA.tests;

import MATA.base.BaseTest;
import org.testng.annotations.Test;

public class MyFirstTest extends BaseTest {

    @Test
    public void checkEmptyEmail() {

        openApp()
                .clickLoginMenuButton()
                .clickLoginButton()
                .checkLoginErrorText("Please enter a valid email address");

    }

}
