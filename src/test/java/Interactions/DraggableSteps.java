package Interactions;

import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DraggableSteps extends BaseTest {

    public void changePageSize() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom = '67%'");
    }

    public void moveUpRight() throws InterruptedException {
        WebElement sourceElement = driver.findElement(By.cssSelector("div#draggable"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(sourceElement).moveByOffset(900, 0).release().perform();
        driver.navigate().refresh();
    }

    public void moveBottomRight(){

        WebElement sourceElement = driver.findElement(By.cssSelector("div#draggable"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(sourceElement).moveByOffset(900, 137).release().perform();
        driver.navigate().refresh();
    }

    public void moveToCenter(){
        WebElement sourceElement = driver.findElement(By.cssSelector("div#draggable"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(sourceElement).moveByOffset(428, 64).release().perform();
        driver.navigate().refresh();
    }

    public void moveUpperLeft(){
        WebElement sourceElement = driver.findElement(By.cssSelector("div#draggable"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(sourceElement).moveByOffset(-7, 137).release().perform();
        driver.navigate().refresh();
    }
}
