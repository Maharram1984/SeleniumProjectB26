package com.cydeo.test.day3_css_Xpath;

import com.cydeo.Base.WebDrFact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class getAttribute {
    public static void main(String[] args) {

    //  TC #5: getText() and getAttribute() method practice
    //  1- Open a Chrome browser
        WebDriver driver = WebDrFact.getDriver("chrome");
        driver.manage().window().maximize();

    //  2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

    //  3- Verify header text is as expected:  Expected: Registration form
        WebElement headerText = driver.findElement(By.tagName("h2"));

        String expect = "Registration form";
        String actual = headerText.getText();

        if(actual.equals(expect)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }

    //  4- Locate “First name” input box
    //  5- Verify placeholder attribute’s value is as expected: Expected: first name
        WebElement input = driver.findElement(By.className("form-control"));

        String expectPlaceHolder = "first name";

        // getAttribute helps to get value of attribute
        String actualPlaceHolder = input.getAttribute("placeholder");

        if(actualPlaceHolder.equals(expectPlaceHolder)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        driver.quit();
    }

}
