package com.tayfa.tests;

import com.tayfa.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BookingReservation {

    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get("https://www.booking.com/");

        WebElement dateInput = Driver.getDriver().findElement(By.className("xp__dates-inner"));

        dateInput.click();

        Thread.sleep(2000);

        WebElement july23 = Driver.getDriver().findElement(By.xpath("//span[@aria-label='23 July 2021']"));
        july23.click();

        Thread.sleep(2000);

        WebElement july30 = Driver.getDriver().findElement(By.xpath("//span[@aria-label='30 July 2021']"));
        july30.click();

        Thread.sleep(1000);

        Driver.getDriver().findElement(By.className("xp__guests__count")).click();


    }

}
