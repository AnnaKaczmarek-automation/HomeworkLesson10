package Others;
import BaseData.BaseTest;
import Basic.BasicOperations;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HighSiteTabTest extends BaseTest {
    BasicOperations basicOperations = new BasicOperations();
    Logger log = LoggerFactory.getLogger("HighSiteTabTest.class");
    HighSiteTabSteps highSideTabSteps = new HighSiteTabSteps();

    @Test
    void handleHighSiteTabOperations() {
        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnOthersTab();
        log.info("***** Tab 'Others' is opened *****");
        basicOperations.clickOnHighSiteTab();
        log.info("***** Tab 'HighSite' is opened *****");
        highSideTabSteps.scrollUntilVisible(driver);
    }
}
