package com.cydeo.test.day3_css_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam2 {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        // div[id='content']>div>h2  id
        // #content>div>h2           id
        // .example>h2               class
        // div[class='example']>h2   class

        WebElement searchBox = driver.findElement(By.cssSelector("input[name='q']"));
        searchBox.sendKeys("cydeo" + Keys.ENTER);

        WebElement cydeoText = driver.findElement(By.cssSelector("a[href='https://cydeo.com/']>h3"));

        if(cydeoText.getText().equals("Cydeo")){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }

        driver.quit();
    }
}
