package com.cydeo.test.day9_Frame;

import com.cydeo.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IframeExample2 extends TestBase {

    @Test
    public void iframeTest() {

        //1. Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");


        //2. Assert: “Your content goes here.” Text is displayed.
//        driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Rich Text Area']")));
//        driver.switchTo().frame("mce_0_ifr");


        WebElement text = driver.findElement(By.id("tinymce"));
        assertTrue(text.isDisplayed());

        //3. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”

        driver.switchTo().defaultContent();
//        driver.switchTo().parentFrame();

        WebElement text2 = driver.findElement(By.xpath("//h3"));
        assertEquals(text2.getText(), "An iFrame containing the TinyMCE WYSIWYG Editor");

        assertTrue(text2.isDisplayed());

    }
}
