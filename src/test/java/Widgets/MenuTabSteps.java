package Widgets;
import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuTabSteps extends BaseTest {

    public void hoverOnElement(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        WebElement musicOption = driver.findElement(By.xpath("//div[@id='ui-id-9']"));
        WebElement jazzOption = driver.findElement(By.xpath("//div[@id='ui-id-13']"));
        WebElement moderOption = driver.findElement(By.xpath("//div[@id='ui-id-16'][text()='Modern']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(musicOption).perform();
        System.out.println("music is chosen");
        wait.until(ExpectedConditions.visibilityOf(jazzOption));
        actions.moveToElement(jazzOption).click().perform();
        System.out.println("jazz is chosen");
        wait.until(ExpectedConditions.visibilityOf(moderOption));
        actions.moveToElement(moderOption).click().perform();
        System.out.println("modern is chosen");
    }
}