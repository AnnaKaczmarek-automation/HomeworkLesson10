package Basic;

import BaseData.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AlertBoxSteps extends BaseTest {


    BasicOperations basicOperations = new BasicOperations();

    public void clickOnPromptPopUpButton() {

        basicOperations.clickOnBasicTab();
        basicOperations.clickOnAlertsTab();

        driver.findElement(By.id("prompt-alert")).click();

    }

    public void typeInTextIntoAlertTextBoxAndPressOK() {

        driver.switchTo().alert().sendKeys("Lord Vader");
        driver.switchTo().alert().accept();
    }

    public void verifyTextUnderPromptPopUpButton() {
        String actualText = driver.findElement(By.xpath("//p[text()='Hello Lord Vader! How are you today?']")).getText();
        String expectedText = "Hello Lord Vader! How are you today?";
        Assert.assertEquals(expectedText, actualText);
    }

}
