import base.BaseTest;
import io.appium.java_client.MobileBy;
import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

//Ненастоящий тест. Помогает сделать скриншот для ожидаемого результата.
public class ScreenShootHelper extends BaseTest {

    @Test
    public void createScreen() {
        openApp("pixel 10");
        File actualScreenshot = $(MobileBy.AccessibilityId("Home-screen")).screenshot();
    }
}

