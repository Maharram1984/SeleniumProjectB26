package com.cydeo.test.day16_Actions_;

import com.cydeo.Utilities.Driver;
import com.cydeo.Utilities.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionScrollPractice {

    @Test
    public void actionScroll1(){

        //1. Go to https://www.etsy.com
        Driver.getDriver().get("https://www.etsy.com");
        //2. Scroll down
        //3. Generate random email and enter into subscribe box
        WebElement email = Driver.getDriver().findElement(By.xpath("//input[@placeholder='Enter your email']"));
        email.sendKeys(Keys.DOWN);
        email.sendKeys(Driver.faker.internet().emailAddress());
        //4. Click on Subscribe
        WebElement subscribe = Driver.getDriver().findElement(By.xpath("//button[@class='wt-btn wt-input-btn-group__btn']"));
        subscribe.click();
        //5. Verify "Great! We've sent you an email to confirm
        //your subscription." is displayed
        WebElement verification = Driver.getDriver().findElement(By.xpath(
        "//div[@class='wt-alert wt-alert--inline wt-alert--success-01 wt-text-body-01']"));
        Assert.assertTrue(verification.isDisplayed());

    }


    @Test
    public void actionScroll2() {
        Driver.getDriver().get("https://practice.cydeo.com");
        WebElement cydeo = Driver.getDriver().findElement(By.xpath("//a[.='CYDEO']"));
        Driver.actions.moveToElement(cydeo).perform();
       // cydeo.sendKeys(Keys.DOWN);
        Sleep.sleep(4);
        WebElement home = Driver.getDriver().findElement(By.xpath("//a[.='Home']"));
        home.sendKeys(Keys.UP);
        home.click();
    }


}
