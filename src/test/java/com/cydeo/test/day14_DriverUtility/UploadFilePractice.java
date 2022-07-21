package com.cydeo.test.day14_DriverUtility;

import com.cydeo.Utilities.Driver;
import com.cydeo.Utilities.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFilePractice {

    @Test
    public void uploadTest() {

        Driver.getDriver().get("https://practice.cydeo.com/upload");

        String path = "C:\\Users\\mrefi\\word-image-267.jpeg";

        Driver.getDriver().findElement(By.id("file-upload")).sendKeys(path);

        Driver.getDriver().findElement(By.id("file-submit")).click();

        Sleep.sleep(3);

        WebElement conformMsg = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(conformMsg.isDisplayed());

        Driver.closeDriver();

    }


}
