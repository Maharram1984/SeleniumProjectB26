package com.cydeo.test.day16_Actions_;

import com.cydeo.Utilities.Driver;
import com.cydeo.Utilities.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ActionHoverOver {

    @Test
    public void actionHoverOverTest1() {
        Driver.getDriver().get("https://practice.cydeo.com/hovers");
        for (int i = 1; i <= 3; i++) {
            int k = 1;
            WebElement user = Driver.getDriver().findElement(By.xpath("(//img)[" + i + "]"));
            Driver.actions.moveToElement(user).perform();
            WebElement userName = Driver.getDriver().findElement(By.xpath("(//h5)[" + i + "]"));
            WebElement viewProfile = Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[" + i + "]"));
            System.out.println(k++ + "user.isDisplayed() = " + user.isDisplayed());
            System.out.println(k++ + "userName.isDisplayed() = " + userName.isDisplayed());
            System.out.println(k++ + "viewProfile.isDisplayed() = " + viewProfile.isDisplayed());
            Assert.assertTrue(user.isDisplayed());
            Assert.assertTrue(userName.isDisplayed());
            Assert.assertTrue(viewProfile.isDisplayed());
        }
    }

    @Test
    public void actionHoverOverTest2() {
        Driver.getDriver().get("https://practice.cydeo.com/hovers");
        List<WebElement> a = Driver.getDriver().findElements(By.xpath("(//img[@alt='User Avatar'])"));
        List<WebElement> b = Driver.getDriver().findElements(By.xpath("(//h5)"));
        List<WebElement> c = Driver.getDriver().findElements(By.xpath("(//a[.='View profile'])"));
        int n = 0;
        for (WebElement each : a) {
            Driver.actions.moveToElement(each).perform();
            Sleep.sleep(2);
            Assert.assertTrue(each.isDisplayed());
            Assert.assertTrue(b.get(n).isDisplayed());
            Assert.assertTrue(c.get(n).isDisplayed());
            n++;
        }
//        do {
//            Driver.actions.moveToElement(a.get(n)).perform();
//            Assert.assertTrue(a.get(n).isDisplayed());
//            Assert.assertTrue(b.get(n).isDisplayed());
//            Assert.assertTrue(c.get(n).isDisplayed());
//            n++;
//        } while (n < a.size());
    }

    @Test
    public void actionHoverOverTest3() {
        //1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        //2. Hover over to first image
        WebElement user1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        Driver.actions.moveToElement(user1).perform();
        WebElement nameUserMsg1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement viewProfile1 = Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[1]"));
        //3. Assert:
        //a. “name: user1” is displayed
        //b. “view profile” is displayed
        Assert.assertTrue(nameUserMsg1.isDisplayed());
        Assert.assertTrue(viewProfile1.isDisplayed());

        //4. Hover over to second image
        WebElement user2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        Driver.actions.moveToElement(user2).perform();
        WebElement nameUserMsg2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement viewProfile2 = Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[2]"));
        //5. Assert:
        //a. “name: user2” is displayed
        //b. “view profile” is displayed
        Assert.assertTrue(nameUserMsg2.isDisplayed());
        Assert.assertTrue(viewProfile2.isDisplayed());
        //6. Hover over to third image
        WebElement user3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));
        Driver.actions.moveToElement(user3).perform();
        WebElement nameUserMsg3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));
        WebElement viewProfile3 = Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[3]"));
        //7. Confirm:
        //a. “name: user3” is displayed
        //b. “view profile” is displayed
        Assert.assertTrue(nameUserMsg3.isDisplayed());
        Assert.assertTrue(viewProfile3.isDisplayed());
    }


}
