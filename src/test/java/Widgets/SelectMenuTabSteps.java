package Widgets;

import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectMenuTabSteps extends BaseTest {

    Logger log = LoggerFactory.getLogger("SelectMenuTabSteps.class");

    public void choseRandomSpeed() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver,5);
        driver.findElement(By.id("speed-button")).click();
//        Select options = new Select(driver.findElement(By.cssSelector("select#speed")));

//        List<WebElement> availableOptions = new ArrayList<WebElement>();
//        availableOptions.add(driver.findElement(By.xpath("//span[@aria-activedescendant='ui-id-1']")));
//        availableOptions.add(driver.findElement(By.xpath("//span[@aria-activedescendant='ui-id-2']")));
//        availableOptions.add(driver.findElement(By.xpath("//span[@aria-activedescendant='ui-id-3']")));
//        availableOptions.add(driver.findElement(By.xpath("//span[@aria-activedescendant='ui-id-4']")));
//        availableOptions.add(driver.findElement(By.xpath("//span[@aria-activedescendant='ui-id-5']")));


        List<String> speed = new ArrayList<>();
        speed.add("Slower");
        speed.add("Slow");
        speed.add("Medium");
        speed.add("Fast");
        speed.add("Faster");
        int random = ThreadLocalRandom.current().nextInt(0, 4);

        Select speedSelection = new Select(driver.findElement(By.cssSelector("select#speed")));
        speedSelection.selectByIndex(random);
        Thread.sleep(4000);

        log.info("Random speed was successfully chosen");
        Thread.sleep(5000);
    }

    public void selectFile() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.findElement(By.cssSelector("span#files-button")).click();
        Select select = new Select(driver.findElement(By.id("files")));
        List<WebElement> listOfOptions = driver.findElements(By.xpath("//ul[@id='files-menu']//li[@class='ui-menu-item']/div[contains(@class,'ui-menu-item-wrapper')]"));
        System.out.println(listOfOptions.size());

        for (WebElement option : listOfOptions) {
            log.info(option.getText());
        }

        listOfOptions.get(3).click();
    }

    public void selectNumber(int index) throws InterruptedException {

        driver.findElement(By.id("number-button")).click();
        Thread.sleep(5000);
        List<WebElement> listOfOptions = driver.findElements(By.cssSelector("ul#number-menu li"));
        listOfOptions.get(index).click();

    }
}
