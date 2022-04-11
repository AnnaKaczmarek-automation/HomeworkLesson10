package Widgets;

import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Month;
import java.util.List;

import static java.lang.Integer.parseInt;

public class DatePickerTabSteps extends BaseTest {

    Logger log = LoggerFactory.getLogger("DatePickerTabSteps.class");

    public void openDataPicker() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#datepicker"))).click();
    }

    public void clickNextButton() {
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        log.info("'Next' button is chosen");
    }

    public void clickPreviousButton() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//span[text()='Prev']")))).click();
    }

    public void chooseDate(int year, int month, int day) throws InterruptedException {
        openDataPicker();
        findYearInCalendar(year);
        findMonthInCalendar(month);
        findDayInCalendar(day);
        waitTillCalendarIsClosed();
    }

    public void findYearInCalendar(int year) {
        int displayedYearText = parseInt(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText());
        System.out.println(displayedYearText);

        if (displayedYearText > year) {
            while (displayedYearText > year) {
                clickPreviousButton();
                displayedYearText = parseInt(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText());
            }
        }

        if (displayedYearText < year) {
            while (displayedYearText < year) {
                clickNextButton();
                displayedYearText = parseInt(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText());
            }
        }
    }

    public void findMonthInCalendar(int month) {
        String displayedMonthText = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        int integerDisplayedMonthValue = changeMonthValuesIntoInteger(displayedMonthText);

        if (integerDisplayedMonthValue > month) {
            while (integerDisplayedMonthValue > month) {
                clickPreviousButton();
                log.info("Previous button was clicked");
                displayedMonthText = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
                integerDisplayedMonthValue = changeMonthValuesIntoInteger(displayedMonthText);

                if (integerDisplayedMonthValue == month) {
                    break;
                }
            }
        }

        if (integerDisplayedMonthValue < month) {
            while (integerDisplayedMonthValue < month) {

                clickNextButton();
                log.info("Next button was clicked");
                displayedMonthText = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
                integerDisplayedMonthValue = changeMonthValuesIntoInteger(displayedMonthText);

                if (integerDisplayedMonthValue == month) {
                    break;
                }
            }
        }
    }

    public Integer changeMonthValuesIntoInteger(String month) {
        int monthInt = 0;
        switch (month) {
            case "January":
                monthInt = Month.JANUARY.getValue();
                log.info("value of month is " + monthInt);
                break;

            case "February":
                monthInt = Month.FEBRUARY.getValue();
                log.info("value of month is " + monthInt);
                break;

            case "March":
                monthInt = Month.MARCH.getValue();
                log.info("value of month is " + monthInt);
                break;

            case "April":
                monthInt = Month.APRIL.getValue();
                log.info("value of month is " + monthInt);
                break;

            case "May":
                monthInt = Month.MAY.getValue();
                log.info("value of month is " + monthInt);
                break;

            case "June":
                monthInt = Month.JUNE.getValue();
                log.info("value of month is " + monthInt);
                break;

            case "July":
                monthInt = Month.JULY.getValue();
                log.info("value of month is " + monthInt);
                break;

            case "August":
                monthInt = Month.AUGUST.getValue();
                log.info("value of month is " + monthInt);
                break;

            case "September":
                monthInt = Month.SEPTEMBER.getValue();
                log.info("value of month is " + monthInt);
                break;

            case "October":
                monthInt = Month.OCTOBER.getValue();
                log.info("value of month is " + monthInt);
                break;

            case "November":
                monthInt = Month.NOVEMBER.getValue();
                log.info("value of month is " + monthInt);
                break;

            case "December":
                monthInt = Month.DECEMBER.getValue();
                log.info("value of month is " + monthInt);
                break;

            default:
                log.info("Wrong month name was provided");
        }
        return monthInt;
    }


    public void findDayInCalendar(int day) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        List<WebElement> listOfWeeks = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("tbody tr")));
        for (WebElement week : listOfWeeks) {
            List<WebElement> allDaysInWeek = week.findElements(By.cssSelector("td"));
            for (WebElement dayOnTheList : allDaysInWeek) {
//                int dayValue = Integer.parseInt(dayOnTheList.findElement(By.cssSelector("td a:nth-child(1)")).getText());
                String dayValue = dayOnTheList.getText();

                if (dayValue.equals(String.valueOf(day))) {
                    dayOnTheList.click();
                    log.info("Chosen day was " + dayOnTheList.getText());
                    Thread.sleep(3000);
                }
            }
        }
    }

    public void waitTillCalendarIsClosed() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("ui-datepicker-div")));
    }
}


