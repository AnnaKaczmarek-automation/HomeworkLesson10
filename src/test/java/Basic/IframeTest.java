package Basic;

import BaseData.BaseTest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IframeTest extends BaseTest {
    BasicOperations basicOperations = new BasicOperations();
    IframeSteps iframeSteps = new IframeSteps();
    Logger log = LoggerFactory.getLogger("IframeTest.class");

    @Test
    void handleSwitchingIframes() {
        driver.get("https://seleniumui.moderntester.pl/");
        log.info("<<<<Webside is opened>>>>");
        basicOperations.clickOnBasicTab();
        basicOperations.clickOnIframeTab();
        basicOperations.selectIframe1();
        log.info("iframe1 is selected");
        iframeSteps.fillInTheFormOnIframe1();
        log.info("All form fields are filled with values");
        basicOperations.switchToDefaultIframe();
        basicOperations.selectIframe2();
        log.info("iframe2 is selected");
        iframeSteps.fillInTheFormOnIframe2();
        basicOperations.switchToDefaultIframe();
        log.info("iframe is switched to default");
    }
}
