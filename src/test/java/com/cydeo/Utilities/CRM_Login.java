package com.cydeo.Utilities;

import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CRM_Login {

    @Test
    public static void crm_login(){

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys(ConfigurationReader.getProperty("username"));

        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys(ConfigurationReader.getProperty("password"));

        WebElement login = Driver.getDriver().findElement(By.xpath("//input[@class='login-btn']"));
        login.click();


//        VyTrack.vyTrack_login();
//        CRM_Utilities.crm_login(driver);
//        CRM_Utilities.crm_login2(driver,"user32","UserUser");

    }
}
