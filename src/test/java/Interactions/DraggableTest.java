package Interactions;
import BaseData.BaseTest;
import Basic.BasicOperations;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DraggableTest extends BaseTest {
    BasicOperations basicOperations = new BasicOperations();
    DraggableSteps draggableSteps = new DraggableSteps();
    Logger log = LoggerFactory.getLogger("DraggableTest");

    @Test
    void handleDraggableTab() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnInteractionsTab();
        log.info("***** Tab 'Interactions' is opened *****");
        basicOperations.clickOnDraggableTab();
        log.info("***** Tab 'Draggable' is opened *****");
        draggableSteps.moveUpRight();
        log.info("***** Element is moved to upper right *****");
        draggableSteps.moveBottomRight();
        log.info("***** Element is moved to bottom right *****");
    }
}
