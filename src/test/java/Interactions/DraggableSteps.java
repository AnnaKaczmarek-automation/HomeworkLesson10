package Interactions;

import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DraggableSteps extends BaseTest {
    Logger log = LoggerFactory.getLogger("DraggableSteps");


    public void moveUpRight() throws InterruptedException {
        WebElement sourceElement = driver.findElement(By.cssSelector("div#draggable"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(sourceElement).moveByOffset(900, 0).release().perform();
//        actions.moveByOffset(700, 0);
        Thread.sleep(5000);
//

    }

    public  void moveBottomRight() throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("document.body.style.zoom = '130%'");
        executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//        driver.execute_script("document.body.style.zoom='zoom %'");
//        WebElement html = driver.findElement(By.xpath("//html"));
//        html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
        WebElement sourceElement = driver.findElement(By.cssSelector("div#draggable"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(sourceElement).
                moveByOffset(900, 250).release().perform();
//        actions.moveByOffset(700, 0);
        Thread.sleep(5000);
    }
}
