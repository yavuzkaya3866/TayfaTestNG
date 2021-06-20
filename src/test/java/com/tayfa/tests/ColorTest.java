package com.tayfa.tests;

import com.tayfa.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ColorTest {

    @Test
    public void test(){

        Driver.getDriver().get("https://www.w3schools.com/");

        WebElement  learnHtml = Driver.getDriver().findElement(By.linkText("Learn HTML"));

        String arkaplanRengi = learnHtml.getCssValue("background-color");

        System.out.println(arkaplanRengi);
    }
}
