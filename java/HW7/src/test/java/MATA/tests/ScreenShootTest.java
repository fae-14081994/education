package MATA.tests;

import MATA.base.BaseTest;

public class ScreenShootTest extends BaseTest {

    public void checkMainPageScreen(){
        openApp()
                .checkScreenshot();
    }
}
