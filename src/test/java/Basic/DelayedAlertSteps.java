package Basic;
import BaseData.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DelayedAlertSteps extends BaseTest {
    static BasicOperations basicOperations = new BasicOperations();

    public void clickOnDelayedAlertButton() {
        basicOperations.clickOnBasicTab();
        basicOperations.clickOnAlertsTab();
        driver.findElement(By.xpath("//button[@id='delayed-alert']")).click();
    }

    public void waitForAlert() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void varifyIfCorrectTextIsDisplayed(){
        String  actualText = driver.findElement(By.xpath("//p[text()='OK button pressed']")).getText();
        String expectedText = "OK button pressed";
        Assert.assertEquals(expectedText, actualText);
    }
}
