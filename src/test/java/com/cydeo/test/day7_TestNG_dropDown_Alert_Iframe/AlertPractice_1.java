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

public class AlertPractice_1 {

    WebDriver driver;
/*1. Open browser
  2. Go to website: http://practice.cydeo.com/javascript_alerts
  3. Click to “Click for JS Confirm” button
  4. Click to OK button from the alert
  5. Verify “You clicked: Ok” text is displayed.  */


    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/javascript_alerts ");
    }

    @Test
    public void alertButton() {
        WebElement clickJS = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        clickJS.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement result = driver.findElement(By.id("result"));
//        System.out.println("result.isDisplayed() = " + result.isDisplayed());
        Assert.assertTrue(result.isDisplayed());
        Assert.assertEquals(result.getText(),"You clicked: Ok", "Failed");
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
