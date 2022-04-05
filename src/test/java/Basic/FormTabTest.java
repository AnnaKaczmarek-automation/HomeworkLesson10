package Basic;

import BaseData.BaseTest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FormTabTest extends BaseTest {
    FormTabSteps formTabSteps = new FormTabSteps();
    BasicOperations basicOperations = new BasicOperations();
    Logger log = LoggerFactory.getLogger("FormTabTest.class");

    @Test
    void handleFormTabOptions() {
        driver.get("https://seleniumui.moderntester.pl/");
        log.info("***** Webside is opened *****");
        basicOperations.clickOnBasicTab();
        log.info("***** Basic tab is opened *****");
        basicOperations.clickOnFormTab();
        log.info("***** Form tab is opened *****");
        formTabSteps.fillInTheForm("Ania", "Słoneczko", "słonko@wp.pl", 33);
    }
}
