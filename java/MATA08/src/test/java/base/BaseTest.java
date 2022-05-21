package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import pages.MainPage;

import java.net.MalformedURLException;
import java.net.URL;

// базовый класс для всех будущих тестов
// базовый класс для всех будующий тестов.
public class BaseTest {

    // метод который будет открывать наше приложение на телефоне.
    // добавили значение String device
    public MainPage openApp(String device) {
        WebDriver driver = null;
        try {
            // передаем значение device в создание драйвера
            driver = getAndroidDriver(device);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("Opps, we have problems with URL for driver!");
        }
        // устанавливаем драйвер для selenide.
        WebDriverRunner.setWebDriver(driver);
        // возвращаем главную страницу для будущей работы с ней в тесте.
        return new MainPage();
    }

    @AfterClass
    public void setDown() {
        Selenide.close();
    }

    // добавили значение String device
    public AndroidDriver getAndroidDriver(String device) throws MalformedURLException {
        // устанавливаем capabilities.
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        // указываем для appium на каком девайсе хотим запускать тест.
        switch (device) {
            case "pixel 10":
                capabilities.setCapability("udid", "emulator-5554");
                break;
//            case "pixel 11":
//                capabilities.setCapability("udid", "emulator-5556");
//                break;
        }
        capabilities.setCapability("app", "/Users/User/Downloads/Android-NativeDemoApp-0.2.1.apk");

        // папка для сохранения скриншотов selenide.
        Configuration.reportsFolder = "screenshots/actual";

        // устанавливаем и открываем приложение. !!! Указываем URL Grid !!!
        return new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }
}


