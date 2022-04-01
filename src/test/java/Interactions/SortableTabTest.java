package Interactions;

import BaseData.BaseTest;
import Basic.BasicOperations;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SortableTabTest extends BaseTest {
    BasicOperations basicOperations = new BasicOperations();
    Logger log = LoggerFactory.getLogger("ResizableTabTest");
    SortableTabSteps sortableTabSteps = new SortableTabSteps();

    @Test
    void handleSortableTabOperations(){
        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnInteractionsTab();
        log.info("***** Tab 'Interactions' is opened *****");
        basicOperations.clickOnSortableTab();
        log.info("***** Tab 'Sortable' is opened *****");

    }
}
