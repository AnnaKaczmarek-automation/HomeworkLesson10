package Basic;
import BaseData.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

public class IframeSteps extends BaseTest {

    Logger log = LoggerFactory.getLogger("IframeSteps.class");

    public void fillInTheFormOnIframe1() {
        WebElement firstName = driver.findElement(By.xpath("//input[@id='inputFirstName3']"));
        firstName.sendKeys("Anna");
        log.info("first name is typed in");
        WebElement surname = driver.findElement(By.xpath("//input[@id='inputSurname3']"));
        surname.sendKeys("Kaczmarek");
        log.info("surname is typed in");
    }

    public void fillInTheFormOnIframe2() {
        WebElement login = driver.findElement(By.xpath("//input[@id='inputLogin']"));
        login.sendKeys("Ania");
        log.info("login is typed in");
        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("AlaMaKota007");
        log.info("password is typed in");
        Select continents = new Select(driver.findElement(By.id("inlineFormCustomSelectPref")));
        continents.selectByValue("europe");
        log.info("value of continent is selected");
        List<WebElement> yearOfExperience = driver.findElements(By.xpath("//div[@class='form-check']"));
        Assert.assertTrue(yearOfExperience.size() > 0);
        log.info("list of elements is not empty");
        yearOfExperience.get(0);
        log.info("value for year of experience is chosen");
    }
}
