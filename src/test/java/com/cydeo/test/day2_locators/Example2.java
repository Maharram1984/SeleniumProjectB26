package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        Thread.sleep(3000);

        WebElement element = driver.findElement(By.id("global-enhancements-search-query"));
        element.sendKeys("wooden spoon" + Keys.ENTER);

        Thread.sleep(3000);
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle =driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASSED");
        }
        System.out.println("PASSED");

        driver.quit();


    }
}
