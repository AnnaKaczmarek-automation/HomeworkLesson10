package Others;

import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HighSiteTabSteps extends BaseTest {

    Logger log = LoggerFactory.getLogger("HighSideTabSteps");

    public void scrollUntilVisible(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        while (!isDisplayed(By.xpath("//input[@id='scroll-button']"))) {
            js.executeScript("window.scrollBy(0,250)");
            log.info("Page is scrolled down by 250px");
        }
    }

    public boolean isDisplayed(By by) {
        try {
            return driver.findElement(by).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
