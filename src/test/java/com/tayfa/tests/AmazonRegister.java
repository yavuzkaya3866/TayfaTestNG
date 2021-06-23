package com.tayfa.tests;

import com.tayfa.pages.AmazonPage;
import com.tayfa.utilities.ReusableMethods;
import org.testng.annotations.Test;

public class AmazonRegister {


    AmazonPage amazonPage = new AmazonPage();

    @Test
    public void test(){

        Driver.getDriver().get("https://amazon.com");

        amazonPage.registerBox.click();
        ReusableMethods.sleep(3000);
        amazonPage.CreateAA.click();
        ReusableMethods.sleep(3000);
        amazonPage.RegisterNameBox.sendKeys("John Doe");
        ReusableMethods.sleep(3000);
        amazonPage.RegisterEmailBox.sendKeys("johndoe1233214554");
        ReusableMethods.sleep(2000);
        amazonPage.RegisterPasswordBox.sendKeys("123.321.John");
        ReusableMethods.sleep(2000);
        amazonPage.RegisterPasswordCheckBox.sendKeys("123.321.John");
        ReusableMethods.sleep(2000);
        amazonPage.CreateYAABox.click();
        ReusableMethods.sleep(2000);

        System.out.println(Driver.getDriver().getCurrentUrl());

Driver.closeDriver();



    }
}
