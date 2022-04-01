package Widgets;
import BaseData.BaseTest;
import Basic.BasicOperations;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SliderTest extends BaseTest {
    BasicOperations basicOperations = new BasicOperations();
    SliderSteps sliderSteps = new SliderSteps();
    Logger log = LoggerFactory.getLogger("SliderTest.class");

    @Test
    void moveTheSlider() throws InterruptedException {
        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnWidgetsTab();
        Thread.sleep(4000);
        log.info("Tab 'Widgets' is opened");
        basicOperations.clickOnSliderTab();
        Thread.sleep(4000);
        log.info("Tab 'Slider' is opened");
        sliderSteps.moveSlider(50);
        sliderSteps.moveSlider(80);
        sliderSteps.moveSlider(80);
        sliderSteps.moveSlider(20);
        sliderSteps.moveSlider(0);
    }
}
