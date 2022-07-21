package com.cydeo.test.day3_css_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_locator {
    public static void main(String[] args) {

        //  T3_getAttribute_Css
        //  TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //  1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//       2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com");

        //  3- Verify “Log in” button text is as expected:
        //  Expected: Log In

        WebElement login = driver.findElement(By.cssSelector("input[type='submit']"));


        String expect = "Log In";
        String actual = login.getAttribute("value");

        if(actual.equals(expect)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        driver.quit();
















    }
}
