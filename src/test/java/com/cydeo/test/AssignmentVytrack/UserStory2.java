package com.cydeo.test.AssignmentVytrack;

import com.cydeo.Utilities.Driver;
import com.cydeo.Utilities.VyTrack;
import com.cydeo.Utilities.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory2 {

    /* 1. store manager or sales manager can see all Vehicles model information
       2. Store manager or Sales manager can create new Vehicle model
       3. during the creation, all required field should be displayed and Fuel type drop down should displayed as (Gasoline, Diesel, Electric, Hybrid)
       4.Verify that store manager or sales manager can Edit the Vehicle model.
       5.Verify that store manager or sales manager can delete the Vehicle model.
       6. store manager or sales manager can reset the grid by click on Grid setting. */


    @Test
    public void userStory5() {

        VyTrack.vyTrack_login();
        WebElement fleetHvrOvr = Driver.getDriver().findElement(By.xpath("(//a[@class='unclickable']//span)[2]"));
        Sleep.sleep(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetHvrOvr).perform();

        WebElement vehicles = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles Model']"));
        vehicles.click();
        WebElement table = Driver.getDriver().findElement(By.xpath("//div[@class='other-scroll-container']"));
        Assert.assertTrue(table.isDisplayed());
        WebElement createCar = Driver.getDriver().findElement(By.xpath("//a[@title='Create Vehicles Model']"));
        createCar.click();
        WebElement fuelTypeBtn = Driver.getDriver().findElement(By.xpath("(//span[@class='select2-chosen'])[2]"));
        fuelTypeBtn.click();
        WebElement hybrid = Driver.getDriver().findElement(By.xpath("//div[.='Hybrid']"));
        hybrid.click();
        WebElement saveAndClose = Driver.getDriver().findElement(By.xpath("//div[@class='btn-group pull-right']"));
        saveAndClose.click();
        WebElement edit = Driver.getDriver().findElement(By.xpath("//a[@title='Edit Vehicles Model']"));
        edit.click();
        WebElement write = Driver.getDriver().findElement(By.xpath("//input[@data-name='field__model-name']"));
        write.sendKeys("SalamSagol");
        Sleep.sleep(2);
        WebElement delete = Driver.getDriver().findElement(By.xpath("//a[@title='Delete Vehicles Model']"));
        delete.click();
        WebElement deleteBtn = Driver.getDriver().findElement(By.xpath("//a[.='Yes, Delete']"));
        deleteBtn.click();
        WebElement conformDeleteMsg = Driver.getDriver().findElement(By.xpath("//div[.='Vehicles Model deleted']"));
        Assert.assertTrue(conformDeleteMsg.isDisplayed());
        WebElement reset = Driver.getDriver().findElement(By.xpath("//i[@class='fa-repeat']"));
        reset.click();

        Driver.closeDriver();



//    SleepUtilities2.sleep(5);

    }


}
