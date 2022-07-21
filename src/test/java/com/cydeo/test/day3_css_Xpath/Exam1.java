package com.cydeo.test.day3_css_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://app.vytrack.com/user/login");

        WebElement userName = driver.findElement(By.id("prependedInput"));
        userName.sendKeys("abcd");

        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("abcd");

        WebElement login = driver.findElement(By.id("_submit"));
        login.click();

        WebElement alert = driver.findElement(By.className("alert"));
        if(alert.getText().equals("Invalid user name or password.")){
            System.out.println("Message is passed");
        }else {
            System.out.println("Message is failed");
        }

        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains("vytrack")){
            System.out.println("URL is passed");
        }else {
            System.out.println("URL is failed");
        }

        driver.findElement(By.partialLinkText("Forgot")).click();

        if(driver.getTitle().equals("Forgot Password")){
            System.out.println("Title is correct");
        }else {
            System.out.println("Title is not correct");
        }

        driver.quit();

    }
}
