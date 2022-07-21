package com.cydeo.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class TableUtility {


    public static void verifyOrder(WebDriver driver, String name) {

        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='table1']//tr//td[2]"));

        for (WebElement each : allNames) {
            if (each.getText().equals(name)) {
//                Assert.assertTrue(true);
//                return;
                System.out.println(each);
            }
        }
//        Assert.assertTrue(false, "Name does not exist in the list");
    }


    public static String returnOrderDate(WebDriver driver, String customerName) {
        String locator = "//td[.='" + customerName + "']//following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));
        return customerDateCell.getText();
    }

    public static String returnOrderDate2(WebDriver driver, String customerName) {
        return driver.findElement(By.xpath("//td[.='" + customerName + "']//following-sibling::td[3]")).getText();
    }

    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate) {

        String locator = "//td[.='" + customerName + "']//following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        Assert.assertEquals(customerDateCell.getText(), expectedOrderDate);
    }

}
