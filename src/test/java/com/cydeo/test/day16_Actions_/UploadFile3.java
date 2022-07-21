package com.cydeo.test.day16_Actions_;

import com.cydeo.Utilities.Driver;
import com.cydeo.Utilities.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFile3 {

    @Test
    public void uploadFile() {
//1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        String path = "C:\\Users\\mrefi\\word-image-267.jpeg";

//2. Find some small file from your computer, and get the path of it.
        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));
        chooseFile.sendKeys(path);
        Driver.actions.moveToElement(chooseFile).pause(3).perform();
        Sleep.sleep(3);
//3. Upload the file.
        WebElement uploadFile = Driver.getDriver().findElement(By.id("file-submit"));
        uploadFile.click();
//4. Assert:
//-File uploaded text is displayed on the page
        WebElement conformMsg = Driver.getDriver().findElement(By.xpath("//h3"));
        Assert.assertTrue(conformMsg.isDisplayed());


    }
}
