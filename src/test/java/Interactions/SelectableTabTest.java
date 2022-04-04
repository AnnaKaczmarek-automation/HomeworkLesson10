package Interactions;
import BaseData.BaseTest;
import Basic.BasicOperations;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectableTabTest extends BaseTest {

    BasicOperations basicOperations = new BasicOperations();
    Logger log = LoggerFactory.getLogger("DraggableTest");
    SelectableTabSteps selectableTabSteps = new SelectableTabSteps();


    @Test
    void handleSelectableTabOperations() {

        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnInteractionsTab();
        log.info("***** Tab 'Interactions' is opened *****");
        basicOperations.clickOnSelectableTab();
        log.info("***** Tab 'Selectable' is opened *****");
        selectableTabSteps.selectItems(1);
        log.info("***** First element is chosen *****");
        selectableTabSteps.selectItems(3);
        log.info("***** Second element is chosen *****");
        selectableTabSteps.selectItems(4);
        log.info("***** Third element is chosen *****");
    }

}


