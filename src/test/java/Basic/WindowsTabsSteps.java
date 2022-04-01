package Basic;

import BaseData.BaseTest;
import org.openqa.selenium.By;

public class WindowsTabsSteps extends BaseTest {

    public void clickOnNewBrowserWindowButton(){

        driver.findElement(By.id("newBrowserWindow")).click();

    }

}
