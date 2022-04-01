package Basic;
import BaseData.BaseTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleAlertTest extends BaseTest {

    static SimpleAlertSteps alertSteps = new SimpleAlertSteps();
    static BasicOperations basicOperations = new BasicOperations();
    private static Logger log = LoggerFactory.getLogger("SimpleAlertSteps.class");


    //    @ParameterizedTest
    @Test
    void handlePopUpOfSimpleAlert() {
        driver.get("https://seleniumui.moderntester.pl/");
        log.info("<<<<Webside is opened>>>>");
        basicOperations.clickOnBasicTab();
        log.info("Basic tab is opened");
        basicOperations.clickOnAlertsTab();
        log.info("Alert tab is opened");
        alertSteps.clickOnSimpleAlertButton();
        log.info("Simple Alert button was clicked");
        alertSteps.verifyIfCorrectTextIsDisplayedAfterAcceptingSimpleAlert();
        log.info("Displayed text is correct");
    }
}
