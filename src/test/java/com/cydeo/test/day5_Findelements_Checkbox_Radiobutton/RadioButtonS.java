package com.cydeo.test.day5_Findelements_Checkbox_Radiobutton;

import com.cydeo.Utilities.Sleep;
import com.cydeo.Base.WebDrFact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButtonS {
    public static void main(String[] args) throws InterruptedException {


//      1. Open Chrome browser
        WebDriver driver = WebDrFact.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        List<WebElement> all = driver.findElements(By.xpath("//input[@name='sport']"));
        for (WebElement allRadio : all) {
            Sleep.sleep(2);
            allRadio.click();
        }

        driver.quit();













    }

}
