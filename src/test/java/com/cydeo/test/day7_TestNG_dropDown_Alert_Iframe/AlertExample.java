package com.cydeo.test.day7_TestNG_dropDown_Alert_Iframe;

import com.cydeo.Base.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertExample {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void informationMethod() {
// 3. Click to “Click for JS Alert” button
// 4. Click to OK button from the alert
// 5. Verify “You successfully clicked an alert” text is displayed.
        WebElement jsAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsAlert.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement result = driver.findElement(By.id("result"));
        Assert.assertTrue(result.isDisplayed());


        String actual = result.getText();
        String expect = "You successfully clicked an alert";
        Assert.assertEquals(actual, expect, "Failed");




    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
