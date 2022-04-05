package Interactions;
import BaseData.BaseTest;
import Basic.BasicOperations;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DroppableTest extends BaseTest {
    BasicOperations basicOperations = new BasicOperations();
    Logger log = LoggerFactory.getLogger("DraggableTest");
    DroppableSteps droppableSteps = new DroppableSteps();
    @Test
    void handleDroppableTagOtpions(){
        driver.get("https://seleniumui.moderntester.pl/");
        basicOperations.clickOnInteractionsTab();
        log.info("***** Tab 'Interactions' is opened *****");
        basicOperations.clickOnDroppableTab();
        log.info("***** Tab 'Droppable' is opened *****");
        WebElement sourceElement = driver.findElement(By.cssSelector("div#draggable"));
        WebElement targetElement = driver.findElement(By.cssSelector("div#droppable"));
        droppableSteps.dragAndDropElement(sourceElement,targetElement);
        log.info("***** Element is correctly dragged and dropped *****");
    }
}
