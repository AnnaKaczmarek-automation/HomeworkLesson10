package Basic;

import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class TableTabSteps extends BaseTest {
    Logger log = LoggerFactory.getLogger("TableTabSteps.class");

    public List<WebElement> createListOfRowsFromTable() {
        List<WebElement> rows = driver.findElements(By.cssSelector("tbody tr"));
        return rows;
    }

    public void printMountainInformation(List<WebElement> rows) {
        log.info("Mountains that fulfill requirements are: ");
        for (WebElement mountain : rows) {
            String city = mountain.findElement(By.xpath("./td[3]")).getText();
            String expectedCity = "Switzerland";
            int height = Integer.parseInt(mountain.findElement(By.xpath("./td[4]")).getText());
            if( city.equals(expectedCity) ){
                if(height > 4000){
                    List<WebElement> cols = mountain.findElements(By.cssSelector("th,td"));
                    log.info(cols.get(0).getText()+"-"+cols.get(1).getText()+","+cols.get(2).getText());
                }
            }
        }
    }
}
