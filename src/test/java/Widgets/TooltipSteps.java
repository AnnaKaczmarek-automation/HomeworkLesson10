package Widgets;

import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TooltipSteps extends BaseTest {

    Logger log = LoggerFactory.getLogger("TooltipSteps.class");

    public void printOutMessage(){
       WebElement inputField = driver.findElement(By.xpath("//input[@id='age']"));
       String tooltip = inputField.getAttribute("title");
        log.info(tooltip);
    }
}
