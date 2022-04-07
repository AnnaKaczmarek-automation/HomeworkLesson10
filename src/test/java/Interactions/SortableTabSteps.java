package Interactions;

import BaseData.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortableTabSteps extends BaseTest {

    Logger log = LoggerFactory.getLogger("SortableTabSteps.class");


    public void createAndShuffleTable() {

        int itemsAmount = driver.findElements(By.xpath("//ul[@id='sortable']/li")).size();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= itemsAmount; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);
        log.info(String.valueOf(numbers));

        for (int i = 0; i < itemsAmount; i++) {
            int index = numbers.get(i);

            log.info("i: "+i+",index: "+index+",selector: "+"//li[contains(text(),'Item "+index+"')]");

            WebElement dragElement = driver.findElement(By.xpath("//li[contains(text(),'Item "+index+"')]"));
            WebElement dropElement = driver.findElements(By.xpath("//ul[@id='sortable']/li")).get(i);
            Actions actions =new Actions(driver);
            actions.dragAndDrop(dragElement,dropElement).perform();
            log.info("element is shuffled");
        }

        List<Integer> shuffledItemsList = new ArrayList<>();
        for (int i=0; i < itemsAmount; i++) {
            int element = Integer.parseInt(driver.findElements(By.xpath("//ul[@id='sortable']/li")).get(i).getText().replace("Item ",""));
            shuffledItemsList.add(element);
        }
        Assert.assertEquals(shuffledItemsList, numbers);
    }
}
