package com.cydeo.test.day4_Xpath;

import com.cydeo.Base.WebDrFact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CydeoForgotPassword {
    public static void main(String[] args) {
       /*
TC #3: Practice Cydeo/ForgotPassword URL verification
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Enter any email into input box
4. Click on Retrieve password
5. Verify URL contains:
Expected: “email_sent”
6. Verify textBox displayed the content as expected.
Expected: “Your e-mail’s been sent!”     */

        WebDriver driver = WebDrFact.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement emailButton = driver.findElement(By.xpath("//input[@type='text']"));
        emailButton.sendKeys("mrefiyev84@gmail.com");

        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
        retrievePassword.click();




        WebElement emailHasBeenSent = driver.findElement(By.xpath("//div[@id='content']"));












        driver.quit();
    }
}
