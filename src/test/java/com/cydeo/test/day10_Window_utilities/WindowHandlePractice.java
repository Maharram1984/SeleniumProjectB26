package com.cydeo.test.day10_Window_utilities;

import com.cydeo.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WindowHandlePractice extends TestBase {


    @Test
    public void windowHandle(){

        driver.get("https://practice.cydeo.com//windows");

//        String oneWindow = driver.getWindowHandle();
//        System.out.println("oneWindow = " + oneWindow);
//
//        System.out.println(driver.getWindowHandle());
//        System.out.println(driver.getWindowHandles());
//
//        Set<String> allWindow = driver.getWindowHandles();
//        System.out.println("allWindow = " + allWindow);
//
        WebElement clickBtn = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickBtn.click();
        WebElement clickBtn2 = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickBtn2.click();
//
//        System.out.println("After = " + driver.getWindowHandle());
//        System.out.println("After = " + driver.getWindowHandles());

        for (String all : driver.getWindowHandles()){

            driver.switchTo().window(all);           // Windows, New Windows
            System.out.println(driver.getTitle());   // Window, Window
            System.out.println(all);                 // Will print those codes

        }




    }
}
