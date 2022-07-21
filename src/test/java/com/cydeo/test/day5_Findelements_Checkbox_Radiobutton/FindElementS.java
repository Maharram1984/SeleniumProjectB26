package com.cydeo.test.day5_Findelements_Checkbox_Radiobutton;

import com.cydeo.Utilities.Sleep;
import com.cydeo.Base.WebDrFact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementS {
    public static void main(String[] args) {
//      1- Open a chrome browser
        WebDriver driver = WebDrFact.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//        2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

//        3- Locate all the links in the page.
        List<WebElement> all = driver.findElements(By.tagName("a"));
        Sleep.sleep(3);
//        4- Print out the number of the links on the page.
        System.out.println("all.size() = " + all.size());
        Sleep.sleep(3);
//        5- Print out the texts of the links.
//        6- Print out the HREF attribute values of the links
        for (WebElement each : all) {
            System.out.println("each.getText() = " + each.getText());
            System.out.println("each.getAttribute(\"href\") = " + each.getAttribute("href"));

        }




driver.quit();










    }
}
