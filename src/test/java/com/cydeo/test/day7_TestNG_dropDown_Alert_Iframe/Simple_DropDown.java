package com.cydeo.test.day7_TestNG_dropDown_Alert_Iframe;

import com.cydeo.Base.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Simple_DropDown {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        //        Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void dropDown2() {
//  3. Verify “Simple dropdown” default selected value is correct
//  Expected: “Please select an option”
        Select select = new Select(driver.findElement(By.id("dropdown")));
        String actual = select.getFirstSelectedOption().getText();
        String expect = "Please select an option";
        Assert.assertEquals(actual, expect, "IT IS FAILED");
    }

    @Test
    public void dropDown1() {
//  4. Verify “State selection” default selected value is correct
//  Expected: “Select a State”
        Select select1 = new Select(driver.findElement(By.id("state")));
        String actual1 = select1.getFirstSelectedOption().getText();
        String expect1 = "Select a State";
        Assert.assertEquals(actual1, expect1, "IT IS FAILED");

    }

}
