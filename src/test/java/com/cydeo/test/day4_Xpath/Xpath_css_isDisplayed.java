package com.cydeo.test.day4_Xpath;

import com.cydeo.Base.WebDrFact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath_css_isDisplayed {

    public static void main(String[] args) {

        /*TC #1: XPATH and cssSelector Practices
          1. Open Chrome browser
          2. Go to https://practice.cydeo.com/forgot_password
          3. Locate all the WebElements on the page using XPATH and/or CSS
          locator only (total of 6)
          a. “Home” link
          b. “Forgot password” header
          c. “E-mail” text
          d. E-mail input box
          e. “Retrieve password” button
          f. “Powered by Cydeo text
          4. Verify all web elements are displayed.    */


        WebDriver driver = WebDrFact.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLink1 = driver.findElement(By.xpath("//a[.='Home']"));

        WebElement forgotPass = driver.findElement(By.cssSelector("div[class='example']>h2")); // .example>h2
        WebElement forgotPass1 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));


        WebElement email = driver.findElement(By.cssSelector("label[for='email']"));
        WebElement email1 = driver.findElement(By.xpath("//label[@for='email']"));


        WebElement emailInput = driver.findElement(By.cssSelector("input[type='text']"));
        WebElement emailInput1 = driver.findElement(By.xpath("//input[@name='email']"));


        WebElement retrievePass = driver.findElement(By.cssSelector("button#form_submit"));

        WebElement powered = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("forgotPass.isDisplayed() = " + forgotPass.isDisplayed());
        System.out.println("forgotPass1.isDisplayed() = " + forgotPass1.isDisplayed());
        System.out.println("email.isDisplayed() = " + email.isDisplayed());
        System.out.println("email1.isDisplayed() = " + email1.isDisplayed());
        System.out.println("emailInput.isDisplayed() = " + emailInput.isDisplayed());
        System.out.println("emailInput1.isDisplayed() = " + emailInput1.isDisplayed());
        System.out.println("retrievePass.isDisplayed() = " + retrievePass.isDisplayed());
        System.out.println("powered.isDisplayed() = " + powered.isDisplayed());


        driver.quit();
    }
}
