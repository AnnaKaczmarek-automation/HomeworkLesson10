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
    void handleDataPickerTabOptions() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnWidgetsTab();
        log.info("***** Tab 'Widgets' is opened *****");
        basicOperations.clickOnDatePickerTab();
        log.info("***** Tab 'DatePicker' is opened *****");
        datePickerTabSteps.openDataPicker();
        log.info("Calendar is opened");
        datePickerTabSteps.chooseDay(2022, "April", 6 );
        log.info("Desired day is chosen");
        datePickerTabSteps.chooseDay(2022, "May", 1 );
        log.info("Desired day is chosen");
        datePickerTabSteps.chooseDay(2023, "January", 31 );
        log.info("Desired day is chosen");
        datePickerTabSteps.chooseDay(2023, "January", 31 );
        log.info("Desired day is chosen");
//        datePickerTabSteps.chooseDay(2022, "March", 26 );
//        log.info("Desired day is chosen");

    }
}
