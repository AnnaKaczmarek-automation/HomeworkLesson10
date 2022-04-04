package Widgets;

import BaseData.BaseTest;
import Basic.BasicOperations;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectMenuTabTest extends BaseTest {

    Logger log = LoggerFactory.getLogger("SelectMenuTabTest.class");
    BasicOperations basicOperations = new BasicOperations();
    SelectMenuTabSteps selectMenuTabSteps = new SelectMenuTabSteps();
    @Test
    void handleSelectMenuTabOptions() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnWidgetsTab();
        log.info("***** Tab 'Widgets' is opened *****");
        basicOperations.clickOnSelectMenuTab();
        log.info("***** Tab 'SelectMenu' is opened *****");
//        selectMenuTabSteps.choseRandomSpeed();
        selectMenuTabSteps.selectFile();
        selectMenuTabSteps.selectNumber(4);
        log.info("***** Number is chosen *****");

    }

}
