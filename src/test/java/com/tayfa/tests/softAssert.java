package com.tayfa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {

    @Test
    public void test1(){

        Driver.getDriver().get("https://amazon.com");
        String title = Driver.getDriver().getTitle();

        //HardAssert hata verdigi noktada durur
        Assert.assertEquals(title,"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");

        //SoftAssert hatayi bulur  ama testin diger asamalarini calistirir.
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(title,"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");


    }
}
