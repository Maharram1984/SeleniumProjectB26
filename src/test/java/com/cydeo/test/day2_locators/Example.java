package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
    public static void main(String[] args) throws InterruptedException {

        //TC #3: Back and forth navigation
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        Thread.sleep(3000);
        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        gmail.click();

        String exceptedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        Thread.sleep(3000);

        if (actualTitle.contains(exceptedTitle)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        driver.navigate().back();

        actualTitle = driver.getTitle();

        if(actualTitle.equals("Google")){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
