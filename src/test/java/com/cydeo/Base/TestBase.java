package com.cydeo.Base;

import com.cydeo.Utilities.ConfigurationReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {

    public static WebDriver driver;

    @BeforeMethod
    public void setUp()
    {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
