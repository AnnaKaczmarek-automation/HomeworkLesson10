package Basic;
import BaseData.BaseTest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfirmAlertBoxTest extends BaseTest {

    ConfirmAlertBoxSteps confirmAlertBoxSteps = new ConfirmAlertBoxSteps();
    BasicOperations basicOperations = new BasicOperations();
    Logger log = LoggerFactory.getLogger("ConfirmAlertBoxTest");

    @Test
    void handleConfirmAlertBox() {
        driver.get("https://seleniumui.moderntester.pl/");
        log.info("***** Webside is opened *****");
        basicOperations.clickOnBasicTab();
        log.info("***** Basic tab is opened *****");
        basicOperations.clickOnAlertsTab();
        log.info("***** Alert tab is opened *****");
        confirmAlertBoxSteps.clickOnConfirmPopUpButton();
        log.info("***** Confirm Pop Up button is chosen *****");
        basicOperations.clickOkButton();
        log.info("***** Button OK was chosen***** ");
        confirmAlertBoxSteps.verifyTextUnderConfirmAlertBoxAfterAcceptation();
        log.info("***** Correct text was displayed *****");
        confirmAlertBoxSteps.clickOnConfirmPopUpButton();
        log.info("***** Confirm Pop Up button is chosen *****");
        basicOperations.clickOnCancelButton();
        log.info("***** Cancel button was chosen *****");
        confirmAlertBoxSteps.verifyTextUnderConfirmAlertBoxAfterDismission();
        log.info("***** Correct text was displayed *****");
    }
}
