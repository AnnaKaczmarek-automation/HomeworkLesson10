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
//        String currentDay = new SimpleDateFormat("d").format(Calendar.getInstance().getTime());
//        System.out.println(currentDay);
//
//        String currentMonth = new SimpleDateFormat("MM").format(Calendar.getInstance().getTime());
//        System.out.println(currentMonth);
//

//        int currentYear = Integer.parseInt(new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime()));
//        System.out.println(currentYear);


        findYearInCalendar(year);
        Thread.sleep(5000);
        findMonthInCalendar(month);
        Thread.sleep(5000);
        findDayInCalendar(day);
        Thread.sleep(5000);
        waitTillCalendarIsClosed();


    }

    public void findYearInCalendar(int year) {

        int displayedYearText = Integer.parseInt(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText());
        System.out.println(displayedYearText);

        if (displayedYearText > year) {
            while (displayedYearText > year) {
                displayedYearText = Integer.parseInt(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText());
                clickPreviousButton();

            }
        }

        if (displayedYearText < year) {
            while (displayedYearText < year) {
                displayedYearText = Integer.parseInt(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText());
                clickNextButton();
            }
        }

//        while (true) {
//            displayedYearText = Integer.parseInt(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText());
//            if (displayedYearText > year) {
//                clickPreviousButton();
//                log.info("Previous button was clicked");
//                break;
//            }
//            if (displayedYearText == year) {
//                break;
//            }
//        }
//
//        while (true) {
//            displayedYearText = Integer.parseInt(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText());
//            if (displayedYearText < year) {
//                clickNextButton();
//                log.info("Next button was clicked");
//
//            }
//            if (displayedYearText == year) {
//                break;
//            }
//        }
//**********************************************************************************************
//        while (displayedYearText > year) {
//            displayedYearText = Integer.parseInt(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText());
//            clickPreviousButton();
//            log.info("Previous button was clicked");
//            if (displayedYearText == year) {
//                break;
//            }
//
//        }
//        while (displayedYearText < year) {
//            displayedYearText = Integer.parseInt(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText());
//            clickNextButton();
//            log.info("Next button was clicked");
//            if (displayedYearText == year) {
//                break;
//            }
//        }

    }

    public void findMonthInCalendar(int month) {

        int integerDisplayedMonthValue = 0;

        while (integerDisplayedMonthValue > month) {
            String displayedMonthText = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            integerDisplayedMonthValue = changeMonthValuesIntoInteger(displayedMonthText);
            clickPreviousButton();
            log.info("Previous button was clicked");
            if (integerDisplayedMonthValue == month) {
                break;
            }
        }
        while (integerDisplayedMonthValue < month) {
            String displayedMonthText = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            integerDisplayedMonthValue = changeMonthValuesIntoInteger(displayedMonthText);
            clickNextButton();
            log.info("Next button was clicked");
            if (integerDisplayedMonthValue == month) {
                break;
            }
        }
    }

    public Integer changeMonthValuesIntoInteger(String month) {

        int monthInt = 0;
        switch (month) {

            case "January":
                monthInt = Month.JANUARY.getValue();
//                actualValue = monthInt + 1;
                log.info("value of month is " + monthInt);
                break;

            case "February":
                monthInt = Month.FEBRUARY.getValue();
//                actualValue = monthInt + 1;
                log.info("value of month is " + monthInt);
                break;

            case "March":
                monthInt = Month.MARCH.getValue();
//                actualValue = monthInt + 1;
                log.info("value of month is " + monthInt);
                break;

            case "April":
                monthInt = Month.APRIL.getValue();
//                actualValue = monthInt + 1;
                log.info("value of month is " + monthInt);
                break;

            case "May":
                monthInt = Month.MAY.getValue();
//                actualValue = monthInt + 1;
                log.info("value of month is " + monthInt);
                break;

            case "June":
                monthInt = Month.JUNE.getValue();
//                actualValue = monthInt + 1;
                log.info("value of month is " + monthInt);
                break;

            case "July":
                monthInt = Month.JULY.getValue();
//                actualValue = monthInt + 1;
                log.info("value of month is " + monthInt);
                break;

            case "August":
                monthInt = Month.AUGUST.getValue();
//                actualValue = monthInt + 1;
                log.info("value of month is " + monthInt);
                break;

            case "September":
                monthInt = Month.SEPTEMBER.getValue();
//                actualValue = monthInt + 1;
                log.info("value of month is " + monthInt);
                break;

            case "October":
                monthInt = Month.OCTOBER.getValue();
//                actualValue = monthInt + 1;
                log.info("value of month is " + monthInt);
                break;

            case "November":
                monthInt = Month.NOVEMBER.getValue();
//                actualValue = monthInt + 1;
                log.info("value of month is " + monthInt);
                break;

            case "December":
                monthInt = Month.DECEMBER.getValue();
//                actualValue = monthInt + 1;
                log.info("value of month is " + monthInt);
                break;

            default:
                log.info("Wrong month name was provided");

        }
        return monthInt;

    }


    public void findDayInCalendar(int day) throws InterruptedException {
        List<WebElement> listOfWeeks = driver.findElements(By.cssSelector("tbody tr"));
        for (WebElement week : listOfWeeks) {
            List<WebElement> allDaysInWeek = week.findElements(By.cssSelector("td"));
            for (WebElement dayOnTheList : allDaysInWeek) {
                int dayValue = Integer.parseInt(dayOnTheList.findElement(By.xpath("//a[contains(@class, 'ui-state-default')]")).getText());
                if (dayValue == day) {
                    dayOnTheList.click();
                    log.info("Chosen day was " + dayOnTheList.getText());
                    Thread.sleep(3000);
                }
            }

        }

    }

//        public void findDayInCalendar(int day, crea){
//        for (WebElement dayOnTheList : allDaysInWeek) {
//            if (Integer.parseInt(dayOnTheList.findElement(By.xpath("//a[contains(@class, 'ui-state-default')]")).getText()) == day) {
//                dayOnTheList.click();
//                log.info("Chosen day was " + dayOnTheList.getText());
//                Thread.sleep(3000);
//            }
//        }


    public void waitTillCalendarIsClosed() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("'ui-datepicker-div")));
    }
}


