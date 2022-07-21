package com.cydeo.test.AssignmentVytrack;

import com.cydeo.Utilities.Driver;
import com.cydeo.Utilities.VyTrack;
import com.cydeo.Utilities.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UserStory14_3 {

    @Test
    public void userStory14_3() {
        VyTrack.vyTrack_login();

        WebElement fleetHvrOvr = Driver.getDriver().findElement(By.xpath("(//a[@class='unclickable']//span)[2]"));
        Sleep.sleep(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetHvrOvr).perform();
        WebElement vehicle = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        vehicle.click();
        Sleep.sleep(4);
        WebElement creatCar = Driver.getDriver().findElement(By.xpath("//div//a[@title='Create Car']")); //a[@title='Create Car']
        creatCar.click();
        WebElement fuelTypeBtn = Driver.getDriver().findElement(By.xpath("(//span[@class='select2-chosen'])[2]"));
        fuelTypeBtn.click();
        WebElement hybrid = Driver.getDriver().findElement(By.xpath("//div[.='Hybrid']"));
        hybrid.click();



    }


}