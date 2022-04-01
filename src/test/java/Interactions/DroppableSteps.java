package Interactions;

import BaseData.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DroppableSteps extends BaseTest {

    public void dragAndDropElement(WebElement source, WebElement target) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();
        String expectedText = "Dropped!";
        String actualText = target.getText();
        Assert.assertEquals(expectedText, actualText);
    }


}
