package com.cydeo.test.day15_Actions;

import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ActionHoverPractice {

    @Test
    public void actionHoverTest() {

//    1. Go to https://www.google.com/
        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));
//    2. Hover over on Search button
        WebElement searchBtn = Driver.getDriver().findElement(By.xpath(
                "//input[@id='gbqfbb']/preceding-sibling::input"));
        Driver.actions.moveToElement(searchBtn).pause(3).perform();
//    3. Hover over on Feeling Lucky button
        WebElement luckyBtn = Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']"));
        Driver.actions.moveToElement(luckyBtn).pause(3).perform();
    }
}
