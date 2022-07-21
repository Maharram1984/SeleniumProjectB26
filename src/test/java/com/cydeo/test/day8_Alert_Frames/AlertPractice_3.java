package com.cydeo.test.day8_Alert_Frames;

import com.cydeo.Base.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertPractice_3 {

    WebDriver driver;
/* 1. Open browser
   2. Go to website: http://practice.cydeo.com/javascript_alerts
   3. Click to “Click for JS Prompt” button
   4. Send “hello” text to alert
   5. Click to OK button from the alert
   6. Verify “You entered:  hello” text is displayed.   */


    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alertButton() throws InterruptedException {
        WebElement clickJS = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        clickJS.click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.sendKeys("hello");
        Thread.sleep(3000);
        alert.accept();

        WebElement result = driver.findElement(By.id("result"));

        System.out.println("result.isDisplayed() = " + result.isDisplayed());
        Assert.assertEquals(result.getText(),"You entered: hello","FAILED");

        Assert.assertTrue(result.isDisplayed());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
