package com.cydeo.test.day9_Frame;

import com.cydeo.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IframePractice extends TestBase {


    @Test
    public void iframeTest() {

        //2- Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");


//        driver.switchTo().frame("mce_0_ifr"); // with id locator
//        driver.switchTo().frame(0);  // with index number
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']")));


        //3- Clear text from comment body
        WebElement comment = driver.findElement(By.id("tinymce"));
        comment.clear();
        //4- Type "Hello World" in comment body
        comment.sendKeys("Hello World");

        //5- Verify "Hello World" text is written in comment body
        assertEquals(comment.getText(), "Hello World");

        driver.switchTo().parentFrame();  // to switch back

        //6- Verify header "An iFrame containing the TinyMCE WYSIWYG Editor"
        WebElement header = driver.findElement(By.xpath("//h3"));
        assertTrue(header.isDisplayed());

        assertEquals(header.getText(), "An iFrame containing the TinyMCE WYSIWYG Editor");


    }


}
