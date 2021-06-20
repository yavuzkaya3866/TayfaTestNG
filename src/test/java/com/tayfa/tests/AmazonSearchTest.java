package com.tayfa.tests;

import com.tayfa.pages.AmazonPage;
import com.tayfa.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonSearchTest {

    AmazonPage page = new AmazonPage();

    @Test
    public void searchTest(){
        Driver.getDriver().get("https://amazon.com");
            page.searchBox.sendKeys("iphone"+ Keys.ENTER);


    }

    @Test

    public void test() throws InterruptedException {

        Driver.getDriver().get("https://www.amazon.com");

        page.searchBox.sendKeys("hello"+Keys.ENTER);
    }

}
