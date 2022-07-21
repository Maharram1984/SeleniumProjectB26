package com.cydeo.Pages;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    // Create constructor and initialize driver and object of the class
    public LibraryLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement inputEmail;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signButton;

// Appear when email is error
    @FindBy(id = "inputEmail-error")
    public WebElement invalidEmailError;

// Appears when email and password are error
    @FindBy(xpath = "//div[@class = 'alert alert-danger']")
    public WebElement incorrectEmailOrPasswordError;



}
