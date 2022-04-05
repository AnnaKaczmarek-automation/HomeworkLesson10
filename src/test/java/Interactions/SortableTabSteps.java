package Interactions;
import BaseData.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SortableTabSteps extends BaseTest {

    public void selectItems(int number) {
        driver.findElement(By.cssSelector("ol li:nth-child("+ number +")")).click();
        String expectedMessage = "You've selected: #" + number + ".";
        String actualMessage = driver.findElement(By.cssSelector("#feedback")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
