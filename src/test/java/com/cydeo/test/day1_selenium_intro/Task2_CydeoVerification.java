package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_CydeoVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        String expectedURL = "practice.cydeo"; // it comes from requirement
        String actualURL = driver.getCurrentUrl();// it comes from Selenium
        System.out.println(driver.getCurrentUrl());

        if(actualURL.contains(expectedURL)){
            System.out.println("URL verification is passed!");
        }else {
            System.out.println("URL verification is failed!");
        }

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        System.out.println(driver.getTitle());

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is passed!");
        }else {
            System.out.println("Title verification is failed!");
        }

        driver.quit();
    }
}
