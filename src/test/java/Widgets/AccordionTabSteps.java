package Widgets;
import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccordionTabSteps extends BaseTest {
    Logger log = LoggerFactory.getLogger("AccordionTabTest.class");

    public void getTextFromSection1() {
        driver.findElement(By.cssSelector("h3#ui-id-1")).click();
        String element1Text = driver.findElement(By.cssSelector("div#ui-id-2")).getText();
        log.info("Text displayed in section 1: " + element1Text);
    }

    public void getTextFromSection2() {
        driver.findElement(By.cssSelector("h3#ui-id-3")).click();
        String element2Text = driver.findElement(By.cssSelector("div#ui-id-4")).getText();
        log.info("Text displayed in section 2: " + element2Text);
    }

    public void getTextFromSection3() throws InterruptedException {
        driver.findElement(By.id("ui-id-5")).click();
        Thread.sleep(1000);

        WebElement element = driver.findElement(By.id("ui-id-6"));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(element));
        String element3Text = element.getText();
        log.info("Text displayed in section 3: " + element3Text);
    }

    public void getTextFromSection4() {
        driver.findElement(By.cssSelector("h3#ui-id-7")).click();
        String element4Text = driver.findElement(By.cssSelector("div#ui-id-8")).getText();
        log.info("Text displayed in section 4: " + element4Text);
    }
}
