package com.tayfa.tests;

import com.tayfa.utilities.Driver;
import com.tayfa.utilities.ReusableMethods;
import org.testng.annotations.Test;

public class GoogleAramaTest {


    @Test
    public void aramaTesti() throws InterruptedException {

        Driver.getDriver().get("https://www.google.com");
        System.out.println(Driver.getDriver().getTitle()); // getTitle sayfanin basligini alir.
        ReusableMethods.sleep(3000);

        Driver.getDriver().navigate().to("https://www.amazon.com");
        System.out.println(Driver.getDriver().getTitle());
        ReusableMethods.sleep(3000);

        Driver.getDriver().navigate().back();
        System.out.println(Driver.getDriver().getTitle());
        ReusableMethods.sleep(2000);

        Driver.getDriver().navigate().forward();
        System.out.println(Driver.getDriver().getTitle());
        ReusableMethods.sleep(2000);

        Driver.closeDriver();

    }

}
