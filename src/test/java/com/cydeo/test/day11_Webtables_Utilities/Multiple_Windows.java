package com.cydeo.test.day11_Webtables_Utilities;

import com.cydeo.Base.TestBase;
import com.cydeo.Utilities.Sleep;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class Multiple_Windows extends TestBase {

    @Test
    public void windowsHandleTest() {
        Sleep.sleep(6);
//        2. Goto:https://www.amazon.com
        driver.get("https://www.amazon.com");
        System.out.println("System.getProperty(\"name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
//        3. Copy-paste the lines from below into your class

        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

    //    4. Create a logic to switch to the tab where Etsy.com is open
        Set<String> all = driver.getWindowHandles();

        for (String each : all) {
            driver.switchTo().window(each);
            System.out.println(driver.getCurrentUrl());
            if(driver.getCurrentUrl().contains("etsy")){
                break;
            }
        }

//        5. Assert:Title contains “Etsy”

        Assert.assertTrue(driver.getTitle().contains("Etsy"));
//        BrowserUtilities.switchWindowAndVerify(driver,"amazon","Amazon");

    }
}