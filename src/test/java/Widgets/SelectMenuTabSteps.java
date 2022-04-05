package Widgets;
import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SelectMenuTabSteps extends BaseTest {

    public void choseRandomSpeed(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        WebElement speedButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("speed-button")));
        speedButton.click();
        List<WebElement> speedOptions = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
        int random = ThreadLocalRandom.current().nextInt(0, 4);
        speedOptions.get(random).click();
    }

    public void selectFile() {
        driver.findElement(By.cssSelector("span#files-button")).click();
        List<WebElement> listOfOptions = driver.findElements(By.xpath("//ul[@id='files-menu']//li[@class='ui-menu-item']/div[contains(@class,'ui-menu-item-wrapper')]"));
        listOfOptions.get(3).click();
    }

    public void selectNumber(int index) {
        driver.findElement(By.id("number-button")).click();
        List<WebElement> listOfOptions = driver.findElements(By.cssSelector("ul#number-menu li"));
        listOfOptions.get(index).click();
    }

    public void selectATitle(){
        driver.findElement(By.xpath("//span[text()='Please pick one']")).click();
        List<WebElement> titleOptions = driver.findElements(By.xpath("//ul[@id='salutation-menu']/li[@class='ui-menu-item']"));
        int random = ThreadLocalRandom.current().nextInt(0, 4);
        titleOptions.get(random).click();
    }
}
