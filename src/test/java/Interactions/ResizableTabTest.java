package Interactions;

import BaseData.BaseTest;
import Basic.BasicOperations;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResizableTabTest extends BaseTest {
    BasicOperations basicOperations = new BasicOperations();
    ResizableTabSteps resizableTabSteps = new ResizableTabSteps();
    Logger log = LoggerFactory.getLogger("ResizableTabTest");

    @Test
    void handleResizableTabOptions(){
        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnInteractionsTab();
        log.info("***** Tab 'Interactions' is opened *****");
        basicOperations.clickOnResizableTab();
        log.info("***** Tab 'Resizable' is opened *****");
        resizableTabSteps.resizeWindowToTheRight(600,600);

    }
}
