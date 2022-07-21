package com.cydeo.test.day7_TestNG_dropDown_Alert_Iframe;

import com.cydeo.Base.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.out.println("Before method is running");
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After method is running");
        driver.quit();
    }

    @Test
    public void etsyTitle() {
        driver.get("https://etsy.com");
    }

    @Test
    public void googleTitle() {
        driver.get("https://google.com/");
        String actual = driver.getTitle();
        String expect = "Google";
        Assert.assertEquals(actual, expect, "Failed");
    }

    @Test
    public void yahooTitle() {
        driver.get("https://yahoo.com");
    }






}
