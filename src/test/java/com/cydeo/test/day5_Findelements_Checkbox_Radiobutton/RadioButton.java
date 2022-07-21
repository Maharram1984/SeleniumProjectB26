package com.cydeo.test.day5_Findelements_Checkbox_Radiobutton;

import com.cydeo.Base.WebDrFact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class RadioButton {
    public static void main(String[] args) {

//      1. Open Chrome browser
        WebDriver driver = WebDrFact.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

//        3. Click to “Hockey” radio button
        WebElement radioButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        radioButton.click();

//        4. Verify “Hockey” radio button is selected after clicking.
        System.out.println("radioButton.isSelected() = " + radioButton.isSelected());
        System.out.println("radioButton.isEnabled() = " + radioButton.isEnabled());


          driver.quit();
    }
}
