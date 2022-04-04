package Widgets;

import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressbarTabSteps extends BaseTest {


    public  void waitUntilProcessIsComplete(){
//        WebElement progressbar = driver.findElement(By.cssSelector("progress-label"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='progressbar']/div[@class='progress-label']"), "Complete!"));
    }
}
