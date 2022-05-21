import base.BaseTest;
import io.appium.java_client.MobileBy;
import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class ScreenShootHelper extends BaseTest {

    @Test
    public void createScreen(){
        openApp();
        File actualScreenshot = $(MobileBy.AccessibilityId("Home-screen")).screenshot();
    }
}