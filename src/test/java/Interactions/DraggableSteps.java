package Interactions;

import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class DraggableSteps extends BaseTest {

    public void clickAndHoldElement() throws InterruptedException {
        WebElement sourceElement = driver.findElement(By.cssSelector("div#draggable"));
        Actions actions = new Actions(driver);
        WebElement targetElement = driver.findElement(By.xpath("//div[@style='position: relative; left: 958px; top: -11px;']"));

        while (sourceElement.getAttribute("style") != targetElement.getAttribute("style")) {
            actions.clickAndHold(sourceElement).sendKeys(Keys.ARROW_RIGHT).release().perform();

        }

    }
}
