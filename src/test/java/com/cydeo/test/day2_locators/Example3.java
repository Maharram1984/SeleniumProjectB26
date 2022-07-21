package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/inputs");

        Thread.sleep(3000);

        WebElement home = driver.findElement(By.className("nav-link"));
        home.click();

        if(driver.getTitle().equals("Practice")){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        Thread.sleep(3000);

        driver.quit();




    }
}
