package Widgets;
import BaseData.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SliderSteps extends BaseTest {

    Logger log = LoggerFactory.getLogger("SliderSteps.class");

    public void moveSlider(int number) {

        if (number > 0 || number < 100) {
            WebElement slide = driver.findElement(By.xpath("//div[@id='custom-handle']"));
            while (Integer.parseInt(slide.getText()) < number) {
                slide.sendKeys(Keys.ARROW_RIGHT);
            }
            while (Integer.parseInt(slide.getText()) > number) {
                slide.sendKeys(Keys.ARROW_LEFT);
            }
            int value = Integer.parseInt(slide.getText());
            Assert.assertEquals(number, value);
            log.info("Given value equals" + value);
        }
    }
}

