package Widgets;

import BaseData.BaseTest;
import Basic.BasicOperations;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatePickerTabTest extends BaseTest {
    Logger log = LoggerFactory.getLogger("DatePickerTabTest.class");
    BasicOperations basicOperations = new BasicOperations();
    DatePickerTabSteps datePickerTabSteps = new DatePickerTabSteps();


    @Test
    void handleDataPickerTabOptions() {
        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnWidgetsTab();
        log.info("***** Tab 'Widgets' is opened *****");
        basicOperations.clickOnDatePickerTab();
        log.info("***** Tab 'DatePicker' is opened *****");
        datePickerTabSteps.chooseDay();
    }
}
