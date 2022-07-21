package com.cydeo.test.day7_TestNG_dropDown_Alert_Iframe;

import com.cydeo.Base.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_DropDown {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //  1. Open Chrome browser
        //   2. Go to https://practice.cydeo.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/dropdown");
    }

    /*3. Select “December 1st, 1923” and verify it is selected.
         Select year using   :   visible text
         Select month using    : value attribute Select
         day using :             index number        */
    @Test
    public void dropDown() throws InterruptedException {

        Select select1 = new Select(driver.findElement(By.id("year")));
        select1.selectByValue("1923");

        Select select3 = new Select(driver.findElement(By.id("month")));
        select3.selectByVisibleText("December");

        Select select2 = new Select(driver.findElement(By.id("day")));
        select2.selectByIndex(0);

        for (WebElement eachMonth : select3.getOptions()) {
            System.out.println("eachMonth.getText() = " + eachMonth.getText());
        }

        String result = select3.getFirstSelectedOption().getText() + " " + select2.getFirstSelectedOption().getText() + "st, " + select1.getFirstSelectedOption().getText();

        Assert.assertEquals(result, "December 1st, 1923");

        driver.quit();

    }
}
