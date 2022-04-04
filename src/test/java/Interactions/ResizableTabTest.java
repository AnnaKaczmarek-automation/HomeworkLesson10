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
        resizableTabSteps.resizeWindowToTheRight(1286,696);
        log.info("Window is resized to the right");
        driver.manage().window().maximize();
        resizableTabSteps.resizeWindowToTheBottom(1296, 686);
        log.info("Window is resized to the bottom");
        driver.manage().window().maximize();
        resizableTabSteps.resizeWindowToTheRightAndBottom(1286,686 );
        log.info("Window is resized to the right and to the bottom");
        driver.manage().window().maximize();

    }
}
