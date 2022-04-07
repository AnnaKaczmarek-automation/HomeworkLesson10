package Interactions;
import BaseData.BaseTest;
import Basic.BasicOperations;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SortableTabTest extends BaseTest {
    BasicOperations basicOperations = new BasicOperations();
    Logger log = LoggerFactory.getLogger("SortableTabTest.class");
    SortableTabSteps sortableTabSteps = new SortableTabSteps();

    @Test
    void handleSortableTabTest() {
        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnInteractionsTab();
        log.info("***** Tab 'Interactions' is opened *****");
        basicOperations.clickOnSortableTab();
        log.info("***** Tab 'Sortable' is opened *****");
        sortableTabSteps.createAndShuffleTable();
        log.info("***** Table with numbers is created and shuffled *****");

    }
}
