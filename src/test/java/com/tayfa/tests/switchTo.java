package com.tayfa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class switchTo {

    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get("https://www.w3schools.com/colors/colors_picker.asp");

        WebElement facebookLink = Driver.getDriver().findElement(By.xpath("//a[@title= 'Facebook']"));
        facebookLink.click();

        System.out.println(Driver.getDriver().getWindowHandles());

        Thread.sleep(3000);
        Set<String> handles = Driver.getDriver().getWindowHandles();

        Object[] array = handles.toArray();
        String sonSayfaninHandleDegeri = array[array.length-1].toString();


        Driver.getDriver().switchTo().window(sonSayfaninHandleDegeri);



    }
}
