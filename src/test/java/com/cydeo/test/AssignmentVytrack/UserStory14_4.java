package com.cydeo.test.AssignmentVytrack;

import com.cydeo.Utilities.Driver;
import com.cydeo.Utilities.VyTrack;
import com.cydeo.Utilities.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class UserStory14_4 {

 /* User goes to homepage
    User should hover over "Fleet" module
    User has to click "Vehicle" option from dropdown list
    User has to click "Create Car" button
    User has to be able to click "VehiclesModel" button
    User should be able to click "Add" button
    User should be able to click needed checkboxes
    User should be able to click "Select" button
    User should conform the table                     */


    @Test
    public void assignmentTest() {

        VyTrack.vyTrack_login();
        WebElement fleetHvrOvr = Driver.getDriver().findElement(By.xpath("(//a[@class='unclickable']//span)[2]"));
        Sleep.sleep(3);
        Driver.actions.moveToElement(fleetHvrOvr).perform();
        Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']")).click();
        Sleep.sleep(4);
        Driver.getDriver().findElement(By.xpath("//a[@title='Create Car']")).click();
        Driver.getDriver().findElement(By.xpath("//a[.='VehiclesModel']")).click();
        Driver.getDriver().findElement(By.xpath("(//button[@type='button'])[1]")).click();
        Sleep.sleep(2);

        List<WebElement> checkBox = Driver.getDriver().findElements(By.xpath("//input[@ tabindex='-1']"));
        for (WebElement each : checkBox) {
            each.click();
        }

        Driver.getDriver().findElement(By.xpath("//button[.='Select']")).click();
        WebElement table = Driver.getDriver().findElement(By.xpath("//div[contains(@class,'control-group control-group-oro_multiple_entity')][1]"));
        Assert.assertTrue(table.isDisplayed());

    }

}
