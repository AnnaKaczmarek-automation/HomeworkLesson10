package Widgets;

import BaseData.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
        driver.findElement(By.cssSelector("ui-datepicker-prev ui-corner-all ui-state-hover ui-datepicker-prev-hover")).click();
    }

    public void chooseDay(int year, String month, int day) throws InterruptedException {
//        String currentDay = new SimpleDateFormat("d").format(Calendar.getInstance().getTime());
//        System.out.println(currentDay);
//
//        String currentMonth = new SimpleDateFormat("MM").format(Calendar.getInstance().getTime());
//        System.out.println(currentMonth);
//
//        int currentYear = Integer.parseInt(new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime()));
//        System.out.println(currentYear);

        //sprawdzam jaki jest wyświetlony rok
        int displayedYearText = Integer.parseInt(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText());

        //sprawdzam jaki jest wyświetlony miesiąc
        WebElement displayedMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        String displayedMonthText = displayedMonth.getText();

//
//        if (displayedYearText == year) {
//            if (displayedMonthText.equals(month)) {
//                findDayInCalendar(day);
//            }
//        }else {
//            clickNextButton();
//        }
//
//        Thread.sleep(5000);
//***********************************8
//
////
//        while (true) {
//            if (displayedYearText == year) {
//                if (displayedMonthText.equals(month)) {
//                    findDayInCalendar(day);
//                }
//            } else if (displayedYearText < year) {
//
//                clickNextButton();
//
//            } else if (displayedYearText > year) {
//
//                clickPreviousButton();
//
//            }
//        }

        findYearInCalendar(year);
        findMonthInCalendar(month);
        findDayInCalendar(day);
    }
    public void  findYearInCalendar(int year){


            int displayedYearText = Integer.parseInt(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText());
            if (displayedYearText > year) {
                clickPreviousButton();
            }
            if (displayedYearText < year) {
                clickNextButton();
            }

    }

    public void  findMonthInCalendar(String month){
        WebElement displayedMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        String displayedMonthText = displayedMonth.getText();

    }


    public void findDayInCalendar(int day) {
        //tworze listę tygodni
        List<WebElement> listOfWeeks = driver.findElements(By.cssSelector("tbody tr"));

        //iteruję po liście, dodając każdy element tr do nowej listy dni tygodnia
        for (WebElement week : listOfWeeks) {
            List<WebElement> allDaysInWeek = week.findElements(By.cssSelector("td"));
            //jesli tekst pobrany z danego dnia tygodnia odpowiada temu w parametrze to kliknij w niego
            if (Integer.parseInt(allDaysInWeek.get(1).getText()) == day) {
                allDaysInWeek.get(0).click();
            }
        }
    }

    public void monthList(){
        List<String> listOfMonth = new ArrayList<>();

        listOfMonth.add("January");
        listOfMonth.add("February");
        listOfMonth.add("March");
        listOfMonth.add("April");
        listOfMonth.add("May");
        listOfMonth.add("June");
        listOfMonth.add("July");
        listOfMonth.add("August");
        listOfMonth.add("September");
        listOfMonth.add("October");
        listOfMonth.add("November");
        listOfMonth.add("December");

    }
}


