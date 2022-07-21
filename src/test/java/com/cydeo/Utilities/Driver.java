package com.cydeo.Utilities;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriverWait waitMe = new WebDriverWait(Driver.getDriver(), 10);
    public static Actions actions = new Actions(Driver.getDriver());
    public static Faker faker = new Faker();

    /* private constructor is not reachable from outside of class */
    private Driver() {
    }

    /* Making our driver instance private is not reachable from outside of class
       We make it static, coz we want it to run before everything,also we will use it in a static method */
    private static WebDriver driver;

    /* Re-usable method that will return same driver instance everytime we call it. */
    public static WebDriver getDriver() {

        if (driver == null) {

            String browserType =
                    ConfigurationReader.getProperty("browser");
            /* Depending on our browser type, switch statement will return that browser */
            switch (browserType.toLowerCase()) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                default:
                    System.out.println("Unknown browser type " + browserType);
                    driver = null;
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        }
        /* Same driver will be returned every time when we call Driver.getDriver(); method */
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
