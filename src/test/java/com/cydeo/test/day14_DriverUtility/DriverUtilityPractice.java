package com.cydeo.test.day14_DriverUtility;

import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverUtilityPractice {

    @Test
    public void googleSearchTest(){

        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));

        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
      //  String searchValue = "there is no spoon";
        String searchValue2 = ConfigurationReader.getProperty("searchValue");
        searchBox.sendKeys(searchValue2 + Keys.ENTER);

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = searchValue2;

        Assert.assertTrue(actualTitle.contains(expectedTitle));
        Driver.getDriver().get("https://etsy.com");
        Driver.closeDriver();

        Driver.getDriver().get("https://etsy.com");
        Driver.closeDriver();


        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));
        WebElement search = Driver.getDriver().findElement(By.name("q"));
        String str = ConfigurationReader.getProperty("env");
        search.sendKeys(str+ Keys.ENTER);
    }

}
