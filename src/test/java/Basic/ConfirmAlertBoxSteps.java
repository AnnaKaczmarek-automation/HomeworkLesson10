package Basic;
import BaseData.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ConfirmAlertBoxSteps extends BaseTest {

    public  void clickOnConfirmPopUpButton(){
        driver.findElement(By.id("confirm-alert")).click();
    }

    public void verifyTextUnderConfirmAlertBoxAfterAcceptation(){
        String actualText = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
        String expectedText = "You pressed OK!";
        Assert.assertEquals(expectedText, actualText);
    }

    public void verifyTextUnderConfirmAlertBoxAfterDismission(){
        String actualText = driver.findElement(By.xpath("//p[text()='You pressed Cancel!']")).getText();
        String expectedText = "You pressed Cancel!";
        Assert.assertEquals(actualText,expectedText);
    }
}
