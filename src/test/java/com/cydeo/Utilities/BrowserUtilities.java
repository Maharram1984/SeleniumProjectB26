package com.cydeo.Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtilities {

//    TC : Create utility method
//   1. Create a new class called BrowserUtils
//   2. Create a method to make Multiple Windows logic re-usable
//   3. When method is called, it should switch window and verify title.

//    Method info:
//   • Name: switchWindowAndVerify
//   • Return type: void
//   • Arg1: WebDriver
//   • Arg2: String expectedInUrl
//   • Arg3: String expectedTitle

    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle) {
        Set<String> all = driver.getWindowHandles();

        for (String each : all) {
            driver.switchTo().window(each);
         //   System.out.println(driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));

         BrowserUtilities.switchWindowAndVerify(driver,"etsy","Etsy");
    }

    public static void verifyTitle(WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }

}
