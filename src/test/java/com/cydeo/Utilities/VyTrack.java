package com.cydeo.Utilities;

import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.Driver;
import com.cydeo.Utilities.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VyTrack {

        @Test
        public static void vyTrack_login(){

            Driver.getDriver().get(ConfigurationReader.getProperty("env2"));

            WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='_username']"));
            username.sendKeys(ConfigurationReader.getProperty("username2"));
            Sleep.sleep(2);

            WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='_password']"));
            password.sendKeys(ConfigurationReader.getProperty("password2"));
            Sleep.sleep(2);

            WebElement login = Driver.getDriver().findElement(By.xpath("//button[@id='_submit']"));
            login.click();








        }

}
