package locators.iOS;

import io.appium.java_client.MobileBy;
import locators.interfaces.MainPageLocators;
import org.openqa.selenium.By;

public class iOSMainPageLocators implements MainPageLocators {

    public By loginButton() {
        return MobileBy.AccessibilityId("Login");
    }

    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }
}
