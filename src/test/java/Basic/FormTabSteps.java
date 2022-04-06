package Basic;

import BaseData.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.util.List;
import java.util.Random;

public class FormTabSteps extends BaseTest {

    public void fillInTheForm(String name, String secondName, String mail, int age) {
        WebElement nameInput = driver.findElement(By.cssSelector("input#inputFirstName3"));
        nameInput.sendKeys(name);

        WebElement secondNameInput = driver.findElement(By.cssSelector("input#inputLastName3"));
        secondNameInput.sendKeys(secondName);

        WebElement mailInput = driver.findElement(By.cssSelector("input#inputEmail3"));
        mailInput.sendKeys(mail);

        List<WebElement> sexOptionList = driver.findElements(By.xpath("//input[@class='form-check-input'][@name='gridRadiosSex']"));
        Random random = new Random();
        int randomIndex = random.nextInt(3);
        sexOptionList.get(randomIndex).click();

        WebElement ageInput = driver.findElement(By.cssSelector("input#inputAge3"));
        ageInput.clear();
        ageInput.sendKeys(String.valueOf(age));

        List<WebElement> yearOfExperience = driver.findElements(By.xpath("//input[@name='gridRadiosExperience']"));
        int randomExperience = random.nextInt(7);
        yearOfExperience.get(randomExperience).click();

        driver.findElement(By.id("gridCheckAutomationTester")).click();

        Select continents = new Select(driver.findElement(By.cssSelector("select#selectContinents")));
        int randomContinent = random.nextInt(7);
        continents.selectByIndex(randomContinent);

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select#selectSeleniumCommands")));
        Select seleniumCommands = new Select(driver.findElement(By.cssSelector("select#selectSeleniumCommands")));
        seleniumCommands.selectByValue("switch-commands");
        seleniumCommands.selectByValue("wait-commands");

        File file = new File("src/main/resources/TestingFile");
        driver.findElement(By.cssSelector("input#chooseFile")).sendKeys(file.getAbsolutePath());

        driver.findElement(By.xpath("//button[text()='Sign in']")).click();

        WebElement validationText = driver.findElement(By.id("validator-message"));
        String actualMessage = validationText.getText();
        String expectedMessage = "Form not send, please fill all missing form fields";
        Assert.assertEquals(expectedMessage, actualMessage);

    }
}
