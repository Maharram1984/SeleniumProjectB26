package com.cydeo.test.day15_Actions;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ActionPractice {

    @Test
    public void actionTest() {

        Driver.getDriver().get("https://practice.cydeo.com/hovers");
//        WebElement imp1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
//        WebElement imp2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
//        WebElement imp3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));
//
//        WebElement user1 = Driver.getDriver().findElement(By.xpath("//*[.='name: user1']"));
//        WebElement user2 = Driver.getDriver().findElement(By.xpath("//*[.='name: user2']"));
//        WebElement user3 = Driver.getDriver().findElement(By.xpath("//*[.='name: user3']"));
//
////        Actions actions = new Actions(Driver.getDriver());
//        Sleep.sleep(2);
//        Driver.actions.moveToElement(imp1).perform();
//        Assert.assertTrue(user1.isDisplayed());
//
//        Sleep.sleep(2);
//        Driver.actions.moveToElement(imp2).perform();
//        Assert.assertTrue(user2.isDisplayed());
//
//        Sleep.sleep(2);
//        Driver.actions.moveToElement(imp3).perform();
//        Assert.assertTrue(user3.isDisplayed());
//
        List<WebElement> images = Driver.getDriver().findElements(By.tagName("img"));
        for (WebElement each : images){
            Driver.actions.moveToElement(each).pause(1000).perform();
        Assert.assertTrue(each.isDisplayed());
        }
//
//    }
//
//    @Test
//    public void actionsTest() {
//        Driver.getDriver().get("https://practice.cydeo.com/hovers");
////        Actions actions = new Actions(Driver.getDriver());
//        for (int i = 1; i <= 3; i++) {
//            WebElement test = Driver.getDriver().findElement(By.xpath("(//img)[" + i + "]"));
//            Driver.actions.moveToElement(test).perform();
////            test = Driver.getDriver().findElement(By.xpath("//*[.='name: user" + i + "']"));
//            Assert.assertTrue(test.isDisplayed());
//        }
//        Driver.closeDriver();
    }


}
