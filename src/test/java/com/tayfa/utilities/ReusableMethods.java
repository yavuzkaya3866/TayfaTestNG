package com.tayfa.utilities;

public class ReusableMethods {


public static void sleep(int milisecond){

    try {
        Thread.sleep(milisecond);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}
