package Widgets;
import BaseData.BaseTest;
import Basic.BasicOperations;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class DatePickerTabTest extends BaseTest {
    Logger log = LoggerFactory.getLogger("DatePickerTabTest.class");
    BasicOperations basicOperations = new BasicOperations();
    DatePickerTabSteps datePickerTabSteps = new DatePickerTabSteps();

    @Test
    void handleDataPickerTabOptions() throws InterruptedException, IOException {
        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnWidgetsTab();
        log.info("***** Tab 'Widgets' is opened *****");
        basicOperations.clickOnDatePickerTab();
        log.info("***** Tab 'DatePicker' is opened *****");
        datePickerTabSteps.chooseDate(2022, 4, 11);
        log.info("Date is selected");
        datePickerTabSteps.chooseDate(2022, 5, 1);
        log.info("Date is selected");
        datePickerTabSteps.chooseDate(2023, 1, 31);
        log.info("Date is selected");
        datePickerTabSteps.chooseDate(2023, 1, 31);
        log.info("Date is selected");
        datePickerTabSteps.chooseDate(2022, 3, 15);
        log.info("Date is selected");
        datePickerTabSteps.chooseDate(2021, 7, 17);
        log.info("Date is selected");
    }
}
