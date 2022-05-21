package locators.iOS;

import io.appium.java_client.MobileBy;
import locators.interfaces.LoginPageLocators;
import org.openqa.selenium.By;

public class iOSLoginPageLocators implements LoginPageLocators {

    public By loginButton() {
        return MobileBy.AccessibilityId("button-LOGIN");
    }

    public By loginErrorText() {
        return MobileBy.AccessibilityId("Please enter a valid email address");
    }
}
