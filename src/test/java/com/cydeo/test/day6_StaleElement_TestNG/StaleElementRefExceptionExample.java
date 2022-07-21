package com.cydeo.test.day6_StaleElement_TestNG;

import com.cydeo.Base.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StaleElementRefExceptionExample {
    public static void main(String[] args) {
/*
TC #1: StaleElementReferenceException handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/add_remove_elements/
3. Click to “Add Element” button
4. Verify “Delete” button is displayed after clicking.
5. Click to “Delete” button.
6. Verify “Delete” button is NOT displayed after clicking.  */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get(" https://practice.cydeo.com/add_remove_elements/");

        WebElement addElement = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElement.click();

        WebElement delete = driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("Before clicking delete button " + delete.isDisplayed());
        delete.click();
       // System.out.println("After clicking delete button " + delete.isDisplayed());

        try {
            System.out.println("After clicking delete button " + delete.isDisplayed());

        }catch (Exception e){
            System.out.println("StaleElementRefException is handled");
        }
        driver.quit();
    }

}
