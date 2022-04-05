package Widgets;
import BaseData.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatePickerTabSteps extends BaseTest {

    public void chooseDay() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#datepicker"))).click();
        Thread.sleep(5000);

        String currentDay = new SimpleDateFormat("dd").format(Calendar.getInstance().getTime());
        System.out.println(currentDay);
        String currentMonth = new SimpleDateFormat("MM").format(Calendar.getInstance().getTime());
        int monthValue = Integer.parseInt(currentMonth)-1;
        String  monthValueInXpath= String.valueOf(monthValue);
        System.out.println(currentMonth);
        int currentYear = Integer.parseInt(new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime()));
        System.out.println(currentYear);

        driver.findElement(By.xpath("//td[@data-year="+currentYear+"][@data-month="+monthValueInXpath+"]/a[text()="+currentDay+"]")).click();

//        String actualDate = (driver.findElement(By.className("hasDatepicker")));
//        System.out.println(actualDate);
        String expectedDate = currentDay+"/"+currentMonth+"/"+currentYear;
        System.out.println(expectedDate);
//        Assert.assertEquals(expectedDate,actualDate);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#datepicker"))).click();
        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
        nextButton.click();
        String monthSecondDate = currentMonth;
        driver.findElement(By.xpath("//td[@data-year=" + currentYear + "][@data-month=" + monthSecondDate + "]/a[text()=" + 1 + "]")).click();
        System.out.println("current date is picked");

        String actualDate2 = (driver.findElement(By.cssSelector("input#datepicker")).getText());
        System.out.println(actualDate2);
        String expectedDate2 = "0" + 1 + "/"+ monthSecondDate+ "/" + currentYear;
        System.out.println(expectedDate2);
        Assert.assertEquals(expectedDate2, actualDate2);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#datepicker"))).click();
        String month = driver.findElement(By.xpath("//span[text()='May']")).getText();
        String year = driver.findElement(By.xpath("//span[text()='2022']")).getText();
        while (year != String.valueOf(currentYear + 1) || month != "January") {
            nextButton.click();
        }

        String monthThirdDate = "0";
        String nextYear = String.valueOf(currentYear+1);
        String day = "31";
        driver.findElement(By.xpath("//td[@data-year='" + nextYear + "'][@data-month='" + monthThirdDate + "']/a[text()='" + day + "'])")).click();

    }
}
