package Basic;
import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class BasicOperations extends BaseTest {
    public void clickOkButton() {
        driver.switchTo().alert().accept();
    }

    public void clickOnCancelButton() {
        driver.switchTo().alert().dismiss();
    }

    public void clickOnBasicTab() {
        driver.findElement(By.xpath("//li[@class='nav-ite dropdown']")).click();
    }

    public void clickOnAlertsTab() {
        driver.findElement(By.id("alerts-item")).click();
    }

    public void clickOnIframeTab() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("iframes-item")).click();
    }
    public void clickOnWindowsTabsTab(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("windows-tabs-item"))).click();
    }

    public void selectIframe1() {
        WebElement iFrame = driver.findElement(By.xpath("//iframe[@name='iframe1']"));
        driver.switchTo().frame(iFrame);
    }

    public void selectIframe2() {
        WebElement iFrame = driver.findElement(By.xpath("//iframe[@name='iframe2']"));
        driver.switchTo().frame(iFrame);
    }

    public void switchToDefaultIframe() {
        driver.switchTo().defaultContent();
    }

    public void clickOnWidgetsTab(){
        driver.findElement(By.cssSelector("ul li:nth-child(3)")).click();
    }

    public void clickOnTooltipTab(){
        driver.findElement(By.id("tooltip-item")).click();
    }

    public void clickOnSliderTab(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("slider-item"))).click();
    }

    public void clickOnInteractionsTab(){
        driver.findElement(By.cssSelector("ul li:nth-child(2)")).click();
    }

    public void clickOnDraggableTab(){
        WebDriverWait wait = new WebDriverWait(driver,7);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("draggable-item"))).click();
    }

    public void clickOnDroppableTab(){
        WebDriverWait wait = new WebDriverWait(driver,7);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("droppable-item"))).click();
    }
    public void clickOnResizableTab(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("resizable-item"))).click();
    }
    public void clickOnSelectableTab(){
        WebDriverWait wait = new WebDriverWait(driver,8);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("selectable-item"))).click();
    }
    public void clickOnSortableTab(){
        WebDriverWait wait = new WebDriverWait(driver,8);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("sortable-item"))).click();
    }

    public void clickOnOthersTab(){
        driver.findElement(By.cssSelector("ul li:nth-child(4)")).click();
    }

    public void clickOnHighSiteTab(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("high-site-item"))).click();
    }

    public void clickOnAccordionTab(){
        WebDriverWait wait = new WebDriverWait(driver,8);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("accordion-item"))).click();
    }

    public void clickOnAutocompleteTab(){
        WebDriverWait wait = new WebDriverWait(driver,8);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("autocomplete-item"))).click();
    }

    public void clickOnDatePickerTab(){
        WebDriverWait wait = new WebDriverWait(driver,8);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("datepicker-item"))).click();
    }

    public void clickOnMenuTab(){
        WebDriverWait wait = new WebDriverWait(driver,8);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu-item"))).click();
    }

    public void clickOnModalDialogTab(){
        WebDriverWait wait = new WebDriverWait(driver,8);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("modal-dialog-item"))).click();
    }

    public void clickOnProgressbarTab(){
        WebDriverWait wait = new WebDriverWait(driver,8);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("progressbar-item"))).click();
    }
    public void clickOnSelectMenuTab(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("selectmenu-item"))).click();
    }
}
