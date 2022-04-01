package Widgets;

import BaseData.BaseTest;
import Basic.BasicOperations;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccordionTabTest extends BaseTest {
    BasicOperations basicOperations = new BasicOperations();
    Logger log = LoggerFactory.getLogger("AccordionTabTest.class");
    AccordionTabSteps accordionTabSteps = new AccordionTabSteps();

    @Test
    void handleAccordionTabOperations() {
        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnWidgetsTab();
        log.info("***** Tab 'Widgets' is opened *****");
        basicOperations.clickOnAccordionTab();
        log.info("***** Tab 'Accordion' is opened *****");
        accordionTabSteps.getTextFromSection1();




    }
}
