package Basic;

import BaseData.BaseTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlertBoxTest extends BaseTest {

    AlertBoxSteps alertBoxSteps = new AlertBoxSteps();
    BasicOperations basicOperations = new BasicOperations();
    Logger log = LoggerFactory.getLogger("AlertBoxTest.class");

    @Test
//    @ParameterizedTest
    void handlePromptAlertBox(){
        driver.get("https://seleniumui.moderntester.pl/");
        log.info("Webside is correctly opened");
        basicOperations.clickOnBasicTab();
        log.info("Basic tab is opened");
        basicOperations.clickOnAlertsTab();
        log.info("Alert tab is opened");
        alertBoxSteps.clickOnPromptPopUpButton();
        log.info("Prompt Pop Up button is clicked");
        alertBoxSteps.typeInTextIntoAlertTextBoxAndPressOK();
        log.info("Text is correctly typed");
        alertBoxSteps.verifyTextUnderPromptPopUpButton();
        log.info("Correct text is displayed");
    }
}
