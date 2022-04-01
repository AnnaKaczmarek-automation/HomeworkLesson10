package Basic;

import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;

public class SimpleAlertSteps extends BaseTest {

    public void clickOnSimpleAlertButton() {
        driver.findElement(By.xpath("//button[@class='btn btn-info'][text()='Simple Alert']")).click();
        driver.switchTo().alert().accept();

    }

    public void verifyIfCorrectTextIsDisplayedAfterAcceptingSimpleAlert() {
        String actualText = driver.findElement(By.xpath("//p[@class='lead'][text()='OK button pressed']")).getText();
        String expectedText = "OK button pressed";
        Assert.assertEquals(actualText, expectedText);

    }


}
