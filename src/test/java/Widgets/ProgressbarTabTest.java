package Widgets;
import BaseData.BaseTest;
import Basic.BasicOperations;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProgressbarTabTest extends BaseTest {
    Logger log = LoggerFactory.getLogger("ProgressbarTabTest.class");
    BasicOperations basicOperations = new BasicOperations();
    ProgressbarTabSteps progressbarTabSteps= new ProgressbarTabSteps();

    @Test
    void handleProgressbarTabOptions() {
        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnWidgetsTab();
        log.info("***** Tab 'Widgets' is opened *****");
        basicOperations.clickOnProgressbarTab();
        log.info("***** Tab 'Progressbar' is opened *****");
        progressbarTabSteps.waitUntilProcessIsComplete();
        log.info("***** Process is completed *****");
    }
}
