package Basic;

import BaseData.BaseTest;
import org.junit.jupiter.api.Test;

public class WindowsTabsTest extends BaseTest {

    BasicOperations basicOperations = new BasicOperations();
    WindowsTabsSteps windowsTabsSteps = new WindowsTabsSteps();

    @Test
    void handleWindowsAndTabsTab(){
        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnBasicTab();
        basicOperations.clickOnWindowsTabsTab();
        windowsTabsSteps.clickOnNewBrowserWindowButton();

    }
}
