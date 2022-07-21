package com.cydeo.test.day15_Actions;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionDoubleClickTest {

    @Test
    public void doubleClickTest() {
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        Driver.getDriver().switchTo().frame("iframeResult");

        WebElement textDoubleClick = Driver.getDriver().findElement(By.cssSelector("#demo"));

        Driver.actions.doubleClick(textDoubleClick).pause(50).perform();

        String expect = "red";
        String actual = textDoubleClick.getAttribute("style");
        Assert.assertTrue(actual.contains(expect));

        Driver.closeDriver();
    }


}
