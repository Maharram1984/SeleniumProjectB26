package com.cydeo.test.day6_StaleElement_TestNG;

import com.cydeo.Base.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_staleElement {

    /*
   1. Open a chrome browser
   2. Go to: https://practice.cydeo.com/abtest
   3. Locate “CYDEO” link, verify it is displayed.
   4. Refresh the page.
   5. Verify it is displayed, again.   */
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @Test
    public void test1() {
        driver.get("https://practice.cydeo.com/abtest ");
    }

    @Test
    public void test2(){
        WebElement cydeo = driver.findElement(By.linkText("CYDEO"));
        System.out.println("cydeo.isDisplayed() = " + cydeo.isDisplayed());
        driver.navigate().refresh();
        cydeo = driver.findElement(By.linkText("CYDEO"));
        System.out.println("cydeo.isDisplayed() = " + cydeo.isDisplayed());
    }

    @Test
    public void test3() {
        driver.navigate().refresh();
        test2();
    }

    @AfterClass
    public void quit() {
        driver.quit();
    }


}
