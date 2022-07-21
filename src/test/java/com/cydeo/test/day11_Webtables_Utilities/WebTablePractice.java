package com.cydeo.test.day11_Webtables_Utilities;

import com.cydeo.Base.TestBase;
import com.cydeo.Utilities.TableUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablePractice extends TestBase {

    @Test
    public void bobMartins() {
        driver.get("https://practice.cydeo.com/web-tables");

        WebElement martin = driver.findElement(By.xpath("//td[.='Bob Martin']"));

        Assert.assertEquals(martin.getText(), "Bob Martin", "Failed");

        WebElement date = driver.findElement(By.xpath
                ("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']//following-sibling::td[3]"));
        // //td[.='12/31/2021']

        Assert.assertEquals(date.getText(), "12/31/2021", "Failed");
        //BrowserUtilities.verifyTitle(date.getText(),"12/31/2021");
    }

    @Test
    public void test2() {
        driver.get("https://practice.cydeo.com/web-tables");
        String customerOrderDate1 = TableUtility.returnOrderDate(driver, "Alexandra Gray");
        System.out.println("customerOrderDate1 = " + customerOrderDate1);

    }

    @Test
    public void test3() {
        driver.get("https://practice.cydeo.com/web-tables");

        TableUtility.orderVerify(driver,"Alexandra Gray","04/15/2021");

    }

}
