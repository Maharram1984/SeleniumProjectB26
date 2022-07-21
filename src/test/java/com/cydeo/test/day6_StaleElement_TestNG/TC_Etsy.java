package com.cydeo.test.day6_StaleElement_TestNG;

import com.cydeo.Base.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_Etsy {

    public static void main(String[] args) throws InterruptedException {
/*TC: Etsy checkbox and radio button
//        1. Go to https://www.etsy.com/
//        2. Search for “wooden spoon”
//        3. Click on filters
//        4. Select free shipping, on sale
//        5. Select under $25 Click on apply filters
//        6. Print count of results */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.etsy.com");

        WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));
        search.sendKeys("wooden spoon"+ Keys.ENTER);

        WebElement filter = driver.findElement(By.xpath("//span[.='All Filters']"));
        filter.click();

        WebElement shipping = driver.findElement(By.xpath("//label[@for='special-offers-free-shipping']"));
        shipping.click();
        WebElement onSale = driver.findElement(By.xpath("//label[@for='special-offers-on-sale']"));
        onSale.click();
        WebElement $25 = driver.findElement(By.xpath("//label[@for='price-input-1']"));
        $25.click();
        WebElement apply = driver.findElement((By.xpath("//button[@aria-label='Apply']")));
        apply.click();
        Thread.sleep(3000);
        WebElement result = driver.findElement(By.xpath("//span[@class='wt-display-inline-flex-sm']/span[1]"));
        System.out.println("result.getText() = " + result.getText());
        driver.quit();


    }
}
