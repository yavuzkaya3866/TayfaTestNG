package com.tayfa.tests;

import com.tayfa.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HTML_Locator {

    @Test
    public void aramaTesti() throws InterruptedException {

        Driver.getDriver().get("https://www.amazon.com");
       WebElement searchBox =  Driver.getDriver().findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
       searchBox.sendKeys("headphones");
        ReusableMethods.sleep(3000);

        Driver.getDriver().findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        ReusableMethods.sleep(5000);
        Driver.closeDriver();

    }
}
