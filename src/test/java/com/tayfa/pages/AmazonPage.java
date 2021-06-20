package com.tayfa.pages;

import com.tayfa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {

    public AmazonPage (){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath= "//span[@class='nav-line-2 ']")
    public  WebElement registerBox;

    @FindBy(xpath ="//a[@id='createAccountSubmit']")
    public WebElement CreateAA;

    @FindBy(xpath = "//input[@id='ap_customer_name']")
    public WebElement RegisterNameBox;

    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElement RegisterEmailBox;

    @FindBy(xpath= "//input[@id='ap_password']")
    public  WebElement RegisterPasswordBox;

    @FindBy(xpath= "//input[@id='ap_password_check']")
    public  WebElement RegisterPasswordCheckBox;

    @FindBy(xpath= "//input[@id='continue']")
    public  WebElement RegisterContinueBox;

    @FindBy(xpath = "//span[@class='a-button-inner']")
    public  WebElement CreateYAABox;




}
