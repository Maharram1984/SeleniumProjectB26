package com.cydeo.test.day5_Findelements_Checkbox_Radiobutton;

import com.cydeo.Base.WebDrFact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class isDisplayedFalse {
    public static void main(String[] args) {
        //1- Open a Chrome browser
        //2- Go to: https://www.tesla.com/
        //3- Locate Solar Panels header
        //4- Verify if it is displayed on the page

        WebDriver driver = WebDrFact.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.tesla.com/");

        WebElement element = driver.findElement(By.xpath("(//h1[contains(text(),'Solar Panels')])[1]"));

        System.out.println("element.isDisplayed() = " + element.isDisplayed());

        driver.quit();
    }
}
