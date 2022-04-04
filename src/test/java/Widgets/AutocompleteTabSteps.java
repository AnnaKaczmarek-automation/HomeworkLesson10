package Widgets;

import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class AutocompleteTabSteps extends BaseTest {
    Logger log = LoggerFactory.getLogger("AutocompleteTabSteps");


    public void typeText(String input) {

        WebElement searchBox = driver.findElement(By.cssSelector("input#search"));
        searchBox.sendKeys(input);
        searchBox.sendKeys(Keys.ARROW_DOWN);

        WebDriverWait wait = new WebDriverWait(driver,8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-1")));
        log.info("'"+input+"'" + " was typed in");
    }

    public void printOutAllOptions() {
//        WebDriverWait wait = new WebDriverWait(driver,8);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ul#ui-id-1 >li div")));
        List<WebElement> listOfOptions = driver.findElements(By.cssSelector("ul#ui-id-1 >li div"));

        for (WebElement el : listOfOptions) {
            String textValue = el.getText();
            log.info(textValue);
        }

    }
}
