package Basic;

import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class DelayedAlertSteps extends BaseTest {

    static BasicOperations basicOperations = new BasicOperations();

    public void clickOnDelayedAlertButton() {
        basicOperations.clickOnBasicTab();
        basicOperations.clickOnAlertsTab();
        driver.findElement(By.xpath("//button[@id='delayed-alert']")).click();
    }

    public void waitForAlert() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.alertIsPresent());
        waitForAlert();

    }
}
