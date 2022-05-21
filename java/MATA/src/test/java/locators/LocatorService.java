package locators;

import locators.Android.AndroidLoginPageLocators;
import locators.Android.AndroidMainPageLocators;
import locators.iOS.iOSLoginPageLocators;
import locators.iOS.iOSMainPageLocators;
import locators.interfaces.LoginPageLocators;
import locators.interfaces.MainPageLocators;

public class LocatorService {

    public static final MainPageLocators MAIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidMainPageLocators() : new iOSMainPageLocators();
    public static final LoginPageLocators LOGIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidLoginPageLocators() : new iOSLoginPageLocators();

}
