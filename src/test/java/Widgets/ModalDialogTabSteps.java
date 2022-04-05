package Widgets;
import BaseData.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Random;

public class ModalDialogTabSteps extends BaseTest {

    Logger log = LoggerFactory.getLogger("ModalDialogTabSteps");
    WebDriverWait wait;

    public void createNewUser() throws InterruptedException {
        driver.findElement(By.id("create-user")).click();
        WebElement nameInput = driver.findElement(By.cssSelector("input#name"));
        String name = "Ania";
        nameInput.clear();
        nameInput.sendKeys(name);

        WebElement mailInput = driver.findElement(By.cssSelector("input#email"));
        String mail = "Ania007@gmail.com";
        mailInput.clear();
        mailInput.sendKeys(mail);

        WebElement passwordInput = driver.findElement(By.cssSelector("input#password"));
        Random rand = new Random();
        String password = String.valueOf(rand.nextInt(99999999));
        passwordInput.clear();
        passwordInput.sendKeys(password);

        driver.findElement(By.xpath("//button[text()='Create an account']")).click();

        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//tbody/tr")));
        Thread.sleep(5000);
        List<WebElement> listOfUsers = driver.findElements(By.xpath("//tbody/tr"));

        String textInArow = name + " " + mail+" "+password;
        for (WebElement user : listOfUsers) {

            if (user.getText().contains(textInArow) ) {
                Assert.assertEquals(textInArow,user.getText());
                log.info(user.getText());
                log.info("This is newly added user");
            }
        }
    }
}