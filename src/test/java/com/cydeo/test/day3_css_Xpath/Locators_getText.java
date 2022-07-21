package com.cydeo.test.day3_css_Xpath;

import com.cydeo.Base.WebDrFact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators_getText {
    public static void main(String[] args) {

    //  TC #1: NextBaseCRM, locators and getText() practice 1- Open a Chrome browser

        WebDriver driver = WebDrFact.getDriver("chrome");
        driver.manage().window().maximize();

    //  2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com");

    //  3- Enter incorrect username: “incorrect”
        WebElement username = driver.findElement(By.className("login-inp"));
        username.sendKeys("incorrect");

    //  4- Enter incorrect password: “incorrect”
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect");

    //  5- Click login button.
        WebElement login = driver.findElement(By.className("login-btn"));
        login.click();

    //  6- Verify error message text is as expected:
    //  Expected: Incorrect login or password
        WebElement error = driver.findElement(By.className("errortext"));

        String expectText = "Incorrect login or password";
        String actualText = error.getText();

        if(actualText.equals(expectText)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }

        driver.quit();





















    }
}
