package com.cydeo.test.day15_Actions;

import com.cydeo.Utilities.Driver;
import com.cydeo.Utilities.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFileTest {

    @Test
    public void uploadFileTest() {
//    1. Go to “https://demo.guru99.com/test/upload”
        Driver.getDriver().get("https://demo.guru99.com/test/upload");

        String path = "C:\\Users\\mrefi\\OneDrive\\Desktop\\some-file.txt";
//    2. Upload file into Choose File
        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//input[@type='file']"));
        chooseFile.sendKeys(path);
//    3. Click terms of service checkbox
        WebElement checkbox = Driver.getDriver().findElement(By.xpath("//input[@class='field_check']"));
        checkbox.click();
//    4. Click Submit File button
        WebElement submitButton = Driver.getDriver().findElement(By.id("submitbutton"));
        submitButton.click();

//    5. Verify expected message appeared.
//    Expected: “1 file
//    has been successfully uploaded.”
        WebElement resultMsg = Driver.getDriver().findElement(By.id("res"));
        String actual = resultMsg.getText();
        String expect = "1 file\nhas been successfully uploaded.";
        Sleep.sleep(3);
       Assert.assertEquals(actual,expect);

       Driver.closeDriver();
    }

}
