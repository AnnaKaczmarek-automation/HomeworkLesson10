package Widgets;

import BaseData.BaseTest;
import Basic.BasicOperations;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MenuTabTest extends BaseTest {
    Logger log = LoggerFactory.getLogger("MenuTabSteps.class");
    BasicOperations basicOperations = new BasicOperations();
    MenuTabSteps menuTabSteps = new MenuTabSteps();

    @Test
    void handleDataPickerTabOptions() {
        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnWidgetsTab();
        log.info("***** Tab 'Widgets' is opened *****");
        basicOperations.clickOnMenuTab();
        log.info("***** Tab 'Menu' is opened *****");
        menuTabSteps.hoverOnElement();
        log.info("elements are correctly picked from the menu");

    }

}
