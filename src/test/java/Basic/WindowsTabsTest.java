package Basic;
import BaseData.BaseTest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WindowsTabsTest extends BaseTest {
    BasicOperations basicOperations = new BasicOperations();
    WindowsTabsSteps windowsTabsSteps = new WindowsTabsSteps();
    Logger log = LoggerFactory.getLogger("WindowsTabsTest.class");

    @Test
    void handleWindowsAndTabsTab() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnBasicTab();
        log.info("***** Tab 'Basic' is opened *****");
        basicOperations.clickOnWindowsTabsTab();
        log.info("***** Tab 'Windows/Tabs' is opened *****");
        windowsTabsSteps.clickOnNewBrowserWindowButton();
        log.info("***** Button 'New Browser Window' is chosen *****");
        windowsTabsSteps.switchToNewWindowAndCloseIt();
        log.info("***** New browser window is open and closed*****");
        windowsTabsSteps.clickOnNewMessageWindowButton();
        log.info("*****  Button 'New Message Window' is chosen *****");
        windowsTabsSteps.switchToNewMessageWindowAndPrintMessage();
        log.info("*****  New message window is open, text is printed and window is and closed *****");
        windowsTabsSteps.clickOnNewBrowserTab();
        log.info("***** Button 'New Browser Tab' is chosen *****");
        windowsTabsSteps.switchToNewBrowserTabAndCloseTab();
        log.info("*****  New window tab is open and closed *****");
    }
}
