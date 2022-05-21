package MATA.tests;

import MATA.base.BaseTest;

public class ScreenShootTestFail extends BaseTest {

    public void checkMainPageScreen(){
        openApp()
                .checkFailScreenshot();
    }

}
