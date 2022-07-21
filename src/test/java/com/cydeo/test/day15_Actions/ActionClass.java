package com.cydeo.test.day15_Actions;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionClass {

    @Test
    public void dragAndDropTest() {

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //Actions actions = new Actions(Driver.getDriver());
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        Driver.actions.dragAndDrop(smallCircle, bigCircle).pause(2000).perform();

//        Driver.actions.moveToElement(smallCircle).pause(1000)
//                .clickAndHold().pause(1000)
//                .moveToElement(bigCircle).pause(1000)
//                .release().perform();

        Assert.assertEquals(bigCircle.getText(), "You did great!");


        Driver.closeDriver();


    }


}
