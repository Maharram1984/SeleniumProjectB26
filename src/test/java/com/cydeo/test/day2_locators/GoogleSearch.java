package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) throws InterruptedException {

        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com/
        driver.get("https://google.com");

        Thread.sleep(4000);

        //3- Write “apple” in search box
        //4- Click google search button
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple" + Keys.ENTER);

        Thread.sleep(2000);

        //5- Verify title:
        //Expected: Title should start with “apple” word
        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Test is PASSED ay BRAT!");
        }else {
            System.out.println("Test is FAILED!");
        }

        driver.navigate().back();


        Thread.sleep(2000);

        driver.quit();













    }




}
