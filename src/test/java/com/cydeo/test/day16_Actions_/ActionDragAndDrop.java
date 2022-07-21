package com.cydeo.test.day16_Actions_;

import com.cydeo.Utilities.Driver;
import com.cydeo.Utilities.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionDragAndDrop {

    @Test
    public void actionDragAndDrop(){

        //2- Go to: https://demo.guru99.com/test/drag_drop.html
        Driver.getDriver().get("https://demo.guru99.com/test/drag_drop.html");
        //3- Drag “BANK” and drop into Account area under Debit Side
        WebElement takeBank = Driver.getDriver().findElement(By.id("credit2"));
        WebElement putBank = Driver.getDriver().findElement(By.cssSelector("#bank"));
        Driver.actions.dragAndDrop(takeBank,putBank).perform();
        //4- Drag “5000” and drop into Amount area under Debit Side
        WebElement takeFirst5000 = Driver.getDriver().findElement(By.xpath("(//li[@data-id='2'])[1]"));
        WebElement putFirst5000 = Driver.getDriver().findElement(By.id("amt7"));
        Sleep.sleep(3);
        Driver.actions.dragAndDrop(takeFirst5000,putFirst5000).perform();
        //5- Drag “SALES” and drop into Account area under Credit
        WebElement takeSales = Driver.getDriver().findElement(By.id("credit1"));
        WebElement putSales = Driver.getDriver().findElement(By.cssSelector("#loan"));
        Driver.actions.dragAndDrop(takeSales,putSales).perform();
        //Side
        //6- Drag “5000” and drop into Amount area under Credit
        WebElement takeSecond5000 = Driver.getDriver().findElement(By.xpath("(//li[@id='fourth'])[1]"));
        WebElement putSecond5000 = Driver.getDriver().findElement(By.cssSelector("#amt8"));
        Sleep.sleep(3);
        Driver.actions.dragAndDrop(takeSecond5000,putSecond5000).pause(3).perform();
        //Side
        //7- Verify “Perfect!” text displayed.
        WebElement perfect = Driver.getDriver().findElement(By.linkText("Perfect!"));
        Assert.assertTrue(perfect.isDisplayed());

    }
}
