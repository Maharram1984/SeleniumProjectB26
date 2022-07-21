package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigations {
    public static void main(String[] args) throws InterruptedException {


        // 1 - Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        // 2 - Create instance of Webdriver
        WebDriver driver = new ChromeDriver();

        Thread.sleep(3000);
        // 3 - Make our page full screen
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");
//        both are same
        // navigate().to()method is for navigating to web page
//        driver.navigate().to("https://www.etsy.com");

        // it is using for stopping application,we are giving time to application to see steps
        Thread.sleep(3000);

        // navigate().back()method is for navigating to back from web page
        driver.navigate().back();

        Thread.sleep(3000);
        // navigate().forward()method is for navigating to forward from web page
        driver.navigate().forward();

        Thread.sleep(3000);
        //navigate().refresh() method is for refreshing the page
        driver.navigate().refresh();

        System.out.println("Etsy page driver.getTitle() = " + driver.getTitle());
//        String currentTittle = driver.getTitle();
//        System.out.println(currentTittle);
        System.out.println("Etsy page driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.get("https://www.tesla.com");

        System.out.println("Tesla page driver.getTitle() = " + driver.getTitle());

        System.out.println("Tesla page driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // this will close the current open page
        driver.close();
        // quit() will close all open pages
        driver.quit();
    }
}
