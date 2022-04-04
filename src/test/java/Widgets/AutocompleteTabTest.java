package Widgets;

import BaseData.BaseTest;
import Basic.BasicOperations;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutocompleteTabTest extends BaseTest {
    BasicOperations basicOperations = new BasicOperations();
    AutocompleteTabSteps autocompleteTabSteps = new AutocompleteTabSteps();
    Logger log = LoggerFactory.getLogger("AutocompleteTabTest.class");


    @Test
    void handleAutocompleteTabOptions(){
        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnWidgetsTab();
        log.info("***** Tab 'Widgets' is opened *****");
        basicOperations.clickOnAutocompleteTab();
        log.info("***** Tab 'Autocomplete' is opened *****");
        autocompleteTabSteps.typeText("a");
        autocompleteTabSteps.printOutAllOptions();





    }


}
