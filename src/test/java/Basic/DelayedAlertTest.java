package Basic;
import BaseData.BaseTest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DelayedAlertTest extends BaseTest {
    DelayedAlertSteps delayedAlertSteps = new DelayedAlertSteps();
    BasicOperations basicOperations = new BasicOperations();
    Logger log = LoggerFactory.getLogger("DelayedAlertTest.class");

    @Test
    void handleDelayedAlert(){
        driver.get("https://seleniumui.moderntester.pl/");
        log.info("***** Webside is correctly opened *****");
        basicOperations.clickOnBasicTab();
        log.info("***** Basic tab is opened *****");
        basicOperations.clickOnAlertsTab();
        log.info("***** Alert tab is opened *****");
        delayedAlertSteps.clickOnDelayedAlertButton();
        log.info("***** Delayed Alert button was chosen *****");
        delayedAlertSteps.waitForAlert();
        log.info("***** Page waited for alert *****");
        basicOperations.clickOkButton();
        log.info("***** OK button was chosen *****");
        delayedAlertSteps.varifyIfCorrectTextIsDisplayed();
        log.info("***** Correct text is displayed *****");
    }
}
