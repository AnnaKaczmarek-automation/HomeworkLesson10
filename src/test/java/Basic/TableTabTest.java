package Basic;

import BaseData.BaseTest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TableTabTest extends BaseTest {
    TableTabSteps tableTabSteps = new TableTabSteps();
    BasicOperations basicOperations = new BasicOperations();
    Logger log = LoggerFactory.getLogger("TableTabTest.class");

    @Test
    void handleFormTabOptions() {
        driver.get("https://seleniumui.moderntester.pl/");
        log.info("***** Webside is opened *****");
        basicOperations.clickOnBasicTab();
        log.info("***** Basic tab is opened *****");
        basicOperations.clickOnTableTab();
        log.info("***** Table tab is opened *****");
        tableTabSteps.printMountainInformation(tableTabSteps.createListOfRowsFromTable());
        log.info("***** Mountain information are printed *****");
    }
}

