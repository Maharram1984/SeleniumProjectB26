package com.cydeo.test.day14_DriverUtility;

import com.cydeo.Utilities.Driver;
import com.cydeo.Utilities.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollingPractice {

    @Test
    public void scrollingTest(){
        Driver.getDriver().get("https://practice.cydeo.com");

        Actions actions = new Actions(Driver.getDriver());

        WebElement cydeo = Driver.getDriver().findElement(By.linkText("CYDEO"));
        Sleep.sleep(3);
        actions.moveToElement(cydeo).perform();

        Sleep.sleep(3);
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform();

        Sleep.sleep(3);
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();


    }


}
