package com.cydeo.test.day10_Window_utilities;

import com.cydeo.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Windows_Handle extends TestBase {

    @Test
    public void windowHandle(){

//        2. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");

//        3. Assert: Title is “Windows”
        Assert.assertEquals(driver.getTitle(),"Windows");

//        4. Click to: “Click Here” link
        WebElement clickBtn = driver.findElement(By.linkText("Click Here"));
        clickBtn.click();

//        5. Switch to new Window.
       // Set<String > all = driver.getWindowHandles();

        for(String each:driver.getWindowHandles()) {

            driver.switchTo().window(each);
            System.out.println(driver.getTitle());
//            System.out.println(each);
        }
//        6. Assert: Title is “New Window”
        Assert.assertEquals(driver.getTitle(),"New Window");

    }
}
