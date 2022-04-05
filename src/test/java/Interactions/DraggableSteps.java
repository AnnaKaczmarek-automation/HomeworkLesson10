package Interactions;
import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DraggableSteps extends BaseTest {
    Logger log = LoggerFactory.getLogger("DraggableSteps");


    public void moveUpRight() {
        WebElement sourceElement = driver.findElement(By.cssSelector("div#draggable"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(sourceElement).moveByOffset(900, 0).release().perform();
    }

    public void moveBottomRight() throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("document.body.style.zoom = '130%'");
        executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        WebElement sourceElement = driver.findElement(By.cssSelector("div#draggable"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(sourceElement).
                moveByOffset(900, 250).release().perform();
        Thread.sleep(5000);
    }
}
