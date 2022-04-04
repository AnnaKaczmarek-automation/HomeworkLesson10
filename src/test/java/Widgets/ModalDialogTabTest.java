package Widgets;

import BaseData.BaseTest;
import Basic.BasicOperations;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModalDialogTabTest extends BaseTest {
    Logger log = LoggerFactory.getLogger("ModalDialogTabTest.class");
    BasicOperations basicOperations = new BasicOperations();
    ModalDialogTabSteps modalDialogTabSteps = new ModalDialogTabSteps();

    @Test
    void handleModalDialogTabOptions() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnWidgetsTab();
        log.info("***** Tab 'Widgets' is opened *****");
        basicOperations.clickOnModalDialogTab();
        log.info("***** Tab 'ModalDialog' is opened *****");
        modalDialogTabSteps.createNewUser();
    }
}
