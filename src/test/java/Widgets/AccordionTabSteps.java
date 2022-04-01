package Widgets;

import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccordionTabSteps extends BaseTest {
    Logger log = LoggerFactory.getLogger("AccordionTabTest.class");

    public void getTextFromSection1(){
        driver.findElement(By.cssSelector("h3#ui-id-1")).click();
        String element1Text = driver.findElement(By.cssSelector("div#ui-id-2")).getText();
        log.info("Text dispayed in section 1: "+element1Text);
    }
}
