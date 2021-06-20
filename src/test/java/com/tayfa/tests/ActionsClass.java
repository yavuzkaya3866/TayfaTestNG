package com.tayfa.tests;

import com.tayfa.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass {

    @Test
    public void test1() throws InterruptedException {

        Driver.getDriver().get("https://amazon.com");
        Actions actions = new Actions(Driver.getDriver());
        Thread.sleep(3000);
        WebElement helloSignIn = Driver.getDriver().findElement(By.xpath("//span[text()='Hello, Sign in']"));

        actions.moveToElement(helloSignIn).perform();

        //How can we do scroll Down in selenium.

        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }
}
