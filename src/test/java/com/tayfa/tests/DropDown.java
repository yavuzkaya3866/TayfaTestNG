package com.tayfa.tests;

import com.tayfa.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown {

    @Test
    public void test(){

        Driver.getDriver().get("https://amazon.com");

        WebElement dropdown = Driver.getDriver().findElement(By.id("searchDropdownBox"));

        Select select = new Select(dropdown);
        List<WebElement> secenekler = select.getOptions();

//        for (WebElement w : secenekler) {
//            System.out.println(w.getText());
//        }

        boolean sonuc = siraliMi(secenekler);
        System.out.println(sonuc);
    }


    // comperaTo -->
    public boolean siraliMi (List<WebElement> secenekler){

        boolean siraliMi = false;

        for(int i=1; i<secenekler.size(); i++){

            WebElement onceki = secenekler.get(i-1);
            WebElement suanki = secenekler.get(i);

            if (onceki.getText().compareTo(suanki.getText())<0){
                    siraliMi = true;
            }else{
                siraliMi= false;
                break;
            }
        }
            return siraliMi;
        // sonuc false oldu. cunku harf sirasina gore dizili degil

    }

}
