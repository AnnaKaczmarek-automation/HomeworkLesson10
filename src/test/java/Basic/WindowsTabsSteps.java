package Basic;
import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WindowsTabsSteps extends BaseTest {
    Logger log = LoggerFactory.getLogger("WindowsTabsSteps");

    public void clickOnNewBrowserWindowButton() {
        driver.findElement(By.id("newBrowserWindow")).click();
    }

    public void switchToNewWindowAndCloseIt() throws InterruptedException {
        String windowBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

        driver.switchTo().window(windowBefore);
        Thread.sleep(5000);
    }

    public void clickOnNewMessageWindowButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='newMessageWindow']")));
        driver.findElement(By.xpath("//button[@id='newMessageWindow']")).click();
    }

    public void switchToNewMessageWindowAndPrintMessage() {
        String windowBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

        String messageText = driver.findElement(By.xpath("//body")).getText();
        log.info("Text of message is: " + messageText);
        driver.switchTo().window(windowBefore);
    }

    public void clickOnNewBrowserTab() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='newMessageWindow']")));
        driver.findElement(By.xpath("//button[@id='newBrowserTab']")).click();
    }

    public void switchToNewBrowserTabAndCloseTab() {
        String windowBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        driver.switchTo().window(windowBefore);
    }
}
