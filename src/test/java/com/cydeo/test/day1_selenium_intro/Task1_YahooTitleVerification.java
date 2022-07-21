package com.cydeo.test.day1_selenium_intro;

import com.cydeo.Base.TestBase;
import com.cydeo.Base.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Task1_YahooTitleVerification extends TestBase {
    public static void main(String[] args) {

//        // 1 - Setting up the web driver manager
//        WebDriverManager.chromedriver().setup();
//        // 2 - Create instance of Webdriver
//        WebDriver driver = new ChromeDriver();
//        // 3 - Make the page full screen
//        driver.manage().window().maximize();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.yahoo.com");

        //actual title comes from Selenium
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title of Yahoo: " +actualTitle);

        //expected title comes from requirements
        String expectedTitle = "Yahoo";

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification is passed!");
        }else {
            System.out.println("Title verification is failed!");
        }
        driver.quit();


    }
}
