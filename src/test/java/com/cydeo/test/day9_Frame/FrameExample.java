package com.cydeo.test.day9_Frame;

import com.cydeo.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class FrameExample extends TestBase {


    @Test
    public void iframeExample() throws InterruptedException {
        //2- Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");

//        driver.switchTo().frame(0);
//        driver.switchTo().frame("mce_0_ifr");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']")));

        //3- Clear text from comment body
        WebElement clearText = driver.findElement(By.cssSelector("#tinymce"));
//        Thread.sleep(3000);
        clearText.clear();

        //4- Type "Hello World" in comment body
//        Thread.sleep(3000);
        clearText.sendKeys("Hello World");

        //5- Verify "Hello World" text is written in comment body
        assertEquals(clearText.getText(), "Hello World");

        driver.switchTo().parentFrame();
//        driver.switchTo().defaultContent();

        //6- Verify header "An iFrame containing the TinyMCE WYSIWYG Editor"
        WebElement header = driver.findElement(By.tagName("h3"));
        assertTrue(header.isDisplayed());

        assertEquals(header.getText(), "An iFrame containing the TinyMCE WYSIWYG Editor");


    }


}
