package Widgets;
import BaseData.BaseTest;
import Basic.BasicOperations;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TooltipTest extends BaseTest {
    TooltipSteps tooltipSteps = new TooltipSteps();
    BasicOperations basicOperations = new BasicOperations();
    Logger log = LoggerFactory.getLogger("TooltipTest.class");

    @Test
    void handleTooltipTab(){
        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnWidgetsTab();
        log.info("***** Tab 'Widgets' is opened *****");
        basicOperations.clickOnTooltipTab();
        log.info("*****Tab 'Tooltips' is opened *****");
        tooltipSteps.printOutMessage();
        log.info("*****Message is correctly displayed *****");
    }
}
