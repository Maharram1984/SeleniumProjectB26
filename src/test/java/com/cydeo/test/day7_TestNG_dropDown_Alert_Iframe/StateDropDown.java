package com.cydeo.test.day7_TestNG_dropDown_Alert_Iframe;

import com.cydeo.Base.WebDriverFactory;
import com.cydeo.Utilities.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StateDropDown {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void stateDropdownTest() {

        Select select = new Select(driver.findElement(By.id("state")));
        select.selectByVisibleText("Illinois");
        select.selectByValue("VA");
        select.selectByIndex(5);

        String actual = select.getFirstSelectedOption().getText();
        String expect = "California";
        Assert.assertEquals(actual, expect, "Failed");

    }

    @Test
    public void multiSelectDropDown() throws InterruptedException {
        Select select = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        System.out.println("select.isMultiple() = " + select.isMultiple());


        select.selectByIndex(2);
        select.selectByValue("java");
        select.selectByVisibleText("Python");

        List<WebElement> all = select.getOptions();

        for (WebElement each : select.getOptions()) { // all
            each.click();
            System.out.println("each.getText() = " + each.getText());
        }

        Sleep.sleep(2);
        select.deselectByIndex(2);
        select.deselectByValue("java");
        select.deselectByVisibleText("Python");
        select.deselectAll();
    }
}
